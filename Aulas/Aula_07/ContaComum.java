package Aula_07;

import java.util.ArrayList;

public class ContaComum {
    private String nome;
    private ArrayList<Pessoa> listPessoas;

    public ContaComum(String nome) {
        this.nome = nome;
        this.listPessoas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addPessoa(Pessoa conta) {
        this.listPessoas.add(conta);
    }
}
