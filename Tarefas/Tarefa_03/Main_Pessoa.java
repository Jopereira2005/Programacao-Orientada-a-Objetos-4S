package Tarefa_03;

import java.util.Scanner;

public class Main_Pessoa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Pessoa person = new Pessoa();
        String cpf, nome;
        int op, idade;
        char sexo;
        
        do {
            System.out.println("\n");
            System.out.println("[1] Criar Pessoa");
            System.out.println("[2] Mostrar Pessoa");
            System.out.println("[3] Sair");
            
            System.out.println("\nOpção: ");
            op = scan.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Insira o Nome");
                    nome = scan.next();
                    person.setNome(nome);
                    
                    System.out.println("Insira o CPF: ");
                    cpf = scan.next();
                    person.setCpf(cpf);

                    System.out.println("Insira o Sexo: ");
                    sexo = scan.next().charAt(0);
                    person.setSexo(sexo);

                    System.out.println("Insira a Idade: ");
                    idade = scan.nextInt();
                    person.setIdade(idade);
                    break;
                case 2:
                    System.out.println(person.imprimir());
                    break;
                case 3:
                    System.out.println("Obrigado!");
                    break;  
                default:
                    System.out.println("Opcao Invalida!!!");
            }
        } while(op != 3);
    }
}
