/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorcertificado;

import geradorcertificado.dadosPessoa.Contato;
import geradorcertificado.dadosPessoa.Endereco;
import geradorcertificado.dadosPessoa.Pessoa;
import geradorcertificado.dadosPessoa.PessoaFisica;
import geradorcertificado.gerador.BuscaArquivos;
import geradorcertificado.gerador.Gerador;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Urban
 */
public class GeradorCertificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BuscaArquivos buscaArquivos = new BuscaArquivos(new File("modelos"), new File("saida"));
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new PessoaFisica("", "", "M", "Lucas Urban", "13-06-1998", new Contato("", "", ""),
                new Endereco("", "", "", "", "")));
        pessoas.add(new PessoaFisica("", "", "M", "Thiago Fonseca", "24-04-2000", new Contato("", "", ""),
                new Endereco("", "", "", "", "")));

        Gerador.Gerar(pessoas, new File(buscaArquivos.getPastaModelos(), "Update sem where.html"),
                buscaArquivos.getPastaSaida());
    }
}
