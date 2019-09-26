package modelo;

import java.io.Serializable;
import java.math.BigDecimal;

public class vestido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int codVestido;
	private String nome;
	private String desc;
	private String tam;
	private BigDecimal val;
	private int estoque;
	
	private estilista _estilista;
	
	public vestido() {
		
	}
	
	public vestido(int codVestido, String nome, String desc, String tam, BigDecimal val, int estoque) {
		super();
		this.codVestido = codVestido;
		this.nome = nome;
		this.desc = desc;
		this.tam = tam;
		this.val = val;
		this.estoque = estoque;
	}

	public int getCodVestido() {
		return codVestido;
	}

	public void setCodVestido(int codVestido) {
		this.codVestido = codVestido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTam() {
		return tam;
	}

	public void setTam(String tam) {
		this.tam = tam;
	}

	public BigDecimal getVal() {
		return val;
	}

	public void setVal(BigDecimal val) {
		this.val = val;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public estilista get_estilista() {
		return _estilista;
	}

	public void set_estilista(estilista _estilista) {
		this._estilista = _estilista;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_estilista == null) ? 0 : _estilista.hashCode());
		result = prime * result + codVestido;
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + estoque;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tam == null) ? 0 : tam.hashCode());
		result = prime * result + ((val == null) ? 0 : val.hashCode());
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
		vestido other = (vestido) obj;
		if (_estilista == null) {
			if (other._estilista != null)
				return false;
		} else if (!_estilista.equals(other._estilista))
			return false;
		if (codVestido != other.codVestido)
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (estoque != other.estoque)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tam == null) {
			if (other.tam != null)
				return false;
		} else if (!tam.equals(other.tam))
			return false;
		if (val == null) {
			if (other.val != null)
				return false;
		} else if (!val.equals(other.val))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "vestido [codVestido=" + codVestido + ", nome=" + nome + ", desc=" + desc + ", tam=" + tam + ", val="
				+ val + ", estoque=" + estoque + ", _estilista=" + _estilista + ", getCodVestido()=" + getCodVestido()
				+ ", getNome()=" + getNome() + ", getDesc()=" + getDesc() + ", getTam()=" + getTam() + ", getVal()="
				+ getVal() + ", getEstoque()=" + getEstoque() + ", get_estilista()=" + get_estilista() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}


	
}
