package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Projeto.BluraySerie;

public class BluraySerieTest {

	@Test
	public void testBluraySerie() {
		BluraySerie BS1 = new BluraySerie("GOT", 80.50,"VAI MORRER TODO MUNDO!", 50, "DEZOITO_ANOS", "SUSPENSE", 7 );
		BluraySerie BS2 = new BluraySerie("VIKINGS", 60.00 ,"As aventuras de ragnaldo e seus amigos", 50, "CATORZE_ANOS", "AÇÃO", 4 );
		assertEquals("GOT", BS1.getNome());
		assertEquals(80.50, BS1.getValor(), 0.0001);
		assertEquals("As aventuras de ragnaldo e seus amigos", BS2.getDescricao());
		assertEquals(50, BS1.getDuracao());
		assertEquals("CATORZE_ANOS", BS2.getClassificao());
		assertEquals("SUSPENSE", BS1.getGenero());
		assertEquals(4, BS2.getTemporada());

	}

	@Test
	public void testToString() {
		BluraySerie BS1 = new BluraySerie("GOT", 80.50,"VAI MORRER TODO MUNDO!", 50, "DEZOITO_ANOS", "SUSPENSE", 7 );
		BluraySerie BS2 = new BluraySerie("VIKINGS", 60.00 ,"As aventuras de ragnaldo e seus amigos", 50, "CATORZE_ANOS", "AÇÃO", 4 );
		assertEquals("SERIE: GOT, R$ 80.5, Nao emprestado, 50 min, DEZOITO_ANOS, SUSPENSE, Temporada 7", BS1.toString());
		BS2.emprestou();
		assertEquals("SERIE: VIKINGS, R$ 60.0, Emprestado, 50 min, CATORZE_ANOS, AÇÃO, Temporada 4",BS2.toString());
	}

	@Test
	public void testEqualsObject() {
		BluraySerie BS1 = new BluraySerie("GOT", 80.50,"VAI MORRER TODO MUNDO!", 50, "DEZOITO_ANOS", "SUSPENSE", 1 );
		BluraySerie BS2 = new BluraySerie("GOT", 80.50,"VAI MORRER TODO MUNDO!", 50, "DEZOITO_ANOS", "SUSPENSE", 2 );
		BluraySerie BS3 = new BluraySerie("GOT", 80.50,"VAI MORRER TODO MUNDO!", 50, "DEZOITO_ANOS", "SUSPENSE", 1 );

		assertEquals(false, BS1.equals(BS2));
		assertEquals(true, BS1.equals(BS3));
		assertEquals(false,BS3.equals(BS2));
	}

}
