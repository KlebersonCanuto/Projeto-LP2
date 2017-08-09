package Lucas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Usuario {

	private String nome;
	private String email;
	private String telefone;

	private Set<Item> itens;

	private List<Emprestimo> emprestimos;

	// construtor da classe

	public Usuario(String nome, String telefone, String email) {

		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		itens = new HashSet<>();
		emprestimos = new ArrayList<>();
	}

	// retorna o nome

	public String getNome() {

		return nome;
	}

	// modifica o nome

	public void setNome(String nome) {

		this.nome = nome;
	}

	// retorna o email

	public String getEmail() {

		return email;
	}

	// modifica o email

	public void setEmail(String email) {

		this.email = email;
	}

	// retorna o celular

	public String getCelular() {

		return telefone;
	}

	// modifica o celular

	public void setCelular(String celular) {

		this.telefone = celular;
	}

	// adiciona item ao array

	public void adicionaItem(Item item) {

		itens.add(item);
	}

	// remove item do array

	public void removeItem(String nomeItem) {

		itens.remove(getItem(nomeItem));
	}

	// atualiza o item
	public void atualizaItem(String nomeItem, String atributo, String valor) {

		Item item = getItem(nomeItem);
		if (atributo.toLowerCase().equals("nome"))
			item.setNome(valor);
		else if (atributo.toLowerCase().equals("valor"))
			item.setValor(Double.valueOf(valor));
	}

	// retorna o nome do item
	public Item getItem(String nomeItem) {

		for (Item item : itens) {
			if (item.getNome().equals(nomeItem))
				return item;
		}
		return null;
	}

	// retorna a lista de itens

	public List<Item> listaItens(List<Item> lista) {

		for (Item item : itens) {

			lista.add(item);
		}
		return lista;
	}

	// adiciona o emprestimo

	public void adicionaEmprestimo(Emprestimo emprestimo) {

		emprestimos.add(emprestimo);
	}

	// retorna o item emprestimo

	public void devolveItem(Item item) {

		itens.remove(item);
	}

	// retorna a representação em String

	@Override
	public String toString() {

		return this.nome + ", " + this.email + ", " + this.telefone;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	// verifica se tem o mesmo nome

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
}