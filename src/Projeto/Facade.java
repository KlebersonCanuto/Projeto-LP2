package Projeto;
import easyaccept.EasyAccept; 

public class Facade {

	Sistema sistema;
	
	public Facade(){
		
		sistema = new Sistema();
	}
	
	public void iniciarSistema(){
		// Inicializa o sistema
		sistema.iniciarSistema();
	}
	
	public void fecharSistema(){
		// Fecha o sistema
		sistema.fecharSistema();
	}
	
	public void cadastrarUsuario(String nome, String telefone, String email){
		// Cadastra um usuario
		sistema.cadastraUsuario(nome, telefone, email);
	}
	
	public String getInfoUsuario(String nome, String telefone, String atributo){
		// Recebe uma informacao do usuario
		return sistema.getInfoUsuario(nome, telefone, atributo);
	}
	
	public void removerUsuario(String nome, String telefone){
		// Remove um usuario
		sistema.removerUsuario(nome, telefone);
	}
	
	public void atualizarUsuario(String nome, String telefone, String atributo, String valor){
		// Atualiza um atributo de usuario
		sistema.atualizarUsuario(nome, telefone, atributo, valor);
	}
	
	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco, String plataforma){
		// Cadastra um jogo eletronico 
		sistema.cadastrarEletronico(nome, telefone, nomeItem, preco, plataforma);
	}
	
	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco){
		// Cadastra um jogo de tabuleiro
		sistema.cadastrarJogoTabuleiro(nome, telefone, nomeItem, preco);
	}
	
	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca){
		// Adiciona uma peca perdida a um jogo de tabuleiro
		sistema.adicionarPecaPerdida(nome, telefone, nomeItem, nomePeca);
	}
	
	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao, String genero, String classificacao, int anoLancamento){
		// Cadastra um BluRay de filme
		sistema.cadastrarBluRayFilme(nome, telefone, nomeItem, preco, duracao, genero, classificacao, anoLancamento);
	}
	
	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao, int numeroFaixas, String artista, String classificacao){
		// Cadastra um BluRay de show
		sistema.cadastrarBluRayShow(nome, telefone, nomeItem, preco, duracao, numeroFaixas, artista, classificacao);
	}
	
	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao, int duracao, String classificacao, String genero, int temporada){
		// Cadastra um BluRay de serie
		sistema.cadastrarBluRaySerie(nome, telefone, nomeItem, preco, descricao, duracao, classificacao, genero, temporada);
	}
	
	public void adicionarBluRay(String nome, String telefone, String nomeBlurayTemporada, int duracao){
		// Adiciona um episodio a serie
		sistema.adicionarBluRay(nome, telefone, nomeBlurayTemporada, duracao);
	}
	
	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo){
		// Retorna uma informacao de um item
		return sistema.getInfoItem(nome, telefone, nomeItem, atributo);
	}
	
	public void removerItem(String nome, String telefone, String nomeItem){
		// Remove um item
		sistema.removerItem(nome, telefone, nomeItem);
	}
	
	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor){
		// Atualiza um atributo de item
		sistema.atualizarItem(nome, telefone, nomeItem, atributo, valor);
	}
	
	public String listarItensOrdenadosPorNome(){
		// Lista os itens ordenados por nome
		return sistema.listarItensOrdenadosPorNome();
	}
	
	public String listarItensOrdenadosPorValor(){
		// Lista os itens ordenados por valor
		return sistema.listarItensOrdenadosPorValor();
	}
	
	public String pesquisarDetalhesItem(String nome, String telefone, String nomeItem){
		// Pesquisa detalhes de um item
		return sistema.pesquisarDetalhesItem(nome, telefone, nomeItem);
	}
	
	public void registrarEmprestimo(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente, String nomeItem, String dataEmprestimo, int periodo){
		// Registra um emprestimo
		sistema.registrarEmprestimo(nomeDono, telefoneDono, nomeRequerente, telefoneRequerente, nomeItem, dataEmprestimo, periodo);
	}
	
	public void devolverItem(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente, String nomeItem, String dataEmprestimo, String dataDevolucao){
		// Devolve um item
		sistema.devolverItem(nomeDono, telefoneDono, nomeRequerente, telefoneRequerente, nomeItem, dataEmprestimo, dataDevolucao);
	}
	
	public String listarEmprestimosUsuarioEmprestando(String nome, String telefone){
		
		return sistema.listarEmprestimoUsuarioEmprestando(nome, telefone);
	}
	
	public String listarEmprestimosUsuarioPegandoEmprestado(String nome, String telefone){
		
		return sistema.listarEmprestimoUsuarioPegandoEmprestado(nome, telefone);
	}
	
	public String listarEmprestimosItem(String nomeItem){
		
		return sistema.listarEmprestimosItem(nomeItem);
	}
	
	public String listarItensNaoEmprestados(){
		
		return sistema.listarItensNaoEmprestados();
	}
	
	public String listarItensEmprestados(){
		
		return sistema.listarItensEmprestados();
	}
	
	public String listarTop10Itens(){
		
		return sistema.listarTop10Itens();
	}
	
	public String listarHistoricoEmprestimoItem(String nomeItem){
		
		return sistema.listarHistoricoEmprestimoItem(nomeItem);
	}
	
	public String listarCaloteiros() {
		
		return sistema.listarCaloteiros();
	}
	
	public String listarTop10MelhoresUsuarios() {
		
		return sistema.listarTop10MelhoresUsuarios();
	}
	
	public String listarTop10PioresUsuarios(){
		
		return sistema.listarTop10PioresUsuarios();
	}
	
	public static void main(String[] args) {
		// Testes easyAccept
		args = new String[] {"Projeto.Facade", "Tests/us1.txt", "Tests/us2.txt", "Tests/us3.txt", "Tests/us4.txt", "Tests/us5.txt", "Tests/us6.txt", "Tests/us7.txt", "Tests/us8.txt"};
//		args = new String[] {"Projeto.Facade", "Tests/us8.txt"};
		EasyAccept.main(args);
	}
}
