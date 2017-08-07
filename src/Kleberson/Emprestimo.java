package Kleberson;

public class Emprestimo {
	
	private Usuario dono;
	private Usuario requerente;
	private Item item;
	private String dataEmprestimo;
	private int periodo;
	private boolean passouDoPeriodo;
	
	public Emprestimo(Usuario dono, Usuario requerente, Item item, String dataEmprestimo, int periodo){
		
		this.dono = dono;
		this.requerente = requerente;
		this.item = item;
		this.dataEmprestimo = dataEmprestimo;
		this.periodo = periodo;
		this.item.emprestou();
		this.requerente.adicionaItem(this.item);
	}

	public void encerra(String dataDevolucao) {
		
		this.requerente.devolveItem(this.item);
		this.item.retornou();
// 		calcula o periodo que ficou com o usuario e compara com o periodo decidido inicialmente e então seta se passou ou não do periodo
	}
	
	public boolean passouDoPeriodo(){
		
		return this.passouDoPeriodo;
	}
	
	public Usuario getDono() {
		
		return this.dono;
	}

	public Usuario getRequerente() {
		
		return this.requerente;
	}

	public Item getItem() {
	
		return this.item;
	}

	public String getDataEmprestimo() {
		
		return this.dataEmprestimo;
	}

	public int getPeriodo() {
		
		return this.periodo;
	}

	public void setPeriodo(int periodo) {
		
		this.periodo = periodo;
	}
}
