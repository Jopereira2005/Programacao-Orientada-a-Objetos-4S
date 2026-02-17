package Tarefa_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Animal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Animal> listAnimal = new ArrayList<>();
        
        String nome;
        int idade = 0, aux = 0, op, op2;
        
        do {
            System.out.println(
                "\n[1]. Cadastrar Animal" +
                "\n[2]. Mostrar todos" +
                "\n[3]. Animais falando" +
                "\n[4]. Sair" +
                "\nOpcao: "); 
            op = scan.nextInt();
            scan.nextLine();
            
            switch(op) {
                case 1 -> {
                    System.out.println(
                        "\nQual o tipo do Animal" +
                        "\n [1]. Cachorro" +
                        "\n [2]. Gato" +    
                        "\n [3]. Capivara" +
                        "\nOpcao: ");
                    op2 = scan.nextInt();
                    scan.nextLine();
                    
                    switch(op2) {
                        case 1 -> {
                            System.out.println("Insira o nome do Cachorro: ");
                            nome = scan.nextLine();

                            System.out.println("Insira a idade do Cachorro: ");
                            idade = scan.nextInt();

                            System.out.println("Insira a velocidade do Cachorro: ");
                            aux = scan.nextInt();
                            scan.nextLine();
                            
                            listAnimal.add(new Cachorro(nome, idade, aux));
                        }
                        case 2 -> {
                            System.out.println("Insira o nome do Gato: ");
                            nome = scan.nextLine();

                            System.out.println("Insira a idade do Gato: ");
                            idade = scan.nextInt();

                            System.out.println("Insira a altura do salto do Gato: ");
                            aux = scan.nextInt();
                            scan.nextLine();
                            
                            listAnimal.add(new Gato(nome, idade, aux));
                        }
                        case 3 -> {
                            System.out.println("Insira o nome da Capivara: ");
                            nome = scan.nextLine();

                            System.out.println("Insira a idade da Capivara: ");
                            idade = scan.nextInt();

                            System.out.println("Insira o peso da Capivara: ");
                            aux = scan.nextInt();
                            scan.nextLine();
                            
                            listAnimal.add(new Capivara(nome, idade, aux));
                        }
                        default -> {
                            System.out.println("Opcao Invalida");
                        }
                    }
                }
                case 2 -> {
                    for(Animal animal: listAnimal) {
                        if (animal instanceof Cachorro) {
                            System.out.println(((Cachorro) animal).imprimir()); 
                        } else if (animal instanceof Gato) {
                            System.out.println(((Gato) animal).imprimir()); 
                        } else if (animal instanceof Capivara) {
                            System.out.println(((Capivara) animal).imprimir()); 
                        } else {
                            System.out.println(animal.imprimir()); 
                        }
                    }
                }
                case 3 -> {
                    for(Animal animal: listAnimal) {
                        if (animal instanceof Cachorro) {
                            System.out.println(((Cachorro) animal).falar()); 
                        } else if (animal instanceof Gato) {
                            System.out.println(((Gato) animal).falar()); 
                        } else if (animal instanceof Capivara) {
                            System.out.println(((Capivara) animal).falar()); 
                        } else {
                            System.out.println(animal.falar()); 
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Cabo a graca ;-;");
                }   
                default -> {
                    System.out.println("Opcao Invalida!!!");
                }
            }
        } while(op != 4);
    }
}
