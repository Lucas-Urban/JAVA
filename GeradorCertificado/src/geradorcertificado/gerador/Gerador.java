/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorcertificado.gerador;

import geradorcertificado.dadosPessoa.Pessoa;
import java.io.BufferedReader;
import java.util.List;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


/**
 *
 * @author Urban
 */
public class Gerador {
    
    private List<Pessoa> pessoas; 
    private File modelo;
    //private Gson json;

    public Gerador() {
       
    }

    public Gerador(List<Pessoa> pessoas, File modelo) {
        this.pessoas = pessoas;
        this.modelo = modelo;
        
    }
    
    public boolean Gerar(Pessoa pessoa) throws IOException{
        boolean conseguiuGerar= false;
        File certificado= new File("src/certificados/certificado"+pessoa.getNome()+".html");
        certificado.createNewFile();


        if (!this.modelo.exists()){
            System.out.println("Arquivo " + modelo + " não existe!");
            return conseguiuGerar;
        }
        if ( !certificado.exists()){
            System.out.println("Arquivo " + certificado + " não existe!");
            return conseguiuGerar;
        }
        
        this.alteraLinha("#nome#", pessoa.getNome(), modelo.getPath() , certificado.getPath());
        this.alteraLinha("#nascimento#", pessoa.getNascimento(), modelo.getPath() , certificado.getPath());
        
        this.alteraLinha("#email#", pessoa.getContato().getEmail() , modelo.getPath() , certificado.getPath());
        this.alteraLinha("#telefone#", pessoa.getContato().getTelefone(), modelo.getPath() , certificado.getPath());
        this.alteraLinha("#site#", pessoa.getContato().getSite(), modelo.getPath() , certificado.getPath());
        
        this.alteraLinha("#uf#", pessoa.getEndereco().getUF(), modelo.getPath() , certificado.getPath());
        this.alteraLinha("#bairro#", pessoa.getEndereco().getBairro(), modelo.getPath() , certificado.getPath());
        this.alteraLinha("#cidade#", pessoa.getEndereco().getCidade(), modelo.getPath() , certificado.getPath());
        this.alteraLinha("#endereco#", pessoa.getEndereco().getEndereco(), modelo.getPath() , certificado.getPath());
        this.alteraLinha("#cep#", pessoa.getEndereco().getCEP(), modelo.getPath() , certificado.getPath());


        
        conseguiuGerar = true;
        return(conseguiuGerar);
    }

    public void alteraLinha(String palavraAntiga, String palavraNova, String modelo, String certificado) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(certificado));
        BufferedReader reader = new BufferedReader(new FileReader(modelo));

        String linha;
        while ((linha = reader.readLine()) != null) {
            if (linha.contains(palavraAntiga)) {
                linha = linha.replace(palavraAntiga, palavraNova);
            }
            writer.write(linha + "\n");
        }

        writer.close();        
        reader.close();

    }

    /**
     * @return the pessoas
     */
    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    /**
     * @param pessoas the pessoas to set
     */
    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    /**
     * @return the modelo
     */
    public File getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(File modelo) {
        this.modelo = modelo;
    }
    
    
   
}
