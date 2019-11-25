package geradorcertificado;

import frontend.MainFrame;
import frontend.ViewPessoa;
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
    public static void main(String[] args) throws IOException {
        BuscaArquivos buscaArquivos = new BuscaArquivos(new File("modelos"), new File("saida"));
        new MainFrame().setVisible(true);
    }
}
