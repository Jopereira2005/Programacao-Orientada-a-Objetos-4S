package Aula_10;

public class Conta {
    private static int contador = 0;
    private int id;
    
    public Conta() {
       this.contador++;
       this.id = this.contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void mostraConta() {
        System.out.println(
            "ID: " + this.id +
            "\nContador: " + contador
        );
    }
    
    public static void mostraContador() {
        System.out.println("Contador: " + contador);
    }
}
