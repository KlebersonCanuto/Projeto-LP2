package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Projeto.BlurayShow;

public class BlurayShowTest {


	/**
	 * Verifica se o construtor está passando as informações para seus devidos lugares
	 */
	@Test
	public void testBlurayShow() {
		BlurayShow BS1 = new BlurayShow("Pior Cenario Possivel", 89.70, 60, 15, "Matanza", "DEZOITO_ANOS");
		assertEquals("Pior Cenario Possivel", BS1.getNome());
		assertEquals(89.70, BS1.getValor(), 0.0001);
		assertEquals(60, BS1.getDuracao());
		assertEquals(15, BS1.getNumeroFaixas());
		assertEquals("Matanza", BS1.getArtista());
		assertEquals("DEZOITO_ANOS", BS1.getClassificacao());
	}

	/** 
	 * Testa se o toString é do formato
	 *"SHOW: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado() + ", " + this.getDuracao() + " min, " + this.getClassificao() + ", " + this.getArtista() + ", " + this.getNumeroFaixas() + " faixas"
	 */
	@Test
	public void testToString() {
		BlurayShow BS2 = new BlurayShow("Tempo de Paz", 89.70, 40, 10, "Maneva", "LIVRE");
		
		assertEquals("SHOW: Tempo de Paz, R$ 89.7, Nao emprestado, 40 min, LIVRE, Maneva, 10 faixas", BS2.toString());
		
	}
}
