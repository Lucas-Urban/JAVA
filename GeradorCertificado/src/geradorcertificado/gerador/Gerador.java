package geradorcertificado.gerador;

import geradorcertificado.dadosPessoa.Pessoa;
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

    private File modelo, saida;
    private Pessoa pessoa;

    public Gerador(File modelo, File saida, Pessoa pessoa) {
        this.modelo = modelo;
        this.saida = saida;
        this.pessoa = pessoa;
    }

    public static void Gerar(ArrayList<Pessoa> pessoas, File modelo, File output) {
        for (Pessoa pessoa : pessoas) {
            File outputCertificado = new File(new File(output, pessoa.getNome()), modelo.getName());
            outputCertificado.getParentFile().mkdirs();
            new Thread(new Gerador(modelo, outputCertificado, pessoa)).run();
        }
    }

    @Override
    public void run() {
        try {
            saida.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(saida));
            BufferedReader reader = new BufferedReader(new FileReader(modelo));
            String linha;
            while ((linha = reader.readLine()) != null)
                writer.write(linha.replace("#nome#", pessoa.getNome()).replace("#nascimento#", pessoa.getNascimento())
                        .replace("#email#", pessoa.getContato().getEmail())
                        .replace("#telefone#", pessoa.getContato().getTelefone())
                        .replace("#site#", pessoa.getContato().getSite()).replace("#uf#", pessoa.getEndereco().getUF())
                        .replace("#bairro#", pessoa.getEndereco().getBairro())
                        .replace("#cidade#", pessoa.getEndereco().getCidade())
                        .replace("#endereco#", pessoa.getEndereco().getEndereco())
                        .replace("#cep#", pessoa.getEndereco().getCEP()) + "\n");
            System.out.println("Certificado " + modelo.getName() + " gerado para " + pessoa.getNome());
            writer.close();
            reader.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao gerar o certificado " + modelo.getName() + " para "
                    + pessoa.getNome() + ":\n" + e.getMessage() + ":");
            e.printStackTrace();
        }
    }
}
