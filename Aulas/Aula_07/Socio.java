package Aula_07;

import java.util.ArrayList;

public class Socio {
    private String nome;
    private ArrayList<Dependente> listDependente;

    public Socio(String nome) {
        this.nome = nome; 
        this.listDependente = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addDependente(Dependente dep) {
        this.listDependente.add(dep);
    }
    
    public void imprimirDependentes() {
        for(Dependente dep: this.listDependente) {
            System.out.println(dep.getNome());
        }
    }
    
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
    }
    
    
}
