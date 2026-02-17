package Tarefa_06;

import java.util.Scanner;

public class Main_Organizador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        OrganizadorDeMusicas organizador = new OrganizadorDeMusicas();
        
        String titulo, artista;
        int duracao, indice, op;
        
        do {
            System.out.println(
                "\n[1]. Adicionar Faixa" +
                "\n[2]. Remover Faixa" +
                "\n[3]. Reproduzir Faixa" +
                "\n[4]. Listar todas as Faixas" +
                "\n[5]. Sair"); 
            System.out.println("Opcao: ");
            op = scan.nextInt();
            scan.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Insira o titulo da Faixa: ");
                    titulo = scan.nextLine();
                    
                    System.out.println("Insira o nome do artista: ");
                    artista = scan.nextLine();
                    
                    System.out.println("Insira a duracao da faixa em segundos: ");
                    duracao = scan.nextInt();
                    
                    organizador.adicionarFaixa(titulo, artista, duracao);
                    break;
                case 2:
                    System.out.println("Insira o indice da Faixa: ");
                    organizador.removerFaixa(scan.nextInt());           
                    break;
                case 3:
                    System.out.println("Insira o indice da Faixa: ");
                    organizador.reproduzirFaixa(scan.nextInt());           
                    break;
                case 4:
                    organizador.listarTodasAsFaixas();
                    break;
                case 5:
                    System.out.println("Cabo a graça!");
                    break;
                default:
                    System.out.println("Opcao Invalida!!!");
            }
        } while(op != 5);
    }
}
