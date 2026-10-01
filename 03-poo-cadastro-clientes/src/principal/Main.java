package principal;

import java.util.Scanner;

import entidades.Cliente;
import repositorios.ClienteRepositorio;

/*
* Classe principal utilizada para executar o projeto.
*/
public class Main {

	/*
	 * Método para executar a classe Main
	 */
	public static void main(String[] args) {

		System.out.println("Sejam bem vindo ao sistema de cadastro de clientes!");

		// Criando um objeto da classe Scanner
		var scanner = new Scanner(System.in);

		// Criando um objeto da classe Cliente
		var cliente = new Cliente();

		System.out.print("INFORME OS NOME DO CLIENTE......: ");
		cliente.setNome(scanner.nextLine());
		
		System.out.print("INFORME O EMAIL DO CLIENTE......: ");
		cliente.setEmail(scanner.nextLine());
		
		System.out.print("INFORME OS TELEFONE DO CLIENTE..: ");
		cliente.setTelefone(scanner.nextLine());

		// Imprimindo os dados do cliente:
		System.out.println("\nDados do cliente:");

		System.out.println("\tID...........: " + cliente.getId());
		System.out.println("\tNome.........: " + cliente.getNome());
		System.out.println("\tEmail........: " + cliente.getEmail());
		System.out.println("\tTelefone.....: " + cliente.getTelefone());
		System.out.println("\tData e Hora..: " + cliente.getDataHoraCadastro());
		
		//Criando um objeto da classe de repositório do cliente
		var clienteRepositorio = new ClienteRepositorio();
		clienteRepositorio.exportarDados(cliente);
		
		//fechando o scanner
		scanner.close();

	}

}
