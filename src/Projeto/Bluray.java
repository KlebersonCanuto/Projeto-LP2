package Projeto;

public class Bluray extends Item{
	
	private int duracao;
	private String classificao;
	
	/**	
	 * Constrói um Bluray a partir de seu nome, valor, duracao e classificacao.
	 *
	 *@param nome, define o nome
	 *@param valor, define o valor em double	
	 *@param duracao, define a duracao em int
	 *@param classificao
	   */
	public Bluray(String nome, double valor, int duracao, String classificao){
		
		super(nome, valor);
		this.duracao = duracao;
		this.classificao = classificao;
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
	public String getClassificao(){
		
		return this.classificao;
	}

	/**
	 * Modifica a classificacao atual para a que foi passada como parametro
	 * @param classificao
	 */
	public void setClassificao(String classificao){
		
		this.classificao = classificao;
	}
}