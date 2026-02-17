package Aula_08;

public class Pessoa {
   protected String nome;
   private String cpf;
   private String celular;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String imprimir() {
        String msg = "\nNome: "+nome
                    +"\nCPF: "+cpf
                    +"\nCelular: "+celular;
        
        return msg;
    }

}
