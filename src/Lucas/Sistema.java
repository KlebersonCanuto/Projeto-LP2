package Lucas;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class Sistema {

	private Set<Usuario> usuarios;
	private List<Emprestimo> emprestimos;
	
	public Sistema(){
		
		usuarios = new HashSet<>();
		emprestimos = new ArrayList<>();
	}

	public void cadastraUsuario(String nome, String telefone, String email) {
		// Cadastra um usuario
		if (usuarioExiste(nome, telefone))
			throw new IllegalArgumentException("Usuario ja cadastrado");
		else if (nome.equals("") || email.equals("") || telefone.equals(""))
			throw new IllegalArgumentException("Atributo vazio");
		else{
			Usuario usuario = new Usuario(nome, telefone, email);
			usuarios.add(usuario);
		}
	}

	public String getInfoUsuario(String nome, String telefone, String atributo) {
		// Retorna uma informacao do usuario
		if (usuarioExiste(nome, telefone)){
			if (atributo.toLowerCase().equals("email"))
				return getUsuario(nome, telefone).getEmail();
			else if (atributo.toLowerCase().equals("nome"))
				return getUsuario(nome, telefone).getNome();
			else if (atributo.toLowerCase().equals("telefone"))
				return getUsuario(nome, telefone).getCelular();
			else
				return null;
		}
		else
			throw new IllegalArgumentException("Usuario invalido");
	}

	public void removerUsuario(String nome, String telefone) {
		// Remove um usuario
		usuarios.remove(getUsuario(nome, telefone));
	}

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {
		// Atualiza um atributo do usuario
		Usuario usuario = getUsuario(nome, telefone);
		if(atributo.toLowerCase().equals("email"))
			usuario.setEmail(valor);
		else if(atributo.toLowerCase().equals("nome"))
			usuario.setNome(valor);
		else if(atributo.toLowerCase().equals("telefone"))
			usuario.setCelular(valor);
	}

	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco, String plataforma) {
		// Cadastra um jogo eletronico de um usuario
		Usuario usuario = getUsuario(nome, telefone);
		Item eletronico = new JogosEletronicos(nomeItem, preco, plataforma);
		usuario.adicionaItem(eletronico);
	}

	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco) {
		// Cadastra um jogo de tabuleiro de um usuario
		Usuario usuario = getUsuario(nome, telefone);
		Item tabuleiro = new JogoTabuleiro(nomeItem, preco);	
		usuario.adicionaItem(tabuleiro);
	}

	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca) {
		// Adiciona uma peca perdida a um jogo de tabuleiro
		Usuario usuario = getUsuario(nome, telefone);
		JogoTabuleiro item = (JogoTabuleiro) usuario.getItem(nomeItem);
		item.adicionaPecaPerdida(nomePeca);
	}
	
	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao, String genero, String classificacao, int anoLancamento) {
		// Cadastra um BluRay de filme de um usuario
		Usuario usuario = getUsuario(nome, telefone);
		Item filme = new BlurayFilme(nomeItem, preco, duracao, genero, classificacao, anoLancamento);
		usuario.adicionaItem(filme);
	}

	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao, int numeroFaixas, String artista, String classificacao) {
		// Cadastra um BluRay de show de um usuario
		Usuario usuario = getUsuario(nome, telefone);
		Item show = new BlurayShow(nomeItem, preco, duracao, numeroFaixas, artista, classificacao);
		usuario.adicionaItem(show);
	}

	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao, int duracao, String classificacao, String genero, int temporada) {
		// Cadastra um BluRay de serie de um usuario
		Usuario usuario = getUsuario(nome, telefone);
		Item serie = new BluraySerie(nomeItem, preco, descricao, duracao, classificacao, genero, temporada);
		usuario.adicionaItem(serie);
	}

	public void adicionarBluRay(String nome, String telefone, String nomeBlurayTemporada, int duracao) {
		// Adiciona um episodio a uma serie
		Usuario usuario = getUsuario(nome, telefone);
		BluraySerie serie = (BluraySerie) usuario.getItem(nomeBlurayTemporada);
		serie.adicionaBluRay(duracao);
	}

	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo) {
		// Retorna uma informacao de um item
		Usuario usuario = getUsuario(nome, telefone);
		Item item = usuario.getItem(nomeItem);
		if (atributo.toLowerCase().equals("nome"))
			return item.getNome();
		else if (atributo.toLowerCase().equals("preco"))
			return String.valueOf(item.getValor()); 
		return null;
	}

	public void removerItem(String nome, String telefone, String nomeItem){
		// Remove um item
		Usuario usuario = getUsuario(nome, telefone);
		usuario.removeItem(nomeItem);
	}

	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor) {
		// Atualiza um item
		Usuario usuario = getUsuario(nome, telefone);
		Item item = usuario.getItem(nomeItem);
		
		if (atributo.toLowerCase().equals("nome"))
			item.setNome(valor);
		else if (atributo.toLowerCase().equals("preco"))
			item.setValor(Double.valueOf(valor));
	}

	public String listarItensOrdenadosPorNome() {
		// Lista todos os itens por ordem alfabetica
		String todosItens = "";
		List<Item> itens = listaItens();
		Collections.sort(itens, new ComparadorNome());
		for (Item item : itens){
			
			todosItens+=item.toString() + "|";
		}
		return todosItens;
	}

	public String listarItensOrdenadosPorValor() {
		// Lista todos os itens por ordem de preco
		String todosItens = "";
		List<Item> itens = listaItens();
		Collections.sort(itens, new ComparadorValor());
		for (Item item : itens){
			
			todosItens+=item.toString() + "|";
		}
		return todosItens;
	}
		
	public String pesquisarDetalhesItem(String nome, String telefone, String nomeItem) {
		// Retorna detalhes de um item
		Usuario usuario = getUsuario(nome, telefone);
		Item item = usuario.getItem(nomeItem);
		return item.toString();
	}

	public void registrarEmprestimo(String nomeDono, String telefoneDono, String nomeRequerente,String telefoneRequerente, String nomeItem, String dataEmprestimo, int periodo) {
		// Cria um novo emprestimo
		Usuario dono = getUsuario(nomeDono, telefoneDono);
		Usuario requerente = getUsuario(nomeRequerente, telefoneRequerente);
		Item item = dono.getItem(nomeItem);
		if (!item.emprestado()){
			Emprestimo emprestimo = new Emprestimo(dono, requerente, item, dataEmprestimo, periodo);
			dono.adicionaEmprestimo(emprestimo);
			requerente.adicionaEmprestimo(emprestimo);
			emprestimos.add(emprestimo);
		}
		else
			throw new IllegalArgumentException("Item emprestado no momento");
	}

	public void devolverItem(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente, String nomeItem, String dataEmprestimo, String dataDevolucao) {		
		// Encerra um emprestimo
		Emprestimo emprestimo = null;
		boolean teveEmprestimo = false;
		
		Usuario dono = getUsuario(nomeDono, telefoneDono);
		Usuario requerente = getUsuario(nomeRequerente, telefoneRequerente);
		Item item = dono.getItem(nomeItem);
		
		for (Emprestimo emp : emprestimos){
		
			if (emp.getItem().equals(item) && emp.getDono().equals(dono) && emp.getRequerente().equals(requerente) && emp.getDataEmprestimo().equals(dataEmprestimo)){
				emprestimo = emp;
				teveEmprestimo = true;
			}
		}
		
		if (teveEmprestimo)
			emprestimo.encerra(dataDevolucao);
		else
			throw new NullPointerException("Emprestimo nao encontrado");
	}
	
	private List<Item> listaItens() {
		// Lista todos os itens (sem ordem definida)
		List<Item> itens = new ArrayList<Item>();
		for (Usuario usuario : usuarios){
			usuario.listaItens(itens);
		}
		return itens;
	}
	
	private boolean usuarioExiste(String nome, String telefone) {
		// Verifica se o usuario existe
		for (Usuario usuario : usuarios){
			if(usuario.getNome().equals(nome))
				if(usuario.getCelular().equals(telefone))
					return true;
		}
		return false;
	}

	private Usuario getUsuario(String nome, String telefone) {
		// Retorna um usuario
		for (Usuario usuario : usuarios){
			if(usuario.getNome().equals(nome))
				if(usuario.getCelular().equals(telefone))
					return usuario;
		}
		throw new NullPointerException("Usuario invalido");
	}
}
