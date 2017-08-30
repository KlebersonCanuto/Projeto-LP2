package Projeto;

import java.util.Comparator;

public class ComparadorUsuarioNome implements Comparator<Usuario>{

	/**
	 * Compara 2 Usuarios pelo nome
	 * 
	 * @return a comparacao de do nome de um com o nome do outro
	 */
	@Override
	public int compare(Usuario u1, Usuario u2) {

		return u1.getNome().compareTo(u2.getNome());
	}

}
