package Projeto;

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
	
/**EST� FALTANDO O EQUALS]
 * Tem que comparar a plataforma e o nome, por�m n�o como o nome ta em item n�o consegui saber como fazer(MATHEUS)
	
	**/
	

}
