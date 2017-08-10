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
	//Testa se está realmente pegando a Exceção em caso de PreÇO negativo
	@Test (expected = IllegalArgumentException.class)
	public void testItemExcecao(){
		Item I4 = new Item("Lolzin", -25.05);
		assertEquals("Preco Invalido", new Item("(500) Days of Summer", -1));
	}
	// Retorna se está emprestado ou não, como true ou false
	@Test
	public void testEmprestado() {
		assertEquals(false, I1.emprestado());
		I1.emprestou();
		assertEquals(true, I1.emprestado());
	}
	// Testa se o metodo transforma a variavel Emprestado para True
	@Test
	public void testEmprestou() {
		assertEquals(false, I1.emprestado());
		I1.emprestou();
		assertEquals(true, I1.emprestado());
		assertEquals(false, I2.emprestado());
		I2.emprestou();
		assertEquals(true, I2.emprestado());
	}
	// Testa se o metodo transforma a variavel Emprestado para False
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
	//Testa se dois itens são iguais (Se tem nome igual)
	@Test
	public void testEquals(){
		Item IE = new Item("", 10.50);
		
		assertEquals(false, I1.equals(I2));
		assertEquals(true, I1.equals(I3));
		assertEquals(false, I1.equals(IE));
	}
	// String para representar se está emprestado ou não
	@Test
	public void testStringEmprestado() {
		assertEquals("Nao emprestado", I1.stringEmprestado());
		I1.emprestou();
		assertEquals("Emprestado", I1.stringEmprestado());
		
	}
	
	



}
