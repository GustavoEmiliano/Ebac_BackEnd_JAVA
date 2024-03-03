package br.com.emiliano;

/**
 * @author gustavo.emiliano
 */

public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("|         Olá Gustavo        |");
        System.out.println("==============================");

        Cliente cliente = new Cliente(1,"Gustavo               ", "Rua Odorico Mendes");
        System.out.println("|Código: " + cliente.getCodigo() + "                   |");
        System.out.println("|Nome: " + cliente.getNome() + "|");
        System.out.println("|Endereço: " + cliente.getEndereco() + "|");
        System.out.println("|" + cliente.getValorTotal() + "                          |");
        System.out.println("==============================");

    }
}
