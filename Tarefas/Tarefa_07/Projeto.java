package Tarefa_07;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nome;
    private ArrayList<Tarefa> tarefas;

    public Projeto(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void adicionarTarefa(int id, String descricao, Membro membro, String status) {
        this.tarefas.add(new Tarefa(id, descricao, membro, status));
    }
    
    public void removerTarefa(int indice) {
        this.tarefas.remove(indice);
    }
    
    public void listarTarefas() {
        int i = 1;
        for(Tarefa tarefa: tarefas) {
            System.out.println("Tarefa " + i +" |=============================");
            System.out.println(tarefa.print());
            i++;
        }
        System.out.println("=======================================");
    }
    
    public String print() {
        return 
            "Nome: " + this.nome +
            "\nQuantidade Tarefas: " + this.tarefas.size();
    }
    
    
}
