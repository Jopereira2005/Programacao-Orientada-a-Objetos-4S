package Tarefa_04;

import java.util.Scanner;

public class Main_Animal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Animal animal1 = new Animal("pexe do Paxe", "Peixe", 500);
        Animal animal2 = new Animal("Rex", "Tiranossauro Rex", 62);
        
        String nome = "", tipo = "";
        int idade = 0, op, op2;
        
        while(true) {
            System.out.println(
                "\n[1]. Cadastrar Novo Animal" +
                "\n[2]. Alimentar" +
                "\n[3]. Brincar" +
                "\n[4]. Dormir" +
                "\n[5]. Status"); 
            System.out.println("Opcao: ");
            op = scan.nextInt();
            
            switch (op) {
                case 1:
                    do {
                        System.out.println(
                            "Qual voce deseja substituir?" +
                            "\n[1]. " + animal1.getNome() +
                            "\n[2]. " + animal2.getNome() +
                            "\n[3]. Cancelar");
                        System.out.println("\nOpcao: ");
                        op2 = scan.nextInt();
                        scan.nextLine();
                        
                        if(op2 == 1 || op2 == 2) {
                            System.out.println("Insira o nome: ");
                            nome = scan.nextLine();

                            System.out.println("Insira o tipo: ");
                            tipo = scan.nextLine();

                                
                            System.out.println("Insira a idade: ");
                            idade = scan.nextInt();
                        }
                        
                        switch (op2) {
                            case 1:
                                animal1 = new Animal(nome, tipo, idade);
                                System.out.println("Cadastro concluido!");
                                break;
                            case 2:
                                animal2 = new Animal(nome, tipo, idade);
                                System.out.println("Cadastro concluido!");

                                break;
                            case 3:
                                System.out.println("Cadastro cancelado!");
                                break;
                            default:
                                System.out.println("Opcao invalida");
                        }       
                    } while(op2 != 1 && op2 != 2 && op2 != 3);
                    break;
                case 2:
                    do {
                        System.out.println(
                            "Quem vai comer?" +
                            "\n[1]. " + animal1.getNome() +
                            "\n[2]. " + animal2.getNome());
                        System.out.println("\nOpcao: ");
                        op2 = scan.nextInt();
                       
                        switch (op2) {
                            case 1:
                                animal1.alimentar();
                                break;
                            case 2:
                                animal2.alimentar();
                                break;
                            default:
                                System.out.println("Opcao invalida");
                        }
                    } while(op2 != 1 && op2 != 2);
                    break;
                case 3:
                    do {
                        System.out.println(
                            "Quem vai brincar?" +
                            "\n[1]. " + animal1.getNome() +
                            "\n[2]. " + animal2.getNome());
                        System.out.println("\nOpcao: ");
                        op2 = scan.nextInt();
                       
                        switch (op2) {
                            case 1:
                                animal1.brincar();
                                break;
                            case 2:
                                animal2.brincar();
                                break;
                            default:
                                System.out.println("Opcao invalida");
                        }
                    } while(op2 != 1 && op2 != 2);
                    break;
                case 4:
                    do {
                        System.out.println(
                            "Quem vai dormir?" +
                            "\n[1]. " + animal1.getNome() +
                            "\n[2]. " + animal2.getNome());
                        System.out.println("\nOpcao: ");
                        op2 = scan.nextInt();
                       
                        switch (op2) {
                            case 1:
                                animal1.dormir();
                                break;
                            case 2:
                                animal2.dormir();
                                break;
                            default:
                                System.out.println("Opcao invalida");
                        }
                    } while(op2 != 1 && op2 != 2);
                    break;
                case 5:
                    do {
                        System.out.println(
                            "Qual status voce quer ver?" +
                            "\n[1]. " + animal1.getNome() +
                            "\n[2]. " + animal2.getNome());
                        System.out.println("\nOpcao: ");
                        op2 = scan.nextInt();
                       
                        switch (op2) {
                            case 1:
                                System.out.println("---------------------------");
                                animal1.mostrarStatus();
                                System.out.println("---------------------------");

                                break;
                            case 2:
                                System.out.println("---------------------------");
                                animal2.mostrarStatus();
                                System.out.println("---------------------------");

                                break;
                            default:
                                System.out.println("Opcao invalida");
                        }
                    } while(op2 != 1 && op2 != 2);
                    break;
                default:
                    System.out.println("Opcao Invalida!!!");
            }
        } 
    }
}
