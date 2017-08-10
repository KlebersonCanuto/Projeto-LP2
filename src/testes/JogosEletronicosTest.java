package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Kleberson.JogosEletronicos;

public class JogosEletronicosTest {

	@Test
	public void testEqualsObject() {
		JogosEletronicos JE1 = new JogosEletronicos("Lolzin", 0, "PC");
		JogosEletronicos JE2 = new JogosEletronicos("Lolzin", 30, "PC");
		JogosEletronicos JE3 = new JogosEletronicos("DS3", 40, "PS4");
		
		assertEquals(true, JE1.equals(JE2));
		assertEquals(false,JE1.equals(JE3));
		assertEquals(false, JE2.equals(JE3));
	}

	@Test
	public void testJogosEletronicos() {
		JogosEletronicos JE = new JogosEletronicos("Lolzin", 0, "PC");
		assertEquals("Lolzin", JE.getNome());
		assertEquals(0, JE.getValor(),0.00001);
		assertEquals("PC", JE.getPlataforma());
		
	}

	@Test
	public void testToString() {
		JogosEletronicos JE = new JogosEletronicos("Lolzin", 0, "PC");
		assertEquals("JOGO ELETRONICO: Lolzin, R$ 0.0, Nao emprestado, PC", JE.toString());
		
		JE.emprestou();
		assertEquals("JOGO ELETRONICO: Lolzin, R$ 0.0, Emprestado, PC", JE.toString());

	
	}

}
