package Tarefa_06;

import java.util.ArrayList;

public class OrganizadorDeMusicas {
    private ArrayList<Faixa> faixas = new ArrayList<>();
    
    public void adicionarFaixa(String titulo, String artista, int duracao) {
        Faixa faixa = new Faixa(titulo, artista, duracao);
        this.faixas.add(faixa);
    }
    
    public void adicionarFaixa(Faixa faixa) {
        this.faixas.add(faixa);
    }
    
    public void listarTodasAsFaixas() {
        int i = 1;
        System.out.println("Lista ================");
        for(Faixa faixa : this.faixas) {
            System.out.println((i++) + "a Faixa =============\n" + faixa.print());
        };
        System.out.println("======================");        
    }
    
    public void reproduzirFaixa(int indice) {
        if(indice >= 1 && indice <= this.faixas.size()) {
            this.faixas.get(indice - 1).reproduzir();
        } else {
            System.out.println("Indice invalido");
        }
    }
    
    public void removerFaixa(int indice) {
        if(indice >= 1 && indice <= this.faixas.size()) {
            this.faixas.remove(indice - 1);
        } else {
            System.out.println("Indice invalido");
        }
    }
}
