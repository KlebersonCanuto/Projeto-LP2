package Projeto;

public class BlurayFilme extends Bluray {

	private String genero;
	private int anoLancamento;
	public BlurayFilme(String nome, int valor, int duracao, String classificao, String genero, int anoLancamento) {
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
