package Tarefa_01;

import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {
        /* 8. Criar um algoritmo que efetue o cálculo do salário líquido de um professor. Os dados fornecidos serão:
        
        valor da hora aula, número de aulas dadas no mês e percentual de desconto do INSS. */
        
        Scanner scan = new Scanner(System.in);
        
        float valor_aula;
        int qtdd_aula_mes;
        float desconto_inss;
        
        System.out.println("Valor em R$ das aulas: ");
        valor_aula = scan.nextFloat();
        
        System.out.println("Quantidade de aulas dadas no mês: ");
        qtdd_aula_mes = scan.nextInt();
        
        System.out.println("Porcentagêm do desconto do INSS: ");
        desconto_inss = scan.nextFloat();
        
        float salario_bruto = valor_aula * qtdd_aula_mes;
        System.out.println("O valor final do salário é: R$" + (salario_bruto - (salario_bruto * (desconto_inss/100))));
    }
 
}
