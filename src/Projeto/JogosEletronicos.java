package Projeto;

public class JogosEletronicos extends Item {
	
	private String plataforma;
	
	public JogosEletronicos(String nomeItem, float valor, String plataforma){
		super(nomeItem, valor);
	}
	
	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}


/**ESTÁ FALTANDO O EQUALS]
 * Tem que comparar a plataforma e o nome, porém não como o nome ta em item não consegui saber como fazer(MATHEUS)
	
	**/
	

}
