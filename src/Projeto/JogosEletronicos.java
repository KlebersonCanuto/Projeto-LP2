package Projeto;

public class JogosEletronicos extends Item {

	private String plataforma;
	
	public JogosEletronicos(String nomeItem, double valor, String plataforma){
		
		super(nomeItem, valor);
		this.plataforma = plataforma;
	}
	
	public String getPlataforma(){
		
		return plataforma;
	}

	public void setPlataforma(String plataforma){
		
		this.plataforma = plataforma;
	}
	
	public String toString(){
		
		return "JOGO ELETRONICO: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getPlataforma();
	}
	
	public int hashCode(){
		
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.getNome() == null) ? 0 : this.getNome().hashCode());
		result = prime * result + ((plataforma == null) ? 0 : plataforma.hashCode());
		return result;
	}

	public boolean equals(Object obj){
		
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
