package Projeto;

public class BluraySerie extends Bluray {

	private String descricao;
	private String genero;
	private int temporada;
	
	public BluraySerie(String nome, double valor, String descricao, int duracao, String classificao, String genero, int temporada) {
		
		super(nome, valor, duracao, classificao);
		this.descricao = descricao;
		this.genero = genero;
		this.temporada = temporada;
	}
	public String getDescricao() {
		
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		
		this.descricao = descricao;
	}
	
	public String getGenero() {
		
		return genero;
	}
	
	public void setGenero(String genero) {
		
		this.genero = genero;
	}
	
	public int getTemporada() {
		
		return temporada;
	}
	
	public void setTemporada(int temporada) {
		
		this.temporada = temporada;
	}
	
	public void adicionaBluRay(int duracao){
		
		adicionaDuracao(duracao);
	}

	// equals numero temporada e nome
}
