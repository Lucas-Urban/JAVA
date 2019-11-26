package geradorcertificado.gerador;

import geradorcertificado.dadosPessoa.Pessoa;
import geradorcertificado.dadosPessoa.PessoaFisica;
import geradorcertificado.dadosPessoa.PessoaJuridica;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Urban e Thiago
 */
public class Gerador implements Runnable {

    private Modelo modelo;
    File saida;
    private Pessoa pessoa;
    ThreadCompletada threadCompletada;
    Thread thread;

    public Gerador(Modelo modelo, File saida, Pessoa pessoa, ThreadCompletada threadCompletada) {
        this.modelo = modelo;
        this.saida = saida;
        this.pessoa = pessoa;
        this.threadCompletada = threadCompletada;
        this.thread = thread;
    }

    public static void Gerar(ArrayList<Pessoa> pessoas, Modelo modelo, File output, ThreadCompletada threadCompletada) {
        for (Pessoa pessoa : pessoas) {
            File outputCertificado = new File(new File(output, pessoa.getNome()), modelo.getNome());
            outputCertificado.getParentFile().mkdirs();
            new Thread(new Gerador(modelo, outputCertificado, pessoa, threadCompletada)).run();
        }
    }

    @Override
    public void run() {
        try {
            saida.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(saida));
            BufferedReader reader = new BufferedReader(new FileReader(modelo.getFile()));
            String linha;
            while ((linha = reader.readLine()) != null){
                linha = linha.replace("#nome#", pessoa.getNome());
                linha = linha.replace("#nascimento#", pessoa.getNascimento());
                linha = linha.replace("#email#", pessoa.getContato().getEmail());
                linha = linha.replace("#telefone#", pessoa.getContato().getTelefone());
                linha = linha.replace("#site#", pessoa.getContato().getSite());
                linha = linha.replace("#uf#", pessoa.getEndereco().getUF());
                linha = linha.replace("#bairro#", pessoa.getEndereco().getBairro());
                linha = linha.replace("#cidade#", pessoa.getEndereco().getCidade());
                linha = linha.replace("#endereco#", pessoa.getEndereco().getEndereco());
                linha = linha.replace("#cep#", pessoa.getEndereco().getCEP());
                if(pessoa instanceof PessoaFisica){
                    PessoaFisica pessoaFisica = (PessoaFisica)pessoa;
                    linha = linha.replace("#cpf#", pessoaFisica.getCPF());
                    linha = linha.replace("#rg#", pessoaFisica.getRG());
                    linha = linha.replace("#sexo#", pessoaFisica.getSexo());
                }else{
                    PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
                    linha = linha.replace("#cnpj#", pessoaJuridica.getCNPJ());
                    linha = linha.replace("#inscricaoEstadual#", pessoaJuridica.getInscricaoEstadual());
                    linha = linha.replace("#inscricaoMunicial#", pessoaJuridica.getInscricaoMunicial());
                }
                writer.write(linha + "\n");
            }
            System.out.println("Certificado " + modelo.getNome()+ " gerado para " + pessoa.getNome());
            writer.close();
            reader.close();
            threadCompletada.notificarThreadCompletada("Geração do certificado "+modelo.getNome()+" para "+pessoa.getNome());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao gerar o certificado " + modelo.getNome()+ " para "
                    + pessoa.getNome() + ":\n" + e.getMessage() + ":");
            e.printStackTrace();
        }
    }
}
