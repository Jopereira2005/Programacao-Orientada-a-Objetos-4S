package Tarefa_04;

import java.util.Scanner;

public class Main_Funcionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario(123456, "Paxe", 'H');
        
        String nome = "";
        int cracha, op;
        char tipoVinculo;
        
        do {
            System.out.println(
                "\n[1]. Cadastrar Novo Funcionario" +
                "\n[2]. Mostrar folha de Pagamento" +
                "\n[3]. Sair"); 
            System.out.println("Opcao: ");
            op = scan.nextInt();
            scan.nextLine();
            
            switch (op) {
                case 1:
                    System.out.println("Insira o nome: ");
                    nome = scan.nextLine();
                    
                    System.out.println("Insira os digitos do cracha: ");
                    cracha = scan.nextInt();
                    
                    System.out.println("Insira o tipo de vinculo (H ou N): ");
                    tipoVinculo = scan.next().charAt(0);
                    
                    funcionario = new Funcionario(cracha, nome, tipoVinculo);
      
                    if(funcionario.getTipoVinculo() == 'H') {
                        System.out.println("Insira o valor da hora trabalhada: ");
                        funcionario.setValorHora(scan.nextFloat());
                        
                        System.out.println("Insira a quantidade de horas trabalhadas: ");
                        funcionario.setQtdeHora(scan.nextFloat());
                    } else {
                       System.out.println("Insira o valor do salario fixo: ");
                       funcionario.setSalario(scan.nextFloat()); 
                    }

                    System.out.println("Insira o valor do desconto salarial: ");
                    funcionario.setValorDesconto(scan.nextFloat());
                    break;
                case 2:
                    System.out.println(funcionario.imprimir());
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
