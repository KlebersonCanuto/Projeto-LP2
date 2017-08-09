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
		// Retorna a dura��o do Bluray	
		return this.duracao;
	}

	public void setDuracao(int duracao){
		// Modifica a dura��o do Bluray
		this.duracao = duracao;
	}

	public String getClassificao(){
		// Retorna a classifica��o do Bluray
		return this.classificao;
	}

	public void setClassificao(String classificao){
		// Modifica a classifica��o do Bluray
		this.classificao = classificao;
	}
}
