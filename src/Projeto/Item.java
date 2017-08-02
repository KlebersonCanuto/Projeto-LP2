package Projeto;

public class Item {
	
	private String nome;
	private int valor; 
	private boolean emprestado;
	
	public Item(String nome, int valor){
		
		this.nome = nome;
		this.valor = valor;
		this.emprestado = false;
	}

	public String getNome() {
		
		return this.nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public int getValor() {
		
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
}