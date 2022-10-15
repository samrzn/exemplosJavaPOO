package viewPOO;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelPOO.ContaCorrente;

public class ClienteBancoFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ContaCorrente c1 = new ContaCorrente();

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

		addEventos();
	}

	// ação-resposta comandos.
	private void addEventos() {
		opSaque.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Double valor = Double.parseDouble(infoValor.getText());
				c1.sacar(valor);
				infoSaldo.setText("Saldo atual: " + c1.getSaldo());
			}
		});
		opDeposito.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Double valor = Double.parseDouble(infoValor.getText());
				c1.depositar(valor);
				infoSaldo.setText("Saldo atual: " + c1.getSaldo());
			}
		});
	}

	public static void main(String[] args) {
		new ClienteBancoFrame().setVisible(true);
	}
}