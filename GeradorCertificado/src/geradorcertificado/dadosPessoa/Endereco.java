/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorcertificado.dadosPessoa;

/**
 *
 * @author Urban
 */
public class Endereco {
    private String uf;
    private String cidade;
    private String bairro;
    private String endereco;
    private String cep;

    public Endereco() {
    }

    public Endereco(String uf, String cidade, String bairro, String endereco, String cep) {
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.endereco = endereco;
        this.cep = cep;
    }

    /**
     * @return the uf
     */
    public String getUF() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUF(String uf) {
        this.uf = uf;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cep
     */
    public String getCEP() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCEP(String cep) {
        this.cep = cep;
    }
    
    
}
