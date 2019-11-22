/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorcertificado;

/**
 *
 * @author Urban
 */
public class PessoaFisica extends Pessoa{
    private String CPF;
    private String RG;
    private String Sexo; 

    public PessoaFisica() {
    }

    public PessoaFisica(String CPF, String RG, String Sexo, String nome, String Nascimento, geradorcertificado.Contato Contato, geradorcertificado.Endereco Endereco) {
        super(nome, Nascimento, Contato, Endereco);
        this.CPF = CPF;
        this.RG = RG;
        this.Sexo = Sexo;
    }

    

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
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
