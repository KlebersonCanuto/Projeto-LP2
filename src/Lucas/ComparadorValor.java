package Lucas;

import java.util.Comparator;

// comparar o valor 

public class ComparadorValor implements Comparator<Item> {

	public int compare(Item o1, Item o2) {

		if (o1.getValor() < o2.getValor())
			return -1;
		if (o1.getValor() > o2.getValor())
			return 1;
		return 0;
	}
}
