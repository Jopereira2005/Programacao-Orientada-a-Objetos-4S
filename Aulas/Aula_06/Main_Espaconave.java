package Aula_06;

public class Main_Espaconave {
    public static void main(String[] args) {
        Espaconave nave1 = new Espaconave();
        nave1.addArma("Redline do Paxe", 44, "Ratata");
        nave1.addArma("Clock-48", 1, "pi pi pi");

        Arma a = new Arma("AWP", 100, "My Aibipiiiii");
        
        nave1.addArma(a);
        nave1.atira("Fuzil do Paxe");
        
        System.out.println("Antes do Remove: ");
        nave1.listarArmas();
        
        nave1.remove("Clock-48");
        nave1.remove("Redline do Paxe");
        
        System.out.println("Depois do Remove: ");
        nave1.listarArmas();
        
        Espaconave nave2 = new Espaconave();
        nave2.addArma(a);
        
        nave2.atira("Glock");
    }
}
