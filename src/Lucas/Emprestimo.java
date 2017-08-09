package Lucas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {

	private Usuario dono;
	private Usuario requerente;
	private Item item;
	private LocalDate dataEmprestimo;
	private int periodo;
	private boolean passouDoPeriodo;

	// construtor da classe

	public Emprestimo(Usuario dono, Usuario requerente, Item item, String dataEmprestimo, int periodo) {

		this.dono = dono;
		this.requerente = requerente;
		this.item = item;
		if (periodo < 7)
			this.periodo = periodo;
		else
			this.periodo = 7;
		this.item.emprestou();
		this.requerente.adicionaItem(this.item);
		this.dataEmprestimo = LocalDate.parse(dataEmprestimo, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	// retorna se o prazo expirou ou não

	public void encerra(String dataDevolucao) {

		this.requerente.devolveItem(this.item);
		this.item.retornou();
		LocalDate diaDevolucao = LocalDate.parse(dataDevolucao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		int duracao = (int) (diaDevolucao.toEpochDay() - this.dataEmprestimo.toEpochDay());

		if (duracao > this.periodo)
			this.passouDoPeriodo = true;
		else
			this.passouDoPeriodo = false;
	}

	// retorna o resultado se expirou ou não

	public boolean passouDoPeriodo() {

		return this.passouDoPeriodo;
	}

	// retorna o dono

	public Usuario getDono() {

		return this.dono;
	}

	// retorna o requerente

	public Usuario getRequerente() {

		return this.requerente;
	}

	// retorna o item

	public Item getItem() {

		return this.item;
	}

	// retorna a data do emprestimo

	public LocalDate getDataEmprestimo() {

		return this.dataEmprestimo;
	}

	// retorna o periodo emprestado

	public int getPeriodo() {

		return this.periodo;
	}

	// modifica o periodo

	public void setPeriodo(int periodo) {

		this.periodo = periodo;
	}
}
