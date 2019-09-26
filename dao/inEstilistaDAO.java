package dao;

import java.sql.SQLException;
import java.util.List;

import modelo.estilista;

public interface inEstilistaDAO {
void Inserir(estilista _o) throws SQLException;
	
	Boolean Alterar(estilista _o) throws SQLException;
	
	Boolean Excluir(estilista _o) throws SQLException;
	
	estilista BuscarPorID(int _id) throws SQLException;
	
	List<estilista> Listar() throws SQLException;

}
