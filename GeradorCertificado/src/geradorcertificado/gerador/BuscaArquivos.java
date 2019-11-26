/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorcertificado.gerador;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

/**
 *
 * @author endriu.ferreira
 */
public class BuscaArquivos {
    private File pastaModelos, pastaSaida;

    public BuscaArquivos(File pastaModelos, File pastaSaida) {
        this.pastaModelos = pastaModelos;
        this.pastaSaida = pastaSaida;
        pastaModelos.mkdirs();
        pastaSaida.mkdirs();
    }

    public File getPastaModelos() {
        return pastaModelos;
    }

    public File getPastaSaida() {
        return pastaSaida;
    }

    public File[] Modelos() {
        return pastaModelos.listFiles();
    }

    public File[] getModelos() {
        return getPastaModelos().listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });
    }
}
