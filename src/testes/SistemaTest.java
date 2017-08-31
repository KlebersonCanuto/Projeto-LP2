package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Projeto.BlurayShow;
import Projeto.Item;
import Projeto.Sistema;
import Projeto.Usuario;

public class SistemaTest {

	Sistema sistema = new Sistema();
	
	/**
	 * Testa a excecoes, ja que nao pode haver 2 Usuarios Iguais.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testCadastraUsuario() {

		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCadastraUsuario2() {

		sistema.cadastraUsuario("", "", "");
	}
	/**
	 * Ao chamar o getInfoUsuario os @param nome e @param telefone sao usados
	 * para saber qual usuario
	 * Ja o @param atributo define qual vai ser o retorno
	 */
	@Test
	public void testGetInfoUsuario() {
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		String resposta = sistema.getInfoUsuario("Matheus", "94189425", "email");
		
		assertEquals("matheusYasuo@hotmail.com", resposta);
	}
	
	/**
	 * Verifica excecao
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testGetInfoUsuarioExcecao() {
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		sistema.getInfoUsuario("Matheus1", "94189425", "email");
		
	}

	/**Esperado que de excecaoo quando adicionar 2 usuarios iguais.
	 * Logo, ao adicionar e depois retirar e preciso cadastrar mais 2 vezes
	 * @param nome e @param telefone para descobrir qual � o usuario
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testRemoverUsuario() {
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		sistema.removerUsuario("Matheus", "94189425");
		
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastraUsuario("Matheus", "94189425", "matheusYasuo@hotmail.com");

	
	}

	/**
	 * @param nome e @param telefone para descobrir qual e o usuario
	 * @param atributo define qual serao a informacao atualizada
	 * @param valor define o valor da nova atualizacao
	 */
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

	/**
	 * @param nome e @param telefone para descobrir qual eo usuario
	 * @param nomeItem para saber de qual item retirar a informacao
	 * @param atributo define qual o atributo retornado (nome ou valor)
	 */
	@Test
	public void testGetInfoItem() {	
		sistema.cadastraUsuario("Matheus1", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus1", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");
		assertEquals("Pior Cenario", sistema.getInfoItem("Matheus1", "94189425", "Pior Cenario", "nome"));
		
		sistema.cadastraUsuario("Matheus2", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus2", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");
		assertEquals("50.0", sistema.getInfoItem("Matheus2", "94189425", "Pior Cenario", "preco"));
	}

	/**
	 * @param nome e @param telefone para descobrir qual � o usuario
	 * @param nomeItem para saber de qual item retirar a informa��o
	 * @param atributo define qual o atributo ser� modificado (nome ou valor)
	 * @param valor ser� o valor que vai est� onde o atributo
	 * indicar ap�s a atualiza��o
	 * 
	 * Retorna sempre uma String
	 */
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
	
	/**
	 * Lista a representa��o de todos os Itens cadastrados ordenado pelo nome
	 */
	@Test
	public void testListarItensOrdenadosPorNome() {
		sistema.cadastraUsuario("Matheus1", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus1", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");
		sistema.cadastrarBluRaySerie("Matheus1", "94189425","VIKINGS", 60.00 ,"As aventuras de ragnaldo e seus amigos", 50, "QUATORZE_ANOS", "ACAO", 4 );;
		sistema.cadastrarEletronico("Matheus1", "94189425", "Lolzin", 23, "PC");
		assertEquals("JOGO ELETRONICO: Lolzin, R$ 23.0, Nao emprestado, PC|SHOW: Pior Cenario, R$ 50.0, Nao emprestado, 50 min, DEZOITO_ANOS, Matanza, 15 faixas|SERIE: VIKINGS, R$ 60.0, Nao emprestado, 50 min, QUATORZE_ANOS, ACAO, Temporada 4|",sistema.listarItensOrdenadosPorNome());
	}
	
	/**
	 * Lista a representa��o de todos os Itens cadastrados ordenado pelo valor
	 */
	@Test
	public void testListarItensOrdenadosPorValor() {
		sistema.cadastraUsuario("Matheus1", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus1", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");
		sistema.cadastrarBluRaySerie("Matheus1", "94189425","VIKINGS", 60.00 ,"As aventuras de ragnaldo e seus amigos", 50, "QUATORZE_ANOS", "ACAO", 4 );;
		sistema.cadastrarEletronico("Matheus1", "94189425", "Lolzin", 23, "PC");
		assertEquals("JOGO ELETRONICO: Lolzin, R$ 23.0, Nao emprestado, PC|SHOW: Pior Cenario, R$ 50.0, Nao emprestado, 50 min, DEZOITO_ANOS, Matanza, 15 faixas|SERIE: VIKINGS, R$ 60.0, Nao emprestado, 50 min, QUATORZE_ANOS, ACAO, Temporada 4|", sistema.listarItensOrdenadosPorValor());
	}
	
	/**
	 * @param nome e @param telefone para descobrir qual � o usuario
	 * @param nomeItem para saber se o usuario tem o Item e retornar sua representa��o
	 */	
	@Test
	public void testPesquisarDetalhesItem() {
		sistema.cadastraUsuario("Matheus1", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus1", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");
		sistema.cadastrarBluRaySerie("Matheus1", "94189425","VIKINGS", 60.00 ,"As aventuras de ragnaldo e seus amigos", 50, "QUATORZE_ANOS", "ACAO", 4 );;
		
		assertEquals("SHOW: Pior Cenario, R$ 50.0, Nao emprestado, 50 min, DEZOITO_ANOS, Matanza, 15 faixas", sistema.pesquisarDetalhesItem("Matheus1", "94189425", "Pior Cenario"));
		
		assertEquals("SERIE: VIKINGS, R$ 60.0, Nao emprestado, 50 min, QUATORZE_ANOS, ACAO, Temporada 4", sistema.pesquisarDetalhesItem("Matheus1", "94189425", "VIKINGS") );
	}

	/**
	 * Ao registrar 2 vezes a exce��o � causada
	 */
	@Test (expected  = IllegalArgumentException.class)
	public void testRegistrarEmprestimo() {
		sistema.cadastraUsuario("Matheus1", "94189425", "matheusYasuo@hotmail.com");
		sistema.cadastrarBluRayShow("Matheus1", "94189425", "Pior Cenario", 50.00, 50, 15, "Matanza", "DEZOITO_ANOS");

		sistema.cadastraUsuario("Matheus2", "95189425", "matheus@hotmail.com");
		
		sistema.registrarEmprestimo("Matheus1", "94189425", "Matheus2", "95189425", "Pior Cenario", "09/08/2017",7);
		sistema.registrarEmprestimo("Matheus1", "94189425", "Matheus2", "95189425", "Pior Cenario", "09/08/2017",7);
	}


}
