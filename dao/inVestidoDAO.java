package dao;

import java.sql.SQLException;
import java.util.List;

import modelo.vestido;

public interface inVestidoDAO {
	
void Inserir(vestido _o) throws SQLException;
	
	Boolean Alterar(vestido _o) throws SQLException;
	
	Boolean Excluir(vestido _o) throws SQLException;
	
	vestido BuscarPorID(int _id) throws SQLException;
	
	List<vestido> Listar() throws SQLException;

}
