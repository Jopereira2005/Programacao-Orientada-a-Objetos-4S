package Aula_07;

public class Main_Socio {
    public static void main(String[] args) {
        Socio s1 = new Socio("Paxe");
        
        Dependente d1 = new Dependente("Mae do Paxe");
        s1.addDependente(d1);
        
        Dependente d2 = new Dependente("Pae do Paxe");
        s1.addDependente(d2);
        
        Dependente d3 = new Dependente("Irmao do Paxe");
        s1.addDependente(d3);
        
        s1.imprimir();
        s1.imprimirDependentes();
    }
}
