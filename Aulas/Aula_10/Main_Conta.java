package Aula_10;

public class Main_Conta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.mostraConta();
        
        Conta c2 = new Conta();
        c2.setContador(99);
        c2.mostraConta();
        
        Conta c3 = new Conta();
        c3.mostraConta();
    }
}
