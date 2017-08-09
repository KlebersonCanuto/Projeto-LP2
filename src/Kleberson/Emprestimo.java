package Kleberson;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
	
	private Usuario dono;
	private Usuario requerente;
	private Item item;
	private LocalDate dataEmprestimo;
	private int periodo;
	private boolean passouDoPeriodo;
	
	public Emprestimo(Usuario dono, Usuario requerente, Item item, String dataEmprestimo, int periodo){
		
		this.dono = dono;
		this.requerente = requerente;
		this.item = item;
		this.requerente.adicionaItem(this.item);
		this.item.emprestou();
		this.dataEmprestimo = LocalDate.parse(dataEmprestimo, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		if (periodo < 7)
			this.periodo = periodo;
		else
			this.periodo = 7;
	}

	public void encerra(String dataDevolucao) {
		// Encerra um emprestimo
		this.requerente.devolveItem(this.item);
		this.item.retornou();
		LocalDate diaDevolucao = LocalDate.parse(dataDevolucao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		int duracao = (int) (diaDevolucao.toEpochDay() - this.dataEmprestimo.toEpochDay());
		
		if (duracao > this.periodo)
			this.passouDoPeriodo = true;
		else
			this.passouDoPeriodo = false;
	}
	
	public boolean passouDoPeriodo(){
		// Verifica se passou do periodo de entrega
		return this.passouDoPeriodo;
	}
	
	public Usuario getDono() {
		// Retorna o dono do item
		return this.dono;
	}

	public Usuario getRequerente() {
		// Retorna o requerente do item
		return this.requerente;
	}

	public Item getItem() {
		// Retorna o item emprestado
		return this.item;
	}

	public String getDataEmprestimo() {
		// Retorna a data do emprestimo
		return this.dataEmprestimo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public int getPeriodo() {
		// Retorna o periodo do emprestimo
		return this.periodo;
	}

	public void setPeriodo(int periodo) {
		// Modifica o periodo de emprestimo
		this.periodo = periodo;
	}
}
