package Tarefa_02;

import java.util.Scanner;

public class ex_05 {
    /* 5) Fa�a um Programa que leia um vetor de 5 n�meros inteiros, mostre a soma, a multiplica��o e os
    n�meros.*/
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double[] numeros = new double[5];
        double soma = 0, mult = 1;
        String string = "";
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i+1) + "� numero: ");
            numeros[i] = scan.nextDouble();
        }
        
        for(int i = 0; i < 5; i++) {
            soma += numeros[i];
            mult *= numeros[i];
            string += "[" + numeros[i]+ "] ";
        }
        
        System.out.println("\nNumeros: " + string); 
        System.out.println("Resultado Soma: " + soma);
        System.out.println("Resultado Multiplicacao: " + mult);
    }
}
