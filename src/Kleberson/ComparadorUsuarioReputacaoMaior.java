package Kleberson;

import java.util.Comparator;

public class ComparadorUsuarioReputacaoMaior implements Comparator<Usuario>{

	@Override
	public int compare(Usuario u1, Usuario u2) {

		if (u1.getReputacao() > u2.getReputacao()) 
			return -1;
        if (u1.getReputacao() < u2.getReputacao()) 
        	return 1;
        return 0;	
	}

}