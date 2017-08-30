package Projeto;

public class BlurayShow extends Bluray{

	private String artista;
	private int numeroFaixas;
	
	/**
	 * Constrói um BlurayFilme que herda Bluray a partir de nome, valor, duracao, classificacao, numero de faixas e artista.
	 * 
	 * @param nome
	 * @param valor
	 * @param duracao
	 * @param numeroFaixas
	 * @param artista
	 * @param classificao
	 */
	public BlurayShow(String nome, double valor, int duracao, int numeroFaixas, String artista, String classificao){
		
		super(nome, valor, duracao, classificao);
		this.artista = artista;
		this.numeroFaixas = numeroFaixas;
	}

	/**
	 * @return o artista
	 */
	public String getArtista(){
		return this.artista;
	}

	/**
	 * Modifica o artista para o valor passado como parametro
	 * @param artista
	 */
	public void setArtista(String artista){
		this.artista = artista;
	}
	
	/**
	 * @return o numero de faixas como int
	 */
	public int getNumeroFaixas(){
		return this.numeroFaixas;
	}

	/**
	 * Modifica o numero de faixas para o valor passado como parametro
	 * @param numeroFaixas
	 */
	public void setNumeroFaixas(int numeroFaixas){
		this.numeroFaixas = numeroFaixas;
	}
	
	/**
	 * Representacao em forma de "SHOW: nome, R$ valor, emprestado(ou nao), duracao min, classificacao, artista, numero de faixas;
	 * 
	 * @return A representacao de BlurayShow
	 */
	public String toString(){
		return "SHOW: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getArtista() + ", " + this.getNumeroFaixas() + " faixas";
	}
}
