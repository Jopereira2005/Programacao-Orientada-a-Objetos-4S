package Tarefa_02;

import java.util.Scanner;

public class ex_05 {
    /* 5) Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os
    números.*/
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double[] numeros = new double[5];
        double soma = 0, mult = 1;
        String string = "";
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i+1) + "º numero: ");
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
