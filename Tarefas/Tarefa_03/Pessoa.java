package Tarefa_03;

public class Pessoa {
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;
    
    
    public void setCpf(String cpf) {
        String cpf_formatado = cpf.replace(".", "").replace("-", "").replaceAll("\\s+", "");
        if(cpf_formatado.length() != 11) {
            System.out.println("CPF invalido!");
        } else {
            this.cpf = cpf_formatado;
        }   
    }
    
    public void setNome(String nome) {
        if(nome.length() == 0) {
            System.out.println("Nome invalido!");
        } else {
            this.nome = nome;
        }
    }
    
    public void setSexo(char sexo) {
        char letra_formatada = Character.toUpperCase(sexo);
        
        if(letra_formatada == 'M' || letra_formatada == 'F' || letra_formatada == 'O') {
            this.sexo = letra_formatada;
        } else {
            System.out.println("Sexo invalido!");
        }
    }
    
    public void setIdade(int idade) {
        if(idade <= 0) {
            System.out.println("Idade Invalida!");
        } else {
            this.idade = idade;
        }
    }
    
    public String imprimir() {
        return (
            "Nome: " + this.nome + "\n" +
            "CPF: " + this.cpf + "\n" +
            "Sexo: " + (this.sexo == 'F' ? "Feminino" : (this.sexo == 'M' ? "Masculino" : "Outro")) + "\n" +
            "Idade: " + this.idade + "\n"
        );
    }
}
