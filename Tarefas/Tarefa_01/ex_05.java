package Tarefa_01;
import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        /* 5. Construir um programa em java que leia o ano de nascimento de João e o ano atual, calcule e
        mostre:
        
        Quantos anos João tem
        Quantos anos João terá em 2016 */
        
        Scanner scan = new Scanner(System.in);
        int ano_atual;
        int ano_nascimento;
        
        System.out.println("Digite o ano de nascimento de Joao: ");
        ano_nascimento = scan.nextInt();
        
        System.out.println("Digite o ano atual: ");
        ano_atual = scan.nextInt();
        
        System.out.println("Joao atualmente tem " + (ano_atual - ano_nascimento) + " anos");
        System.out.println("Joao em 2016 tem" +
        (((2016 - ano_nascimento) < 0)
        ? ", ..., calma, deixa o menino nascer antes .-."
        : ((2016 - ano_nascimento) + " anos")));

    }
}
