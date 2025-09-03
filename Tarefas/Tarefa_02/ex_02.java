package Tarefa_02;

import java.util.Scanner;

public class ex_02 {
    /*2) Em uma elei��o presidencial existem quatro candidatos. Os votos s�o informados atrav�s de
        c�digos. Os dados utilizados para a contagem dos votos obedecem � seguinte codifica��o:
        
            1,2,3,4 = voto para os respectivos candidatos;
            5 = voto nulo;
            6 = voto em branco;
            
        Elabore um algoritmo que leia o c�digo do candidato em um voto. Calcule e escreva:
            - total de votos para cada candidato;
            - total de votos nulos;
            - total de votos em branco;
        Como finalizador do conjunto de votos, tem-se o valor 0.*/
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] candidatos = {0, 0, 0, 0, 0, 0};
        int opcao = 0;
        
        while(true) {
            System.out.println("Digite o numero do respectivo candidato: ");
            opcao = scan.nextInt();
            
            if(opcao == 0) {
                break;
            } else if(opcao < 0 || opcao > 6) {
                System.out.println("Op��o invalida!");
            } else {
                candidatos[(opcao - 1)]++;
            }
        }
        
        for(int i = 0; i < 4; i++) {
            System.out.println("O " + (i+1) + "� canditado: " + candidatos[i] + " votos");
        }
        System.out.println("Votos Nulos: " + candidatos[4]);
        System.out.println("Votos em Branco: " + candidatos[5]);

        
    }
}
