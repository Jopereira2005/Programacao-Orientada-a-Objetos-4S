package Aula_08;

import java.util.ArrayList;

public class Main_Pessoa {
    public static void main(String[] args) {
       Professor prof = new Professor("MrPaxe", "123", "A1");
       prof.setSalario(35000);
       prof.setTipoVinculo('N');
       
       Aluno alu = new Aluno("Paxinho", "2222", "RA222222");
       alu.setNota1(6.8);
       alu.setNota2(7.6);
       
//        System.out.println(prof.imprimir());
//        System.out.println(alu.imprimir());
        
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        lstPessoas.add(prof);
        lstPessoas.add(alu);
        
        // imprimir todos
//        for (Pessoa p : lstPessoas) {
//            System.out.println(p.imprimir());
//        }
        
        // imprimir apenas alunos
        for (Pessoa p : lstPessoas) {
            if (p instanceof Aluno) {
                System.out.println(((Aluno) p).getRa()); 
            }
            
        }
    }
}