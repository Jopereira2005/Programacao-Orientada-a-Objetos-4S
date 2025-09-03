package Tarefa_01;
import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {
        /* 6. Sabe-se que 1 quilowatt de energia custa 1/500 avos do salário mínimo. Faça um algoritmo que receba o
        valor do salário mínimo e a quantidade de quilowatts consumida por uma residência. Calcule e mostre:
        
        A. O valor, em reais, de cada quilowatt;
        B. O valor, em reais, a ser pago por essa residência
        C. O valor, em reais, a ser pago com desconto de 15% */
        
        Scanner scan = new Scanner(System.in);

        float salario_minimo;
        float quilowatts_residencia;
        
        System.out.println("Digite o valor do salario minimo: ");
        salario_minimo = scan.nextFloat();
        
        System.out.println("Digite o gasto da residencia em quilowatts: ");
        quilowatts_residencia = scan.nextFloat();

        
        float valor_watts = salario_minimo/500;
        float valor_pago = valor_watts * quilowatts_residencia;
        
        System.out.println("A. O valor de cada quilowatt e: R$" + valor_watts);
        System.out.println("B. O valor pago pela residencia e: R$" + valor_pago);
        System.out.println("C. O valor pago pela residencia com 15% de desconto e: R$" + (valor_pago - (valor_pago*0.15)));


    }
}
