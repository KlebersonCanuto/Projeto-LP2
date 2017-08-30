package Projeto;

import java.util.Comparator;

public class ComparadorValor implements Comparator<Item>{

	/**
	 * Compara 2 Itens pelo valor
	 * 
	 * @return representacoes em inteiro para os casos de comparacao
	 */
	public int compare(Item o1, Item o2){
       
		if (o1.getValor() < o2.getValor()) 
			return -1;
        if (o1.getValor() > o2.getValor()) 
        	return 1;
        return 0;	
	}
}