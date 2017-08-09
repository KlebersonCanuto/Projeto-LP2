package Lucas;

import java.util.ArrayList;
import java.util.List;

public class BluraySerie extends Bluray {

	private String descricao;
	private String genero;
	private int temporada;
	private List<Integer> episodios;

	// construtor da classe Bluray serie

	public BluraySerie(String nome, double valor, String descricao, int duracao, String classificao, String genero,
			int temporada) {

		super(nome, valor, duracao, classificao);
		this.descricao = descricao;
		this.genero = genero;
		this.temporada = temporada;
		episodios = new ArrayList<>();
	}

	// retorna a descrição

	public String getDescricao() {

		return descricao;
	}

	// modifica a descrição

	public void setDescricao(String descricao) {

		this.descricao = descricao;
	}

	// retorna o genero

	public String getGenero() {

		return genero;
	}

	// modifica o genero

	public void setGenero(String genero) {

		this.genero = genero;
	}

	// retorna a temporada

	public int getTemporada() {

		return temporada;
	}

	// modifica a temporada

	public void setTemporada(int temporada) {

		this.temporada = temporada;
	}

	// adiciona o Bluray ao ArraList

	public void adicionaBluRay(int duracao) {

		episodios.add(duracao);
	}

	// retorna a representação em String

	public String toString() {

		return "SERIE: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", "
				+ this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getGenero() + ", Temporada "
				+ this.getTemporada();
	}

	public int hashCode() {

		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.getNome() == null) ? 0 : this.getNome().hashCode());
		result = prime * result + temporada;
		return result;
	}

	// verifica o Bluray por nome e por temporada

	public boolean equals(Object obj) {

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