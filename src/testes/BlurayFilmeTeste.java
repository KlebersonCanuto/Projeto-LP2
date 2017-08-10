package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Projeto.BlurayFilme;

public class BlurayFilmeTeste {

	@Test
	public void testBlurayFilme() {
		BlurayFilme BF1 = new BlurayFilme("Valente", 29.50, 100, "ANIMAÇÃO", "LIVRE", 2006);
		BlurayFilme BF2 = new BlurayFilme("Bastardos Inglórios", 80.00, 120, "AÇÃO", "DEZOITO_ANOS", 2009);
		assertEquals("Valente", BF1.getNome() );
		assertEquals(80.00, BF2.getValor(), 0.00001);
		assertEquals(100, BF1.getDuracao());
		assertEquals("AÇÃO", BF2.getGenero());
		assertEquals("LIVRE", BF1.getClassificao());
		assertEquals(2009, BF2.getAnoLancamento());
		
	
	}

	@Test
	public void testToString() {
		BlurayFilme BF1 = new BlurayFilme("Valente", 29.50, 100, "ANIMAÇÃO", "LIVRE", 2006);
		BlurayFilme BF2 = new BlurayFilme("Bastardos Inglórios", 80.00, 120, "AÇÃO", "DEZOITO_ANOS", 2009);
		
		assertEquals("FILME: Valente, R$ 29.5, Nao emprestado, 100 min, LIVRE, ANIMAÇÃO, 2006", BF1.toString());
		assertEquals("FILME: Bastardos Inglórios, R$ 80.0, Nao emprestado, 120 min, DEZOITO_ANOS, AÇÃO, 2009", BF2.toString());
	}

}
