package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class compra implements Serializable{

	private static final long serialVersionUID = 1L;
	private int codCompra;
	private Date data;
	private BigDecimal valorTotal;
	private String tipoPag;
	private String status;

	private funcionario _funcionario;
	private cliente _cliente;
	private itemCompra _itemCompra;

	
	public compra() {
		
	}
	
	public compra(int codCompra, Date data, BigDecimal valorTotal, String tipoPag, String status) {
		super();
		this.codCompra = codCompra;
		this.data = data;
		this.valorTotal = valorTotal;
		this.tipoPag = tipoPag;
		this.status = status;
	}



	public int getCodCompra() {
		return codCompra;
	}

	public void setCodCompra(int codCompra) {
		this.codCompra = codCompra;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getTipoPag() {
		return tipoPag;
	}

	public void setTipoPag(String tipoPag) {
		this.tipoPag = tipoPag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public funcionario get_funcionario() {
		return _funcionario;
	}

	public void set_funcionario(funcionario _funcionario) {
		this._funcionario = _funcionario;
	}

	public cliente get_cliente() {
		return _cliente;
	}

	public void set_cliente(cliente _cliente) {
		this._cliente = _cliente;
	}

	public itemCompra get_itemCompra() {
		return _itemCompra;
	}

	public void set_itemCompra(itemCompra _itemCompra) {
		this._itemCompra = _itemCompra;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_cliente == null) ? 0 : _cliente.hashCode());
		result = prime * result + ((_funcionario == null) ? 0 : _funcionario.hashCode());
		result = prime * result + codCompra;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tipoPag == null) ? 0 : tipoPag.hashCode());
		result = prime * result + ((valorTotal == null) ? 0 : valorTotal.hashCode());
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
		compra other = (compra) obj;
		if (_cliente == null) {
			if (other._cliente != null)
				return false;
		} else if (!_cliente.equals(other._cliente))
			return false;
		if (_funcionario == null) {
			if (other._funcionario != null)
				return false;
		} else if (!_funcionario.equals(other._funcionario))
			return false;
		if (codCompra != other.codCompra)
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (tipoPag == null) {
			if (other.tipoPag != null)
				return false;
		} else if (!tipoPag.equals(other.tipoPag))
			return false;
		if (valorTotal == null) {
			if (other.valorTotal != null)
				return false;
		} else if (!valorTotal.equals(other.valorTotal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "compra [codCompra=" + codCompra + ", data=" + data + ", valorTotal=" + valorTotal + ", tipoPag="
				+ tipoPag + ", status=" + status + ", _funcionario=" + _funcionario + ", _cliente=" + _cliente + "]";
	}

	public void setItem(List<itemCompra> itens) {
		// TODO Auto-generated method stub
		
	}


	
}
