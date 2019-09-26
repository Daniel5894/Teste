package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.pessoa;
import modelo.cliente;

public class pessoaDAO implements inPessoaDAO{
	
	
private Connection conexao;
	
	public pessoaDAO(Connection _conexao) {
		this.conexao = _conexao;
	}
	

	public void Inserir(pessoa _o) throws SQLException {
		
		String SQL = "INSERT INTO _pessoa (cpf, nome, end, tel, email) VALUES (?, ?)";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCpf());
		ps.setString(2, _o.getNome());
		ps.setString(3, _o.getEnd());
		ps.setInt(4, _o.getTel());
		ps.setString(5, _o.getEmail());
		
		ps.execute();

	}
	
	public Boolean Alterar(pessoa _o) throws SQLException {

		String SQL = "UPDATE _pessoa SET nome = ?, end = ?, tel = ?, email = ? WHERE cpf = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCpf());
		ps.setString(2, _o.getNome());
		ps.setString(3, _o.getEnd());
		ps.setInt(4, _o.getTel());
		ps.setString(5, _o.getEmail());
		
		return ps.execute();
	}
	
	public Boolean Excluir(pessoa _o) throws SQLException {

		String SQL = "DELETE FROM _pessoa WHERE cpf = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _o.getCpf());
		
		return ps.execute();
	}

	public pessoa BuscarPorCpf(int _cpf) throws SQLException {
		
		String SQL = "SELECT cpf, nome, email FROM _pessoa WHERE cpf = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _cpf);
		
		ResultSet rs = ps.executeQuery();
		
		pessoa p = null;
		
		if(rs.next()) {
			p = new pessoa();
			
			p.setCpf(rs.getInt(1));
			p.setNome(rs.getString(2));
			p.setEnd(rs.getString(3));
			p.setTel(rs.getInt(4));
			p.setEmail(rs.getString(5));
		}
		
		return p;
	}

	public List<pessoa> Listar() throws SQLException {
	
		String SQL = "SELECT * FROM _pessoa";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		List<pessoa> pessoas = new ArrayList<pessoa>();
		ResultSet rs = ps.executeQuery();
		
		pessoa p = null;
		
		while(rs.next()) {
			p = new pessoa();
			
			p.setCpf(rs.getInt(1));
			p.setNome(rs.getString(2));
			p.setEnd(rs.getString(3));
			p.setTel(rs.getInt(4));
			p.setEmail(rs.getString(5));
			
			clienteDAO daoCliente = new clienteDAO(this.conexao);
			
			List<cliente> clientes = daoCliente.Listar(); 
			
			p.setClientes(clientes);
			
			pessoas.add(p);
		}
	
		return pessoas;
	}

	
}
