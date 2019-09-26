package modelo;

import java.io.Serializable;

public class estilista implements Serializable {

	private static final long serialVersionUID = 1L;
	private int cnpj;
	private String nome;
	private String end;
	private int tel;
	private String email;
	
	public estilista() {
		
	}
	
	public estilista(int cnpj, String nome, String end, int tel, String email) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.end = end;
		this.tel = tel;
		this.email = email;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cnpj;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + tel;
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
		estilista other = (estilista) obj;
		if (cnpj != other.cnpj)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tel != other.tel)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "estilista [cnpj=" + cnpj + ", nome=" + nome + ", end=" + end + ", tel=" + tel + ", email=" + email
				+ "]";
	}

	

}
