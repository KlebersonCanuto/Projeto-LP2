package Projeto;

import java.io.Serializable;

public class CartaoNoob implements Cartao, Serializable{

	public String qualificacao() {

		return "Noob";
	}

	public int periodoMaximo() {

		return 7;
	}
}
