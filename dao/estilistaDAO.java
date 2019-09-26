package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.estilista;

public class estilistaDAO {

	private Connection conexao;
	
	public estilistaDAO(Connection _conexao) {
		this.conexao = _conexao;
	}
	
	public void Inserir(estilista _o) throws SQLException {
		
		String SQL = "INSERT INTO _estilista (cnpj, nome, end, tel, email) VALUES (?, ?)";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCnpj());
		ps.setString(2, _o.getNome());
		ps.setString(3, _o.getEnd());
		ps.setInt(4, _o.getTel());
		ps.setString(5, _o.getEmail());
		
		ps.execute();

	}
	
	public Boolean Alterar(estilista _o) throws SQLException {

		String SQL = "UPDATE _estilista SET cnpj = ?, nome = ?, end = ?, tel = ?, email = ? WHERE cnpj = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCnpj());
		ps.setString(2, _o.getNome());
		ps.setString(3, _o.getEnd());
		ps.setInt(4, _o.getTel());
		ps.setString(5, _o.getEmail());
		
		return ps.execute();
	}
	
	public Boolean Excluir(estilista _o) throws SQLException {

		String SQL = "DELETE FROM _estilista WHERE cnpj = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCnpj());
		
		return ps.execute();
	}

	public estilista BuscarPorCnpj(int _cnpj) throws SQLException {
		
		String SQL = "SELECT cnpj, nome, end, tel, email FROM _estilista WHERE cnpj = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _cnpj);
		
		ResultSet rs = ps.executeQuery();
		
		estilista e = null;
		
		if(rs.next()) {
			e = new estilista();
			
			e.setCnpj(rs.getInt(1));
			e.setNome(rs.getString(2));
			e.setEnd(rs.getString(3));
			e.setTel(rs.getInt(4));
			e.setEmail(rs.getString(5));
		}
		
		return e;
	}

	public List<estilista> Listar() throws SQLException {
		
		String SQL = "SELECT * FROM _estilista";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		List<estilista> estilistas = new ArrayList<estilista>();
		ResultSet rs = ps.executeQuery();
		
		estilista e = null;
		
		while(rs.next()) {
			e = new estilista();
			
			e.setCnpj(rs.getInt(1));
			e.setNome(rs.getString(2));
			e.setEnd(rs.getString(3));
			e.setTel(rs.getInt(4));
			e.setEmail(rs.getString(5));
			
			estilistas.add(e);
		}
	
		return estilistas;
	}


}