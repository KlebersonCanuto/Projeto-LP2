package Projeto;

import easyaccept.EasyAccept;

public class Facade {

	Sistema sistema;

	/**
	 * Da inicio ao sistema
	 */
	public Facade() {

		sistema = new Sistema();
	}

	/**
	 * Inicia o sistema
	 */
	public void iniciarSistema() {
		
		sistema.iniciarSistema();
	}

	/**
	 * Fecha o sistema
	 */
	public void fecharSistema() {
		
		sistema.fecharSistema();
	}

	/**
	 * Cadastra um usuario passando como parametro o nome, telefone e email
	 * 
	 * @param nome
	 * @param telefone
	 * @param email
	 */
	public void cadastrarUsuario(String nome, String telefone, String email) {
		
		sistema.cadastraUsuario(nome, telefone, email);
	}

	/**
	 * 
	 * @param nome
	 * @param telefone
	 * @param atributo
	 * @return um atributo do usuario de acordo com o atributo passado como
	 *         parametro
	 */
	public String getInfoUsuario(String nome, String telefone, String atributo) {
		
		return sistema.getInfoUsuario(nome, telefone, atributo);
	}

	/**
	 * Remove um usuario, tendo como parametros seu nome e telefone
	 * 
	 * @param nome
	 * @param telefone
	 */
	public void removerUsuario(String nome, String telefone) {
		
		sistema.removerUsuario(nome, telefone);
	}

	/**
	 * Atualiza um atributo do usuario de acordo com o atributo passado como
	 * parametro e o valor para modificar
	 * 
	 * Nome, telefone, atributo e valor são passados com parametro
	 * 
	 * @param nome
	 * @param telefone
	 * @param atributo
	 * @param valor
	 */
	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {
		
		sistema.atualizarUsuario(nome, telefone, atributo, valor);
	}

