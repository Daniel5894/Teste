package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.vestido;

public class vestidoDAO {
	
	private Connection conexao;
	
	public vestidoDAO(Connection _conexao) {
		this.conexao = _conexao;
	}
	
	public void Inserir(vestido _o) throws SQLException {
		
		String SQL = "INSERT INTO _vestido (codVestido, nome, desc, tam, val, estoque) VALUES (?, ?)";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCodVestido());
		ps.setString(2, _o.getNome());
		ps.setString(3, _o.getDesc());
		ps.setString(4, _o.getTam());
		ps.setBigDecimal(5, _o.getVal());
		ps.setInt(6, _o.getEstoque());
		
		ps.execute();

	}
	public Boolean Alterar(vestido _o) throws SQLException {

		String SQL = "UPDATE _vestido SET codVestido = ?, nome = ?, desc = ?, tam = ?, val = ?, estoque = ? WHERE codVestido = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCodVestido());
		ps.setString(2, _o.getNome());
		ps.setString(3, _o.getDesc());
		ps.setString(4, _o.getTam());
		ps.setBigDecimal(5, _o.getVal());
		ps.setInt(6, _o.getEstoque());
		
		return ps.execute();
	}
	
	public Boolean Excluir(vestido _o) throws SQLException {

		String SQL = "DELETE FROM _vestido WHERE codVestido = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCodVestido());
		
		return ps.execute();
	}
	
	public vestido BuscarPorCodVestido(int _codVestido) throws SQLException {
		
		String SQL = "SELECT codCli, tipo FROM _vestido WHERE codCli = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _codVestido);
		
		ResultSet rs = ps.executeQuery();
		
		vestido v = null;
		
		if(rs.next()) {
			v = new vestido();
			
			v.setCodVestido(rs.getInt(1));
			v.setNome(rs.getString(2));
			v.setDesc(rs.getString(3));
			v.setTam(rs.getString(4));
			v.setVal(rs.getBigDecimal(5));
			v.setEstoque(rs.getInt(6));

		}
		
		return v;
	}

	public List<vestido> Listar() throws SQLException {

		String SQL = "SELECT * FROM vestido";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		List<vestido> vestidos = new ArrayList<vestido>();
		ResultSet rs = ps.executeQuery();
		
		vestido v = null;
		
		while(rs.next()) {
			v = new vestido();
			
			v.setCodVestido(rs.getInt(1));
			v.setNome(rs.getString(2));
			v.setDesc(rs.getString(3));
			v.setTam(rs.getString(4));
			v.setVal(rs.getBigDecimal(5));
			v.setEstoque(rs.getInt(6));
			
			vestidos.add(v);
		}
		
		return vestidos;
	}


}
