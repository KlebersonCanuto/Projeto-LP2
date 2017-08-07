package Matheus;

public class JogosEletronicos extends Item {
	
	private String plataforma;
	
	public JogosEletronicos(String nomeItem, double valor, String plataforma){
		
		super(nomeItem, valor);
		this.plataforma = plataforma;
	}
	
	public String getPlataforma() {
		
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		
		this.plataforma = plataforma;
	}
	
	@Override
	public String toString() {
		if(this.getEmprestado()) {
		return "JOGO ELETRONICO: " + this.getNome() + ", R$ " + this.getValor() + ", Emprestado, " 
	+ this.getPlataforma();
	} else {
		return "JOGO ELETRONICO: " + this.getNome() + ", R$ " + this.getValor() + ", Não emprestado, " 
				+ this.getPlataforma();
	}
	}

		
	

}
