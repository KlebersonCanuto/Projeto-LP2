package Lucas;

import java.util.Comparator;

// comparar os nomes

public class ComparadorNome implements Comparator<Item> {

	public int compare(Item o1, Item o2) {

		return o1.getNome().compareTo(o2.getNome());
	}
}
