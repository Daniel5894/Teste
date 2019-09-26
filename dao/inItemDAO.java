package dao;

import java.sql.SQLException;
import java.util.List;

import modelo.itemCompra;

public interface inItemDAO {
	
void Inserir(itemCompra _o) throws SQLException;
	
	Boolean Alterar(itemCompra _o) throws SQLException;
	
	Boolean Excluir(itemCompra _o) throws SQLException;
	
	itemCompra BuscarPorID(int _id) throws SQLException;
	
	List<itemCompra> Listar() throws SQLException;

}
