package Aula_10;

public class Pessoa {
    private String nome;
    private static int contador = 0;

    public Pessoa(String nome) {
        this.nome = nome;
        contador++;
    }

    public String getNome() {
        return nome;
    }

    public static void setContador(int contador) {
        Pessoa.contador = contador;
    }
    
    public static void mostrarTotalPessoa() {
        System.out.println("Total de Pessoas: " + Pessoa.contador);
    }
    
}
