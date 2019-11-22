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
public class Pessoa {
    private  String nome;
    private  String Nascimento;
    private  Contato Contato;
    private  Endereco Endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String Nascimento, Contato Contato, Endereco Endereco) {
        this.nome = nome;
        this.Nascimento = Nascimento;
        this.Contato = Contato;
        this.Endereco = Endereco;
    } 

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the Nascimento
     */
    public String getNascimento() {
        return Nascimento;
    }

    /**
     * @param Nascimento the Nascimento to set
     */
    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    /**
     * @return the Contato
     */
    public Contato getContato() {
        return Contato;
    }

    /**
     * @param Contato the Contato to set
     */
    public void setContato(Contato Contato) {
        this.Contato = Contato;
    }

    /**
     * @return the Endereco
     */
    public Endereco getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }
    
}
