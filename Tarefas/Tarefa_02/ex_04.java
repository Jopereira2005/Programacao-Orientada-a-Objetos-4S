package Tarefa_02;

import java.util.Scanner;

public class ex_04 {
    /* 4) Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem
    pares. Termine a leitura se o usuário digitar zero (0).*/
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double num, resultado = 0;
        int contador = 0;
        
        while(true) {
            System.out.println("Digite um numero: ");
            num = scan.nextDouble();
            
            if(num == 0) break;
            
            if(num % 2 == 0) {
                contador++;
                resultado += num;
            }
        }
        
        System.out.println("A media dos valores pares inserido e: " + resultado/contador);
    }
}
