package Lucas;

public class BlurayShow extends Bluray {

	private String artista;
	private int numeroFaixas;

	// construtor da classe BlurayShow
	public BlurayShow(String nome, double valor, int duracao, int numeroFaixas, String artista, String classificao) {

		super(nome, valor, duracao, classificao);
		this.artista = artista;
		this.numeroFaixas = numeroFaixas;
	}

	// retorna o artista

	public String getArtista() {

		return artista;
	}

	// modifica o artista

	public void setArtista(String artista) {

		this.artista = artista;
	}

	// retorna o número de faixas

	public int getNumeroFaixas() {

		return numeroFaixas;
	}

	// modifica o número de faixas

	public void setNumeroFaixas(int numeroFaixas) {

		this.numeroFaixas = numeroFaixas;
	}

	// retorna a representação em String

	public String toString() {

		return "SHOW: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", "
				+ this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getArtista() + ", "
				+ this.getNumeroFaixas();
	}
}