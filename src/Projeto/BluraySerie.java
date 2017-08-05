package Projeto;

public class BluraySerie extends Bluray {

	private String descricao;
	private String genero;
	private int temporada;

	public BluraySerie(String nome, double valor, String descricao, int duracao, String classificao, String genero,
			int temporada) {
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

	@Override
	public String toString() {
		if (getEmprestado()) {

			return "SERIE:" + getNome() + ", " + getValor() + ", " + "Emprestado, " + getDuracao() + "min, "
					+ getClassificao() + "," + this.genero + ", Temporada" + this.temporada;
		} else {

			return "SERIE:" + getNome() + ", " + getValor() + ", " + "Nao emprestado, " + getDuracao() + "min, "
					+ getClassificao() + "," + this.genero + ", Temporada" + this.temporada;

		}
	}

	// equals numero temporada e nome
}