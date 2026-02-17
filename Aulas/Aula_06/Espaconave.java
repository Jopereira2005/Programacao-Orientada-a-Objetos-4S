package Aula_06;

import java.util.ArrayList;

public class Espaconave {
    private String nome;
    private ArrayList<Arma> listArma = new ArrayList<>();  
    
    public void addArma(Arma arma) {
        listArma.add(arma);
    }
    
    public void addArma(String nome, int dano, String efeito) {
        Arma novaArma = new Arma(nome, dano, efeito);
        this.listArma.add(novaArma);
    }
    
    public void remove(Arma arma) {
        this.listArma.remove(arma);
    }
    
    public void remove(String nome) {
        Arma arma_to_remove = null;
        for(Arma arma: this.listArma ) {
           if(arma.getNome().equals(nome)) {
               arma_to_remove = arma;
               break;
           }
        };
        this.listArma.remove(arma_to_remove);
    }
    
    public void atira(String nome) {
       for(Arma arma: this.listArma ) {
           if(arma.getNome().equals(nome)) {
              arma.atira();
              break;
           }
        }; 
    }
    
    public void atiraTodas() {
       this.listArma.forEach(arma -> {
           arma.atira();
       });
    }
    
    public void listarArmas() {
       this.listArma.forEach(arma -> {
           arma.imprimir();
       });
    }
}
