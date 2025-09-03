package Tarefa_02;
import java.util.Scanner;
import java.util.ArrayList;

public class ex_06 {
    /* 6) Faça um Programa que leia 10 números inteiros e armazene-os num vetor. Armazene os números
    pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores. */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Double> pares = new ArrayList<>();
        ArrayList<Double> impares = new ArrayList<>();

        double aux;
        String string_pares = "";
        String string_impares = "";

        
        for(int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "º numero: ");
            aux = scan.nextDouble();
            
            if(aux % 2 == 0) {
                pares.add(aux);
            } else {
                impares.add(aux);
            }
        }
        
        System.out.println("\nNumeros Pares: " + pares);
        System.out.println("\nNumeros Impares: " + impares);
    }
}
