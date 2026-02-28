package testqualcod.ex27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calcorrigido {
  public static void main(String args[]) {
        
        // Criação do objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                // Solicita os dois números ao usuário
                System.out.println("Digite dois números:");
                double numero1 = scanner.nextDouble();
                double numero2 = scanner.nextDouble();

                // Menu de operações
                System.out.println("Escolha a operação: ");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");

                int operacao = scanner.nextInt();

                double resultado;

                if (operacao == 1) {
                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);

                } else if (operacao == 2) {
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);

                } else if (operacao == 3) {
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);

                } else if (operacao == 4) {
                    // Tratamento para divisão por zero
                    if (numero2 == 0) {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    } else {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado: " + resultado);
                    }

                } else {
                    System.out.println("Opção inválida.");
                }

            } catch (InputMismatchException e) {
                // Tratamento para entradas inválidas (letras no lugar de números)
                System.out.println("Erro: digite apenas números válidos.");
                scanner.nextLine(); // limpa o buffer
            }

            // Pergunta se o usuário deseja continuar
            System.out.println("Deseja realizar outra operação? (s/n)");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        // Encerra o Scanner
        scanner.close();
        System.out.println("Programa finalizado.");
    }
}