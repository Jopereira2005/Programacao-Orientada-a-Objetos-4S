package Tarefa_07;

import java.util.ArrayList;
import java.util.Scanner;


public class Main_Projeto {
    private static Scanner scan = new Scanner(System.in);
        
    private static ArrayList<Projeto> projetos = new ArrayList<>();    
    private static ArrayList<Membro> membros = new ArrayList<>();
    
    public static void main(String[] args) {
        Projeto projeto = null;
        Membro membro = null;
        
        String nome = "", descricao = "", cargo = "", status = "";
        int id, op, op2, op3;

//        Membro membro1 = new Membro("Mr Paxe", "Programador Chefe");;;
//        Membro membro2 = new Membro("Junior Paxe", "Programador Junior");
//        Membro membro3 = new Membro("Pleno Paxe", "Programador Pleno");
//        Membro membro4 = new Membro("Senior Paxe", "Programador Senior");
//        
//        Projeto projeto = new Projeto(12345678, "SmartPark");
//        projeto.adicionarTarefa(1234, "Pegar café", membro2, "Concluido");
//        projeto.adicionarTarefa(5678, "Programar até o burnout", membro3, "Concluido");
//        projeto.adicionarTarefa(8901, "Corrigir os erros", membro4, "Pendente");
//        projeto.adicionarTarefa(2346, "Tomar café e relaxar", membro1, "Em andamento");
        
//        System.out.println(projeto.print());;
//        projeto.listarTarefas();
        
        while(true) {
            System.out.println(
                "\n[1]. Cadastrar Projeto" +
                "\n[2]. Adicionar Tarefa" +
                "\n[3]. Substituir Membro em Tarefa" +
                "\n[4]. Lista Projetos" +                        
                "\n[5]. Mostrar Projeto"); 
            System.out.println("Opcao: ");
            op = scan.nextInt();
            scan.nextLine();
            
            switch(op) {
                case 1 -> {
                    System.out.println("Insira o ID do Projeto: ");
                    id = scan.nextInt();
                    scan.nextLine();
                    
                    System.out.println("Insira o Nome do Projeto: ");
                    nome = scan.nextLine();
                    
                    projetos.add(new Projeto(id, nome));
                }
                case 2 -> {
                    if(projetos.isEmpty()) {
                        System.out.println("Nenhum Projeto Cadastrado!");
                        continue;
                    }
                    
                    System.out.println("Insira o ID do Projeto: ");
                    id = scan.nextInt();
                    scan.nextLine();
                    
                    projeto = procurarProjetoID(id);
                    
                    if(projeto == null) {
                        System.out.println("Projeto não encontrado");
                        continue;
                    }
                    
                    System.out.println("Insira o ID do Tarefa: ");
                    id = scan.nextInt();
                    scan.nextLine();
                    
                    System.out.println("Insira a descricao da Tarefa: ");
                    descricao = scan.nextLine();
                    
                    System.out.println("Insira o status da Tarefa: ");
                    status = scan.nextLine();
                    
                    if(membros.isEmpty()) {
                        System.out.println( 
                            "[1]. Adicionar novo membro" + 
                            "\n[*]. Adicionar membro existente"    
                        );
                    } else {
                        System.out.println( 
                            "[1]. Adicionar novo membro" + 
                            "\n[2]. Adicionar membro existente"
                        );
                    }                 
                    System.out.println("Opcao: ");
                    op2 = scan.nextInt();
                    scan.nextLine();
                    
                    if(op2 == 1) {
                        System.out.println("Insira o Nome do Membro: ");
                        nome = scan.nextLine();
                        
                        System.out.println("Insira o Cargo do Membro: ");
                        cargo = scan.nextLine();
                        
                        membro = new Membro(nome, cargo);
                        membros.add(membro);
                    }  else if(op2 != 1 && !membros.isEmpty()) {
                        System.out.println("Escolha entre um dos membros");
                        int i = 1;
                        for(Membro m: membros) {
                            System.out.println("[" + i +"] -------------");
                            System.out.println(m.print());
                        }
                        System.out.println("-----------------");
                        System.out.println("Opcao: ");
                        op3 = scan.nextInt();
                        scan.nextLine();
                        
                        if(op3 < 0 || op3 > membros.size()) {
                            System.out.println("Opcao invalida");
                            continue;
                        }
                        
                        membro = membros.get(op3 - 1);
                    } else {
                        System.out.println("Opcao invalida");
                        continue;                    }
                    
                    projeto.adicionarTarefa(id, descricao, membro, status);
                }
                case 3 -> {
                    if(projetos.isEmpty()) {
                        System.out.println("Nenhum Projeto Cadastrado!");
                        continue;
                    }
                    
                    System.out.println("Projetos");
                    listaProjeto();
                    
                    System.out.println("Insira o ID do Projeto: ");
                    id = scan.nextInt();
                    scan.nextLine();
                    
                    projeto = procurarProjetoID(id);
                    if(projeto == null || projeto.getTarefas() == null) {
                        System.out.println("Projeto não encontrado ou sem Tarefas");
                        continue;
                    }
                    
                    System.out.println(projeto.print());
                    projeto.listarTarefas();
                    System.out.println("Insira o ID da Tarefa: ");
                    id = scan.nextInt();
                    scan.nextLine();
                    
                    Tarefa tarefa = procurarTarefaID(id, projeto.getTarefas());
                    if(tarefa == null) {
                        System.out.println("Tarefa não encontrada");
                        continue;
                    }
                    
                    if(membros.isEmpty()) {
                        System.out.println( 
                            "[1]. Adicionar novo membro" + 
                            "\n[*]. Adicionar membro existente"    
                        );
                    } else {
                        System.out.println( 
                            "[1]. Adicionar novo membro" + 
                            "\n[2]. Adicionar membro existente"
                        );
                    }                 
                    System.out.println("Opcao: ");
                    op2 = scan.nextInt();
                    scan.nextLine();
                    
                    if(op2 == 1) {
                        System.out.println("Insira o Nome do Membro: ");
                        nome = scan.nextLine();
                        
                        System.out.println("Insira o Cargo do Membro: ");
                        cargo = scan.nextLine();
                        
                        membro = new Membro(nome, cargo);
                        membros.add(membro);
                    }  else if(op2 != 1 && !membros.isEmpty()) {
                        System.out.println("Escolha entre um dos membros");
                        int i = 1;
                        for(Membro m: membros) {
                            System.out.println("[" + i +"] -------------");
                            System.out.println(m.print());
                        }
                        System.out.println("-----------------");

                        System.out.println("Opcao: ");
                        op3 = scan.nextInt();
                        scan.nextLine();
                        
                        if(op3 < 0 || op3 > membros.size()) {
                            System.out.println("Opcao invalida");
                            continue;
                        }
                        
                        membro = membros.get(op3 - 1);
                    } else {
                        System.out.println("Opcao invalida");
                        continue;
                    }
                    
                    tarefa.setMembroResponsavel(membro);   
                }
                case 4 -> {
                    if(projetos.isEmpty()) {
                        System.out.println("Nenhum Projeto Cadastrado!");
                        continue;
                    }
                    
                    System.out.println("Lista de Projetos");
                    listaProjeto();
                }
                case 5 -> {
                    if(projetos.isEmpty()) {
                        System.out.println("Nenhum Projeto Cadastrado!");
                        continue;
                    }
                    
                    System.out.println("Insira o ID do Projeto: ");
                    id = scan.nextInt();
                    scan.nextLine();
                    
                    projeto = procurarProjetoID(id);
                    
                    if(projeto == null) {
                        System.out.println("Projeto não encontrado");
                        continue;
                    }
                    
                    System.out.println(projeto.print());
                    if(!projeto.getTarefas().isEmpty()) {
                       projeto.listarTarefas(); 
                    }
                }
            }        
        }     
    }
    
    public static Projeto procurarProjetoID(int id) {
        for (Projeto p : projetos) {
            if (p.getId() == id) return p;
        }
        return null;
    }
    
    public static void listaProjeto() {
        for(Projeto p: projetos) {
            System.out.println(p.print());  
        }
    }
    
    public static Tarefa procurarTarefaID(int id, ArrayList<Tarefa> tarefas) {
        for (Tarefa t: tarefas) {
            if (t.getId() == id) return t;
        }
        return null;
    }
}
