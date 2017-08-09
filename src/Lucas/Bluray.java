package Lucas;

public class Bluray extends Item {

	private int duracao;
	private String classificao;

	// construtor da classe

	public Bluray(String nome, double valor, int duracao, String classificao) {

		super(nome, valor);
		this.duracao = duracao;
		this.classificao = classificao;
	}

	// Retorna a duração do Bluray
	public int getDuracao() {

		return this.duracao;
	}

	// Modifica a duração do Bluray

	public void setDuracao(int duracao) {

		this.duracao = duracao;
	}

	// Retorna a classificação do Bluray

	public String getClassificao() {

		return this.classificao;
	}

	// Modifica a classificação do Bluray

	public void setClassificao(String classificao) {

		this.classificao = classificao;
	}

	// recebe a duração do Bluray

	public void adicionaDuracao(int duracao) {

		this.duracao += duracao;
	}
}
