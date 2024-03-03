package br.com.emiliano;

import java.util.List;

/**
 * @author gustavo.emiliano
 */

public class Venda {
    private Cliente cliente;
    private Funcionario vendedor;
    private List<ItemVenda> itens;

    //construtor
    public Venda(Cliente cliente, Funcionario vendedor, List<ItemVenda> itens) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    //construtor vazio
    public Venda(){

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }
}
