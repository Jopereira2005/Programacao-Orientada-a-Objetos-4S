package Aula_07;

public class Main_Funcionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Paxe1");
        Funcionario f2 = new Funcionario("Paxe2");
        Funcionario f3 = new Funcionario("Paxe3");
        
        f1.setChefe(f3);
        f2.setChefe(f3);

        f3.addFuncionario(f1);
        f3.addFuncionario(f2);
        
        f3.imprimir();
        f3.imprimirFuncionario();
    }
}
