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

	// Retorna a dura��o do Bluray
	public int getDuracao() {

		return this.duracao;
	}

	// Modifica a dura��o do Bluray

	public void setDuracao(int duracao) {

		this.duracao = duracao;
	}

	// Retorna a classifica��o do Bluray

	public String getClassificao() {

		return this.classificao;
	}

	// Modifica a classifica��o do Bluray

	public void setClassificao(String classificao) {

		this.classificao = classificao;
	}

	// recebe a dura��o do Bluray

	public void adicionaDuracao(int duracao) {

		this.duracao += duracao;
	}
}
