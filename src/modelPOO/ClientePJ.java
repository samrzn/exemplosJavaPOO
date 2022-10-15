package modelPOO;

public class ClientePJ extends Cliente {
	private String CNPJ;
	private String ie;

	public ClientePJ() {

	}

	public ClientePJ(String nome, String email, String telefone, 
	String data, String cNPJ, String ie) {
		
		super();
		CNPJ = cNPJ;
		this.ie = ie;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
}