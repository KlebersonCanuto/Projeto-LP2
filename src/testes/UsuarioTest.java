package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import Projeto.Emprestimo;
import Projeto.Item;
import Projeto.Usuario;

public class UsuarioTest {

	Item I1;
	Item I2;
	Item I3;
	Usuario U1;
	Usuario U2;
	Usuario U3;
	Usuario U4;

	@Before
	public void setUp() throws Exception {
		U1 = new Usuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		U2 = new Usuario("Lucas", "21812687", "Lucas@hotmail.com");
		U3 = new Usuario("Matheus", "94189425", "matheus2@hotmai.com");
		I1 = new Item("Cd-Zezo", 15.05);
		I2 = new Item("De volta ao futuro", 45.00);
		I3 = new Item("Cd-Zezo", 15.05);

	}

	@Test
	public void testGetReputacao() {
		assertEquals(0.0, U1.getReputacao(), 0.000001);
		U1.adicionaItem(I2);
		assertEquals(2.25, U1.getReputacao(), 0.0001);

	}

	/**
	 * Verifica se o construtor está passando as informações para seus devidos
	 * lugares
	 */
	@Test
	public void testUsuario() {
		assertEquals("Matheus", U1.getNome());
		assertEquals("94189425", U1.getCelular());
		assertEquals("matheusYasuo@hotmail.com", U1.getEmail());

	}

	/**
	 * Testa o adicionaItem() E depois verifica com o getItem se foi adicionado
	 * 
	 * @param NomeItem
	 *            utilizado para descobrir se usuario tem tal item
	 */
	@Test
	public void testGetItem() {
		U1.adicionaItem(I1);
		U1.adicionaItem(I2);
		assertEquals(I1, U1.getItem("Cd-Zezo"));
		assertEquals(I2, U1.getItem("De volta ao futuro"));

	}

	/**
	 * Adiciona e depois remove o item para verificar se acontece a exceção
	 * 
	 * @param NomeItem
	 *            utilizado para descobrir se usuario tem tal item como não tem
	 *            é jogado a exceção
	 */
	@Test(expected = NullPointerException.class)
	public void testGetItemException() {

		U1.adicionaItem(I1);
		assertEquals(I1, U1.getItem("Cd-Zezo"));
		U1.removeItem("Cd-Zezo");
		assertEquals("Item nao encontrado", U1.getItem("Cd-Zezo"));

	}

	// Fazer
	@Test
	public void testlistaItens() {
	}

	/**
	 * Testa se o toString é do formato nome + ", " +this.email + ", " +
	 * this.telefone
	 */
	@Test
	public void testToString() {
		assertEquals("Matheus, matheusYasuo@hotmail.com, 94189425", U1.toString());
		assertEquals("Lucas, Lucas@hotmail.com, 21812687", U2.toString());

	}

	/**
	 * Verifica se 2 usuarios são iguais São iguais se @param Nome e @param
	 * Telefone forem iguais
	 */
	@Test
	public void testEqualsObject() {
		Usuario U4 = new Usuario("Matheus", "94189437", "matheusYasuo@hotmail.com");

		assertEquals(false, U1.equals(U2));
		assertEquals(true, U1.equals(U3));
		assertEquals(false, U4.equals(U1));
	}

	@Test
	public void testAdicionaEmprestimo() {
		Usuario dono = new Usuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		Usuario requerente = new Usuario("Lucas", "21812687", "Lucas@hotmail.com");
		Item item = new Item("Cd-Zezo", 15.05);
		Emprestimo e = new Emprestimo(dono, requerente, item, "08/08/2017", 5);
		List<Emprestimo> emprestimos = new ArrayList<>();

		emprestimos.add(e);
		assertEquals(true, emprestimos.size() == 1);
		assertEquals(false, emprestimos.size() == 2);

	}
	
	@Test
	public void testDevolveItem(){
		
	}

}
