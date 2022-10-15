package exemploProgOrientadaObj_aula03082022;

import java.util.Date;

import modelPOO.Cliente;
import modelPOO.ClientePJ;

public class ClienteApp {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Y2K");
		ClientePJ c2 = new ClientePJ();

		c1.setEmail("business@y2k.com");
		c1.setData(new Date());
		System.out.println("Cliente: " + c1.getNome() + ".");

		c2.setNome("Tove");
		System.out.println("Cliente PJ: " + c2.getNome() + ".");
	}
}