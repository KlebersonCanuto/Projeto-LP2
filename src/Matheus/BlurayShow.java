package Matheus;

public class BlurayShow extends Bluray{

	private String artista;
	private int numeroFaixas;
	
	public BlurayShow(String nome, double valor, int duracao, int numeroFaixas, String artista, String classificao) {
		
		super(nome, valor, duracao, classificao);
		this.artista = artista;
		this.numeroFaixas = numeroFaixas;
	}

	public String getArtista() {
		
		return artista;
	}

	public void setArtista(String artista) {
		
		this.artista = artista;
	}

	public int getNumeroFaixas() {
		
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		
		this.numeroFaixas = numeroFaixas;
	}
	
	@Override
	public String toString() {
		if(this.getEmprestado()) {
		return "SHOW: " + this.getNome() + ", R$ " + this.getValor() + ", Emprestado, " 
	+ this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getArtista() + ", " + this.getNumeroFaixas();
	} else {
		return "SHOW: " + this.getNome() + ", R$ " + this.getValor() + ", Não Emprestado, " 
				+ this.getDuracao() + "min , " + this.getClassificao() + ", " + this.getArtista() + ", " + this.getNumeroFaixas();
	}

	
	}
	
	

	
}