	/**
	 * Cadastra um Jogo Eletronico passando o nome, telefone, nome do item,
	 * preco e plataforma como parametro
	 * 
	 * @param nome
	 * @param telefone
	 * @param nomeItem
	 * @param preco
	 * @param plataforma
	 */
	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco, String plataforma) {
		
		sistema.cadastrarEletronico(nome, telefone, nomeItem, preco, plataforma);
	}

	/**
	 * Cadastra um Jogo de Tabuleiro passando o nome, telefone, nome do item e
	 * preco
	 * 
	 * @param nome
	 * @param telefone
	 * @param nomeItem
	 * @param preco
	 */
	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco) {
		
		sistema.cadastrarJogoTabuleiro(nome, telefone, nomeItem, preco);
	}

	/**
	 * Adiciona uma peca perdida a um Bluray Serei
	 * 
	 * São passados como parametro nome, telefone, nome do item e nome da peca
	 * 
	 * @param nome
	 * @param telefone
	 * @param nomeItem
	 * @param nomePeca
	 */
	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca) {
		
		sistema.adicionarPecaPerdida(nome, telefone, nomeItem, nomePeca);
	}

	/**
	 * Cadastra um Bluray Filme passando o nome, telefone, nome do item, preco,
	 * duracao, genero, classificacao e ano de lancamento
	 * 
	 * @param nome
	 * @param telefone
	 * @param nomeItem
	 * @param preco
	 * @param duracao
	 * @param genero
	 * @param classificacao
	 * @param anoLancamento
	 */
	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao, String genero, String classificacao, int anoLancamento) {
		
		sistema.cadastrarBluRayFilme(nome, telefone, nomeItem, preco, duracao, genero, classificacao, anoLancamento);
	}

	/**
	 * Cadastra um Bluray Show passando o nome, telefone, nome do item, preco,
	 * duracao, numero de faixas, artista e classificacao
	 * 
	 * @param nome
	 * @param telefone
	 * @param nomeItem
	 * @param preco
	 * @param duracao
	 * @param numeroFaixas
	 * @param artista
	 * @param classificacao
	 */
	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao, int numeroFaixas, String artista, String classificacao) {
		
		sistema.cadastrarBluRayShow(nome, telefone, nomeItem, preco, duracao, numeroFaixas, artista, classificacao);
	}

	/**
	 * Cadastra um Bluray Serie passando o nome, telefone, nome do item, preco,
	 * descricao, duracao, classificacao, genero e temporada
	 * 
	 * @param nome
	 * @param telefone
	 * @param nomeItem
	 * @param preco
	 * @param descricao
	 * @param duracao
	 * @param classificacao
	 * @param genero
	 * @param temporada
	 */
	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao, int duracao, String classificacao, String genero, int temporada) {
		
		sistema.cadastrarBluRaySerie(nome, telefone, nomeItem, preco, descricao, duracao, classificacao, genero, temporada);
	}

	/**
	 * adiciona um bluray a lista de episodio de bluray serie passando como
	 * parametro nome, telefone, nome do bluray temporada e duracao
	 * 
	 * @param nome
	 * @param telefone
	 * @param nomeBlurayTemporada
	 * @param duracao
	 */
	public void adicionarBluRay(String nome, String telefone, String nomeBlurayTemporada, int duracao) {
		
		sistema.adicionarBluRay(nome, telefone, nomeBlurayTemporada, duracao);
	}

	/**
	 * 
	 * 
	 * @param nome
	 * @param telefone
	 * @param nomeItem
	 * @param atributo
	 * @return um atributo do item de acordo com o atributo passado como
	 *         parametro
	 */
	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo) {
		
		return sistema.getInfoItem(nome, telefone, nomeItem, atributo);
	}

	/**
	 * Remove um item de um usuario(nome, telefone)
	 * 
	 * @param nome
	 * @param telefone
	 * @param nomeItem
	 */
	public void removerItem(String nome, String telefone, String nomeItem) {
		
		sistema.removerItem(nome, telefone, nomeItem);
	}

	/**
	 * Atualiza um atributo do item de acordo com o atributo passado como
	 * parametro e o valor para modificar
	 * 
	 * Nome, telefone, nome do item, atributo e valor são passados com parametro
	 * 
	 * @param nome
	 * @param telefone
	 * @param nomeItem
	 * @param atributo
	 * @param valor
	 */
	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor) {
		
		sistema.atualizarItem(nome, telefone, nomeItem, atributo, valor);
	}

	/**
	 * Representacao em forma de string de uma lista que está ordenada
	 * alfabeticamente
	 * 
	 * @return representacao de uma lista ordenada por nome
	 */
	public String listarItensOrdenadosPorNome() {
		
		return sistema.listarItensOrdenadosPorNome();
	}

	/**
	 * Representacao em forma de string de uma lista que está ordenada pelo
	 * valor
	 * 
	 * @return representacao de uma lista ordenada por valor
	 */
	public String listarItensOrdenadosPorValor() {

		return sistema.listarItensOrdenadosPorValor();
	}

	/**
	 * 
	 * @param nome
	 * @param telefone
	 * @param nomeItem
	 * @return a representacao de um item, passados usuario(nome e telefone) e
	 *         nome do item como parametro
	 */
	public String pesquisarDetalhesItem(String nome, String telefone, String nomeItem) {
		
		return sistema.pesquisarDetalhesItem(nome, telefone, nomeItem);
	}

	/**
	 * Registra um emprestimo apartir de um usuario(Dono) para um
	 * usuario(Requerente, passando um item, data de emprestimo e o periodo como
	 * parametros
	 * 
	 * @param nomeDono
	 * @param telefoneDono
	 * @param nomeRequerente
	 * @param telefoneRequerente
	 * @param nomeItem
	 * @param dataEmprestimo
	 * @param periodo
	 */
	public void registrarEmprestimo(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente, String nomeItem, String dataEmprestimo, int periodo) {
		
		sistema.registrarEmprestimo(nomeDono, telefoneDono, nomeRequerente, telefoneRequerente, nomeItem, dataEmprestimo, periodo);
	}

	/**
	 * Devolve um item emprestado apartir de um usuario(Dono) para um
	 * usuario(Requerente, passando um item, data de emprestimo e o periodo como
	 * parametros
	 * 
	 * @param nomeDono
	 * @param telefoneDono
	 * @param nomeRequerente
	 * @param telefoneRequerente
	 * @param nomeItem
	 * @param dataEmprestimo
	 * @param dataDevolucao
	 */
	public void devolverItem(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente, String nomeItem, String dataEmprestimo, String dataDevolucao) {
		
		sistema.devolverItem(nomeDono, telefoneDono, nomeRequerente, telefoneRequerente, nomeItem, dataEmprestimo,
				dataDevolucao);
	}

	/**
	 * Representacao em forma de string de uma lista de usuarios com itens
	 * emprestados
	 * 
	 * @param nome
	 * @param telefone
	 * @return representacao de usuarios com itens emprestados
	 */
	public String listarEmprestimosUsuarioEmprestando(String nome, String telefone) {
		
		return sistema.listarEmprestimoUsuarioEmprestando(nome, telefone);
	}

	/**
	 * Representacao em forma de string de uma lista de usuarios com itens que
	 * pegou emprestado
	 * 
	 * @param nome
	 * @param telefone
	 * @return representacao de usuarios com itens que pegou emprestados
	 */
	public String listarEmprestimosUsuarioPegandoEmprestado(String nome, String telefone) {
		
		return sistema.listarEmprestimoUsuarioPegandoEmprestado(nome, telefone);
	}

	/**
	 * 
	 * @param nomeItem
	 * @return lista os emprestimos em que tal item está participando
	 */
	public String listarEmprestimosItem(String nomeItem) {

		return sistema.listarEmprestimosItem(nomeItem);
	}

	/**
	 * 
	 * @return lista todos os itens não emprestados
	 */
	public String listarItensNaoEmprestados() {

		return sistema.listarItensNaoEmprestados();
	}

	/**
	 * 
	 * @return lista todos os itens emprestados
	 */
	public String listarItensEmprestados() {

		return sistema.listarItensEmprestados();
	}

	/**
	 * 
	 * @return lista os 10 itens mais emprestados
	 */
	public String listarTop10Itens() {

		return sistema.listarTop10Itens();
	}

	/**
	 * 
	 * @param nomeItem
	 * @return Lista o historico de emprestimo de um item
	 */
	public String listarHistoricoEmprestimoItem(String nomeItem) {

		return sistema.listarHistoricoEmprestimoItem(nomeItem);
	}

	/**
	 * 
	 * @return um representacao em lista dos caloteiros, usuarios com reputacao
	 *         negativa
	 */
	public String listarCaloteiros() {

		return sistema.listarCaloteiros();
	}

	/**
	 * 
	 * @return lista os 10 usuarios com as maiores reputacao
	 */
	public String listarTop10MelhoresUsuarios() {

		return sistema.listarTop10MelhoresUsuarios();
	}

	/**
	 * 
	 * @return representacao em lista dos 10 usuario com as piores reputacao
	 */
	public String listarTop10PioresUsuarios() {

		return sistema.listarTop10PioresUsuarios();
	}

	public static void main(String[] args) {
		
		args = new String[] { "Projeto.Facade", "Tests/us1.txt", "Tests/us2.txt", "Tests/us3.txt", "Tests/us4.txt",	"Tests/us5.txt", "Tests/us6.txt", "Tests/us7.txt", "Tests/us8.txt" };
//		args = new String[] {"Projeto.Facade", "Tests/us1.txt"};
		EasyAccept.main(args);
	}
}