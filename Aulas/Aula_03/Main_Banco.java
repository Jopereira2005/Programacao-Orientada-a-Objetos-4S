package Aula_03;

import java.util.Scanner;

public class Main_Banco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();
        double valor;
        int opt;
        
        do {
            System.out.println("\n\n");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Imprimir");
            System.out.println("[4] Sair");

            opt = scan.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Valor do deposito: ");
                    valor = scan.nextDouble();

                    conta1.depositar(valor);
                    break;
                case 2:
                    System.out.println("Valor para saque: ");
                    valor = scan.nextDouble();

                    conta1.sacar(valor);
                    break;
                case 3:
                    conta1.imprimir();
                    break;
                case 4:
                    System.out.println("Obrigado!");
                    break;
                default:
                    System.out.println("## OPCAO INVALIDA ##");
            }
        } while (opt != 4);
    }
}

