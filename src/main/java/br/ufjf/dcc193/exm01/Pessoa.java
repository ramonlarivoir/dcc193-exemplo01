package br.ufjf.dcc193.exm01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Pessoa
 */

 @Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nome;
    private Integer idade;
    
    Pessoa() {
        this.nome = "";
        this.idade = 0;
    }
    Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param idade the idade to set
     */
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    /**
     * @return the idade
     */
    public Integer getIdade() {
        return idade;
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.nome+" "+this.idade+" anos";
    }

}