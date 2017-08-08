package Kleberson;

public class Item {
	
	private String nomeItem;
	private double valor; 
	private boolean emprestado;
	
	public Item(String nomeItem, double valor){
		
		this.nomeItem = nomeItem;
		this.valor = valor;
		this.emprestado = false;
	}

	public String getNome(){
		
		return this.nomeItem;
	}

	public void setNome(String nomeItem){
		
		this.nomeItem = nomeItem;
	}

	public double getValor(){
		
		return this.valor;
	}

	public void setValor(double valor){
		
		this.valor = valor;
	}

	public boolean emprestado(){
		
		return this.emprestado;
	}

	public void emprestou(){
	
		this.emprestado = true;
	}
	
	public void retornou(){
		
		this.emprestado = false;
	}
	
	public String stringEmprestado(){
		
		if (this.emprestado)
			return "Emprestado";
		return "Não Emprestado";
	}
	public int hashCode(){
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeItem == null) ? 0 : nomeItem.hashCode());
		return result;
	}

	public boolean equals(Object obj){
		
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