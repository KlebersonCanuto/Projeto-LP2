package Projeto;

import java.io.Serializable;

public class CartaoBomAmigo implements Cartao, Serializable{

	public String qualificacao() {

		return "BomAmigo";
	}

	public int periodoMaximo() {

		return 14;
	}
}
