package br.com.emiliano;

/**
 * @author gustavo.emiliano
 */

public class Produto {
    private int codigo;
    private String nome;

    //construtor vazio
    public Produto(){

    }

    //construtor
    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
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

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
