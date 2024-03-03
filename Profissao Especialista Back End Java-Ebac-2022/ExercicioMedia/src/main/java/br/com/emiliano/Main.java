package br.com.emiliano;

import java.util.Scanner;

/**
 * @author gustavo.emiliano
 * Módulo 8 - Variávies tipos e operadores
 * Exercício de codar um programe que calcule a méddia de 4 notas - #F043 Do Curso da EBAC - JAVABACKEND
 */

public class Main {

    public static void main(String[] args) {
        int totalNotas = 4;
        int[] notas = new int[totalNotas];
        double media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("|      Calculadora Média      |");
        System.out.println("===============================");

        for (int i = 0; i < totalNotas; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();

            // Verifica se a nota digitada é menor ou igual a 10
            if (notas[i] > 10) {
                System.out.println("Nota inválida! Digite uma nota menor ou igual a 10.");
                return; // Encerra o programa se a nota for inválida
            }
        }

        // Calcula a média
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        media = (double) soma / totalNotas;

        // Verifica se o aluno foi aprovado ou reprovado
        if (media < 6) {
            System.out.println("Aluno Reprovado!!");
        } else {
            System.out.println("Aluno Aprovado!!");
        }

        // Imprime a média
        System.out.println("A média dele foi: " + media);
        System.out.println("===============================");
    }
}
