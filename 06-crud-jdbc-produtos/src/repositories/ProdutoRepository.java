package repositories;

import entities.Produto;
import factories.ConnectionFactory;

/*
 * Classe responsável por gravar, alterar, excluir e consultar
 * dados de produtos no banco de dados do PostgreSQL (CRUD)
 */
public class ProdutoRepository {
	
	//Atributo
	private ConnectionFactory connectionFactory = new ConnectionFactory();

	/*
	 * Método para inserir um produto novo na tabela
	 * do banco de dados.
	 */
	public void inserir(Produto produto) throws Exception {
		
		//Abrindo conexão com o banco de dados
		var connection = connectionFactory.getConnection();
		
		//Escrevendo um comando SQL para inserir um produto no banco de dados
		var statement = connection.prepareStatement("INSERT INTO produtos(nome, preco, quantidade) VALUES(?,?,?)");		
		//Passandos os parametros para o comando SQL
		statement.setString(1, produto.getNome());
		statement.setDouble(2, produto.getPreco());
		statement.setInt(3, produto.getQuantidade());
		statement.execute(); //Executando o comando SQL
		
		//Fechando a conexão com o banco de dados
		connection.close();
	}
	
	/*
	 * Método para atualizar um produto existente
	 * na tabela do banco de dados.
	 */
	public boolean atualizar(Produto produto) throws Exception {
		
		// Abrindo conexão com o banco de dados
		var connection = connectionFactory.getConnection();

		// Escrevendo um comando SQL para atualizar um produto no banco de dados
		var statement = connection.prepareStatement("UPDATE produtos SET nome=?, preco=?, quantidade=? WHERE id=?");
		// Passandos os parametros para o comando SQL
		statement.setString(1, produto.getNome());
		statement.setDouble(2, produto.getPreco());
		statement.setInt(3, produto.getQuantidade());
		statement.setInt(4, produto.getId());
		var rowsAffected = statement.executeUpdate(); // Executando o comando SQL

		// Fechando a conexão com o banco de dados
		connection.close();
		
		//Retornar verdadeiro se algum produto foi atualizado
		return rowsAffected == 1; //true or false
	}

	/*
	* Método para excluir um produto existente
	* na tabela do banco de dados.
	*/
	public boolean excluir(Integer id) throws Exception {
			
		// Abrindo conexão com o banco de dados
        var connection = connectionFactory.getConnection();
            
        //Escrever o comando SQL para executar a exclusão do produto no banco de dados.
        var statement = connection.prepareStatement("DELETE FROM produtos WHERE id=?");
        statement.setInt(1, id);
        var rowsAffected = statement.executeUpdate(); //Executando o comando SQL
            
        //Fechando a conexão com o banco de dados
        connection.close();
            
        //Retornar verdadeiro se algum produto foi excluído
        return rowsAffected == 1;
	}
	
	/*
	 * Método para consultar todos os produtos 
	 * existentes na tabela do banco de dados.
	 */
	public void consultar() throws Exception {
		
		//Abrindo conexão com o banco de dados
		var connection = connectionFactory.getConnection();
		
		//Escrever um comando SQL para executar a consulta dos produtos no banco de dados
		var statement = connection.prepareStatement("SELECT * FROM produtos ORDER BY id");
		var result = statement.executeQuery(); //Executando o comando SQL
		
		//percorrer cada registro retornado pela consulta
		while(result.next()) {
			System.out.println("------------------------------");
			System.out.println("\n  PRODUTO:  \n");
			System.out.println("ID...........: " + result.getInt("id"));
			System.out.println("NOME.........: " + result.getString("nome"));
			System.out.println("PREÇO........: " + result.getDouble("preco"));
			System.out.println("QUANTIDADE...: " + result.getInt("quantidade"));
			System.out.println("------------------------------");
		}
		
		//Fechando a conexão do banco
		connection.close();
	}
	
}







