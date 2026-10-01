package controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

import entities.Endereco;
import entities.Funcionario;

/*
 * Classe de controle para realizar o fluxo de cadastro
 * de funcionário e endereço
 */

public class FuncionarioController {

	public void cadastrarFuncionario() {

		var scanner = new Scanner(System.in);

		System.out.println("\nCADASTRO DE FUNCIONÁRIO:\n");

		var funcionario = new Funcionario();
		// instanciando funcionário
		funcionario.setEndereco(new Endereco());
		// instanciando endereço do funcionário

		funcionario.setId(UUID.randomUUID());
		// gerando um ID aleatório para o funcionário
		funcionario.getEndereco().setId(UUID.randomUUID());
		// gerando um ID aleatório para o endereço

		System.out.print("INFORME O NOME DO FUNCIONÁRIO...........:");
		funcionario.setNome(scanner.nextLine());

		System.out.print("INFORME O CPF DO FUNCIONÁRIO............:");
		funcionario.setCpf(scanner.nextLine());

		System.out.print("INFORME A DATA DE ADMISSÃO (dd/MM/yyyy).:");
		var input = scanner.nextLine();
		var dataAdmissao = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		funcionario.setDataAdmissao(dataAdmissao);

		System.out.print("INFORME O LOGRADOURO....................:");
		funcionario.getEndereco().setLogradouro(scanner.nextLine());

		System.out.print("INFORME O NUMERO........................:");
		funcionario.getEndereco().setNumero(scanner.nextLine());

		System.out.print("INFORME O COMPLEMENTO...................:");
		funcionario.getEndereco().setComplemento(scanner.nextLine());

		System.out.print("INFORME O BAIRRO........................:");
		funcionario.getEndereco().setBairro(scanner.nextLine());

		System.out.print("INFORME A CIDADE........................:");
		funcionario.getEndereco().setCidade(scanner.nextLine());

		System.out.print("INFORME O ESTADO........................:");
		funcionario.getEndereco().setEstado(scanner.nextLine());

		System.out.print("INFORME O CEP...........................:");
		funcionario.getEndereco().setCep(scanner.nextLine());

		// Imprimindo os dados
		System.out.println("\nDADOS DO FUNCIONÁRIO:");
		System.out.println("\tID................: " + funcionario.getId());
		System.out.println("\tNOME..............: " + funcionario.getNome());
		System.out.println("\tCPF...............: " + funcionario.getCpf());
		System.out.println("\tDATA DE ADMISSÃO..: " + funcionario.getDataAdmissao());
		System.out.println("\tLOGRADOURO........: " + funcionario.getEndereco().getLogradouro());
		System.out.println("\tNUMERO............: " + funcionario.getEndereco().getNumero());
		System.out.println("\tCOMPLEMENTO.......: " + funcionario.getEndereco().getComplemento());
		System.out.println("\tBAIRRO............: " + funcionario.getEndereco().getBairro());
		System.out.println("\tCIDADE............: " + funcionario.getEndereco().getCidade());
		System.out.println("\tESTADO............: " + funcionario.getEndereco().getEstado());
		System.out.println("\tCEP...............: " + funcionario.getEndereco().getCep());

		scanner.close();
	}
}
