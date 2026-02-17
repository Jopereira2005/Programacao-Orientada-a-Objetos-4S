package Tarefa_08;

public class Capivara extends Animal{
    private int peso;

    public Capivara() {
    }

    public Capivara(String nome, int idade, int peso) {
        super(nome, idade);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
    public String imprimir() {
        return
            "Capivara =============\n" +
            super.imprimir() +
            "\nPeso: " + this.peso + "kg";
    }
    
    @Override
    public String falar() {
        return "Capivara " + super.getNome() + " fala: Salve Sargento cricricri!";
    }
    
    
}
