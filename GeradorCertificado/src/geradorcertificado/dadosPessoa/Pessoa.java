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
public class Pessoa {
    private  String nome;
    private  String nascimento;
    private  Contato contato;
    private  Endereco endereco;  


    public Pessoa(String nome, String nascimento, Contato contato, Endereco endereco) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.contato = contato;
        this.endereco = endereco;
    } 

    public Pessoa() {
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
     * @return the nascimento
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the Contato
     */
    public Contato getContato() {
        return contato;
    }

    /**
     * @param Contato the Contato to set
     */
    public void setContato(Contato contato) {
        this.contato = contato;
    }

    /**
     * @return the Endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nome==null||nome.length()==0 ? "Nova pessoa" : nome;
    }
}
