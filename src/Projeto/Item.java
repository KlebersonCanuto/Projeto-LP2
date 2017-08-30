package Projeto;

import java.io.Serializable;

public class Item implements Serializable{
	
	private static final long serialVersionUID = 2302455036203561862L;
	private String nomeItem;
	private double valor; 
	private boolean emprestado;
	private int quantidadeEmprestimo;
	
	/**
	 * Constrói um Item apartir do seu nome e valor
	 * 
	 * @param nomeItem
	 * @param valor
	 */
	public Item(String nomeItem, double valor){
		
		if (valor < 0)
			throw new IllegalArgumentException("Preco invalido");
		else{
			this.nomeItem = nomeItem;
			this.valor = valor;
			this.emprestado = false;
			this.quantidadeEmprestimo = 0;
		}
	}
	
	/**
	 * 
	 * @return o nome
	 */
	public String getNome(){
		return this.nomeItem;
	}

	/**
	 * Modifica o nome de acordo com o valor parametrizado
	 * 
	 * @param nomeItem
	 */
	public void setNome(String nomeItem){
		this.nomeItem = nomeItem;
	}
	
	/**
	 * 
	 * @return o valor
	 */
	public double getValor(){
		return this.valor;
	}

	/**
	 * Modifica o valor de acordo com o valor parametrizado
	 * 
	 * @param valor
	 */
	public void setValor(double valor){

		this.valor = valor;
	}

	/**
	 * 
	 * @return o boolean definindo se esta emprestado ou nao
	 */
	public boolean emprestado(){
		return this.emprestado;
	}
	
	/**
	 * Soma mais um na quantidade de vezes que foi emprestado
	 * Coloca o estado como emprestado
	 *
	 */
	public void emprestou(){
		this.quantidadeEmprestimo+=1;
		this.emprestado = true;
	}
	
	/**
	 * Muda o estado para nao emprestado
	 */
	public void retornou(){
		this.emprestado = false;
	}
	
	/**
	 * Caso esteja emprestado
	 * @return "Emprestado"
	 * 
	 * caso contrario 
	 * @return "Nao emprestado"
	 */
	public String stringEmprestado(){
		if (this.emprestado)
			return "Emprestado";
		return "Nao emprestado";
	}
	
	/**
	 * 
	 * @return a quantidade de emprestimos
	 */
	public int getQuantidadeEmprestimo(){
		
		return this.quantidadeEmprestimo;
	}

	/**
	 * @return o hashCode do item
	 */
	public int hashCode(){

		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeItem == null) ? 0 : nomeItem.hashCode());
		return result;
	}

	/**
	 * Verifica se os dois objetos sao iguais e retorna um boolean
	 * 
	 * @return boolean
	 */
	public boolean equals(Object obj){
		// Verifica se 2 itens sï¿½o iguais
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Item other = (Item) obj;
		if (nomeItem == null) {
			if (other.nomeItem != null)
				return false;
		} else if (!nomeItem.equals(other.nomeItem))
			return false;
	
		return true;
	}
}