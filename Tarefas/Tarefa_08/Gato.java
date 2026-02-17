package Tarefa_08;

public class Gato extends Animal {
    private int alturaSalto;

    public Gato() {
    }

    public Gato(String nome, int idade, int alturaSalto) {
        super(nome, idade);
        this.alturaSalto = alturaSalto;
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(int alturaSalto) {
        this.alturaSalto = alturaSalto;
    }
    
    @Override
    public String imprimir() {
        return
            "Gato =================\n" +
            super.imprimir() +
            "\nAltura do Salto: " + this.alturaSalto + "m";
    }
    
    @Override
    public String falar() {
        return "Gato " + super.getNome() + " fala: Salve soo miarmiar!";
    }
    
    
}
