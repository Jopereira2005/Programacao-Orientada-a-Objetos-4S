package Tarefa_02;

import java.util.Scanner;

public class ex_01 {
    /* 1) Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos. O
    final da leitura acontecerá quando for lido um valor negativo. */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        double resultado = 0, valor = 0;
        int contador = 0;
    
        while(true) {
            System.out.println("Digite um valor: ");
            valor = scan.nextDouble();
            
            if(valor >= 0) {
                contador++;
                resultado += valor;
            } else {
                break;
            }
        }
        System.out.println("A media dos valores digitados e: " + resultado/contador);
    }
}
