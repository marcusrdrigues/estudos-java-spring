package main;

import controllers.ProdutoController;

public class Main {

	public static void main(String[] args) {
		
		try {
		
			//Executando o cadastro do produto
			var produtoController = new ProdutoController();
			//produtoController.cadastrarProduto();
			produtoController.atualizarProduto();
		} 
		catch (Exception e) {
			System.out.println("\nFALHA: " + e.getMessage());
		}
	}
}
