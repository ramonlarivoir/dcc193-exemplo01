package br.ufjf.dcc193.exm01;

/**
 * Pessoa
 */
public class Pessoa {
    private String nome;
    private Integer idade;
    
    Pessoa() {
        this.nome = "";
        this.idade = 0;
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
}