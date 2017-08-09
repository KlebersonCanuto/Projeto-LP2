package Lucas;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class UsuarioController{

	private Set<Usuario> usuarios;
	private List<Emprestimo> emprestimos;
	
	public UsuarioController(){
		
	// construtor da classe
		
		usuarios = new HashSet<>();
		emprestimos = new ArrayList<>();
	}
	
	//	 cria o objeto usuario e adiciona usuario ao Hashset 

	public void cadastraUsuario(String nome, String telefone, String email){
		
		Usuario usuario = new Usuario(nome, telefone, email);
		usuarios.add(usuario);
	}
	


	public String getInfoUsuario(String nome, String telefone, String atributo){
		
		if (atributo.toLowerCase().equals("email"))
			if (usuarioExiste(nome, telefone))
				return getUsuario(nome, telefone).getEmail();
			else{
				return null;
			}
		return null;
	}
	
	// remove usuario

	public void removerUsuario(String nome, String telefone){

		if (usuarioExiste(nome, telefone))
			usuarios.remove(getUsuario(nome, telefone));
	}
	
	// atualiza o usario 

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor){
		
		Usuario usuario = getUsuario(nome, telefone);
		if(atributo.toLowerCase().equals("email"))
			usuario.setEmail(valor);
		else if(atributo.toLowerCase().equals("nome"))
			usuario.setNome(valor);
		else if(atributo.toLowerCase().equals("telefone"))
			usuario.setCelular(valor);
	}
	
	// cadastra item eletronico 

	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco, String plataforma){

		Usuario usuario = getUsuario(nome, telefone);

		Item eletronico = new JogosEletronicos(nomeItem, preco, plataforma);
		usuario.adicionaItem(eletronico);
	}
	
	// cadastra jogo de tabuleiro 

	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco){
		
		Usuario usuario = getUsuario(nome, telefone);
		Item tabuleiro = new JogosTabuleiro(nomeItem, preco);	
		usuario.adicionaItem(tabuleiro);
	}
	
	// adiciona peças perdidas

	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca){

		Usuario usuario = getUsuario(nome, telefone);
		JogosTabuleiro item = (JogosTabuleiro) usuario.getItem(nomeItem);
		item.adicionaPecaPerdida(nomePeca);
	}
	
	// cadastra filme bluray
	
	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao, String genero, String classificacao, int anoLancamento){

		Usuario usuario = getUsuario(nome, telefone);
		Item filme = new BlurayFilme(nomeItem, preco, duracao, genero, classificacao, anoLancamento);
		usuario.adicionaItem(filme);
	}
	
	// cadastra show 

	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao, int numeroFaixas, String artista, String classificacao){

		Usuario usuario = getUsuario(nome, telefone);
		Item show = new BlurayShow(nomeItem, preco, duracao, numeroFaixas, artista, classificacao);
		usuario.adicionaItem(show);
	}
	
	// cadastra serie

	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao, int duracao, String classificacao, String genero, int temporada){

		Usuario usuario = getUsuario(nome, telefone);
		Item serie = new BluraySerie(nomeItem, preco, descricao, duracao, classificacao, genero, temporada);
		usuario.adicionaItem(serie);
	}
	
	// adiciona bluray 	

	public void adicionarBluRay(String nome, String telefone, String nomeBlurayTemporada, int duracao){

		Usuario usuario = getUsuario(nome, telefone);
		BluraySerie serie = (BluraySerie) usuario.getItem(nomeBlurayTemporada);
		serie.adicionaBluRay(duracao);
	}

	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo){

		Usuario usuario = getUsuario(nome, telefone);
		Item item = usuario.getItem(nomeItem);
		if (atributo.toLowerCase().equals("nome"))
			return item.getNome();
		else if (atributo.toLowerCase().equals("valor"))
			return String.valueOf(item.getValor()); 
		return null;
	}
	
	// remove Item 
	
	public void removerItem(String nome, String telefone, String nomeItem){

		Usuario usuario = getUsuario(nome, telefone);
		usuario.removeItem(nomeItem);
	}
	
	// atualiza item

	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor){

		Usuario usuario = getUsuario(nome, telefone);
		usuario.atualizaItem(nomeItem, atributo, valor);
	}
	
	// lista ordenados por nome 

	public String listarItensOrdenadosPorNome(){
		
		String todosItens = "";
		List<Item> itens = listaItens();
		Collections.sort(itens, new ComparadorNome());
		for (Item item : itens){
			
			todosItens+=item.toString() + System.lineSeparator();
		}
		return todosItens;
	}
	
	// lista ordenados por valor

	public String listarItensOrdenadosPorValor(){

		String todosItens = "";
		List<Item> itens = listaItens();
		Collections.sort(itens, new ComparadorValor());
		for (Item item : itens){
			
			todosItens+=item.toString() + System.lineSeparator();
		}
		return todosItens;
	}
		
	public String pesquisarDetalhesItem(String nome, String telefone, String nomeItem){
		
		Usuario usuario = getUsuario(nome, telefone);
		Item item = usuario.getItem(nomeItem);
		return item.toString();
	}
	
	// registra o Emprestimo

	public void registrarEmprestimo(String nomeDono, String telefoneDono, String nomeRequerente,String telefoneRequerente, String nomeItem, String dataEmprestimo, int periodo){

		Usuario dono = getUsuario(nomeDono, telefoneDono);
		Usuario requerente = getUsuario(nomeRequerente, telefoneRequerente);
		Item item = dono.getItem(nomeItem);
		Emprestimo emprestimo = new Emprestimo(dono, requerente, item, dataEmprestimo, periodo);
		dono.adicionaEmprestimo(emprestimo);
		requerente.adicionaEmprestimo(emprestimo);
		emprestimos.add(emprestimo);

	}
	
	// devolve o item 

	public void devolverItem(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente, String nomeItem, String dataEmprestimo, String dataDevolucao){		
	
		Usuario dono = getUsuario(nomeDono, telefoneDono);
		Usuario requerente = getUsuario(nomeRequerente, telefoneRequerente);
		Item item = requerente.getItem(nomeItem);
		Emprestimo emprestimo = null;
		for (Emprestimo cadaEmprestimo : emprestimos){
			
			if (cadaEmprestimo.getItem().equals(item))
				if (cadaEmprestimo.getDono().equals(dono))
					if (cadaEmprestimo.getRequerente().equals(requerente))
						if (cadaEmprestimo.getDataEmprestimo().equals(dataEmprestimo))
								emprestimo = cadaEmprestimo;
				
		}
		emprestimo.encerra(dataDevolucao);
	}
	
	private List<Item> listaItens(){
		
		List<Item> itens = new ArrayList<Item>();
		for (Usuario usuario : usuarios){
			
			usuario.listaItens(itens);
		}
		return itens;
	}
	
	// detecta se usuario existe
	
	private boolean usuarioExiste(String nome, String telefone){
		
		for (Usuario usuario : usuarios){
			if(usuario.getNome().equals(nome))
				if(usuario.getCelular().equals(telefone))
					return true;
		}
		return false;
	}
	
	// retorna o usuario da lista

	private Usuario getUsuario(String nome, String telefone){

		for (Usuario usuario : usuarios){
			if(usuario.getNome().equals(nome))
				if(usuario.getCelular().equals(telefone))
					return usuario;
		}
		return null;
	}
}
