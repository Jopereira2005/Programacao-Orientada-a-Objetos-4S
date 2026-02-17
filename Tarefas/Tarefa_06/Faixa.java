package Tarefa_06;

public class Faixa {
    private String titulo;
    private String artista;
    private int duracao;

    public Faixa(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }
    
    public void reproduzir() {
        System.out.println("Reproduzindo " + this.titulo + " de " + this.artista + " (" + this.duracao + "segundos).");
    }
    
    public String print() {
        return 
            "Titulo: " + this.titulo +
            "\nArtista: " + this.artista +
            "\nDuracao: " + this.duracao + "s";
    }
}
