package Tarefa_01;

import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {
        /* 9. Criar um algoritmo que leia o peso de uma pessoa, somente a parte inteira. Calcular e imprimir:
        
        O peso da pessoa em gramas
        O novo peso, em gramas, se a pessoa engordar 12% */
        
        Scanner scan = new Scanner(System.in);
        
        float peso;
        
        System.out.println("Insira o peso em quilos: ");
        peso = scan.nextInt();
        
        float novo_peso = peso * 1.12f;
        
        System.out.println("O peso da pessoa em gramas e: " + peso*1000 + "g");
        System.out.println("O peso caso a pessoa engodar 12%: " + novo_peso*1000 + "kg");

    }
 
}
