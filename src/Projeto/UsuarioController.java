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
	
	public void removerUsuario(String nome, String telefone) {

		if (usuarioExiste(nome, telefone))
			usuarios.remove(getUsuario(nome, telefone));
	}

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {

		Usuario usuario = getUsuario(nome, telefone);
		if(atributo.toLowerCase().equals("email"))
			usuario.setEmail(valor);
		else if(atributo.toLowerCase().equals("nome"))
			usuario.setNome(valor);
		else if(atributo.toLowerCase().equals("telefone"))
			usuario.setCelular(valor);
	}
	
	public String getInfo(String nome, String telefone, String atributo) {

		if (atributo.toLowerCase() == "email")
			if (usuarioExiste(nome, telefone))
				return getUsuario(nome, telefone).getEmail();
			else{
				return null; //excessão futuramente
			}
		return null; //excessão futuramente
	}

	private boolean usuarioExiste(String nome, String telefone) {
		
		return false;
	}

	private Usuario getUsuario(String nome, String telefone) {

		return null;
	}

	public void adicionaItem(String nome, String telefone, Item item) {
		
		Usuario usuario = getUsuario(nome, telefone);
		usuario.adicionaItem(item);
	}
}
