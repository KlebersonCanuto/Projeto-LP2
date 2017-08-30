package Projeto;

public class BlurayFilme extends Bluray {

	private String genero;
	private int anoLancamento;

	/**
	 * Constrói um BlurayFilme que herda Bluray a partir de nome, valor, duracao, classificacao, genero e ano de Lancamento.
	 * 
	 * @param nome
	 * @param valor
	 * @param duracao
	 * @param genero
	 * @param classificao
	 * @param anoLancamento
	 */
	public BlurayFilme(String nome, double valor, int duracao, String genero, String classificao, int anoLancamento){
			
		super(nome, valor, duracao, classificao);
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		
	}
	
	/**
	 * 
	 * @return o genero
	 */
	public String getGenero(){
		
		return this.genero;
	}
	
	/**
	 * Modifica o genero para o valor passado como parametro
	 * @param genero
	 */
	public void setGenero(String genero){
		
		this.genero = genero;
	}
	
	/**
	 * 
	 * @return o ano de lancamento
	 */
	public int getAnoLancamento(){
		
		return this.anoLancamento;
	}
	
	/**
	 * Retorna a  representação de um BlurayFilme em forma de  "FILME: nome, R$ valor, emprestado(ou nao), duracao min, classificacao, genero, ano de lancamento.
	 * 
	 * @return a representação de um BlurayFilme
	 */
	public String toString(){
		
		return "FILME: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getGenero() + ", " + this.getAnoLancamento();
	}
}