package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.funcionario;

public class funcionarioDAO {

	private Connection conexao;
	
	public funcionarioDAO(Connection _conexao) {
		this.conexao = _conexao;
	}
	
	public void Inserir(funcionario _o) throws SQLException {
		
		String SQL = "INSERT INTO _funcionario (mat, cargo, salario, admissao) VALUES (?, ?)";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getMat());
		ps.setString(2, _o.getCargo());
		ps.setBigDecimal(3, _o.getSalario());
		ps.setDate(4, (Date) _o.getAdmissao());
		
		ps.execute();

	}
	
	public Boolean Alterar(funcionario _o) throws SQLException {

		String SQL = "UPDATE _funcionario SET mat = ?, cargo = ?, salario = ?, admissao = ? WHERE mat = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getMat());
		ps.setString(2, _o.getCargo());
		ps.setBigDecimal(3, _o.getSalario());
		ps.setDate(4, (Date) _o.getAdmissao());
		
		return ps.execute();
	}
	
	public Boolean Excluir(funcionario _o) throws SQLException {

		String SQL = "DELETE FROM _funcionario WHERE mat = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getMat());
		
		return ps.execute();
	}

	public funcionario BuscarPorMat(int _mat) throws SQLException {
		
		String SQL = "SELECT mat, tipo FROM _funcionario WHERE mat = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _mat);
		
		ResultSet rs = ps.executeQuery();
		
		funcionario f = null;
		
		if(rs.next()) {
			f = new funcionario();
			
			f.setMat(rs.getInt(1));
			f.setCargo(rs.getString(2));
			f.setSalario(rs.getBigDecimal(3));
			f.setAdmissao(rs.getDate(4));

		}
		
		return f;
	}

	public List<funcionario> Listar() throws SQLException {

		String SQL = "SELECT * FROM funcionario";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		List<funcionario> funcionarios = new ArrayList<funcionario>();
		ResultSet rs = ps.executeQuery();
		
		funcionario f = null;
		
		while(rs.next()) {
			f = new funcionario();
			
			f.setMat(rs.getInt(1));
			f.setCargo(rs.getString(2));
			f.setSalario(rs.getBigDecimal(3));
			f.setAdmissao(rs.getDate(4));
			
			funcionarios.add(f);
		}
		
		return funcionarios;
	}

	
}
