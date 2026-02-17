package Aula_07;

public class Main_Tutor {
    public static void main(String[] args) {
        Tutor tutor1 = new Tutor("Paxe", "123456789090");
        Tutor tutor2 = new Tutor("MrPaxe", "0987632121");
        
        Pet pet1 = new Pet("Cachorro do Paxe", "Pitbull", 10);
        Pet pet2 = new Pet("Paxe do Paxe", "Baiacu", 1);
        Pet pet3 = new Pet("Gato do Paxe", "Viralata", 5);
        Pet pet4 = new Pet("Cachorro do MrPaxe", "Dobberman", 8);
        Pet pet5 = new Pet("Cachorro do Paxe", "Pitbull", 2);
            
        tutor1.addPet(pet1);
        tutor1.addPet(pet2);
        tutor1.addPet(pet3);
        
        tutor2.addPet(pet4);
        tutor2.addPet(pet5);

        tutor1.imprimir();
        tutor2.imprimir();
    }
}
