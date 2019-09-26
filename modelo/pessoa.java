package modelo;

import java.io.Serializable;
import java.util.List;

public class pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int cpf;
	private String nome;
	private String end;
	private int tel;
	private String email;
	
	private List<cliente> clientes;
	private List<funcionario> funcionarios;
	
	public pessoa() {
		
	}
	
	public pessoa(int cpf, String nome, String end, int tel, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.end = end;
		this.tel = tel;
		this.email = email;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
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

	public List<cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<cliente> clientes) {
		this.clientes = clientes;
	}

	public List<funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
		result = prime * result + cpf;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((funcionarios == null) ? 0 : funcionarios.hashCode());
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
		pessoa other = (pessoa) obj;
		if (clientes == null) {
			if (other.clientes != null)
				return false;
		} else if (!clientes.equals(other.clientes))
			return false;
		if (cpf != other.cpf)
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
		if (funcionarios == null) {
			if (other.funcionarios != null)
				return false;
		} else if (!funcionarios.equals(other.funcionarios))
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
		return "pessoa [cpf=" + cpf + ", nome=" + nome + ", end=" + end + ", tel=" + tel + ", email=" + email
				+ ", clientes=" + clientes + ", funcionarios=" + funcionarios + "]";
	}

	
	
}
	