package dao;

import java.sql.SQLException;
import java.util.List;

import modelo.funcionario;

public interface inFuncionarioDAO {
	
void Inserir(funcionario _o) throws SQLException;
	
	Boolean Alterar(funcionario _o) throws SQLException;
	
	Boolean Excluir(funcionario _o) throws SQLException;
	
	funcionario BuscarPorID(int _id) throws SQLException;
	
	List<funcionario> Listar() throws SQLException;
	
}