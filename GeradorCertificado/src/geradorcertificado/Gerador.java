/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorcertificado;

import geradorcertificado.dadosPessoa.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author Urban
 */
public class Gerador {
    private ArrayList<Pessoa> pessoas; 
    private String modelo;

    public Gerador() {
    }

    public Gerador(ArrayList<Pessoa> pessoas, String modelo) {
        this.pessoas = pessoas;
        this.modelo = modelo;
    }
    
   
}
