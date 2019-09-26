package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.cliente;

public class clienteDAO implements inClienteDAO{
	
	private Connection conexao;
	
	public clienteDAO(Connection _conexao) {
		this.conexao = _conexao;
	}
	
	public void Inserir(cliente _o) throws SQLException {
		
		String SQL = "INSERT INTO _cliente (codCli, tipo) VALUES (?, ?)";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCodCli());
		ps.setString(2, _o.getTipo());
		
		ps.execute();

	}
	
	public Boolean Alterar(cliente _o) throws SQLException {

		String SQL = "UPDATE _cliente SET codCli = ?, tipo = ? WHERE codCli = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCodCli());
		ps.setString(2, _o.getTipo());
		
		return ps.execute();
	}
	
	public Boolean Excluir(cliente _o) throws SQLException {

		String SQL = "DELETE FROM _cliente WHERE codCli = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCodCli());
		
		return ps.execute();
	}

	public cliente BuscarPorCodCli(int _codCli) throws SQLException {
		
		String SQL = "SELECT codCli, tipo FROM _cliente WHERE codCli = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _codCli);
		
		ResultSet rs = ps.executeQuery();
		
		cliente c = null;
		
		if(rs.next()) {
			c = new cliente();
			
			c.setCodCli(rs.getInt(1));
			c.setTipo(rs.getString(2));

		}
		
		return c;
	}

	public List<cliente> Listar() throws SQLException {

		String SQL = "SELECT * FROM cliente";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		List<cliente> clientes = new ArrayList<cliente>();
		ResultSet rs = ps.executeQuery();
		
		cliente c = null;
		
		while(rs.next()) {
			c = new cliente();
			
			c.setCodCli(rs.getInt(1));
			c.setTipo(rs.getString(2));
			
			clientes.add(c);
		}
		
		return clientes;
	}

}

