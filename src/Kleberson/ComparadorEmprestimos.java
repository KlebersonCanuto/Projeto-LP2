package Kleberson;

import java.util.Comparator;

public class ComparadorEmprestimos implements Comparator<Item> {

	public int compare(Item o1, Item o2){
	       
		if (o1.getQuantidadeEmprestimo() > o2.getQuantidadeEmprestimo()) 
			return -1;
        if (o1.getQuantidadeEmprestimo() < o2.getQuantidadeEmprestimo()) 
        	return 1;
        return 0;	
	}
}
