package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	private int mat;
	private String cargo;
	private BigDecimal salario;
	private Date admissao;

	private pessoa _pessoa;
	
	public funcionario() {
		
	}
	
	public funcionario(int mat, String cargo, BigDecimal salario, Date admissao) {
		super();
		this.mat = mat;
		this.cargo = cargo;
		this.salario = salario;
		this.admissao = admissao;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public pessoa get_pessoa() {
		return _pessoa;
	}

	public void set_pessoa(pessoa _pessoa) {
		this._pessoa = _pessoa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_pessoa == null) ? 0 : _pessoa.hashCode());
		result = prime * result + ((admissao == null) ? 0 : admissao.hashCode());
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + mat;
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
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
		funcionario other = (funcionario) obj;
		if (_pessoa == null) {
			if (other._pessoa != null)
				return false;
		} else if (!_pessoa.equals(other._pessoa))
			return false;
		if (admissao == null) {
			if (other.admissao != null)
				return false;
		} else if (!admissao.equals(other.admissao))
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (mat != other.mat)
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "funcionario [mat=" + mat + ", cargo=" + cargo + ", salario=" + salario + ", admissao=" + admissao
				+ ", _pessoa=" + _pessoa + "]";
	}
	
}