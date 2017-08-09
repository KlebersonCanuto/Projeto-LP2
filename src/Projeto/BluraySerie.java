package Projeto;

import java.util.ArrayList;
import java.util.List;


public class BluraySerie extends Bluray {

	private String descricao;
	private String genero;
	private int temporada;
	private List <Integer> episodios; 
	
	public BluraySerie(String nome, double valor, String descricao, int duracao, String classificao, String genero, int temporada){
		
		super(nome, valor, duracao, classificao);
		this.descricao = descricao;
		this.genero = genero;
		this.temporada = temporada;
		episodios = new ArrayList<>();
	}
	
	public String getDescricao(){
		// Retorna a descricao da serie
		return this.descricao;
	}
	
	public void setDescricao(String descricao){
		// Modifica a descricao da serie
		this.descricao = descricao;
	}
	
	public String getGenero(){
		// Retorna o genero da serie
		return this.genero;
	}
	
	public void setGenero(String genero){
		// Modifica o genero da serie
		this.genero = genero;
	}
	
	public int getTemporada(){
		// Retorna a temporada da serie
		return this.temporada;
	}
		
	public void adicionaBluRay(int duracao){
		// Adiciona um episodio a serie
		episodios.add(duracao);
	}
	
	public String toString(){
		// Retorna a representacao em String da serie
		return "SERIE: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getGenero() + ", Temporada " + this.getTemporada();
	}

	public int hashCode(){
		// hashCode da serie
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.getNome() == null) ? 0 : this.getNome().hashCode());
		result = prime * result + temporada;
		return result;
	}
	
	public boolean equals(Object obj){
		// Verifica se 2 series sao iguais
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
