package Matheus;

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
	
	@Override
	public String toString() {
		if(this.getEmprestado()) {
		return "FILME: " + this.getNome() + ", R$ " + this.getValor() + ", Emprestado, " 
	+ this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getGenero() + ", " + this.getAnoLancamento();
	} else {
		return "FILME: " + this.getNome() + ", R$ " + this.getValor() + ", Não Emprestado, " 
				+ this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getGenero() + ", " + this.getAnoLancamento();
	}

	
	}

	
}
