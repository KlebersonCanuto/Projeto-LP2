package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Projeto.BlurayFilme;

public class BlurayFilmeTest {

	/**
	 * Verifica se o construtor está passando as informações para seus devidos lugares
	 */
	@Test
	public void testBlurayFilme() {
		BlurayFilme BF1 = new BlurayFilme("Valente", 29.50, 100, "ANIMACAO", "LIVRE", 2006);
		BlurayFilme BF2 = new BlurayFilme("Bastardos Inglórios", 80.00, 120, "ACAO", "DEZOITO_ANOS", 2009);
		assertEquals("Valente", BF1.getNome() );
		assertEquals(80.00, BF2.getValor(), 0.00001);
		assertEquals(100, BF1.getDuracao());
		assertEquals("ACAO", BF2.getGenero());
		assertEquals("LIVRE", BF1.getClassificacao());
		assertEquals(2009, BF2.getAnoLancamento());
		
	
	}

	/** 
	 * Testa se o toString é do formato
	 *"FILME: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getGenero() + ", " + this.getAnoLancamento()
	 */
	@Test
	public void testToString() {
		BlurayFilme BF1 = new BlurayFilme("Valente", 29.50, 100, "ANIMACAO", "LIVRE", 2006);
		BlurayFilme BF2 = new BlurayFilme("Bastardos Inglórios", 80.00, 120, "ACAO", "DEZOITO_ANOS", 2009);
		
		assertEquals("FILME: Valente, R$ 29.5, Nao emprestado, 100 min, LIVRE, ANIMACAO, 2006", BF1.toString());
		assertEquals("FILME: Bastardos Inglórios, R$ 80.0, Nao emprestado, 120 min, DEZOITO_ANOS, ACAO, 2009", BF2.toString());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testErro(){
		BlurayFilme BF1 = new BlurayFilme("Valente", 29.50, 100, "ANIMA", "LIVRE", 2006);
	}
	
}
