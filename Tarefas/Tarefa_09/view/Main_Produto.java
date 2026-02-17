package Tarefa_09.view;

import Tarefa_09.dao.ProdutoDAO;
import Tarefa_09.entity.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_Produto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ProdutoDAO produto_dao = new ProdutoDAO();
        ArrayList<Produto> listProduto = null;
        
        String nome;
        int id, quantidade, op;
        double valorUnitario;
        
        while(true) {
            System.out.println(
                "\n[1]. Inserir Produto" +
                "\n[2]. Apagar Produto" +
                "\n[3]. Editar Produto" +
                "\n[4]. Listar Produtos" +
                "\nOpcao: "); 
            op = scan.nextInt();
            scan.nextLine();
            
            switch(op) {
                case 1 -> {
                    System.out.println("Insira o nome do Produto: ");
                    nome = scan.nextLine();

                    System.out.println("Insira a quantidade do Produto: ");
                    quantidade = scan.nextInt();

                    System.out.println("Insira o valor unitario do Produto: ");
                    valorUnitario = scan.nextDouble();
                    
                    produto_dao.inserir(new Produto(nome, quantidade, valorUnitario));
                }
                
                case 2 -> {
                    System.out.println("Insira o id do Produto: ");
                    id = scan.nextInt();
                    scan.nextLine();
                    
                    produto_dao.excluir(id);
                    System.out.println("Produto Excluido com sucesso");
                }
                
                case 3 -> {
                    System.out.println("Insira o id do Produto: ");
                    id = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Insira o nome do Produto: ");
                    nome = scan.nextLine();

                    System.out.println("Insira a quantidade do Produto: ");
                    quantidade = scan.nextInt();

                    System.out.println("Insira o valor unitario do Produto: ");
                    valorUnitario = scan.nextDouble();
                    scan.nextLine();
                    
                    produto_dao.editar(new Produto(id, nome, quantidade, valorUnitario));
                }
                
                case 4 -> {
                    listProduto = produto_dao.getAll(Produto.class);
                    System.out.println("Produtos ================="); 

                    for(Produto produto: listProduto) {
                        System.out.println("ID: " + produto.getId() + " --------------------");
                        System.out.println(
                            "Nome: " + produto.getNome() +
                            "\nQuantidade: " + produto.getQuantidade() +
                            "\nValor Unitario: " + produto.getValorUnitario()
                        );
                        System.out.println("==========================");  
                    } 
                }
                default -> {
                    System.out.println("Opcao Invalida!!!");
                }
            }
        }
    }
}
