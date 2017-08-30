package Projeto;

import java.util.List;
import java.util.ArrayList;

public class JogoTabuleiro extends Item{

	private List<String> pecasPerdidas;
	
	
	/**
	 * Constrói um Jogo de Tabuleiro apartir do nome e do valor
	 * 
	 * @param nomeItem
	 * @param valor
	 */
	public JogoTabuleiro(String nomeItem, double valor){
		
		super(nomeItem, valor);
		pecasPerdidas = new ArrayList<>();	
	}
	
	/**
	 * Adiciona o valor do parametro a sua lista de pecas
	 * 
	 * @param nomePeca
	 */
	public void adicionaPecaPerdida(String nomePeca){
		
		pecasPerdidas.add(nomePeca);
	}
	
	/**
	 * Verifica o tamanho da lista de pecas, se for igual a 0
	 * @return "COMPLETO"
	 * Mas se for maior
	 * @return "COM PECAS PERDIDAS"
	 */
	public String verificaPecas(){
		
		if(pecasPerdidas.size() > 0)
			return "COM PECAS PERDIDAS";
		return "COMPLETO";	
	}

	/**
	 * Retorna a representacao em string de um jogo de tabuleiro em forma de  "JOGO DE TABULEIRO: nome, R$ valor, emprestado(ou nao), pecas perdidas(ou nao)"
	 * 
	 * @return a representacao de jogo de tabuleiro
	 */
	public String toString(){
		
		return "JOGO DE TABULEIRO: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.verificaPecas();
	}
	
	/**
	 * Verifica se dois Jogos de Tabuleiros sao iguais
	 * Apartir do  nome e pecas perdidas
	 */
	public boolean equals(Object obj){

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		JogoTabuleiro o = (JogoTabuleiro) obj;
		if (this.getNome() == null) {
			if (o.getNome() != null)
				return false;
		} else if (!this.getNome().equals(o.getNome()))
			return false;
	
		if (this.pecasPerdidas.size() != o.pecasPerdidas.size())
			return false;
	
		else{
			for (int i = 0; i < this.pecasPerdidas.size(); i++){
				if (!this.pecasPerdidas.get(i).equals(o.pecasPerdidas.get(i)))
					return false;
			}	
		}
		
		return true;
	}
}