package modelo;

import java.io.Serializable;

public class cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	private int codCli;
	private String tipo;

	private pessoa _pessoa;
	
	public cliente() {
		
	}
	
	public cliente(int codCli, String tipo) {
		super();
		this.codCli = codCli;
		this.tipo = tipo;
	}

	public int getCodCli() {
		return codCli;
	}

	public void setCodCli(int codCli) {
		this.codCli = codCli;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		result = prime * result + codCli;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		cliente other = (cliente) obj;
		if (_pessoa == null) {
			if (other._pessoa != null)
				return false;
		} else if (!_pessoa.equals(other._pessoa))
			return false;
		if (codCli != other.codCli)
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "cliente [codCli=" + codCli + ", tipo=" + tipo + ", _pessoa=" + _pessoa + "]";
	}
	
}


	
	
	