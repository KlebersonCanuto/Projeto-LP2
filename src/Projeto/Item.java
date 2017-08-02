package Projeto;

public class Item {
	
	protected String nome;
	protected int valor; 
	protected boolean emprestado = false;
	
	public Item(String nome, int valor, boolean emprestado){
		this.nome = nome;
		this.valor = valor;
		this.emprestado = emprestado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean getEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	

}