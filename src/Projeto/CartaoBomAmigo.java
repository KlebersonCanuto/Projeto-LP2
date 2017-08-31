package Projeto;

import java.io.Serializable;

public class CartaoBomAmigo implements Cartao, Serializable{

	/**
	 * 
	 * @return a classificacao 
	 */
	public String qualificacao() {

		return "BomAmigo";
	}
	
	/**
	 * 
	 * @return o periodo maximo de dias 
	 */
	public int periodoMaximo() {

		return 14;
	}
}
