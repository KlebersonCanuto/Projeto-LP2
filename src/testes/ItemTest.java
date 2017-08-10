package testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Projeto.Item;

public class ItemTest {
	
	Item I1;
	Item I2;
	Item I3;
	@Before
	public void setUp() throws Exception {
		I1 = new Item("Cd-Zezo", 15.05);
		I2 = new Item("De volta ao futuro", 45.00);
		I3 = new Item("Cd-Zezo", 15.05);
		
		
	}
	
	/**
	 * Verifica se o construtor está passando as informações para seus devidos lugares
	 */
	@Test
	public void testItem() {
		I1 = new Item("Cd-Zezo", 15.05);
		I2 = new Item("De volta ao futuro", 45);
		assertEquals("Cd-Zezo", I1.getNome());
		assertEquals("De volta ao futuro", I2.getNome());
		assertNotEquals(15.05, I2.getValor());
		assertEquals(15.05, I1.getValor(), 0.001);
		assertEquals(45.00, I2.getValor(), 0.001);
		
	
		
		
		
	}
	/**
	 * Verifica se o programa joga exceção quando @param valor for negativo
	 * 
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testItemExcecao(){
		Item I4 = new Item("Lolzin", -25.05);
		assertEquals("Preco Invalido", new Item("(500) Days of Summer", -1));
	}
	
	/**
	 * Emprestado verifica se o Item está atualmente Emprestado ou Não emprestado
	 * Retorna um boolean
	 */
	@Test
	public void testEmprestado() {
		assertEquals(false, I1.emprestado());
		I1.emprestou();
		assertEquals(true, I1.emprestado());
	}
	
	/**
	 * Caso emprestado esteja como falso, ou seja, Item não emprestado
	 * esse metodo modifica para verdadeiro, logo item agr está Emprestado
	 */
	@Test
	public void testEmprestou() {
		assertEquals(false, I1.emprestado());
		I1.emprestou();
		assertEquals(true, I1.emprestado());
		assertEquals(false, I2.emprestado());
		I2.emprestou();
		assertEquals(true, I2.emprestado());
	}
	
	/**
	 * Caso emprestado esteja como verdadeiro, ou seja, Item Emprestado
	 * esse metodo modifica para falso, logo item agr Não está emprestado
	 */
	@Test
	public void testRetornou() {
		assertEquals(false, I1.emprestado());
		I1.emprestou();
		assertEquals(true, I1.emprestado());
		I1.retornou();
		assertEquals(false, I1.emprestado());
		I2.emprestou();
		I2.retornou();
		assertEquals(false, I2.emprestado());
	}

	/**
	 * Verifica se 2 Itens são iguais
	 * São iguais se @param NomeItem for igual
	 */
	@Test
	public void testEquals(){
		Item IE = new Item("", 10.50);
		
		assertEquals(false, I1.equals(I2));
		assertEquals(true, I1.equals(I3));
		assertEquals(false, I1.equals(IE));
	}
	
	/** 
	 * Verifica a situação do item
	 * Caso emprestado é retornado a String "Emprestado"
	 * se não é retornado a String "Não emprestado"
	 *
	 */
	@Test
	public void testStringEmprestado() {
		assertEquals("Nao emprestado", I1.stringEmprestado());
		I1.emprestou();
		assertEquals("Emprestado", I1.stringEmprestado());
		
	}
	
	



}
