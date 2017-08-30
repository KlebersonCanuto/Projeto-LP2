package Projeto;

import java.io.Serializable;

public class CartaoFreeRyder implements Cartao, Serializable{

	public String qualificacao() {

		return "FreeRyder";
	}

	public int periodoMaximo() {

		return 5;
	}
}
