package Projeto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo implements Serializable{
	
	private static final long serialVersionUID = -1238008821695884368L;
	private Usuario dono;
	private Usuario requerente;
	private Item item;
	private LocalDate dataEmprestimo;
	private int periodo;
	private boolean passouDoPeriodo;
	private LocalDate dataDevolucao;
	private boolean terminou;
	private int duracao;
	
	/**
	 * Constrói um emprestimo apartir de um Usuario(Dono), outro usuario(Requerente), um item, uma data de emprestimo e um periodo
	 * 
	 * @param dono
	 * @param requerente
	 * @param item
	 * @param dataEmprestimo
	 * @param periodo
	 */
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
	
	/**
	 * Pega a data de devolucao, devolve o item que estava com o Requerente e verifica, calcula o tempo de emprestimo
	 * Após isso verifica se foi maior ou nao que o periodo estipulado, e com isso define se passou ou nao do periodo
	 * 
	 * @param dataDevolucao
	 */
	public void encerra(String dataDevolucao) {
		
		LocalDate diaDevolucao = LocalDate.parse(dataDevolucao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		this.dataDevolucao = diaDevolucao;
		this.requerente.devolveItem(this.item);
		this.item.retornou();
		this.duracao = (int) (diaDevolucao.toEpochDay() - this.dataEmprestimo.toEpochDay());
		this.terminou = true;
		
		if (duracao > this.periodo)
			this.passouDoPeriodo = true;
		
		else
			this.passouDoPeriodo = false;
	}
	
	/**
	 * 
	 * @return o boolean que representa se atrasou ou nao
	 */
	public boolean passouDoPeriodo(){
		
		return this.passouDoPeriodo;
	}
	
	/**
	 * 
	 * @return o dono do item
	 */
	public Usuario getDono() {
		
		return this.dono;
	}
	
	/**
	 * 
	 * @return o requerente
	 */
	public Usuario getRequerente() {
		
		return this.requerente;
	}
	
	/**
	 * 
	 * @return o item do emprestimo
 	 */
	public Item getItem() {
		
		return this.item;
	}
	
	/**
	 * 
	 * @return data que o emprestimo aconteceu
	 */
	public String getDataEmprestimo() {
		
		return this.dataEmprestimo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	/**
	 * 
	 * @return o periodo estipulado do emprestimo
	 */
	public int getPeriodo() {
		
		return this.periodo;
	}

	/**
	 * Modifica o periodo de acordo com o valor parametrizado
	 * 
	 * @param periodo
	 */
	public void setPeriodo(int periodo) {
		
		this.periodo = periodo;
	}
	
	/**
	 * 
	 * @return o boolean se o emprestimo terminou ou nao
	 */
	public boolean terminou() {
		
		return this.terminou;
	}
	
	/**
	 * Retorna a representacao no formato "EMPRESTIMO - De: dono, PARA: requerente, item, data do emprestimo, periodo dias, ENTREGA: data de devolucao"
	 * 
	 * @return a representacao de um Emprestimo
	 */
	public String toString() {
		
		return "EMPRESTIMO - De: " + this.dono.getNome() + ", Para: " + this.requerente.getNome() + ", " + this.item.getNome() + ", " + this.getDataEmprestimo() + ", " + this.periodo + " dias, ENTREGA: " + this.getDataEntrega();
	}
	
	/**
	 * 
	 * @return a duracao
	 */
	public int getDuracao(){
		
		return this.duracao;
	}

	/**
	 * Caso o emprestimo tenha sido encerrado
	 * @return data de devolucao
	 * 
	 * Já se ainda está em andamento
	 * @return "Emprestimo em andamento"
	 */
	private String getDataEntrega() {
		
		if (terminou())
			return this.dataDevolucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return "Emprestimo em andamento";
	}
	
	/**
	 * @return o hashCode do emprestimo
	 */
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEmprestimo == null) ? 0 : dataEmprestimo.hashCode());
		result = prime * result + ((dono == null) ? 0 : dono.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((requerente == null) ? 0 : requerente.hashCode());
		return result;
	}
	
	/**
	 * Verifica se os dois objetos sao iguais e retorna um boolean
	 * 
	 * @return boolean
	 */
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprestimo other = (Emprestimo) obj;
		if (dataEmprestimo == null) {
			if (other.dataEmprestimo != null)
				return false;
		} else if (!dataEmprestimo.equals(other.dataEmprestimo))
			return false;
		if (dono == null) {
			if (other.dono != null)
				return false;
		} else if (!dono.equals(other.dono))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (requerente == null) {
			if (other.requerente != null)
				return false;
		} else if (!requerente.equals(other.requerente))
			return false;
		return true;
	}
}