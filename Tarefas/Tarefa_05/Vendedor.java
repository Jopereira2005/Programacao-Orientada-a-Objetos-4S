package Tarefa_05;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;

    public Vendedor() {}

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * this.percentualComissao / 100;
    }
    
    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return calcularPagamentoComissao(valorVenda) - desconto;
    }
    
    public String imprimir() {
        return
            "\nCodigo: " + this.codigo +
            "\nNome: " + this.nome +
            "\n% Comissao: " + this.percentualComissao;
    }
    
    public String imprimir(double valorVenda) {
        return
            "\nCodigo: " + this.codigo +
            "\nNome: " + this.nome +            
            "\nValor Venda: " + valorVenda +
            "\n% Comissao: " + this.percentualComissao +
            "\nValor a Pagar: : " + calcularPagamentoComissao(valorVenda);
    }
    
    public String imprimir(double valorVenda, double desconto) {
        return
            "\nCodigo: " + this.codigo +
            "\nNome: " + this.nome +            
            "\nValor Venda: " + valorVenda +
            "\nComissao: " + this.percentualComissao + "%" +
            "\nDesconto: " + desconto +                
            "\nValor a Pagar: : " + calcularPagamentoComissao(valorVenda, desconto);
    }

}
