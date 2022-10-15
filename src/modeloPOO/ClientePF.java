package modeloPOO;

public class ClientePF extends Cliente {
	private String rg;
	private String CPF;
	
	public ClientePF(String nome, String email, String telefone, 
	String data, String rg, String cPF) {

		super();
		this.rg = rg;
		CPF = cPF;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	// método construtor padrão quando declarado com atributo super(), está
	// herdando todos os contrutores da classe pai.
	public ClientePF() {
		super();
	}
}