package Projeto;

public class Facade {

	Sistema sistema;
	public Facade(){
		
		sistema = new Sistema();
	}
	
	public void cadastraUsuario(String nome, String telefone, String email){
		
		sistema.cadastraUsuario(nome, telefone, email);
	}
	
	public String getInfoUsuario(String nome, String telefone, String atributo){
		
		return sistema.getInfoUsuario(nome, telefone, atributo);
	}
	
	public void removerUsuario(String nome, String telefone){
	
		sistema.removerUsuario(nome, telefone);
	}
	
	public void atualizarUsuario(String nome, String telefone, String atributo, String valor){
		
		sistema.atualizarUsuario(nome, telefone, atributo, valor);
	}
	
	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco){
		
		sistema.cadastrarEletronico(nome, telefone, nomeItem, preco);
	}
	
	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco){
		
		sistema.cadastrarJogoTabuleiro(nome, telefone, nomeItem, preco);
		
	}
	
	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca){
		
		sistema.adicionarPecaPerdida(nome, telefone, nomeItem, nomePeca);
	}
	
	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao, String genero, String classificacao, int anoLancamento){
		
		sistema.cadastrarBluRayFilme(nome, telefone, nomeItem, preco, duracao, genero, classificacao, anoLancamento);
	}
	
	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao, int numeroFaixas, String artista, String classificacao){
		
		sistema.cadastrarBluRayShow(nome, telefone, nomeItem, preco, duracao, numeroFaixas, artista, classificacao);
	}
	
	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao, int duracao, String classificacao, String genero, int temporada){
		
		sistema.cadastrarBluRaySerie(nome, telefone, nomeItem, preco, descricao, duracao, classificacao, genero, temporada);
	}
	
	public void adicionarBluRay(String nome, String telefone, String nomeBlurayTemporada, int duracao){
		
		sistema.adicionarBluRay(nome, telefone, nomeBlurayTemporada, duracao);
	}
	
	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo){
		
		return sistema.getInfoItem(nome, telefone, nomeItem, atributo);
	}
	
	public void removerItem(String nome, String telefone, String nomeBlurayTemporada, int duracao){
		
		sistema.removerItem(nome, telefone, nomeBlurayTemporada, duracao);
	}
	
	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor){
		
		sistema.atualizarItem(nome, telefone, nomeItem, atributo, valor);
	}
	
	public String listarItensOrdenadosPorNome(){
		
		return sistema.listarItensOrdenadosPorNome();
	}
	
	public String listarItensOrdenadosPorValor(){
		
		return sistema.listarItensOrdenadosPorValor();
	}
	
	public String pesquisarDetalhesItem(String nome, String telefone, String nomeItem){
		
		return sistema.pesquisarDetalhesItem();
	}
	
	public void registrarEmprestimo(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente, String nomeItem, String dataEmprestimo, int periodo){
		
		sistema.registrarEmprestimo(nomeDono, telefoneDono, nomeRequerente, telefoneRequerente, nomeItem, dataEmprestimo, periodo);
	}
	
	public void devolverItem(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente, String nomeItem, String dataEmprestimo, String dataDevolucao){
		
		sistema.devolverItem(nomeDono, telefoneDono, nomeRequerente, telefoneRequerente, nomeItem, dataEmprestimo, dataDevolucao);
	}
}
