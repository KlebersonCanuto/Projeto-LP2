package Projeto;

import java.util.HashSet;


public class Sistema {

	private UsuarioController usuarioController;
	private HashSet<Item> itens;
	public Sistema(){
		
		usuarioController = new UsuarioController();
		itens = new HashSet<>();
	}

	public void cadastraUsuario(String nome, String telefone, String email) {
		
		usuarioController.adicionaUsuario(nome, telefone, email);
	}


	public String getInfoUsuario(String nome, String telefone, String atributo) {
		
		return usuarioController.getInfo(nome, telefone, atributo);
	}

	public void removerUsuario(String nome, String telefone) {

		usuarioController.removerUsuario(nome, telefone);
	}

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {
		
		usuarioController.atualizarUsuario(nome, telefone, atributo, valor);
	}

	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco) {

		Item eletronico = new JogosEletronicos(nomeItem, preco);
		itens.add(eletronico);
		usuarioController.adicionaItem(nome, telefone, eletronico);
	}

	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco) {
		
		Item tabuleiro = new JogosTabuleiro(nomeItem, preco);	
		itens.add(tabuleiro);
		usuarioController.adicionaItem(nome, telefone, tabuleiro);
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
