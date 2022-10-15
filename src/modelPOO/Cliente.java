package modelPOO;

import java.util.Date;

// classe representação do objeto Cliente.

public class Cliente {
	private String nome;
	private String email;
	private String telefone;
	private Date data;

	// construtor padrão.
	public Cliente() {

	}

	// construtor com parâmetros - personalizado.
	public Cliente(String nome) {
		this.nome = nome;
	}

	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	// construtor completo - possui todos os atributos da classe.
	public Cliente(String nome, String email, String telefone, Date data) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.data = data;
	}

	// observação: a criação de um construtor com parâmetros, inválida a execução
	// dos construtores padrões herdados nos filhos, é necessário criar um novo
	// construtor padrão por cima para reestabelecer o funcionamento.

// classe de assessor público contendo atributos privados, para utilização externa dos
// atributos é necessário encapsulamento com "get & set" - sendo reconhecidos nos
// arquivos externos como propriedades.
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}