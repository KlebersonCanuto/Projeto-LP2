package Projeto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Usuario {
	
	private String nome;
	private String email;
	private String telefone;
	private double reputacao;
	
	
	private Set<Item> itens;
	
	private List<Emprestimo> emprestimos;
	
	
	public Usuario(String nome, String telefone, String email ){
		
		this.nome = nome;
		this.telefone = telefone ;
		this.email = email;
		this.reputacao = 0.0;
		itens = new HashSet<>();
		emprestimos = new ArrayList<>();
	}
	
	public double getReputacao(){
		return this.reputacao;
	}
	
	public void somaReputacao(double valor){
		this.reputacao += valor;
	}

	public String getNome() {
		// Retorna o nome do usuario
		return this.nome;
	}

	public void setNome(String nome) {
		// Modifica o nome do usuario
		this.nome = nome;
	}

	public String getEmail() {
		// Retorna o email do usuario
		return this.email;
	}

	public void setEmail(String email) {
		// Modifica o email do usuario
		this.email = email;
	}

	public String getCelular() {
		// Retorna o celular do usuario
		return this.telefone;
	}

	public void setCelular(String celular) {
		// Modifica o celular do usuario
		this.telefone = celular;
	}
	
	public void adicionaItem(Item item){
		// Adiciona um item ao usuario
		itens.add(item);
		
	}
	
	public void removeItem(String nomeItem) {
		// Remove um item do usuario
		itens.remove(getItem(nomeItem));
	}	
	
	public Item getItem(String nomeItem){
		// Retorna um item do usuario
		for (Item item : itens){
			if(item.getNome().equals(nomeItem))
				return item;
			}
		throw new NullPointerException("Item nao encontrado");
		}
	
	public List<Item> listaItens(List<Item> lista){
		// Retorna a lista de itens do usuario
		for (Item item : itens){
			
			lista.add(item);
		}
		return lista;
	}
	
	public void adicionaEmprestimo(Emprestimo emprestimo){
		// Adidiciona um emprestimo ao historico do usuario
		emprestimos.add(emprestimo);
	}
	
	public void devolveItem(Item item){
		// Devolve um item emprestado ao dono original
		itens.remove(item);
	}

	public String toString() {
		// Representacao em string do usuario
		return this.nome + ", " +this.email + ", " + this.telefone;
	}

	public int hashCode() {
		// hashCode do usuario
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		// Verifica se 2 usuarios sao iguais
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