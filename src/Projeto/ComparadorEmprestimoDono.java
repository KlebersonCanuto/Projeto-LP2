package Projeto;

import java.util.Comparator;

public class ComparadorEmprestimoDono implements Comparator<Emprestimo> {

	public int compare(Emprestimo o1, Emprestimo o2) {
		
		return o1.getDono().getNome().compareTo(o2.getDono().getNome());
	}
}