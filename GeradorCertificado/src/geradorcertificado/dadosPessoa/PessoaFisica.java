/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorcertificado.dadosPessoa;

import geradorcertificado.dadosPessoa.Pessoa;

/**
 *
 * @author Urban
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private String rg;
    private String Sexo; 

    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, String rg, String Sexo, String nome, String nascimento, geradorcertificado.dadosPessoa.Contato contato, geradorcertificado.dadosPessoa.Endereco endereco) {
        super(nome, nascimento, contato, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.Sexo = Sexo;
    }

    

    /**
     * @return the cpf
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRG() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRG(String rg) {
        this.rg = rg;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    
}
