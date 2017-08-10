package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Projeto.BlurayShow;
import Projeto.Item;
import Projeto.Sistema;
import Projeto.Usuario;

public class SistemaTest {

	Usuario U1 = new Usuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
	Sistema sistema = new Sistema();
	
	@Test (expected = IllegalArgumentException.class)
	public void testCadastraUsuario() {
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		
	}

	@Test
	public void testGetInfoUsuario() {
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		String resposta = sistema.getInfoUsuario("Matheus", "94189425", "email");
		
		assertEquals("matheusYasuo@hotmail.com", resposta);
	}
	
	//OLhar se não é null pointer
	@Test (expected = IllegalArgumentException.class)
	public void testGetInfoUsuarioExcecao() {
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		sistema.getInfoUsuario("Matheus1", "94189425", "email");
	}

	/*Esperado que de exceção quando adicionar 2 usuarios iguais.
	 * Logo, ao adicionar e depois retirar é preciso cadastrar mais 2 vezes
	 * 
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testRemoverUsuario() {
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		sistema.removerUsuario("Matheus", "94189425");
		
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");

	
	}

	@Test
	public void testAtualizarUsuario() {
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		sistema.atualizarUsuario("Matheus", "94189425", "email", "matheus@gmail.com");
		assertEquals("matheus@gmail.com", sistema.getInfoUsuario("Matheus", "94189425", "email"));
	
		sistema.cadastraUsuario("Matheus1", "94189425", "matheusYasuo@hotmail.com");
		sistema.atualizarUsuario("Matheus1", "94189425", "nome", "Hurley");
		assertEquals("Hurley", sistema.getInfoUsuario("Hurley", "94189425", "nome"));
	
		sistema.cadastraUsuario("Matheus2", "94189425", "matheusYasuo@hotmail.com");
		sistema.atualizarUsuario("Matheus2", "94189425", "telefone", "99999999");
		assertEquals("99999999", sistema.getInfoUsuario("Matheus2", "99999999", "telefone"));
	
	}	

	@Test
	public void testGetInfoItem() {	
		sistema.cadastraUsuario("Matheus1", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus1", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");
		assertEquals("Pior Cenario", sistema.getInfoItem("Matheus1", "94189425", "Pior Cenario", "nome"));
		
		sistema.cadastraUsuario("Matheus2", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus2", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");
		assertEquals("50.0", sistema.getInfoItem("Matheus2", "94189425", "Pior Cenario", "preco"));
	}

	
	@Test
	public void testAtualizarItem() {
		sistema.cadastraUsuario("Matheus1", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus1", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");
		sistema.atualizarItem("Matheus1", "94189425", "Pior Cenario", "nome", "Natureza Humana");
		assertEquals("Natureza Humana", sistema.getInfoItem("Matheus1", "94189425", "Natureza Humana", "nome"));
		
		sistema.cadastraUsuario("Matheus2", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus2", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");
		sistema.atualizarItem("Matheus2", "94189425", "Pior Cenario", "preco", "25");
		assertEquals("25.0", sistema.getInfoItem("Matheus2", "94189425", "Pior Cenario", "preco"));
		
	}

	@Test
	public void testListarItensOrdenadosPorNome() {
		sistema.cadastraUsuario("Matheus1", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus1", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");
		sistema.cadastrarBluRaySerie("Matheus1", "94189425","VIKINGS", 60.00 ,"As aventuras de ragnaldo e seus amigos", 50, "CATORZE_ANOS", "AÇÃO", 4 );;
		sistema.cadastrarEletronico("Matheus1", "94189425", "Lolzin", 23, "PC");
		assertEquals("JOGO ELETRONICO: Lolzin, R$ 23.0, Nao emprestado, PC|SHOW: Pior Cenario, R$ 50.0, Nao emprestado, 50 min, DEZOITO_ANOS, Matanza, 15 faixas|SERIE: VIKINGS, R$ 60.0, Nao emprestado, 50 min, CATORZE_ANOS, AÇÃO, Temporada 4|",sistema.listarItensOrdenadosPorNome());
	}

	@Test
	public void testListarItensOrdenadosPorValor() {
		sistema.cadastraUsuario("Matheus1", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus1", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");
		sistema.cadastrarBluRaySerie("Matheus1", "94189425","VIKINGS", 60.00 ,"As aventuras de ragnaldo e seus amigos", 50, "CATORZE_ANOS", "AÇÃO", 4 );;
		sistema.cadastrarEletronico("Matheus1", "94189425", "Lolzin", 23, "PC");
		assertEquals("JOGO ELETRONICO: Lolzin, R$ 23.0, Nao emprestado, PC|SHOW: Pior Cenario, R$ 50.0, Nao emprestado, 50 min, DEZOITO_ANOS, Matanza, 15 faixas|SERIE: VIKINGS, R$ 60.0, Nao emprestado, 50 min, CATORZE_ANOS, AÇÃO, Temporada 4|", sistema.listarItensOrdenadosPorValor());
	}

	@Test
	public void testPesquisarDetalhesItem() {
		sistema.cadastraUsuario("Matheus1", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus1", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");
		sistema.cadastrarBluRaySerie("Matheus1", "94189425","VIKINGS", 60.00 ,"As aventuras de ragnaldo e seus amigos", 50, "CATORZE_ANOS", "AÇÃO", 4 );;
		
		assertEquals("SHOW: Pior Cenario, R$ 50.0, Nao emprestado, 50 min, DEZOITO_ANOS, Matanza, 15 faixas", sistema.pesquisarDetalhesItem("Matheus1", "94189425", "Pior Cenario"));
		
		assertEquals("SERIE: VIKINGS, R$ 60.0, Nao emprestado, 50 min, CATORZE_ANOS, AÇÃO, Temporada 4", sistema.pesquisarDetalhesItem("Matheus1", "94189425", "VIKINGS") );
	}

	@Test (expected  = IllegalArgumentException.class)
	public void testRegistrarEmprestimo() {
		sistema.cadastraUsuario("Matheus1", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus1", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");

		sistema.cadastraUsuario("Matheus2", "95189425", "matheus@hotmail.com");
		
		sistema.registrarEmprestimo("Matheus1", "94189425", "Matheus2", "95189425", "Pior Cenario", "09/08/2017",7);
		sistema.registrarEmprestimo("Matheus1", "94189425", "Matheus2", "95189425", "Pior Cenario", "09/08/2017",7);
	}

	@Test
	public void testDevolverItem() {
		
	}

}
