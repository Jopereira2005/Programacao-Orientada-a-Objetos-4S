package Tarefa_05;

public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice() {}

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = 
            (Character.toUpperCase(sexo) == 'M'
                ? 'M'
                : 'F');
        this.valorAutomovel = valorAutomovel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public double calcularValor() {
        char sexo = Character.toUpperCase(this.sexo);
        
        if(sexo == 'M' && idade <= 25) {
            System.out.println("blalalala: " + this.valorAutomovel*10/100);
            return (this.valorAutomovel*10/100);
        } else if(sexo == 'M' && idade > 25) {
            return (this.valorAutomovel*5/100);
        } else {
            return (this.valorAutomovel*2/100);
        } 
    }
    
    public String imprimir() {
        return 
            "Número: " + this.numero +
            "\nNome: " + this.nome + 
            "\nIdade: " + this.idade + 
            "\nSexo: " + this.sexo + 
            "\nValor Automovel: " + this.valorAutomovel + 
            "\nValor Apolice: " + calcularValor();    
    }
}
