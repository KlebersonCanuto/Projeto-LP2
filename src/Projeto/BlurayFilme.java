package Projeto;

public class BlurayFilme extends Bluray {

	private String genero;
	private int anoLancamento;
	
	public BlurayFilme(String nome, double valor, int duracao, String genero, String classificao, int anoLancamento){
	
		super(nome, valor, duracao, classificao);
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		
	}
	
	public String getGenero(){
		// Retorna o genero do filme
		return this.genero;
	}
	
	public void setGenero(String genero){
		// Modifica o genero do filme
		this.genero = genero;
	}
	
	public int getAnoLancamento(){
		// Retorna o ano de lancamento do filme
		return this.anoLancamento;
	}
		
	public String toString(){
		// Retorna a representação em String do filme
		return "FILME: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getGenero() + ", " + this.getAnoLancamento();
	}
}
