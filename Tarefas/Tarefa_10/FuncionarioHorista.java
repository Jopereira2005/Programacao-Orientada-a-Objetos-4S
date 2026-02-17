package Tarefa_10;

public class FuncionarioHorista extends Funcionario {
    private int qtdeHoras;
    private double valorHora;

    public FuncionarioHorista() {}

    public FuncionarioHorista(int numeroCracha, String nome, String setor, String funcao, int qtdeHoras, double valorHora) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSalario() {
        return this.qtdeHoras * this.valorHora;
    }
    
    @Override
    public String toString() {
        return 
            "Cracha: " + super.getNumeroCracha() +
            "\nNome: " + super.getNome() +
            "\nSetor: " + super.getSetor()+
            "\nFuncao: " + super.getFuncao()+
            "\nHoras Trabalhadas: " + this.qtdeHoras +
            "\nValor Hora: " + this.valorHora +             
            "\nSalario Final: " + calcularSalario() +
            "\nTipo: Funcionario Horista";
    }
}
