package Projeto;

public class Item {
	
	private String nomeItem;
	private float valor; 
	private boolean emprestado;
	
	public Item(String nomeItem, float valor){
		
		this.nomeItem = nomeItem;
		this.valor = valor;
		this.emprestado = false;
	}

	public String getNome() {
		
		return this.nomeItem;
	}

	public void setNome(String nomeItem) {
		
		this.nomeItem = nomeItem;
	}

	public float getValor() {
		
		return this.valor;
	}

	public void setValor(int valor) {
		
		this.valor = valor;
	}

	public boolean getEmprestado() {
		
		return this.emprestado;
	}

	public void emprestou() {
	
		this.emprestado = true;
	}
	
	public void retornou(){
		
		this.emprestado = false;
	}
	
	//To string para levar over das filhas.
}