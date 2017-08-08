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
		
		return descricao;
	}
	
	public void setDescricao(String descricao){
		
		this.descricao = descricao;
	}
	
	public String getGenero(){
		
		return genero;
	}
	
	public void setGenero(String genero){
		
		this.genero = genero;
	}
	
	public int getTemporada(){
		
		return temporada;
	}
	
	public void setTemporada(int temporada){
		
		this.temporada = temporada;
	}
	
	public void adicionaBluRay(int duracao){
		
		episodios.add(duracao);
	}
	
	public String toString(){
	
		return "SERIE: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getGenero() + ", Temporada " + this.getTemporada();
	}

	public int hashCode(){
		
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.getNome() == null) ? 0 : this.getNome().hashCode());
		result = prime * result + temporada;
		return result;
	}
	
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