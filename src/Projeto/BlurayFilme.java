package Projeto;

public class BlurayFilme extends Bluray {

	private Genero genero;
	private int anoLancamento;

	/**
	 * Constrói um BlurayFilme que herda Bluray a partir de nome, valor, duracao, classificacao, genero e ano de Lancamento.
	 * 
	 * @param nome
	 * @param valor
	 * @param duracao
	 * @param genero
	 * @param classificacao
	 * @param anoLancamento
	 */
	public BlurayFilme(String nome, double valor, int duracao, String genero, String classificacao, int anoLancamento){
			
		super(nome, valor, duracao, classificacao);
		this.anoLancamento = anoLancamento;
		setGenero(genero);
		
	}
	
	/**
	 * 
	 * @return o genero
	 */
	public String getGenero(){
		
		return this.genero.getGenero();
	}
	
	/**
	 * Modifica o genero para o valor passado como parametro
	 * @param genero
	 */
	public void setGenero(String genero){
		
		if (genero.equals("ACAO"))
			this.genero = Genero.ACAO;
		
		else if (genero.equals("ANIMACAO"))
			this.genero = Genero.ANIMACAO;
		
		else if (genero.equals("AVENTURA"))
			this.genero = Genero.AVENTURA;
		
		else if (genero.equals("COMEDIA"))
			this.genero = Genero.COMEDIA;
		
		else if (genero.equals("DOCUMENTARIO"))
			this.genero = Genero.DOCUMENTARIO;
		
		else if (genero.equals("DRAMA"))
			this.genero = Genero.DRAMA;
		
		else if (genero.equals("EROTICO"))
			this.genero = Genero.EROTICO;
		
		else if (genero.equals("FAROESTE"))
			this.genero = Genero.FAROESTE;
		
		else if (genero.equals("FICCAO"))
			this.genero = Genero.FICCAO;
		
		else if (genero.equals("MUSICAL"))
			this.genero = Genero.MUSICAL;
		
		else if (genero.equals("POLICIAL"))
			this.genero = Genero.POLICIAL;
		
		else if (genero.equals("ROMANCE"))
			this.genero = Genero.ROMANCE;
		
		else if (genero.equals("SUSPENSE"))
			this.genero = Genero.SUSPENSE;
		
		else if (genero.equals("TERROR"))
			this.genero = Genero.TERROR;
		
		else if (genero.equals("OUTRO"))
			this.genero = Genero.OUTRO;
		
		else
			throw new IllegalArgumentException("Genero invalido");
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
		
		return "FILME: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getDuracao() + " min, " + this.getClassificacao() + ", " + this.getGenero() + ", " + this.getAnoLancamento();
	}
}