package dao;

import java.sql.SQLException;
import java.util.List;

import modelo.pessoa;

public interface inPessoaDAO {
	
void Inserir(pessoa _o) throws SQLException;
	
	Boolean Alterar(pessoa _o) throws SQLException;
	
	Boolean Excluir(pessoa _o) throws SQLException;
	
	pessoa BuscarPorCpf(int _cpf) throws SQLException;
	
	List<pessoa> Listar() throws SQLException;

}
