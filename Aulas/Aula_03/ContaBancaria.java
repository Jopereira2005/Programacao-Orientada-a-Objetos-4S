package Aula_03;

public class ContaBancaria {
    private String id;
    private double saldo;
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito: " + valor);
        
    }
    
    public void sacar(double valor) {
        if((this.saldo - valor) < valor) {
            System.out.println("Saldo Insuficiente!");
        } else {
            this.saldo -= valor;
            System.out.println("Saque: " + valor);
        }
        
    }
    
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
    }

}
