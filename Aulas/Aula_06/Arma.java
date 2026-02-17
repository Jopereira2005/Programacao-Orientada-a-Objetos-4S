package Aula_06;

public class Arma {
    private String nome;
    private int dano;
    private String efeito;

    public Arma(String nome, int dano, String efeito) {
        this.nome = nome;
        this.dano = dano;
        this.efeito = efeito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void atira() {
        System.out.println(this.efeito + "\nVoce recebeu " + this.dano);
    }
    
    public void imprimir() {
        System.out.println(
            "-----------------------" +
            "\nNome: " + this.nome +
            "\nDano: " + this.dano +
            "\nEfeito: " + this.efeito +
            "\n-----------------------"
        );
    }

}
