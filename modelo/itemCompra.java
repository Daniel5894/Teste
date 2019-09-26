package modelo;

import java.io.Serializable;
import java.math.BigDecimal;

public class itemCompra implements Serializable{

	private static final long serialVersionUID = 1L;
	private int codItem;
	private BigDecimal val;
	private BigDecimal valTotal;
	private int qtd;

	private compra _compra;
	private vestido _vestido;
	
	public itemCompra() {
		
	}
	
	public itemCompra(int codItem, BigDecimal val, BigDecimal valTotal, int qtd) {
		super();
		this.codItem = codItem;
		this.val = val;
		this.valTotal = valTotal;
		this.qtd = qtd;

	}

	public int getCodItem() {
		return codItem;
	}

	public void setCodItem(int codItem) {
		this.codItem = codItem;
	}

	public BigDecimal getVal() {
		return val;
	}

	public void setVal(BigDecimal val) {
		this.val = val;
	}

	public BigDecimal getValTotal() {
		return valTotal;
	}

	public void setValTotal(BigDecimal valTotal) {
		this.valTotal = valTotal;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public compra get_compra() {
		return _compra;
	}

	public void set_compra(compra _compra) {
		this._compra = _compra;
	}

	public vestido get_vestido() {
		return _vestido;
	}

	public void set_vestido(vestido _vestido) {
		this._vestido = _vestido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_compra == null) ? 0 : _compra.hashCode());
		result = prime * result + ((_vestido == null) ? 0 : _vestido.hashCode());
		result = prime * result + codItem;
		result = prime * result + qtd;
		result = prime * result + ((val == null) ? 0 : val.hashCode());
		result = prime * result + ((valTotal == null) ? 0 : valTotal.hashCode());
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
		itemCompra other = (itemCompra) obj;
		if (_compra == null) {
			if (other._compra != null)
				return false;
		} else if (!_compra.equals(other._compra))
			return false;
		if (_vestido == null) {
			if (other._vestido != null)
				return false;
		} else if (!_vestido.equals(other._vestido))
			return false;
		if (codItem != other.codItem)
			return false;
		if (qtd != other.qtd)
			return false;
		if (val == null) {
			if (other.val != null)
				return false;
		} else if (!val.equals(other.val))
			return false;
		if (valTotal == null) {
			if (other.valTotal != null)
				return false;
		} else if (!valTotal.equals(other.valTotal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "itemCompra [codItem=" + codItem + ", val=" + val + ", valTotal=" + valTotal + ", qtd=" + qtd
				+ ", _compra=" + _compra + ", _vestido=" + _vestido + "]";
	}
	
	
	
}
