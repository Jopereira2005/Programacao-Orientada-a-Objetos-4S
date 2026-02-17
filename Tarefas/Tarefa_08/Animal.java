package Tarefa_08;

public class Animal {
    private String nome;
    private int idade;

    public Animal() {
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String imprimir() {
        return
            "Nome: " + this.nome +
            "\nIdade: " + this.idade;
    }
    
    public String falar() {
        return "Animal " + this.nome + "fala: Salve mano .-.";
    }
}
