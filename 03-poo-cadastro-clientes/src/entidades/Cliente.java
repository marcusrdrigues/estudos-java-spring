package entidades;

import java.time.LocalDateTime;
import java.util.UUID;

/*
* Classe para modelagem dos dados de um cliente
*/
public class Cliente {

	/*
	* Atributos (dados) da classe Cliente
	*/
	private UUID id = UUID.randomUUID();
	private String nome;
	private String email;
	private String telefone;
	private LocalDateTime DataHoraCadastro = LocalDateTime.now();

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDateTime getDataHoraCadastro() {
		return DataHoraCadastro;
	}

	public void setDataHoraCadastro(LocalDateTime dataHoraCadastro) {
		DataHoraCadastro = dataHoraCadastro;
	}
}
