package Aula_07;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private ArrayList<Funcionario> listFuncionario;
    private Funcionario chefe;

    public Funcionario(String nome) {
        this.nome = nome;
        this.listFuncionario = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }
    
    public void addFuncionario(Funcionario func) {
        this.listFuncionario.add(func);
    }
    
    public void imprimirFuncionario() {
        for(Funcionario func: this.listFuncionario) {
            System.out.println(func.getNome());
        }
    }
    
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
    }
    
    
    
}
