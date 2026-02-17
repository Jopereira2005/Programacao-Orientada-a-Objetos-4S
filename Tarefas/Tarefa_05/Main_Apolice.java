package Tarefa_05;

import java.util.Scanner;

public class Main_Apolice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Apolice apolice = new Apolice();
        
        String nome;
        char sexo;
        int numero, idade, op;
        double valorAutomovel;
        
        do {
            System.out.println(
                "\n[1]. Criar Apolice" +
                "\n[2]. Ver Dados Apolice" +
                "\n[3]. Sair"); 
            System.out.println("Opcao: ");
            op = scan.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Insira o numero da Apolice: ");
                    numero = scan.nextInt();
                    scan.nextLine();
                    
                    System.out.println("Insira o nome do motorista: ");
                    nome = scan.nextLine();
                    
                    System.out.println("Insira a idade do motorista: ");
                    idade = scan.nextInt();
                    
                    System.out.println("Insira o sexo do motorista(M/F): ");
                    sexo = scan.next().charAt(0);
                    
                    System.out.println("Insira o valor do Automovel: ");
                    valorAutomovel = scan.nextDouble();
                    
                    apolice = new Apolice(numero, nome, idade, sexo, valorAutomovel);

                    break;
                case 2:
                    System.out.println(apolice.imprimir());
                    break;
                case 3:
                    System.out.println("Cabo a graça!");
                    break;
                default:
                    System.out.println("Opcao Invalida!!!");
            }
        } while(op != 3);
    }
}
