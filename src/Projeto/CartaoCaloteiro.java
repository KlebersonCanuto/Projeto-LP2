package Projeto;

import java.io.Serializable;

public class CartaoCaloteiro implements Cartao, Serializable{

	public String qualificacao() {

		return "Caloteiro";
	}

	public int periodoMaximo() {
		
		return 0;
	}
}
