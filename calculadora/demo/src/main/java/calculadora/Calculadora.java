package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    // MÉTODOS

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {

        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }

        return a / b;
    }

    // MAIN

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        Calculadora calc = new Calculadora();

        while (continuar) {

            try {

                System.out.println("Digite dois números:");

                double numero1 = scanner.nextDouble();
                double numero2 = scanner.nextDouble();

                System.out.println("Escolha a operação:");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");

                int operacao = scanner.nextInt();

                double resultado;

                if (operacao == 1) {

                    resultado = calc.somar(numero1, numero2);
                    System.out.println("Resultado: " + resultado);

                } else if (operacao == 2) {

                    resultado = calc.subtrair(numero1, numero2);
                    System.out.println("Resultado: " + resultado);

                } else if (operacao == 3) {

                    resultado = calc.multiplicar(numero1, numero2);
                    System.out.println("Resultado: " + resultado);

                } else if (operacao == 4) {

                    resultado = calc.dividir(numero1, numero2);
                    System.out.println("Resultado: " + resultado);

                } else {

                    System.out.println("Opção inválida.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Erro: digite apenas números válidos.");
                scanner.nextLine();

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());
            }

            System.out.println("Deseja realizar outra operação? (s/n)");

            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        scanner.close();

        System.out.println("Programa finalizado.");
    }
}