package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Projeto.Emprestimo;
import Projeto.Item;
import Projeto.Usuario;

public class EmprestimoTest {
	
	Usuario dono = new Usuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
	Usuario requerente = new Usuario("Lucas", "21812687", "Lucas@hotmail.com");
	Item item = new Item("Cd-Zezo", 15.05);
	
	/**
	 * Verifica se o construtor está passando as informações para seus devidos lugares
	 */
	@Test
	public void testEmprestimo() {
		Emprestimo emprestimo = new Emprestimo(dono, requerente, item, "08/08/2017", 5);
		assertEquals(dono, emprestimo.getDono());
		assertEquals(requerente, emprestimo.getRequerente());
		assertEquals(item, emprestimo.getItem());
		assertEquals("08/08/2017",emprestimo.getDataEmprestimo());
		assertEquals(5, emprestimo.getPeriodo());

		
	}

	/**
	 * @param dataDevolucao para definir quantos dias se passaram
	 * Encerra um emprestimo se esse existe e define de passou ou não do
	 * periodo definido pelo dono
	 */
	@Test
	public void testEncerra() {
		Emprestimo emprestimo1 = new Emprestimo(dono, requerente, item, "08/08/2017", 5);
		Emprestimo emprestimo2 = new Emprestimo(dono, requerente, item, "08/08/2017", 12);
		
		emprestimo1.encerra("15/08/2017");
		assertEquals(true, emprestimo1.passouDoPeriodo());
		
		emprestimo2.encerra("09/08/2017");
		assertEquals(false, emprestimo2.passouDoPeriodo());
	}


}
