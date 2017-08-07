package Matheus;

import java.util.List;
import java.util.ArrayList;

public class JogosTabuleiro extends Item {

	private List<String> pecasPerdidas;
	
	
	public JogosTabuleiro(String nomeItem, double valor) {
		
		super(nomeItem, valor);
		pecasPerdidas = new ArrayList<>();
		
		
	}
	
	public void adicionaPecaPerdida(String nomePeca){
		
		pecasPerdidas.add(nomePeca);
	}
	
	public String verificaPecas() {
		if(pecasPerdidas.size() > 0) {
			return "COM PECAS PERDIDAS";
		} else { return "SEM PECAS PERDIDAS";}
		
	}
	/**ESTï¿½ FALTANDO O EQUALS]
	 * Tem que comparar as peï¿½as perdidas e o nome, porï¿½m nï¿½o como o nome ta em item nï¿½o consegui saber como fazer(MATHEUS)
		
		**/

	@Override
	public String toString() {
		if(this.getEmprestado()) {
		return "JOGO DE TABULEIRO: " + this.getNome() + ", R$ " + this.getValor() + ", Emprestado, " 
	+ this.verificaPecas();
	} else {
		return "JOGO DE TABULEIRO: " + this.getNome() + ", R$ " + this.getValor() + ", Não emprestado, " 
				+ this.verificaPecas();
	}

	
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (this.getNome() == null) {
			if (other.getNome() != null)
				return false;
		} else if (!this.getNome().equals(other.getNome()))
			return false;
		// fazer comparação dos array
		return true;
	}



}
