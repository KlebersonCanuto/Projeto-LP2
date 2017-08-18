package Lucas;

public class JogosEletronicos extends Item {

	private String plataforma;
	
	public JogosEletronicos(String nomeItem, double valor, String plataforma){
		
		super(nomeItem, valor);
		this.plataforma = plataforma;
	}
	
	public String getPlataforma(){
		// Retorna a plataforma do jogo
		return plataforma;
	}

	public void setPlataforma(String plataforma){
		// Modifica a plataforma do jogo
		this.plataforma = plataforma;
	}
	
	public String toString(){
		// Retorna a representacao em string do jogo
		return "JOGO ELETRONICO: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getPlataforma();
	}
	
	public int hashCode(){
		// hashCode do jogo eletronico
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.getNome() == null) ? 0 : this.getNome().hashCode());
		result = prime * result + ((plataforma == null) ? 0 : plataforma.hashCode());
		return result;
	}

	public boolean equals(Object obj){
		// Verifica se 2 jogos eletronicos sao iguais
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		JogosEletronicos other = (JogosEletronicos) obj;
		if (this.getNome() == null) {
			if (other.getNome() != null)
				return false;
		} else if (!this.getNome().equals(other.getNome()))
			return false;
		if (plataforma == null) {
			if (other.plataforma != null)
				return false;
		} else if (!plataforma.equals(other.plataforma))
			return false;
		
		return true;
	}
}

