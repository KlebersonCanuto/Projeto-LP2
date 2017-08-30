package Kleberson;

import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
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

	public void iniciarSistema() {
		try{
			
			InputStream fisUsuarios = new FileInputStream("usuarios.txt");
			ObjectInputStream oisUsuarios = new ObjectInputStream(fisUsuarios);
			InputStream fisEmprestimos = new FileInputStream("emprestimos.txt");
			ObjectInputStream oisEmprestimos = new ObjectInputStream(fisEmprestimos);

			int numeroUsuarios = oisUsuarios.readInt();
			int numeroEmprestimos = oisEmprestimos.readInt();
			
			for (int i = 0; i < numeroUsuarios; i++) {
				usuarios.add( (Usuario) oisUsuarios.readObject());
			}
			for (int i = 0; i < numeroEmprestimos; i++){
				emprestimos.add((Emprestimo) oisEmprestimos.readObject());
			}
		
			oisEmprestimos.close();
			oisUsuarios.close();

		} catch(IOException e){
			System.out.println("Arquivo não encontrado");		
		} catch (ClassNotFoundException e){
			System.out.println("Ocorreu um erro");
		}
	}

	public void fecharSistema() {
		
		try{
			
			OutputStream fosUsuarios = new FileOutputStream("usuarios.txt");
			ObjectOutputStream oosUsuarios = new ObjectOutputStream(fosUsuarios);
		
			OutputStream fosEmprestimos = new FileOutputStream("emprestimos.txt");
			ObjectOutputStream oosEmprestimos = new ObjectOutputStream(fosEmprestimos);
		
			oosEmprestimos.writeInt(emprestimos.size());
			oosUsuarios.writeInt(usuarios.size());
		
			for (Usuario usuario : usuarios) {
				oosUsuarios.writeObject(usuario);	
			}
			for	(Emprestimo emprestimo : emprestimos){
				oosEmprestimos.writeObject(emprestimo);
			}
			
			oosEmprestimos.close();
			oosUsuarios.close();
			usuarios.clear();
			emprestimos.clear();
			
		} catch(IOException e){
			System.out.println("Arquivo não encontrado");		
		}
	}
	
	public void cadastraUsuario(String nome, String telefone, String email) {
		// Cadastra um usuario
		try{
			if (usuarioExiste(nome, telefone))
				throw new IllegalArgumentException("Usuario ja cadastrado");
			else if (nome.equals("") || email.equals("") || telefone.equals(""))
				throw new IllegalArgumentException("Atributo vazio");
			else{
				Usuario usuario = new Usuario(nome, telefone, email);
				usuarios.add(usuario);
			} 
		} catch (IllegalArgumentException e){
			e.printStackTrace();
		}
	}

	public String getInfoUsuario(String nome, String telefone, String atributo) {
		// Retorna uma informacao do usuario
		try{
			if (usuarioExiste(nome, telefone)){
				Usuario usuario = getUsuario(nome, telefone);
				if (atributo.toLowerCase().equals("email"))
					return usuario.getEmail();
				else if (atributo.toLowerCase().equals("nome"))
					return usuario.getNome();
				else if (atributo.toLowerCase().equals("telefone"))
					return usuario.getCelular();
				else if (atributo.toLowerCase().equals("reputacao"))
					return String.valueOf(usuario.getReputacao());
				else if (atributo.toLowerCase().equals("cartao"))
					return usuario.getQualificacao();
			}
			else
				throw new IllegalArgumentException("Usuario invalido");
		} catch (IllegalArgumentException e){
			e.printStackTrace();
		} return null;
	}

	public void removerUsuario(String nome, String telefone) {
		// Remove um usuario
		try{
			usuarios.remove(getUsuario(nome, telefone));
		} catch (NullPointerException e){
			e.printStackTrace();
		} 
	}

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {
		// Atualiza um atributo do usuario
		try{
			Usuario usuario = getUsuario(nome, telefone);
			if(atributo.toLowerCase().equals("email"))
				usuario.setEmail(valor);
			else if(atributo.toLowerCase().equals("nome"))
				usuario.setNome(valor);
			else if(atributo.toLowerCase().equals("telefone"))
				usuario.setCelular(valor);
		} catch (NullPointerException e){
			e.printStackTrace();
		}
	}

	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco, String plataforma) {
		// Cadastra um jogo eletronico de um usuario
		try{
			Usuario usuario = getUsuario(nome, telefone);
			Item eletronico = new JogosEletronicos(nomeItem, preco, plataforma);
			usuario.adicionaItem(eletronico);
		} catch (NullPointerException e){
			e.printStackTrace();
		}
	}

	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco) {
		// Cadastra um jogo de tabuleiro de um usuario
		try{
			Usuario usuario = getUsuario(nome, telefone);
			Item tabuleiro = new JogoTabuleiro(nomeItem, preco);	
			usuario.adicionaItem(tabuleiro);
		} catch (NullPointerException e){
			e.printStackTrace();
		}
	}

	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca) {
		// Adiciona uma peca perdida a um jogo de tabuleiro
		try{
			Usuario usuario = getUsuario(nome, telefone);
			JogoTabuleiro item = (JogoTabuleiro) usuario.getItem(nomeItem);
			item.adicionaPecaPerdida(nomePeca);
		} catch (NullPointerException e){
			e.printStackTrace();
		}
		
	}
	
	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao, String genero, String classificacao, int anoLancamento) {
		// Cadastra um BluRay de filme de um usuario
		try{
			Usuario usuario = getUsuario(nome, telefone);
			Item filme = new BlurayFilme(nomeItem, preco, duracao, genero, classificacao, anoLancamento);
			usuario.adicionaItem(filme);
		} catch (NullPointerException e){
			e.printStackTrace();
		}
	}

	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao, int numeroFaixas, String artista, String classificacao) {
		// Cadastra um BluRay de show de um usuario
		try{
			Usuario usuario = getUsuario(nome, telefone);
			Item show = new BlurayShow(nomeItem, preco, duracao, numeroFaixas, artista, classificacao);
			usuario.adicionaItem(show);
		} catch (NullPointerException e){
			e.printStackTrace();
		}
	}

	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao, int duracao, String classificacao, String genero, int temporada) {
		// Cadastra um BluRay de serie de um usuario
		try{
			Usuario usuario = getUsuario(nome, telefone);
			Item serie = new BluraySerie(nomeItem, preco, descricao, duracao, classificacao, genero, temporada);
			usuario.adicionaItem(serie);
		} catch (NullPointerException e){
			e.printStackTrace();
		}
	}

	public void adicionarBluRay(String nome, String telefone, String nomeBlurayTemporada, int duracao) {
		// Adiciona um episodio a uma serie
		try{
			Usuario usuario = getUsuario(nome, telefone);
			BluraySerie serie = (BluraySerie) usuario.getItem(nomeBlurayTemporada);
			serie.adicionaBluRay(duracao);
		} catch (NullPointerException e){
			e.printStackTrace();
		}
	}

	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo) {
		// Retorna uma informacao de um item
		try{
			Usuario usuario = getUsuario(nome, telefone);
			Item item = usuario.getItem(nomeItem);
			if (atributo.toLowerCase().equals("nome"))
				return item.getNome();
			else if (atributo.toLowerCase().equals("preco"))
				return String.valueOf(item.getValor()); 
		} catch (NullPointerException e){
			e.printStackTrace();
		} return null;
	}

	public void removerItem(String nome, String telefone, String nomeItem){
		// Remove um item
		try{
			Usuario usuario = getUsuario(nome, telefone);
			usuario.removeItem(nomeItem);
		} catch (NullPointerException e){
			e.printStackTrace();
		}
	}

	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor) {
		// Atualiza um item
		try{
			Usuario usuario = getUsuario(nome, telefone);
			Item item = usuario.getItem(nomeItem);
			if (atributo.toLowerCase().equals("nome"))
				item.setNome(valor);
			else if (atributo.toLowerCase().equals("preco"))
				item.setValor(Double.valueOf(valor));
		} catch (NullPointerException e){
			e.printStackTrace();
		}
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
		try{
			Usuario usuario = getUsuario(nome, telefone);
			Item item = usuario.getItem(nomeItem);
			return item.toString();
		} catch (NullPointerException e){
			e.printStackTrace();
		} return null;
	}

	public void registrarEmprestimo(String nomeDono, String telefoneDono, String nomeRequerente,String telefoneRequerente, String nomeItem, String dataEmprestimo, int periodo) {
		// Cria um novo emprestimo
		try{
			Usuario dono = getUsuario(nomeDono, telefoneDono);
			Usuario requerente = getUsuario(nomeRequerente, telefoneRequerente);
			Item item = dono.getItem(nomeItem);
			if (!item.emprestado()){
				if (!requerente.getQualificacao().equals("Caloteiro")){
					if (periodo <= requerente.getPeriodoMaximo()){	
						Emprestimo emprestimo = new Emprestimo(dono, requerente, item, dataEmprestimo, periodo);
						dono.adicionaEmprestimo(emprestimo);
						dono.somaReputacao(item.getValor() * 0.10);
						requerente.adicionaEmprestimo(emprestimo);
						emprestimos.add(emprestimo);
					}else{
						throw new IllegalArgumentException("Usuario impossiblitado de pegar emprestado por esse periodo");
					}
				}
				else{
					throw new IllegalArgumentException("Usuario nao pode pegar nenhum item emprestado");
				}
			}
			else
				throw new IllegalArgumentException("Item emprestado no momento");
		} catch (IllegalArgumentException e){
			e.printStackTrace();
		}
	}

	public void devolverItem(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente, String nomeItem, String dataEmprestimo, String dataDevolucao) {		
		// Encerra um emprestimo
		try{
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
		
			if (teveEmprestimo){
				emprestimo.encerra(dataDevolucao);
				int dias;
				double total;
				if (emprestimo.passouDoPeriodo()){
					dias = emprestimo.getDuracao() - emprestimo.getPeriodo();
					total = -((dias * 0.01) * emprestimo.getItem().getValor());
					emprestimo.getRequerente().somaReputacao(total);
					emprestimo.getRequerente().atualizaQualificacao();
				}else{
					emprestimo.getRequerente().somaReputacao(emprestimo.getItem().getValor() * 0.05);
					emprestimo.getRequerente().atualizaQualificacao();
				}
			}else{
			throw new NullPointerException("Emprestimo nao encontrado");
			}
		} catch (NullPointerException e){
			e.printStackTrace();
		}
	}
	

	public String listarEmprestimoUsuarioEmprestando(String nome, String telefone){
		
		try{
			Usuario usuario = getUsuario(nome, telefone);
			String stringEmprestimos = "Emprestimos: ";
			for (Emprestimo emprestimo : emprestimos) {
				if (emprestimo.getDono().equals(usuario))
					stringEmprestimos+=emprestimo.toString() + "|";
			}
			if (stringEmprestimos.equals("Emprestimos: "))
				return "Nenhum item emprestado";
			return stringEmprestimos;
		} catch (NullPointerException e){
			e.printStackTrace();
		} return null;
	}

	public String listarEmprestimoUsuarioPegandoEmprestado(String nome, String telefone){

		try{
			Usuario usuario = getUsuario(nome, telefone);
			String stringEmprestimos = "Emprestimos pegos: ";
			for (Emprestimo emprestimo : emprestimos) {
				if (emprestimo.getRequerente().equals(usuario))
					stringEmprestimos+=emprestimo.toString() + "|";
			}
			if (stringEmprestimos.equals("Emprestimos pegos: "))
				return "Nenhum item pego emprestado";
			return stringEmprestimos;
		} catch (NullPointerException e){
			e.printStackTrace();
		} return null;
	}
	
	public String listarEmprestimosItem(String nomeItem){
		
		String stringEmprestimos = "Emprestimos associados ao item: ";
		for (Emprestimo emprestimo : emprestimos) {
			if (emprestimo.getItem().getNome().equals(nomeItem))
				stringEmprestimos+=emprestimo.toString() + "|";
		}
		if (stringEmprestimos.equals("Emprestimos associados ao item: "))
			return "Nenhum emprestimos associados ao item";
		return stringEmprestimos;
	}

	public String listarItensNaoEmprestados(){
		
		String itensNaoEmprestados = "";
		List<Item> itens = itensNaoEmprestados();
		Collections.sort(itens, new ComparadorNome());
		for (Item item : itens){
			
			itensNaoEmprestados+=item.toString() + "|";
		}
		return itensNaoEmprestados;
	}

	public String listarItensEmprestados(){

		String itensEmprestados = "";
		for (Emprestimo emprestimo: emprestimos){
			if (!emprestimo.terminou())
				itensEmprestados+="Dono do item: " + emprestimo.getDono().getNome() + ", Nome do item emprestado: " + emprestimo.getItem().getNome() + "|";
		}
		
		return itensEmprestados;
	}

	public String listarTop10Itens(){
		
		String top10 = "";
		List<Item> itens = listaItens();
		Collections.sort(itens, new ComparadorEmprestimos());
		int contador = 0;
		for (Item item : itens){
			contador+=1;
			if (item.getQuantidadeEmprestimo() > 0)
				top10+= contador + ") " + item.getQuantidadeEmprestimo() + " emprestimos - " + item.toString() + "|";
			if(contador == 10)
				break;
		}
		return top10;
	}
	
	public String listarHistoricoEmprestimoItem(String nomeItem){
		
		String historico = "";
		for (Emprestimo emprestimo : emprestimos){
			if(emprestimo.getItem().getNome().equals(nomeItem))
				historico+=emprestimo.toString() + "|";
		}
		return historico;
	}
	
	public String listarCaloteiros(){
		
		String caloteiros = "Lista de usuarios com reputacao negativa: ";
		List<Usuario> novaLista = new ArrayList<>();
		novaLista.addAll(usuarios);
		Collections.sort(novaLista, new ComparadorUsuarioNome());
		for (Usuario usuario : novaLista) {
			if (usuario.getReputacao() < 0)
				caloteiros+= usuario.toString() + "|";
		}
		if (caloteiros.equals("Lista de usuarios com reputacao negativa: "))
			return "Nao tem usuario com reputacao negativa";
		return caloteiros;
	}

	public String listarTop10MelhoresUsuarios(){
		
		String melhores = "";
		List<Usuario> novaLista = new ArrayList<>(usuarios);
		Collections.sort(novaLista, new ComparadorUsuarioReputacaoMaior());
		if (usuarios.size()>=10){
			for (int i = 0; i < 10; i++){
				Usuario usuario = novaLista.get(i);
				melhores+= (i+1) +": " + usuario.getNome() + " - Reputacao: " + String.format("%.2f", usuario.getReputacao()) + "|";
			}
		} else{
			for (Usuario usuario: novaLista){
				melhores += (novaLista.indexOf(usuario)+1) + ": " + usuario.getNome() + " - Reputacao: " + String.format("%.2f", usuario.getReputacao()) + "|";
			}
		}
		return melhores;
	}

	public String listarTop10PioresUsuarios(){
		
		String piores = "";
		List<Usuario> novaLista = new ArrayList<>(usuarios);
		Collections.sort(novaLista, new ComparadorUsuarioReputacaoMenor());
		if (usuarios.size()>=10){
			for (int i = 0; i < 10; i++){
				Usuario usuario = novaLista.get(i);
				piores+= (i+1) +": " + usuario.getNome() + " - Reputacao: " + String.format("%.2f", usuario.getReputacao()) + "|";
			}
		} else{
			for (Usuario usuario: novaLista){
				piores += (novaLista.indexOf(usuario)+1) + ": " + usuario.getNome() + " - Reputacao: " + String.format("%.2f", usuario.getReputacao()) + "|";
			}
		}
		return piores;
	}
	
	
	private List<Item> listaItens() {
		// Lista todos os itens (sem ordem definida)
		Set<Item> itens = new HashSet<Item>();
		for (Usuario usuario : usuarios){
			usuario.listaItens(itens);
		}
		
		List<Item> lista = new ArrayList<>(itens);
		return lista;
	}
	
	private List<Item> itensNaoEmprestados() {
		// Lista todos os itens (sem ordem definida)
		List<Item> itens = new ArrayList<Item>();
		for (Usuario usuario : usuarios){
			usuario.itensNaoEmprestados(itens);
		}
		return itens;
	}
	private boolean usuarioExiste(String nome, String telefone) {
		// Verifica se o usuario existe
		for (Usuario usuario : usuarios){
			if(usuario.getNome().toLowerCase().equals(nome.toLowerCase()))
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
