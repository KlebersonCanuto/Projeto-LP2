package Kleberson;

public class Emprestimo {
	
	private Usuario dono;
	private Usuario requerente;
	private Item item;
	private String dataEmprestimo;
	private int periodo;
	
	public Emprestimo(Usuario dono, Usuario requerente, Item item, String dataEmprestimo, int periodo){
		
		this.dono = dono;
		this.requerente = requerente;
		this.item = item;
		this.dataEmprestimo = dataEmprestimo;
		this.periodo = periodo;
		item.emprestou();
	}

	public Usuario getDono() {
		
		return this.dono;
	}

	public void setDono(Usuario dono) {
		this.dono = dono;
	}

	public Usuario getRequerente() {
		return this.requerente;
	}

	public void setRequerente(Usuario requerente) {
		this.requerente = requerente;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getDataEmprestimo() {
		return this.dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public int getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
}
