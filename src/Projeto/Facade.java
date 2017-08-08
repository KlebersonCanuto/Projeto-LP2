package Projeto;

public class Facade {

	UsuarioController controlador;
	
	public Facade(){
		
		controlador = new UsuarioController();
	}
	
	public void iniciarSistema(){

		
	}
	
	public void cadastraUsuario(String nome, String telefone, String email){
		
		controlador.cadastraUsuario(nome, telefone, email);
	}
	
	public String getInfoUsuario(String nome, String telefone, String atributo){
		
		return controlador.getInfoUsuario(nome, telefone, atributo);
	}
	
	public void removerUsuario(String nome, String telefone){
	
		controlador.removerUsuario(nome, telefone);
	}
	
	public void atualizarUsuario(String nome, String telefone, String atributo, String valor){
		
		controlador.atualizarUsuario(nome, telefone, atributo, valor);
	}
	
	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco, String plataforma){
		
		controlador.cadastrarEletronico(nome, telefone, nomeItem, preco, plataforma);
	}
	
	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco){
		
		controlador.cadastrarJogoTabuleiro(nome, telefone, nomeItem, preco);
		
	}
	
	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca){
		
		controlador.adicionarPecaPerdida(nome, telefone, nomeItem, nomePeca);
	}
	
	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao, String genero, String classificacao, int anoLancamento){
		
		controlador.cadastrarBluRayFilme(nome, telefone, nomeItem, preco, duracao, genero, classificacao, anoLancamento);
	}
	
	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao, int numeroFaixas, String artista, String classificacao){
		
		controlador.cadastrarBluRayShow(nome, telefone, nomeItem, preco, duracao, numeroFaixas, artista, classificacao);
	}
	
	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao, int duracao, String classificacao, String genero, int temporada){
		
		controlador.cadastrarBluRaySerie(nome, telefone, nomeItem, preco, descricao, duracao, classificacao, genero, temporada);
	}
	
	public void adicionarBluRay(String nome, String telefone, String nomeBlurayTemporada, int duracao){
		
		controlador.adicionarBluRay(nome, telefone, nomeBlurayTemporada, duracao);
	}
	
	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo){
		
		return controlador.getInfoItem(nome, telefone, nomeItem, atributo);
	}
	
	public void removerItem(String nome, String telefone, String nomeItem){
		
		controlador.removerItem(nome, telefone, nomeItem);
	}
	
	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor){
		
		controlador.atualizarItem(nome, telefone, nomeItem, atributo, valor);
	}
	
	public String listarItensOrdenadosPorNome(){
		
		return controlador.listarItensOrdenadosPorNome();
	}
	
	public String listarItensOrdenadosPorValor(){
		
		return controlador.listarItensOrdenadosPorValor();
	}
	
	public String pesquisarDetalhesItem(String nome, String telefone, String nomeItem){
		
		return controlador.pesquisarDetalhesItem(nome, telefone, nomeItem);
	}
	
	public void registrarEmprestimo(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente, String nomeItem, String dataEmprestimo, int periodo){
		
		controlador.registrarEmprestimo(nomeDono, telefoneDono, nomeRequerente, telefoneRequerente, nomeItem, dataEmprestimo, periodo);
	}
	
	public void devolverItem(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente, String nomeItem, String dataEmprestimo, String dataDevolucao){
		
		controlador.devolverItem(nomeDono, telefoneDono, nomeRequerente, telefoneRequerente, nomeItem, dataEmprestimo, dataDevolucao);
	}
	
	public void fecharSistema(){
		
		
	}
}
