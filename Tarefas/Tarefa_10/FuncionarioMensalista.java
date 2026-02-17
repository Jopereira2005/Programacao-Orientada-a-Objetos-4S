package Tarefa_10;

public class FuncionarioMensalista extends Funcionario {
    private double salario;
    private double desconto;

    public FuncionarioMensalista() {}

    public FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao, double salario, double desconto) {
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
        this.desconto = desconto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    @Override
    public double calcularSalario() {
        return this.salario - this.desconto;
    }
    
    @Override
    public String toString() {
        return 
            "Cracha: " + super.getNumeroCracha() +
            "\nNome: " + super.getNome() +
            "\nSetor: " + super.getSetor()+
            "\nFuncao: " + super.getFuncao()+
            "\nSalario Bruto: " + this.salario +
            "\nDesconto: " + this.desconto +             
            "\nSalario Final: " + calcularSalario() +
            "\nTipo: Funcionario Mensalista";
    }
}
