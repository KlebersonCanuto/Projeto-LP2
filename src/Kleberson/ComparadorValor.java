package Kleberson;

import java.util.Comparator;

public class ComparadorValor implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		if (o1 == null || o2 == null)
			return 0;
		
		if(o1.getValor()>o2.getValor())
			return 1;
		else if (o2.getValor()<o2.getValor())
			return -1;
		else 
			return 0;
	}

}
