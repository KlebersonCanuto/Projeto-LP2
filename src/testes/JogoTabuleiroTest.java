package testes;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import Projeto.JogoTabuleiro;

public class JogoTabuleiroTest {

	/**
	 * Verifica se o construtor está passando as informações para seus devidos lugares
	 */
	@Test
	public void testJogoTabuleiro() {
		JogoTabuleiro JT = new JogoTabuleiro("War", 100.00);
		assertEquals("War", JT.getNome());
		assertEquals(100.00, JT.getValor(), 0.00001);
	}
	
	/**
	 * Dado um Item do tipo JogoTabuleiro faz a verificação se alguma peça
	 * foi perdida e retorna uma String representando a informação
	 */
	@Test
	public void testVerificaPecas() {
		JogoTabuleiro JT = new JogoTabuleiro("War", 100.00);
		assertEquals("COMPLETO", JT.verificaPecas());
		
		JT.adicionaPecaPerdida("Dado");
		assertEquals("COM PECAS PERDIDAS", JT.verificaPecas());
	}

	/** 
	 * Testa se o toString é do formato
	 * "JOGO DE TABULEIRO: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.verificaPecas();
	 */
	@Test
	public void testToString() {
		JogoTabuleiro JT = new JogoTabuleiro("War", 100.00);
		
		assertEquals("JOGO DE TABULEIRO: War, R$ 100.0, Nao emprestado, COMPLETO", JT.toString());
		
		JT.adicionaPecaPerdida("Dado");
		assertEquals("JOGO DE TABULEIRO: War, R$ 100.0, Nao emprestado, COM PECAS PERDIDAS", JT.toString());
		
		
	}
	
	/**
	 * Verifica se 2 JogoTabuleiro são iguais
	 * São iguais se @param Nome e tiverem peças perdidas iguais 
	 */
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
