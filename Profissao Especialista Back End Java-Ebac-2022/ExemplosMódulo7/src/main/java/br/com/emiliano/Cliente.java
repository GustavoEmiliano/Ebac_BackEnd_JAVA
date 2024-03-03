package br.com.emiliano;

/**
 * @author gustavo.emiliano
 */

public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;

    //construtor
    public Cliente(int codigo, String nome, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }


    //getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    //Métodos
    public int getValorTotal() {
        return 20;
    }

}
