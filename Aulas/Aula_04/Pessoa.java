package Aula_04;

public class Pessoa {
    private String cpf;
    private String nome;
    private String carteira_motorista;

    public Pessoa(String nome, String cpf) {
        String cpf_formatado = cpf.replace(".", "").replace("-", "").replaceAll("\\s+", "");
        if(cpf_formatado.length() != 11) {
            System.out.println("CPF invalido!");
        } else {
            this.cpf = cpf_formatado;
        } 
        
        if(nome.length() == 0) {
            System.out.println("Nome invalido!");
        } else {
            this.nome = nome;
        }
    }

    public String getCarteira_motorista() {
        return carteira_motorista;
    }

    public void setCarteira_motorista(String carteira_motorista) {
        if(carteira_motorista.length() == 0) {
            System.out.println("Carteira invalida!");
        } else {
            this.carteira_motorista = carteira_motorista;
        };
    }
    
    public String imprimir() {
        String msg =
            "\nNome: " + this.nome +
            "\nCPF: " + this.cpf +
            "\nCarteira de Motorista: " 
                + (this.carteira_motorista == null 
                    ? "Nao Habilitado!" : 
                    this.carteira_motorista);
        return msg;
    }   
}
