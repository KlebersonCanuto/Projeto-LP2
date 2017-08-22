package Projeto;

import java.util.Comparator;

public class ComparadorUsuarioNome implements Comparator<Usuario>{

	@Override
	public int compare(Usuario u1, Usuario u2) {

		return u1.getNome().compareTo(u2.getNome());
	}

}
