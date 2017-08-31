package Projeto;

import java.util.ArrayList;
import java.util.List;


public class BluraySerie extends Bluray {

	private Genero genero;
	private String descricao;
	private int temporada;
	private List <Integer> episodios; 
	
	/**
	 * Constrói um BluraySerie que herda Bluray a partir de nome, valor, duracao, classificacao, genero, descricao e temporada.
	 * e cria uma lista de episodios que começa vazio
	 * 
	 * @param nome
	 * @param valor
	 * @param descricao
	 * @param duracao
	 * @param classificacao
	 * @param genero
	 * @param temporada
	 */
	public BluraySerie(String nome, double valor, String descricao, int duracao, String classificacao, String genero, int temporada){
		
		super(nome, valor, duracao, classificacao);
		this.descricao = descricao;
		this.temporada = temporada;
		episodios = new ArrayList<>();
		setGenero(genero);
	}
	
	/**
	 * 
	 * @return a descricao 
	 */
	public String getDescricao(){
		
		return this.descricao;
	}
	
	/**
	 * Modifica a descricao para o valor parametrizado
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao){
		
		this.descricao = descricao;
	}
	
	/**
	 * 
	 * @return o genero
	 */
	public String getGenero(){
		
		return this.genero.getGenero();
	}
	
	/**
	 * Modifica o genero para o valor passado como parametro
	 * @param genero
	 */
	public void setGenero(String genero){
		
		if (genero.equals("ACAO"))
			this.genero = Genero.ACAO;
		
		else if (genero.equals("ANIMACAO"))
			this.genero = Genero.ANIMACAO;
		
		else if (genero.equals("AVENTURA"))
			this.genero = Genero.AVENTURA;
		
		else if (genero.equals("COMEDIA"))
			this.genero = Genero.COMEDIA;
		
		else if (genero.equals("DOCUMENTARIO"))
			this.genero = Genero.DOCUMENTARIO;
		
		else if (genero.equals("DRAMA"))
			this.genero = Genero.DRAMA;
		
		else if (genero.equals("EROTICO"))
			this.genero = Genero.EROTICO;
		
		else if (genero.equals("FAROESTE"))
			this.genero = Genero.FAROESTE;
		
		else if (genero.equals("FICCAO"))
			this.genero = Genero.FICCAO;
		
		else if (genero.equals("MUSICAL"))
			this.genero = Genero.MUSICAL;
		
		else if (genero.equals("POLICIAL"))
			this.genero = Genero.POLICIAL;
		
		else if (genero.equals("ROMANCE"))
			this.genero = Genero.ROMANCE;
		
		else if (genero.equals("SUSPENSE"))
			this.genero = Genero.SUSPENSE;
		
		else if (genero.equals("TERROR"))
			this.genero = Genero.TERROR;
		
		else if (genero.equals("OUTRO"))
			this.genero = Genero.OUTRO;
		
		else
			throw new IllegalArgumentException("Genero invalido");
	}
	
	/**
	 * 
	 * @return a temporada
	 */
	public int getTemporada(){
		
		return this.temporada;
	}
	
	/**
	 * adiciona a lista de episodios uma duracao, que representa um episodio
	 * 
	 * @param duracao
	 */
	public void adicionaBluRay(int duracao){
		
		episodios.add(duracao);
	}
	
	/**
	 *  Retorna a  representação de um BluraySerie em forma de "SERIE: nome, R$ valor, emprestado(ou nao), duracao min, classificacao, genero, Temporada Nº temporada;
	 *  
	 *  @return a representacao de BluraySerie
	 */
	public String toString(){
		
		return "SERIE: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getDuracao() + " min, " + this.getClassificacao() + ", " + this.getGenero() + ", Temporada " + this.getTemporada();
	}

	/**
	 * @return Um o hashCode de BluraySerie
	 */
	public int hashCode(){

		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.getNome() == null) ? 0 : this.getNome().hashCode());
		result = prime * result + temporada;
		return result;
	}
	
	/**
	 * Retorna se um objeto e igual ao outro seguindo as definicoes do equals
	 * 
	 * @return true ou false 
	 */
	public boolean equals(Object obj){
		
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		BluraySerie other = (BluraySerie) obj;
		if (this.getNome() == null) {
			if (other.getNome() != null)
				return false;
		} else if (!this.getNome().equals(other.getNome()))
			return false;
		if (temporada != other.temporada)
			return false;
		
		return true;
	}
}