/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorcertificado;
import geradorcertificado.dadosPessoa.Pessoa;
import geradorcertificado.dadosPessoa.PessoaFisica;
import geradorcertificado.gerador.Gerador;
import java.io.File;
import java.io.IOException;
        

/**
 *
 * @author Urban
 */
public class GeradorCertificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerador gerador = new Gerador();

        File file= new File("C:/Users/Urban/Documents/GitHub/JAVA/GeradorCertificado/src/modelos/updateSemWhere.html");
        gerador.setModelo(file);
        
        Pessoa testePessoa = new PessoaFisica("", "", "M", "Lucas Urban", "13-06-1998", null, null);
        
        
        

        try{
           System.out.println("vai gerar o certificado");
            if (gerador.Gerar(testePessoa)){
                System.out.println("Gerou certificado");
            }else{
               System.out.println("Não Gerou certificado"); 
            }

        } catch(IOException e){
            System.out.println("deu erro no arquivo: "+e.getMessage());
        }
    }
}
