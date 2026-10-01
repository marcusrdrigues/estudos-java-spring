package factories;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Classe responsável por fazer a conexão
 * com o banco de dados do projeto.
 */
public class ConnectionFactory {

	/*
	 * Método para retornar a conexão
	 * com um banco de dados PostgreSQL.
	 */
	public Connection getConnection() throws Exception {
		
		var host = "jdbc:postgresql://localhost:5432/bd_produtos"; //endereço do banco de dados
		var user = "postgres"; //usuário de acesso ao banco de dados
		var pass = "coti"; //senha de acesso ao banco de dados
		
		//Abrir e retornar a conexão com o banco de dados
		return DriverManager.getConnection(host, user, pass);
	}
}
