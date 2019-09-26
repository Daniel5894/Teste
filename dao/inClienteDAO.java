package dao;

import java.sql.SQLException;
import java.util.List;

import modelo.cliente;

public interface inClienteDAO {
	
void Inserir(cliente _o) throws SQLException;
	
	Boolean Alterar(cliente _o) throws SQLException;
	
	Boolean Excluir(cliente _o) throws SQLException;
	
	cliente BuscarPorCodCli(int _codCli) throws SQLException;
	
	List<cliente> Listar() throws SQLException;

}
