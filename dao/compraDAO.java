package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.compra;

public class compraDAO {

	private Connection conexao;
	
	public compraDAO(Connection _conexao) {
		this.conexao = _conexao;
	}
	

	public void Inserir(compra _o) throws SQLException {
		
		String SQL = "INSERT INTO _compra (codCompra, data, valorTotal, tipoPag, status) VALUES (?, ?)";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCodCompra());
		ps.setDate(2, (Date) _o.getData());
		ps.setBigDecimal(3, _o.getValorTotal());
		ps.setString(4, _o.getTipoPag());
		ps.setString(5, _o.getStatus());
		
		ps.execute();

	}
	
	public Boolean Alterar(compra _o) throws SQLException {

		String SQL = "UPDATE _compra SET codCompra = ? data = ? valorTotal = ? tipoPag = ?, status = ? WHERE codCompra = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCodCompra());
		ps.setDate(2, (Date) _o.getData());
		ps.setBigDecimal(3, _o.getValorTotal());
		ps.setString(4, _o.getTipoPag());
		ps.setString(5, _o.getStatus());
		
		return ps.execute();
	}
	
	public Boolean Excluir(compra _o) throws SQLException {

		String SQL = "DELETE FROM _compra WHERE codCompra = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCodCompra());
		
		return ps.execute();
	}
	
	public compra BuscarPorCodCompra(int _codCompra) throws SQLException {
		
		String SQL = "SELECT codCompra, data, valorTotal, tipoPag, status FROM _compra WHERE codCompra = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _codCompra);
		
		ResultSet rs = ps.executeQuery();
		
		compra c = null;
		
		if(rs.next()) {
			c = new compra();
			
			c.setCodCompra(rs.getInt(1));
			c.setData(rs.getDate(2));
			c.setValorTotal(rs.getBigDecimal(3));
			c.setTipoPag(rs.getString(4));
			c.setStatus(rs.getString(5));
		}
		
		return c;
	}

	public List<compra> Listar() throws SQLException {
	
		String SQL = "SELECT * FROM _compra";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		List<compra> compras = new ArrayList<compra>();
		ResultSet rs = ps.executeQuery();
		
		compra c = null;
		
		while(rs.next()) {
			c = new compra();
			
			c.setCodCompra(rs.getInt(1));
			c.setData(rs.getDate(2));
			c.setValorTotal(rs.getBigDecimal(3));
			c.setTipoPag(rs.getString(4));
			c.setStatus(rs.getString(5));
			
			itemDAO daoItem = new itemDAO(this.conexao);
			
			List<modelo.itemCompra> itens = daoItem.Listar(); 
			
			c.setItem(itens);
			
			compras.add(c);
		}
	
		return compras;
	}

	

}
