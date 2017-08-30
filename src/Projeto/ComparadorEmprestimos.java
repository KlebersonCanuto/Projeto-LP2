package Projeto;

import java.util.Comparator;

public class ComparadorEmprestimos implements Comparator<Item> {
	
	/**
	 * Compara 2 itens pela a quantidade de emprestimo
	 * 
	 * @return representacoes em inteiro para os casos de comparacao
	 */
	@Override
	public int compare(Item o1, Item o2) {
		if (o1.getQuantidadeEmprestimo() > o2.getQuantidadeEmprestimo()) 
			return -1;
        if (o1.getQuantidadeEmprestimo() < o2.getQuantidadeEmprestimo()) 
        	return 1;
        return 0;	
	}
}
