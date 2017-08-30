package Projeto;

import java.util.Comparator;

public class ComparadorNome implements Comparator<Item>{
	
	/**
	 * Compara 2 itens pelo nome
	 * 
	 * @return a comparacao de do nome de um com o nome do outro
	 */
	public int compare(Item o1, Item o2){
		
		return o1.getNome().compareTo(o2.getNome());
	}
}