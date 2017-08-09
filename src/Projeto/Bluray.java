package Projeto;

public class Bluray extends Item{
	
	private int duracao;
	private String classificao;
	
	public Bluray(String nome, double valor, int duracao, String classificao){
		
		super(nome, valor);
		this.duracao = duracao;
		this.classificao = classificao;
	}

	public int getDuracao(){
		// Retorna a duração do Bluray	
		return this.duracao;
	}

	public void setDuracao(int duracao){
		// Modifica a duração do Bluray
		this.duracao = duracao;
	}

	public String getClassificao(){
		// Retorna a classificação do Bluray
		return this.classificao;
	}

	public void setClassificao(String classificao){
		// Modifica a classificação do Bluray
		this.classificao = classificao;
	}
}
