package modelPOO;

// ao implementar uma interface, obrigatoriamente todos seus métodos devem ser
// implementados na classe destino.
public class ContaCorrente extends Conta implements ContaInterface {

	private double saldo = 0;

	@Override
	public void registrar() {
		System.out.println("Conta corrente registrada.");
	}

	// metódos implementados com a interface "ContaInterface": os métodos adicionados
	// receberam as propriedades de cálculo para suas respectivas funções, isso
	// é considerado polimorfismo, pois acrescenta novas características.
	@Override
	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);
	}

	@Override
	public void sacar(double valor) {
		setSaldo(getSaldo() - valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
} 