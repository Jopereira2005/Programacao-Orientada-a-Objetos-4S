package Aula_04;

public class Main_Pessoa {
    public static void main(String[] args) {
        Pessoa person = new Pessoa("Paxe", "12345678909");
        
        System.out.println(person.imprimir());

        person.setCarteira_motorista("1234567890");
        
        System.out.println(person.imprimir());
        
    }
}
