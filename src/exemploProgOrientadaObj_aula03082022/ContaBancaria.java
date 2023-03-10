package exemploProgOrientadaObj_aula03082022;

import modelPOO.Conta;
import modelPOO.ContaCorrente;
import modelPOO.ContaPoupanca;

public class ContaBancaria {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();
		
		// classe abstrata instanciando vetor de objetos.
		Conta c2[] = { new ContaCorrente(), new ContaPoupanca() };
		for (Conta c : c2)
			c.registrar();
	}
} 