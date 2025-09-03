package Aula_03;

public class Main_Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        
        aluno1.setNome("Paxe");
        aluno1.setRa("123456");
        aluno1.setCurso("Computacao");
        
        Aluno aluno2 = new Aluno();
        
        aluno2.setNome("Mr Paxe");
        aluno2.setRa("654321");
        aluno2.setCurso("Computacao");
        
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("RA: " + aluno1.getRa());
        System.out.println("Curso: " + aluno1.getCurso());
        
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("RA: " + aluno2.getRa());
        System.out.println("Curso: " + aluno2.getCurso());

    }  
}
