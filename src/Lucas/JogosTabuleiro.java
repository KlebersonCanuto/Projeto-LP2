package Lucas;

import java.util.List;
import java.util.ArrayList;

public class JogosTabuleiro extends Item {

	private List<String> pecasPerdidas;

	// construtor da classe

	public JogosTabuleiro(String nomeItem, double valor) {

		super(nomeItem, valor);
		pecasPerdidas = new ArrayList<>();
	}

	// adiciona peças ao ArraList

	public void adicionaPecaPerdida(String nomePeca) {

		pecasPerdidas.add(nomePeca);
	}

	// verifica se existe peças perdidas

	public String verificaPecas() {
		if (pecasPerdidas.size() > 0)
			return "COM PECAS PERDIDAS";
		else
			return "SEM PECAS PERDIDAS";
	}

	// retorna a representação em String

	public String toString() {

		return "JOGO DE TABULEIRO: " + this.getNome() + ", R$ " + this.getValor() + ", " + this.stringEmprestado()
				+ ", " + this.verificaPecas();
	}

	// verificar se dois jogos de tabuleiros são iguais pelo nome

	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		JogosTabuleiro o = (JogosTabuleiro) obj;
		if (this.getNome() == null) {
			if (o.getNome() != null)
				return false;
		} else if (!this.getNome().equals(o.getNome()))
			return false;

		if (this.pecasPerdidas.size() != o.pecasPerdidas.size())
			return false;

		else {
			for (int i = 0; i < this.pecasPerdidas.size(); i++) {
				if (!this.pecasPerdidas.get(i).equals(o.pecasPerdidas.get(i)))
					return false;
			}
		}

		return true;
	}
}
