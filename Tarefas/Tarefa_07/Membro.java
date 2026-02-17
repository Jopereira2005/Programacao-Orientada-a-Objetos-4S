package Tarefa_07;

public class Membro {
    private String nome;
    private String cargo;

    public Membro(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String print() {
        return 
            "Nome: " + this.nome +
            "\nCargo: " + this.cargo;
    }
}
