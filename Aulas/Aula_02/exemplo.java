package Aula_02;
import java.util.Scanner;

public class exemplo {
    public static double calculo(double num1, double num2, String operador) {
        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisao por zero!");
                }
                break;
            default:
                System.out.println("Operador invalido");
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = scan.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scan.nextDouble();

        System.out.print("Digite o operador cd(+, -, *, /): ");
        String operador = scan.next();

        double resposta = calculo(num1, num2, operador);
        System.out.println("Resultado: " + resposta);
    }
}