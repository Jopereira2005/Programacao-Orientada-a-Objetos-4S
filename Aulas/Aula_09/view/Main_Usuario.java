package Aula_09.view;

import Aula_09.entity.Usuario;
import Aula_09.dao.UsuarioDAO;
import java.util.ArrayList;


public class Main_Usuario {
    public static void main(String[] args) {
        // Usuario user = new Usuario("Paxe4", "12345678");
        UsuarioDAO usuario_dao = new UsuarioDAO();
        ArrayList<Usuario> listUsuarios = usuario_dao.getAllUsuarios();
        
        // usuario_dao.inserir(user);
        // for(Usuario usuario: listUsuarios) {
        //    System.out.println(usuario.getLogin());
        // }
        
        
        // Usuario user_01 = usuario_dao.getUserById(2);
        // System.out.println(user_01.getLogin());
        
        if(usuario_dao.autenticar("Paxe", "12345678")) {
            
        }
    }
}
