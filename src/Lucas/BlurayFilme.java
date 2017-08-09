package Lucas;

public class BlurayFilme extends Bluray {

	private String genero;
	private int anoLancamento;

	// construtor de Bluray Filme

	public BlurayFilme(String nome, double valor, int duracao, String genero, String classificao, int anoLancamento) {

		super(nome, valor, duracao, classificao);
		this.genero = genero;
		this.anoLancamento = anoLancamento;

	}

	// retorna o genero do Bluray

	public String getGenero() {

		return genero;
	}

	// modifica o genero do Bluray

	public void setGenero(String genero) {

		this.genero = genero;
	}

	// retorna o ano de lancamento do Bluray

	public int getAnoLancamento() {

		return anoLancamento;
	}

	// modifica o ano de lançamento do Bluray
	public void setAnoLancamento(int anoLancamento) {

		this.anoLancamento = anoLancamento;
	}

	// retorna a representação em String

	public String toString() {

		return "FILME: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", "
				+ this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getGenero() + ", "
				+ this.getAnoLancamento();
	}
}