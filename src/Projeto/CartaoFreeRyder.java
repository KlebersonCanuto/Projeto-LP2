package Projeto;

import java.io.Serializable;

public class CartaoFreeRyder implements Cartao, Serializable{

	/**
	 * 
	 * @return a classificacao 
	 */
	public String qualificacao() {

		return "FreeRyder";
	}

	/**
	 * 
	 * @return o periodo maximo de dias 
	 */
	public int periodoMaximo() {

		return 5;
	}
}
