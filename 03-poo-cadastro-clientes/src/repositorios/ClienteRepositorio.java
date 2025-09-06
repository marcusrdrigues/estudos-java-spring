package repositorios;

import java.io.PrintWriter;

import entidades.Cliente;

/*
* Classe para armazenar dados de clientes
* em arquivos na máquina local do usuário
*/
public class ClienteRepositorio {
	
	/*
	* Método para exportar os dados de um cliente
	* para um arquivo de extensão TXT
	*/
	public void exportarDados(Cliente cliente) {
		
		try {
			
			//Criando um arquivo na máquina do usuário
			var printWriter = new PrintWriter("/Volumes/SSD_Marcus/temp/" + cliente.getId() + ".txt");
			
			//escrevendo os dados do cliente dentro do arquivo
			printWriter.write(cliente.getId() + "\n");
			printWriter.write(cliente.getNome() + "\n");
			printWriter.write(cliente.getEmail() + "\n");
			printWriter.write(cliente.getTelefone() + "\n");
			printWriter.write(cliente.getDataHoraCadastro() + "\n");
			
			//fechando o arquivo
			printWriter.close();
			
			System.out.println("\nDADOS GRAVADOS COM SUCESSO EM ARQUIVO!");
		}
		catch (Exception e) {
			System.out.println("\nFalha ao gravar arquivo!");
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
