package Tarefa_08;

public class Cachorro extends Animal{
    private int velocidade;

    public Cachorro() {
    }

    public Cachorro(String nome, int idade, int velocidade) {
        super(nome, idade);
        this.velocidade = velocidade;
    }
    
    @Override
    public String imprimir() {
        return
            "Cachorro =============\n" +
            super.imprimir() +
            "\nVelocidade: " + this.velocidade + "km/h";
    }
    
    @Override
    public String falar() {
        return "Cachorro " + super.getNome() + " fala: Salve mano auauau!";
    }
    
    
}
