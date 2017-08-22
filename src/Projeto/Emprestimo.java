package Projeto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
	
	private Usuario dono;
	private Usuario requerente;
	private Item item;
	private LocalDate dataEmprestimo;
	private int periodo;
	private boolean passouDoPeriodo;
	private LocalDate dataDevolucao;
	private boolean terminou;
	private int duracao;
	
	public Emprestimo(Usuario dono, Usuario requerente, Item item, String dataEmprestimo, int periodo){
		
		this.dono = dono;
		this.requerente = requerente;
		this.item = item;
		this.requerente.adicionaItemEmprestado(this.item);
		this.item.emprestou();
		this.dataEmprestimo = LocalDate.parse(dataEmprestimo, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.periodo = periodo;
		this.terminou = false;
	}

	public void encerra(String dataDevolucao) {
		// Encerra um emprestimo
		LocalDate diaDevolucao = LocalDate.parse(dataDevolucao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.dataDevolucao = diaDevolucao;
		this.requerente.devolveItem(this.item);
		this.item.retornou();
		this.duracao = (int) (diaDevolucao.toEpochDay() - this.dataEmprestimo.toEpochDay());
		
		if (duracao > this.periodo)
			this.passouDoPeriodo = true;
		else
			this.passouDoPeriodo = false;
		this.terminou = true;
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
	
	public boolean terminou() {
		
		return this.terminou;
	}
	
	public String toString() {
		
		return "EMPRESTIMO - De: " + this.dono.getNome() + ", Para: " + this.requerente.getNome() + ", " + this.item.getNome() + ", " + this.getDataEmprestimo() + ", " + this.periodo + " dias, ENTREGA: " + this.getDataEntrega();
	}
	
	public int getDuracao(){
		
		return this.duracao;
	}

	private String getDataEntrega() {
		
		if (terminou())
			return this.dataDevolucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return "Emprestimo em andamento";
	}
}
