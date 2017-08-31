package Projeto;

import java.io.Serializable;

public class CartaoNoob implements Cartao, Serializable{
	
	/**
	 * 
	 * @return a classificacao 
	 */
	public String qualificacao() {

		return "Noob";
	}

	/**
	 * 
	 * @return o periodo maximo de dias 
	 */
	public int periodoMaximo() {

		return 7;
	}
}
