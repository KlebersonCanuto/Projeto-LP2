package Projeto;

import java.util.HashSet;
import java.util.Set;

public class Sistema {

	private Set<Usuario> usuarios;
	
	public Sistema(){
		
		usuarios = new HashSet<Usuario>();
	}

	public void cadastraUsuario(String nome, String telefone, String email) {
		
	}


	public String getInfoUsuario(String nome, String telefone, String atributo) {

		return null;
	}

	public void removerUsuario(String nome, String telefone) {

		
	}

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {

		
	}

	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco) {

		
	}

	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco) {

		
	}

	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca) {

		
	}
	
	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao, String genero, String classificacao, int anoLancamento) {

		
	}

	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao, int numeroFaixas, String artista, String classificacao) {

		
	}

	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao, int duracao, String classificacao, String genero, int temporada) {

		
	}

	public void adicionarBluRay(String nome, String telefone, String nomeBlurayTemporada, int duracao) {

		
	}

	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo) {

		return null;
	}

	public void removerItem(String nome, String telefone, String nomeBlurayTemporada, int duracao) {

		
	}

	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor) {

		
	}

	public String listarItensOrdenadosPorNome() {

		return null;
	}

	public String listarItensOrdenadosPorValor() {

		return null;
	}

	public String pesquisarDetalhesItem() {

		return null;
	}

	public void registrarEmprestimo(String nomeDono, String telefoneDono, String nomeRequerente,String telefoneRequerente, String nomeItem, String dataEmprestimo, int periodo) {

		
	}

	public void devolverItem(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente, String nomeItem, String dataEmprestimo, String dataDevolucao) {		
	}
}
