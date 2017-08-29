package Kleberson;

import java.io.Serializable;

public class Item implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2302455036203561862L;
	private String nomeItem;
	private double valor; 
	private boolean emprestado;
	private int quantidadeEmprestimo;
	
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
	
	public String getNome(){
		// Retorna o nome do item
		return this.nomeItem;
	}

	public void setNome(String nomeItem){
		// Muda o nome do item
		this.nomeItem = nomeItem;
	}

	public double getValor(){
		// Retorna o preco do item
		return this.valor;
	}

	public void setValor(double valor){
		// Muda o preco do item
		this.valor = valor;
	}

	public boolean emprestado(){
		// Verifica se o item esta emprestado
		return this.emprestado;
	}

	public void emprestou(){
		// Muda o item para emprestado
		this.quantidadeEmprestimo+=1;
		this.emprestado = true;
	}
	
	public void retornou(){
		// Muda o item para nao emprestado
		this.emprestado = false;
	}
	
	public String stringEmprestado(){
		// Representacao em string do emprestimo do item
		if (this.emprestado)
			return "Emprestado";
		return "Nao emprestado";
	}
	
	public int getQuantidadeEmprestimo(){
		
		return this.quantidadeEmprestimo;
	}

	public int hashCode(){
		// hashCode de um item
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeItem == null) ? 0 : nomeItem.hashCode());
		return result;
	}

	public boolean equals(Object obj){
		// Verifica se 2 itens s�o iguais
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