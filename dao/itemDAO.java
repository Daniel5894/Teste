package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.itemCompra;

public class itemDAO {

private Connection conexao;
	
	public itemDAO(Connection _conexao) {
		this.conexao = _conexao;
	}
	
	public void Inserir(itemCompra _o) throws SQLException {
		
		String SQL = "INSERT INTO _itemCompra (codItem, val, valTotal, qtd) VALUES (?, ?)";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCodItem());
		ps.setBigDecimal(2, _o.getVal());
		ps.setBigDecimal(3, _o.getValTotal());
		ps.setInt(4, _o.getQtd());
		
		ps.execute();

	}
	
	public Boolean Alterar(itemCompra _o) throws SQLException {

		String SQL = "UPDATE _itemCompra SET codItem = ?, val = ?, valTotal = ?, qtd = ? WHERE codItem = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCodItem());
		ps.setBigDecimal(2, _o.getVal());
		ps.setBigDecimal(3, _o.getValTotal());
		ps.setInt(4, _o.getQtd());
		
		return ps.execute();
	}
	
	public Boolean Excluir(itemCompra _o) throws SQLException {

		String SQL = "DELETE FROM _itemCompra WHERE codItem = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCodItem());
		
		return ps.execute();
	}

	public itemCompra BuscarPorItemCompra(int _itemCompra) throws SQLException {
		
		String SQL = "SELECT itemCompra, tipo FROM _itemCompra WHERE itemCompra = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _itemCompra);
		
		ResultSet rs = ps.executeQuery();
		
		itemCompra i = null;
		
		if(rs.next()) {
			i = new itemCompra();
			
			i.setCodItem(rs.getInt(1));
			i.setVal(rs.getBigDecimal(2));
			i.setValTotal(rs.getBigDecimal(3));
			i.setQtd(rs.getInt(4));
			

		}
		
		return i;
	}

	public List<itemCompra> Listar() throws SQLException {

		String SQL = "SELECT * FROM cliente";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		List<itemCompra> itens = new ArrayList<itemCompra>();
		ResultSet rs = ps.executeQuery();
		
		itemCompra i = null;
		
		while(rs.next()) {
			i = new itemCompra();
			
			i.setCodItem(rs.getInt(1));
			i.setVal(rs.getBigDecimal(2));
			i.setValTotal(rs.getBigDecimal(3));
			i.setQtd(rs.getInt(4));
			
			itens.add(i);
		}
		
		return itens;
	}

}
