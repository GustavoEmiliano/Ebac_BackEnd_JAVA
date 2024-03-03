package br.com.emiliano;

/**
 * @author gustavo.emiliano
 */

public class ItemVenda {
    private int quantidade;
    private Produto produto;

    //construtor vazio
    public ItemVenda() {
    }
    //construtor
    public ItemVenda(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    //getters e setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}
