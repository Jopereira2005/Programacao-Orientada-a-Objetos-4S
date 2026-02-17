package Aula_06;

import java.util.ArrayList;

public class Main_Lista {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        
        listaNomes.add("Paxe");
        listaNomes.add("MrPaxe");
        listaNomes.add("MisterPaxe");
        
        System.out.println("Nome: " + listaNomes.get(0));
        
        if(listaNomes.contains("Paxe")) {
            System.out.println("Tem o Paxe");
        }
        
        if(listaNomes.isEmpty()) {
            System.out.println("Ta Vazia");
        } else {
            System.out.println("Nao ta vazia");
        }
        
        System.out.println("\nFor Normal: ");
        for(int i = 0;i < listaNomes.size(); i++) {
            System.out.println(listaNomes.get(i));
        }
        
        System.out.println("\nForEach: ");
        for(String nome: listaNomes) {
            System.out.println(nome);
        }
        
        System.out.println("\nForEach Metodo: ");
        listaNomes.forEach(nome -> {
            System.out.println(nome);
        });
        
        listaNomes.remove(2);
        listaNomes.remove("MisterPaxe");

        
    }
 
}
