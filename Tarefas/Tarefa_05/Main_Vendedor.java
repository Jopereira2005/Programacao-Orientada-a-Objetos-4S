package Tarefa_05;

import java.util.Scanner;

public class Main_Vendedor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Vendedor vendedor = new Vendedor();
        
        String nome;
        int codigo, op;
        double percentualComissao, valorVenda = 0, desconto = 0;
        
        do {
            System.out.println(
                "\n[1]. Cadastrar Vendedor" +
                "\n[2]. Calcular Venda" +
                "\n[3]. Sair"); 
            System.out.println("Opcao: ");
            op = scan.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Insira o codigo do vendedor: ");
                    codigo = scan.nextInt();
                    scan.nextLine();
                    
                    System.out.println("Insira o nome do vendedor: ");
                    nome = scan.nextLine();
                    
                    System.out.println("Insira o percetual de Comissao do vendedor: ");
                    percentualComissao = scan.nextDouble();
                    
                    vendedor = new Vendedor(codigo, nome, percentualComissao);
                    break;
                case 2:
                    System.out.println("Insira o valor da venda: ");
                    valorVenda = scan.nextDouble();
                    
                    if(valorVenda < 0) {
                        System.out.println("Valor de Venda invalido");
                        valorVenda = 0;
                    } else {
                        System.out.println("Insira o desconto da venda: ");
                        desconto = scan.nextDouble();

                        if(desconto > vendedor.calcularPagamentoComissao(valorVenda)) {
                            System.out.println("Desconto invalido");
                            desconto = 0;
                        }
                    }
                    
                    if(desconto == 0 && valorVenda == 0) {
                        System.out.println(vendedor.imprimir());
                    } else if(desconto == 0) {
                        System.out.println(vendedor.imprimir(valorVenda));
                    } else {
                        System.out.println(vendedor.imprimir(valorVenda, desconto));
                    }
                    
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
