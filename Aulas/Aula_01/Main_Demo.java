package Aula_01;
import java.util.Scanner;

public class Main_Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int idade;
        float valor;
        boolean isTrue;

        System.out.println("Digite o nome verdadeiro do Paxe: ");
        nome = scan.nextLine();
        // Gambiarra pra consumir o enter -> scan.nextLine(); 
 
        System.out.println("Digite a idade do Paxe: ");        
        idade = scan.nextInt();
        
        System.out.println("Digite o valor da conta bancaria de Paxe: ");
        valor = scan.nextFloat();
        
        System.out.println("Essas informações são verdadeiras?: ");
        isTrue = scan.nextBoolean();
        
        System.out.println("O nome verdadeiro do Paxe e " + nome + " ele tem tem " + idade + " anos e exatos R$" + valor + " na conta bancaria, essas informacoes sao totalmente " + (isTrue == true ? "verdadeiras" : "falsas"));
    }
}
