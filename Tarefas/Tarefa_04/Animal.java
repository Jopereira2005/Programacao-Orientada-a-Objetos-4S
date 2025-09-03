package Tarefa_04;

public class Animal {
    private String nome;
    private String tipo;
    private int idade;
    private int energia;
    private int felicidade;

    public Animal(String nome, String tipo, int idade) {
        this.nome = nome;
        this.tipo = tipo;
        if(this.idade > 11000) {
            System.out.println("Idade Invalida, o animal mais velho do mundo vive ate 11000 anos");
            System.exit(0);
        }
        this.idade = idade;
        this.energia = 100;
        this.felicidade = 100;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void alimentar() {
        this.energia += 10;
        
        System.out.println(this.nome + " foi alimentado!");
    }
    
    public void brincar() {
        this.felicidade += 10;
        this.energia -= 5;
        
        if(this.energia <= 0) {
            System.out.println(this.nome + " morreu de tanto brincar ;-;");
            System.out.println("\nA festa acabou, ASSASSINO!!!");
            System.exit(0);
        }
      
        if(this.energia < 25) {
            System.out.println(this.nome + " esta brincando e esta mais feliz, mas cansado!");
        } else {
            System.out.println(this.nome + " esta brincando e esta mais feliz!");
        }
    }
    
    public void dormir() {
        this.energia = 100;
        System.out.println(this.nome + " dormiu e esta com energia maxima!");
    }
    
    public void mostrarStatus() {
        String status =
            "Nome: " + this.nome +
            "\nTipo: " + this.tipo +
            "\nIdade: " + this.idade +
            "\nEnergia: " + this.energia +
            "\nFelicidade: " + this.felicidade;
        System.out.println(status);
    }      
}
