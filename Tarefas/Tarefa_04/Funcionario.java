package Tarefa_04;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;

    public Funcionario(int cracha, String nome, char tipoVinculo) {
        this.cracha = cracha;
        this.nome = nome;    
        this.tipoVinculo = 
            (Character.toUpperCase(tipoVinculo) == 'H'
                ? 'H'
                : 'N');
        
        this.valorHora = 0;
        this.qtdeHora = 0;
        this.salario = 0;
        this.valorDesconto = 0;
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public float calcularSalario() {
        char tipoVeTratado =  Character.toUpperCase(this.tipoVinculo);
        
        return tipoVeTratado == 'H'          
            ? this.valorHora * this.qtdeHora
            : this.salario;   
    }
    
    public float calcularValorReceber() {
        return ((calcularSalario() - this.valorDesconto) >= 0)
            ? calcularSalario() - this.valorDesconto
            : 0;
    }
    
    public String imprimir() {
        return 
            "\nCracha: " + this.cracha +
            "\nNome: " + this.nome +
            "\nTipo Vinculo: " + this.tipoVinculo +
            "\nSalario: " + calcularSalario() +
            "\nDesconto: " + this.valorDesconto +
            "\nValor a receber: " + calcularValorReceber();          
    }
}
