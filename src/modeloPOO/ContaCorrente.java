package modeloPOO;

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
		saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
}