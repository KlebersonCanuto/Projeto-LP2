package Projeto;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 8045523698148959051L;
	private String nome;
	private String email;
	private String telefone;
	private double reputacao;
	private String qualificacao;
	private int periodoMaximo;
	
	
	private Set<Item> itens;
	
	private List<Emprestimo> emprestimos;
	
	
	/**
	 * Constrói um Usuario apartir do nome, telefone e email
	 * Inicializa a reputacao com 0.0 e classificacao com FreeRyder
	 * Cria o hashSet de item e o Arraylist de emprestimos
	 * 
	 * @param nome
	 * @param telefone
	 * @param email
	 */
	public Usuario(String nome, String telefone, String email ){
		
		this.nome = nome;
		this.telefone = telefone ;
		this.email = email;
		this.reputacao = 0.0;
		this.qualificacao = "FreeRyder";
		this.periodoMaximo = 5;
		itens = new HashSet<>();
		emprestimos = new ArrayList<>();
	}
	
	/**
	 * 
	 * @return a qualificacao
	 */
	public String getQualificacao(){
		return this.qualificacao;
	}
	
	/**
	 * Modifica a qualificacao de acordo com a reputacao
	 */
	public void atualizaQualificacao(){
		if (reputacao < 0){
			this.qualificacao = "Caloteiro";
			this.setPeriodoMaximo(0);
		}else if (reputacao >= 0 && itens.size() == 0){
			this.qualificacao = "FreeRyder";
			this.setPeriodoMaximo(5);
		}
		else if (reputacao >= 0 && reputacao <= 100){
			this.qualificacao = "Noob";
			this.setPeriodoMaximo(7);
		}else{
			this.qualificacao = "BomAmigo";
			this.setPeriodoMaximo(14);
		}
	}
	
	/**
	 * 
	 * @return o periodo maximo de dias 
	 */
	public int getPeriodoMaximo(){
		return this.periodoMaximo;
	}
	
	/**
	 * Modifica o periodo maximo de acordo com o valor parametrizado
	 * 
	 * @param periodoMaximo
	 */
	public void setPeriodoMaximo(int periodoMaximo){
		this.periodoMaximo = periodoMaximo;
	}
	
	/**
	 * 
	 * @return a reputacao
	 */
	public double getReputacao(){
		return this.reputacao;
	}
	
	/**
	 * Soma o valor passado com o que já se tinha
	 * 
	 * @param valor
	 */
	public void somaReputacao(double valor){
		this.reputacao += valor;
	}

	/**
	 * 
	 * @return o nome
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * Modifica o nome de acordo com o valor parametrizado 
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * 
	 * @return o email
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * Modifica o email de acordo com o valor parametrizado 
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 
	 * @return o celular
	 */
	public String getCelular() {

		return this.telefone;
	}

	/**
	 * Modifica o celular de acordo com o valor parametrizado 
	 * 
	 * @param celular
	 */
	public void setCelular(String celular) {
		this.telefone = celular;
	}
	
	/**
	 * Adiciona um item a sua lista de Item
	 * 
	 * @param item
	 */
	public void adicionaItem(Item item){
		itens.add(item);
		this.reputacao+=(item.getValor()*0.05);
		this.atualizaQualificacao();
	}
	
	/**
	 * Adiciona um item emprestado a sua lista de item
	 * 
	 * @param item
	 */
	public void adicionaItemEmprestado(Item item) {
		
		itens.add(item);
	}
	
	/**
	 * Retira um item da sua lista de item
	 * 
	 * @param nomeItem
	 */
	public void removeItem(String nomeItem) {
		itens.remove(getItem(nomeItem));
	}	
	
	/**
	 * Pega um item pelo seu nome
	 * 
	 * @param nomeItem
	 * @return item
	 * 
	 * caso nao ache o item 
	 * @return "Item nao encontrado"
	 */
	public Item getItem(String nomeItem){
		// Retorna um item do usuario
		for (Item item : itens){
			if(item.getNome().equals(nomeItem))
				return item;
			}
		throw new NullPointerException("Item nao encontrado");
		}
	
	/**
	 * retorna uma lista de itens nao emprestados
	 * 
	 * @param lista
	 * @return lista de itens nao emprestados
	 */
	public List<Item> itensNaoEmprestados(List<Item> lista){
		
		for (Item item : itens){
			if (!item.emprestado())
				lista.add(item);
		}
		return lista;
	}
	
	/**
	 * 
	 * @param lista
	 * @return lista de itens do usuario
	 */
	public Set<Item> listaItens(Set<Item> lista){
		for (Item item : itens){
			
			lista.add(item);
		}
		return lista;
	}
	
	/**
	 * Adiciona um novo emprestimo ao historico do usuario 
	 * 
	 * @param emprestimo
	 */
	public void adicionaEmprestimo(Emprestimo emprestimo){
		emprestimos.add(emprestimo);
	}
	
	/**
	 * Devolve um item emprestado ao dono original
	 *
	 * @param item
	 */
	public void devolveItem(Item item){
		itens.remove(item);
	}

	/**
	 * Representacao de Usuario em forma de "nome, email, telefone"
	 *  
	 * @return representacao de usuario	 
	 */
	public String toString() {
		return this.nome + ", " +this.email + ", " + this.telefone;
	}

	/** 
	 * return o hashCode de Usuario
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	/**
	 * Verifica se dois objetos sao iguais a partir do nome e telefone
	 * 
	 * @return boolean
	 */
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