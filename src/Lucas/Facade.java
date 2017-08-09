package Lucas;

public class Facade {

	UsuarioController controlador;

	// construtor da Facade

	public Facade() {

		controlador = new UsuarioController();
	}

	// inicializar o sistema
	public void iniciarSistema() {

	}

	// chama o m�todo cadastra usuario

	public void cadastraUsuario(String nome, String telefone, String email) {

		controlador.cadastraUsuario(nome, telefone, email);
	}

	public String getInfoUsuario(String nome, String telefone, String atributo) {

		return controlador.getInfoUsuario(nome, telefone, atributo);
	}

	// chama o m�todo remove usu�rio
	public void removerUsuario(String nome, String telefone) {

		controlador.removerUsuario(nome, telefone);
	}

	// chama o m�todo atualizar o usu�rio

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {

		controlador.atualizarUsuario(nome, telefone, atributo, valor);
	}

	// chama o m�todo cadastrar Eletronico

	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco, String plataforma) {

		controlador.cadastrarEletronico(nome, telefone, nomeItem, preco, plataforma);
	}

	// chama o m�todo cadastrar Jogo de Tabuleiro

	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco) {

		controlador.cadastrarJogoTabuleiro(nome, telefone, nomeItem, preco);

	}

	// chama o m�todo adiciona pe�as perdidas

	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca) {

		controlador.adicionarPecaPerdida(nome, telefone, nomeItem, nomePeca);
	}

	// chama o m�todo cadastrar o Filme

	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao,
			String genero, String classificacao, int anoLancamento) {

		controlador.cadastrarBluRayFilme(nome, telefone, nomeItem, preco, duracao, genero, classificacao,
				anoLancamento);
	}

	// chama o m�todo cadastar Show

	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao,
			int numeroFaixas, String artista, String classificacao) {

		controlador.cadastrarBluRayShow(nome, telefone, nomeItem, preco, duracao, numeroFaixas, artista, classificacao);
	}

	// chama o m�todo cadastrar S�rie
	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao,
			int duracao, String classificacao, String genero, int temporada) {

		controlador.cadastrarBluRaySerie(nome, telefone, nomeItem, preco, descricao, duracao, classificacao, genero,
				temporada);
	}

	// adiciona o Bluray

	public void adicionarBluRay(String nome, String telefone, String nomeBlurayTemporada, int duracao) {

		controlador.adicionarBluRay(nome, telefone, nomeBlurayTemporada, duracao);
	}
	
	// cadastra informa��es do Item

	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo) {

		return controlador.getInfoItem(nome, telefone, nomeItem, atributo);
	}
	
	// remove o Item 

	public void removerItem(String nome, String telefone, String nomeItem) {

		controlador.removerItem(nome, telefone, nomeItem);
	}
	
	// chama o metodo para atualizar os Itens 

	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor) {

		controlador.atualizarItem(nome, telefone, nomeItem, atributo, valor);
	}
	
	// chama o m�todo para listar os Itens por nome

	public String listarItensOrdenadosPorNome() {

		return controlador.listarItensOrdenadosPorNome();
	}
	
	// chama o m�todo para listar os Itens por valor

	public String listarItensOrdenadosPorValor() {

		return controlador.listarItensOrdenadosPorValor();
	}
	
	// chama o m�todo para pesquisar os Detalhes item

	public String pesquisarDetalhesItem(String nome, String telefone, String nomeItem) {

		return controlador.pesquisarDetalhesItem(nome, telefone, nomeItem);
	}
	
	// chama o m�todo registrar Emprestimo

	public void registrarEmprestimo(String nomeDono, String telefoneDono, String nomeRequerente,
			String telefoneRequerente, String nomeItem, String dataEmprestimo, int periodo) {

		controlador.registrarEmprestimo(nomeDono, telefoneDono, nomeRequerente, telefoneRequerente, nomeItem,
				dataEmprestimo, periodo);
	}
	
	// chama o m�todo devolver item

	public void devolverItem(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente,
			String nomeItem, String dataEmprestimo, String dataDevolucao) {

		controlador.devolverItem(nomeDono, telefoneDono, nomeRequerente, telefoneRequerente, nomeItem, dataEmprestimo,
				dataDevolucao);
	}
	
	// finaliza o sistema

	public void fecharSistema() {

	}
}
