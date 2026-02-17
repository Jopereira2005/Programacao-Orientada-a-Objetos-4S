package Aula_07;

public class Pet {
    private String nome;
    private String raca;
    private int idade;

    public Pet(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
    
    public void imprimir() {
        System.out.println(
            "Nome: " + this.nome +
            "\nRaca: " + this.raca +
            "\nIdade: " + this.idade 
        );
    }   
}
