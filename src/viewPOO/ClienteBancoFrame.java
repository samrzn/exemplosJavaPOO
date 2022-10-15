package viewPOO;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClienteBancoFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// componentes da GUI.
	JTextField infoValor = new JTextField(6);
	JButton opSaque = new JButton("Sacar");
	JButton opDeposito = new JButton("Depositar");
	JLabel infoSaldo = new JLabel("0");

	// método construtor.
	public ClienteBancoFrame() {
		JPanel painel = new JPanel();
		painel.setLayout(new FlowLayout());
		painel.add(new JLabel("Valor:"));
		painel.add(infoValor);
		painel.add(opSaque);
		painel.add(opDeposito);

	// JFrame - janela.
	JPanel painelResultado = new JPanel();
	painelResultado.setLayout(new FlowLayout());
	painelResultado.add(infoSaldo);
	
	this.setLayout(new BorderLayout());
	this.add(painel, "North");
	this.add(painelResultado, "South");
	this.setSize(320, 140);
	}
	

	public static void main(String[] args) {
		new ClienteBancoFrame().setVisible(true);
	}
}