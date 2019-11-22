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
    private String CNPJ;
    private String InscricaoEstadual;
    private String InscricaoMunicial;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String CNPJ, String InscricaoEstadual, String InscricaoMunicial, String nome, String Nascimento, geradorcertificado.dadosPessoa.Contato Contato, geradorcertificado.dadosPessoa.Endereco Endereco) {
        super(nome, Nascimento, Contato, Endereco);
        this.CNPJ = CNPJ;
        this.InscricaoEstadual = InscricaoEstadual;
        this.InscricaoMunicial = InscricaoMunicial;
    }

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the InscricaoEstadual
     */
    public String getInscricaoEstadual() {
        return InscricaoEstadual;
    }

    /**
     * @param InscricaoEstadual the InscricaoEstadual to set
     */
    public void setInscricaoEstadual(String InscricaoEstadual) {
        this.InscricaoEstadual = InscricaoEstadual;
    }

    /**
     * @return the InscricaoMunicial
     */
    public String getInscricaoMunicial() {
        return InscricaoMunicial;
    }

    /**
     * @param InscricaoMunicial the InscricaoMunicial to set
     */
    public void setInscricaoMunicial(String InscricaoMunicial) {
        this.InscricaoMunicial = InscricaoMunicial;
    }
    
    
}
