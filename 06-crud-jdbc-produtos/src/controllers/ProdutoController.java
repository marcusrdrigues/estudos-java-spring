package controllers;

import java.util.Scanner;

import entities.Produto;
import repositories.ProdutoRepository;

/*
 * Classe para realizar as interações 
 * com o usuário da aplicação
 */
public class ProdutoController {

	//Atributo
	private Scanner scanner = new Scanner(System.in);
	
	/*
	 * Método para que o usuário possa escolher
	 * que opção do projeto deseja executar 
	 */
	public void gerenciarProdutos() throws Exception {
		
		System.out.println("\nGERENCIAMENTO DE PRODUTOS:\n");
		System.out.println("(1) CADASTRAR PRODUTO");
		System.out.println("(2) ATUALIZAR PRODUTO");
		System.out.println("(3) EXCLUIR PRODUTO");
		System.out.println("(4) CONSULTAR PRODUTOS");
		
		System.out.print("\nINFORME A OPÇÃO DESEJADA: ");
		var opcao = Integer.parseInt(scanner.nextLine());
		
		switch(opcao) {
		case 1:
			cadastrarProduto();
			break;
		case 2:
			atualizarProduto();
			break;
		case 3:
			excluirProduto();
			break;
		case 4:
			consultarProdutos();
			break;
		default:
			System.out.println("\nOPÇÃO INVÁLIDA!");
			break;
		}
		
		System.out.print("\nDESEJA REALIZAR OUTRA OPERAÇÃO? (S/N): ");
		var continuar = scanner.nextLine();
		
		if(continuar.equalsIgnoreCase("S")) {
			gerenciarProdutos(); //recursividade
		}
		else {
			System.out.println("\nFIM DO PROGRAMA!");
		}
	}	
	
	/*
	 * Método para capturar os dados
	 * para realizar o cadastro de
	 * um produto.
	 */
	private void cadastrarProduto() throws Exception {
				
		System.out.println("\nCADASTRO DE PRODUTOS:\n");
		
		var produto = new Produto(); //Criando objeto
		
		System.out.print("NOME DO PRODUTO.....: ");
		produto.setNome(scanner.nextLine());
		
		System.out.print("PREÇO...............: ");
		produto.setPreco(Double.parseDouble(scanner.nextLine()));
		
		System.out.print("QUANTIDADE..........: ");
		produto.setQuantidade(Integer.parseInt(scanner.nextLine()));
		
		var produtoRepository = new ProdutoRepository();
		produtoRepository.inserir(produto);
		
		System.out.println("\nPRODUTO CADASTRADO COM SUCESSO!");
	}
	
	/*
	 * Método para capturar os dados
	 * para realizar a edição de
	 * um produto.
	 */
	private void atualizarProduto() throws Exception {
				
		System.out.println("\nEDIÇÃO DE PRODUTOS:\n");
		
		var produto = new Produto(); //Criando objeto
		
		System.out.print("ID DO PRODUTO.......: ");
		produto.setId(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("NOME................: ");
		produto.setNome(scanner.nextLine());
		
		System.out.print("PREÇO...............: ");
		produto.setPreco(Double.parseDouble(scanner.nextLine()));
		
		System.out.print("QUANTIDADE..........: ");
		produto.setQuantidade(Integer.parseInt(scanner.nextLine()));
		
		var produtoRepository = new ProdutoRepository();
		
		if(produtoRepository.atualizar(produto)) {
			System.out.println("\nPRODUTO ATUALIZADO COM SUCESSO!");
		}
		else {
			System.out.println("\nNENHUM PRODUTO FOI ATUALIZADO. VERIFIQUE O ID INFORMADO.");
		}		
	}
	
	/*
	 * Método para capturar os dados
	 * para realizar a exclusão de
	 * um produto.
	 */
	private void excluirProduto() throws Exception {
		
		System.out.println("\nEXCLUSÃO DE PRODUTOS:\n");
		
		System.out.print("ID DO PRODUTO.......: ");
		var id = Integer.parseInt(scanner.nextLine());
		
		var produtoRepository = new ProdutoRepository();
		
		if(produtoRepository.excluir(id)) {
			System.out.println("\nPRODUTO EXCLUIDO COM SUCESSO!");
		} else {
			System.out.println("\nNENHUM PRODUTO FOI EXCLUIDO. VERIFIQUE O ID INFORMADO.");
		}		
	}
	
	/*
	 * Método para listar os produtos
	 * cadastrados no banco de dados.
	 */
	private void consultarProdutos() throws Exception {
		
		System.out.println("\nCONSULTA DE PRODUTOS:\n");
		
		var produtoRepository = new ProdutoRepository();
		produtoRepository.consultar();
	}
	
}





