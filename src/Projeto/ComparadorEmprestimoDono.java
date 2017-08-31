package Projeto;

import java.util.Comparator;

public class ComparadorEmprestimoDono implements Comparator<Emprestimo> {
	
	/**
	 * Compara 2 emprestimos pelo nome do dono
	 * 
	 * @return a comparacao de do nome de um dono com o nome do outro dono
	 */
	public int compare(Emprestimo o1, Emprestimo o2) {
		
		return o1.getDono().getNome().compareTo(o2.getDono().getNome());
	}
}