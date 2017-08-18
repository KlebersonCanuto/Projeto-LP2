package Matheus;

public class BlurayShow extends Bluray{

	private String artista;
	private int numeroFaixas;
	
	public BlurayShow(String nome, double valor, int duracao, int numeroFaixas, String artista, String classificao){
		
		super(nome, valor, duracao, classificao);
		this.artista = artista;
		this.numeroFaixas = numeroFaixas;
	}

	public String getArtista(){
		// Retorna o artista
		return this.artista;
	}

	public void setArtista(String artista){
		// Modifica o artista
		this.artista = artista;
	}

	public int getNumeroFaixas(){
		// Retorna o numero de faixas do show
		return this.numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas){
		// Modifica o numero de faixas do show
		this.numeroFaixas = numeroFaixas;
	}
	
	public String toString(){
		// Retorna a representacao em string do show
		return "SHOW: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getArtista() + ", " + this.getNumeroFaixas() + " faixas";
	}
}
