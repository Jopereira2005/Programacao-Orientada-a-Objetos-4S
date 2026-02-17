package Tarefa_10;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main_Funcionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Funcionario> listFuncionario = new ArrayList<>();
        
        int op, op2, numeroCracha, qtdeHoras = 0;
        double valorHora = 0, salario = 0, desconto = 0;
        String nome, setor, funcao;
        
        String inputValue = JOptionPane.showInputDialog("Please input a value");

        do {
            System.out.println(
                "\n[1]. Cadastrar Funcionario" +
                "\n[2]. Mostrar todos" +
                "\n[3]. Sair" +
                "\nOpcao: "); 
            op = scan.nextInt();
            scan.nextLine();
            
            switch(op) {
                case 1 -> {
                    System.out.println(
                        "\nQual o tipo de funcionario?" +
                        "\n[1]. Funcionario Horista" +
                        "\n[2]. Funcionario Mensalista" +
                        "\nOpcao: "); 
                    op2 = scan.nextInt();
                    scan.nextLine();
                    
                    if(op2 != 1 && op2 != 2) {
                        System.out.println("Opcao Invalida");
                        break;
                    }
                    
                    numeroCracha = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero do cracha"));
                    nome = JOptionPane.showInputDialog("Insira o nome");
                    setor = JOptionPane.showInputDialog("Insira o setor");
                    funcao = JOptionPane.showInputDialog("Insira a funcao");
                    
                    if(op2 == 1) {
                        qtdeHoras = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de Horas trabalhadas"));
                        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de Horas trabalhadas"));
                        
                        listFuncionario.add(new FuncionarioHorista(numeroCracha, nome, setor, funcao, qtdeHoras, valorHora));
                    } else {
                        System.out.println("Insira o salario: ");
                        salario = scan.nextDouble();
                        
                        System.out.println("Insira o desconto salarial: ");
                        desconto = scan.nextDouble();
                        
                        listFuncionario.add(new FuncionarioMensalista(numeroCracha, nome, setor, funcao, salario, desconto));
                    }
                }
                case 2 -> {
                    if(listFuncionario.isEmpty()) {
                        System.out.println("Cadastre Algum Funcionario");
                        break;
                    }
                    System.out.println("Lista de Funcionarios");
                    System.out.println("--------------------------------------------");
                    for(Funcionario funcionario: listFuncionario) {
                        if(funcionario instanceof FuncionarioHorista) {
                            System.out.println(((FuncionarioHorista) funcionario).toString());  
                        } else {
                            System.out.println(((FuncionarioMensalista) funcionario).toString());  
                        }
                        System.out.println("--------------------------------------------");
                    }
                }
                case 3 -> {
                    System.out.println("Cabo a graca ;-;");
                }
                default -> {
                    System.out.println("Opcao Invalida");
                }
            }
        } while(op != 3);
    }
}
