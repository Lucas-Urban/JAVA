/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorcertificado.gerador;

import java.io.File;

/**
 *
 * @author Thiag
 */
public class Modelo {
    private File file;
    private String nome;

    public Modelo(File file) {
        setFile(file);
    }
    
    public File getFile() {
        return file;
    }

    public String getNome() {
        return nome;
    }

    public void setFile(File file) {
        this.file = file;
        nome=file.getName();
    }

    @Override
    public String toString() {
        return nome;
    }
}
