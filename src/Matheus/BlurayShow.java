package Projeto;

public class BlurayShow extends Bluray{

	private String artista;
	private int numeroFaixas;
	
	public BlurayShow(String nome, double valor, int duracao, int numeroFaixas, String artista, String classificao) {
		super(nome, valor, duracao, classificao);
		this.artista = artista;
		this.numeroFaixas = numeroFaixas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}
	
	

}
