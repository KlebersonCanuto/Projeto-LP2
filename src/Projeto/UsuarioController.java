package Projeto;

import java.util.HashSet;

public class UsuarioController {

	private HashSet<Usuario> usuarios;
	
	public UsuarioController(){
		
		usuarios = new HashSet<>();
	}
	
	public void adicionaUsuario(String nome, String telefone, String email){
		
		Usuario usuario = new Usuario(nome, telefone, email);
		usuarios.add(usuario);
	}
}
