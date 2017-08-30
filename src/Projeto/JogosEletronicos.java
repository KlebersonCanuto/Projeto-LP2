package Projeto;

public class JogosEletronicos extends Item {

	private String plataforma;
	
	/**
	 * Constrói um Jogo Eletronico apartir do nome, valor e plataforma
	 * 
	 * @param nomeItem
	 * @param valor
	 * @param plataforma
	 */
	public JogosEletronicos(String nomeItem, double valor, String plataforma){
		
		super(nomeItem, valor);
		this.plataforma = plataforma;
	}
	
	/**
	 * 
	 * @return a plataforma
	 */
	public String getPlataforma(){
		return plataforma;
	}

	/**
	 * Modifica a plataforma para o valor parametrizado
	 * 
	 * @param plataforma
	 */
	public void setPlataforma(String plataforma){
		this.plataforma = plataforma;
	}
	
	/**
	 * Retorna a representacao em forma "JOGO ELETRONICO: nome, R$ valor, emprestado(ou nao), plataforma"
	 * 
	 * @return representacao de um Jogo Eletronico
	 */
	public String toString(){
		return "JOGO ELETRONICO: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getPlataforma();
	}
	
	/**
	 * @return hashCode de Jogo Eletronico
	 */
	public int hashCode(){
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.getNome() == null) ? 0 : this.getNome().hashCode());
		result = prime * result + ((plataforma == null) ? 0 : plataforma.hashCode());
		return result;
	}

	/**
	 * Verifica se dois Jogos Eletronicos sao iguais e retorna um boolean
	 * apartir do nome e plataforma
	 * 
	 * @return boolean
	 */
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

