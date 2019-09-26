package dao;

import java.sql.SQLException;
import java.util.List;

import modelo.compra;

public interface inCompraDAO {
	
void Inserir(compra _o) throws SQLException;
	
	Boolean Alterar(compra _o) throws SQLException;
	
	Boolean Excluir(compra _o) throws SQLException;
	
	compra BuscarPorID(int _id) throws SQLException;
	
	List<compra> Listar() throws SQLException;

		
}
