package Lucas;

public class Item {

	private String nomeItem;
	private double valor;
	private boolean emprestado;

	// Construtor da classe

	public Item(String nomeItem, double valor) {

		this.nomeItem = nomeItem;
		this.valor = valor;
		this.emprestado = false;
	}

	// Retorna o Item

	public String getNome() {

		return this.nomeItem;
	}

	// modifica o Item

	public void setNome(String nomeItem) {

		this.nomeItem = nomeItem;
	}

	// retorna o valor do Bluray

	public double getValor() {

		return this.valor;
	}

	// modifica o valor do Bluray

	public void setValor(double valor) {

		this.valor = valor;
	}

	// retorna se o bluray está emprestado ou não

	public boolean emprestado() {

		return this.emprestado;
	}

	// retorna true se estiver emrpestado

	public void emprestou() {

		this.emprestado = true;
	}

	// retorna false quando não ta emprestado

	public void retornou() {

		this.emprestado = false;
	}

	// verifica se foi emprestado ou não

	public String stringEmprestado() {

		if (this.emprestado)
			return "Emprestado";
		return "Não Emprestado";
	}

	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeItem == null) ? 0 : nomeItem.hashCode());
		return result;
	}

	// verifica o item pelo nome

	public boolean equals(Object obj) {

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