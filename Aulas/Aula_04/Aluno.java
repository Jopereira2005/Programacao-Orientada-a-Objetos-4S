package Aula_04;

public class Aluno {
    // Atributos
    private String nome;
    private String ra;
    private String curso;
    
    // Método Construtor
    public Aluno(String nome, String ra, String curso) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }
    
    // Métodos Acessores e Modificadores
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getRa() {
        return this.nome;
    }
    
    public void setRa(String ra) {
        this.ra = ra;
    }
    
    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // Métodos Auxiliares
    
    public void imprimir() {
        String msg =
            "\nNome: " + nome +
            "\nRA: " + ra +
            "\nCurso: " + curso;
        
        System.out.println(msg);
    }

}
