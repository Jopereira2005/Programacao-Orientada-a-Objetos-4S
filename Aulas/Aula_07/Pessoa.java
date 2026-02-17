package Aula_07;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<ContaComum> listContas;

    public Pessoa(String nome) {
        this.nome = nome;
        this.listContas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addConta(ContaComum conta) {
        this.listContas.add(conta);
    }  
}
