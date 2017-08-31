package Projeto;

public class Bluray extends Item{
	
	private int duracao;
	private Classificacao classificacao;
	
	/**	
	 * Constrói um Bluray a partir de seu nome, valor, duracao e classificacao.
	 *
	 *@param nome, define o nome
	 *@param valor, define o valor em double	
	 *@param duracao, define a duracao em int
	 *@param classificacao
	   */
	public Bluray(String nome, double valor, int duracao, String classificacao){
		
		super(nome, valor);
		this.duracao = duracao;
		setClassificacao(classificacao);
	}
	
	/**
	 * @return a duracao
	 */
	public int getDuracao(){
		
		return this.duracao;
	}
	
	/**
	 * Modifica a duracao atual para a duracao que foi repassada
	 * @param duracao
	 */
	public void setDuracao(int duracao){
		
		this.duracao = duracao;
	}
	
	/**
	 * 
	 * @return a classificacao 
	 */
	public String getClassificacao(){
		
		return this.classificacao.getClassificacao();
	}

	/**
	 * Modifica a classificacao atual para a que foi passada como parametro
	 * @param classificacao
	 */
	public void setClassificacao(String classificacao){
		
		if (classificacao.equals("LIVRE"))
			this.classificacao = Classificacao.LIVRE;		
		
		else if (classificacao.equals("DEZ_ANOS"))
			this.classificacao = Classificacao.DEZ_ANOS;
		
		else if (classificacao.equals("DOZE_ANOS"))
			this.classificacao = Classificacao.DOZE_ANOS;
		
		else if (classificacao.equals("QUATORZE_ANOS"))
			this.classificacao = Classificacao.QUATORZE_ANOS;
		
		else if (classificacao.equals("DEZESSEIS_ANOS"))
			this.classificacao = Classificacao.DEZESSEIS_ANOS;
		
		else if (classificacao.equals("DEZOITO_ANOS"))
			this.classificacao = Classificacao.DEZOITO_ANOS;
		
		else
			throw new IllegalArgumentException("Classicacao invalida");
	}
}