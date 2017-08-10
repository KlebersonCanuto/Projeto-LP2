package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Kleberson.JogoTabuleiro;

public class JogoTabuleiroTest {

	@Test
	public void testJogoTabuleiro() {
		JogoTabuleiro JT = new JogoTabuleiro("War", 100.00);
		assertEquals("War", JT.getNome());
		assertEquals(100.00, JT.getValor(), 0.00001);
	}

	@Test
	public void testVerificaPecas() {
		JogoTabuleiro JT = new JogoTabuleiro("War", 100.00);
		assertEquals("COMPLETO", JT.verificaPecas());
		
		JT.adicionaPecaPerdida("Dado");
		assertEquals("COM PECAS PERDIDAS", JT.verificaPecas());
	}

	@Test
	public void testToString() {
		JogoTabuleiro JT = new JogoTabuleiro("War", 100.00);
		
		assertEquals("JOGO DE TABULEIRO: War, R$ 100.0, Nao emprestado, COMPLETO", JT.toString());
		
		JT.adicionaPecaPerdida("Dado");
		assertEquals("JOGO DE TABULEIRO: War, R$ 100.0, Nao emprestado, COM PECAS PERDIDAS", JT.toString());
		
		
	}
	
	@Test
	public void testEqualsObject() {
		JogoTabuleiro JT1 = new JogoTabuleiro("War", 100.00);
		JogoTabuleiro JT2 = new JogoTabuleiro("War", 80.00);
		
		assertEquals(true, JT1.equals(JT2));
		JT1.adicionaPecaPerdida("Dado");
		assertEquals(false, JT1.equals(JT2));
		JT2.adicionaPecaPerdida("Dado");
		assertEquals(true, JT1.equals(JT2));
		
		
		
	}


}
