package Aula_07;

public class Main_Pessoa {
    public static void main(String[] args) {
        Pessoa p =  new Pessoa("Paxe");
        ContaComum c = new ContaComum("poupanca");
        
        p.addConta(c);
        p = null;
    }
}
