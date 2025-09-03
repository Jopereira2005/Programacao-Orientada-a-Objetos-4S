package Tarefa_02;
import java.util.Scanner;

public class ex_03 {
    /*3) Escreva um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma classe.
    O algoritmo deverá ler, além das notas, o código do aluno e deverá ser encerrado quando o
    código for igual a zero. */
    
    public static void main(String[] args) { 
       Scanner scan = new Scanner(System.in);

       double media = 0;
       int codigo = 0;
       
       while(true) { 
            System.out.println("\nDigite o codigo do Aluno: ");
            codigo = scan.nextInt();
           
            if(codigo == 0) break;
           
            for(int i = 1; i <= 3; i++) {
                System.out.println("Digite " + (i) + "º nota do aluno: ");
                media += scan.nextDouble();  
            }
           
            System.out.println("Codigo Aluno: " + codigo);
            System.out.println("Media: " + media/3);
       }
    }
}
