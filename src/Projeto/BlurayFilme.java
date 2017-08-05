package Projeto;

public class BlurayFilme extends Bluray {

	private String genero;
	private int anoLancamento;
	public BlurayFilme(String nome, double valor, int duracao, String genero, String classificao, int anoLancamento) {
		super(nome, valor, duracao, classificao);
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	
	
	

}
