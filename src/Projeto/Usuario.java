package Projeto;

import java.util.HashSet;

public class Usuario {
	String nome;
	String email;
	String telefone;
	
	HashSet<Item> itens = new HashSet<>();
	
	
	public Usuario(String nome, String telefone, String email ){
		
		this.nome = nome;
		this.telefone = telefone ;
		this.email = email;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return telefone;
	}

	public void setCelular(String celular) {
		this.telefone = celular;
	}

	@Override
	public String toString() {
		return this.nome + ", " +this.email + ", " + this.telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
	
	

}
