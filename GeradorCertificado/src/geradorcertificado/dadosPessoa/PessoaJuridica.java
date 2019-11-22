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
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicial;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String inscricaoEstadual, String inscricaoMunicial, String nome, String nascimento, geradorcertificado.dadosPessoa.Contato contato, geradorcertificado.dadosPessoa.Endereco endereco) {
        super(nome, nascimento, contato, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicial = inscricaoMunicial;
    }

    /**
     * @return the cnpj
     */
    public String getCNPJ() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the inscricaoEstadual
     */
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    /**
     * @param inscricaoEstadual the inscricaoEstadual to set
     */
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    /**
     * @return the inscricaoMunicial
     */
    public String getInscricaoMunicial() {
        return inscricaoMunicial;
    }

    /**
     * @param inscricaoMunicial the inscricaoMunicial to set
     */
    public void setInscricaoMunicial(String inscricaoMunicial) {
        this.inscricaoMunicial = inscricaoMunicial;
    }
    
    
}
