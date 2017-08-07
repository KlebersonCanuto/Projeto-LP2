package Matheus;

public abstract class Bluray extends Item{
	
	
	private int duracao;
	private String classificao;
	
	public Bluray(String nome, double valor, int duracao, String classificao){
		
		super(nome, valor);
		this.duracao = duracao;
		this.classificao = classificao;
	}

	public int getDuracao() {
		
		return this.duracao;
	}

	public void setDuracao(int duracao) {
		
		this.duracao = duracao;
	}

	public String getClassificao() {
		
		return this.classificao;
	}

	public void setClassificao(String classificao) {
		
		this.classificao = classificao;
	}

	public void adicionaDuracao(int duracao){
		
		this.duracao += duracao;

	}
	
	public abstract String toString();

	
	
}
