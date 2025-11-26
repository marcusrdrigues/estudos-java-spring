package controllers;

import java.util.Scanner;

import entities.Produto;
import repositories.ProdutoRepository;

/*
 * Classe para realizar as interações
 * com o usuário da aplicação.
 */
public class ProdutoController {

	// Atributo
	private Scanner scanner = new Scanner(System.in);

	/*
	 * Método para capturar os dados para realizar o cadastro de um produto.
	 */
	public void cadastrarProduto() throws Exception {

		System.out.println("\nCADASTRO DE PRODUTOS\n");

		var produto = new Produto(); // Criando objeto

		System.out.print("NOME DO PRODUTO......: ");
		produto.setNome(scanner.nextLine());

		System.out.print("PREÇO DO PRODUTO.....: ");
		produto.setPreco(Double.parseDouble(scanner.nextLine()));

		System.out.print("QUANTIDADE DO PRODUTO: ");
		produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

		// Retornando o objeto produto preenchido
		var produtoRepository = new repositories.ProdutoRepository();
		produtoRepository.inserir(produto);

		System.out.println("\nPRODUTO CADASTRADO COM SUCESSO!");
	}

	/*
	 * Método para capturar os dados para realizar a edição do produto.
	 */
	public void atualizarProduto() throws Exception {

		System.out.println("\nATUALIZAÇÃO DE PRODUTOS\n");

		var produto = new Produto(); // Criando objeto

		System.out.print("ID DO PRODUTO........: ");
		produto.setId(Integer.parseInt(scanner.nextLine()));

		System.out.print("NOME DO PRODUTO......: ");
		produto.setNome(scanner.nextLine());

		System.out.print("PREÇO DO PRODUTO.....: ");
		produto.setPreco(Double.parseDouble(scanner.nextLine()));

		System.out.print("QUANTIDADE DO PRODUTO: ");
		produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

		// Retornando o objeto produto preenchido
		var produtoRepository = new ProdutoRepository();

		if (produtoRepository.atualizar(produto)) {
			System.out.println("\nPRODUTO ATUALIZADO COM SUCESSO!");
		} 
		else {
			System.out.println("\nNENHUM PRODUTO FOI ATUALIZADO. VERIFIQUE O ID INFORMADO.");
		}
	}
}
