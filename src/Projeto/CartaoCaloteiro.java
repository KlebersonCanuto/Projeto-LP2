package Projeto;

import java.io.Serializable;

public class CartaoCaloteiro implements Cartao, Serializable{

	/**
	 * 
	 * @return a classificacao 
	 */
	public String qualificacao() {

		return "Caloteiro";
	}

	/**
	 * 
	 * @return o periodo maximo de dias 
	 */
	public int periodoMaximo() {
		
		return 0;
	}
}
