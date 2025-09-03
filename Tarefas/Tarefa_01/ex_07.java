package Tarefa_01;

import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {
        // 7. Calcular e apresentar o volume de uma lata de óleo, utilizando a fórmula: Volume = 3.14159 * r2 * altura
        
        Scanner scan = new Scanner(System.in);
        
        float raio;
        float altura;
        
        System.out.println("Digite o raio da lata em cm: ");
        raio = scan.nextFloat();
        
        System.out.println("Digite a altura da lata em cm: ");
        altura = scan.nextFloat();
        
        System.out.println("O volume da lata de oleo e: " + (3.14159 * (raio*raio) * altura) + "cm3");
    }
 
}
