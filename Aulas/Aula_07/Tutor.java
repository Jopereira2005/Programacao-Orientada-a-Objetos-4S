package Aula_07;

import java.util.ArrayList;

public class Tutor {
    private String nome;
    private String cpf;
    private ArrayList<Pet> listaPet;

    public Tutor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.listaPet = new ArrayList<>();
    }
    
    public void addPet(Pet pet) {
        this.listaPet.add(pet);
    }
    
    public void imprimir() {
        System.out.println(
            "Nome:" + this.nome +
            "\nCPF:" + this.cpf +
            "\nPets ===================="
        );
        
        for(Pet pet: listaPet) {
            System.out.println("=========================");
            pet.imprimir();
        }
        System.out.println("=========================");

    }
    
    

}
