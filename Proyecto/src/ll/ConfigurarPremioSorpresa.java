package ll;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConfigurarPremioSorpresa extends JDialog {
	private JLabel lblNmeroDeClientes;
	private JTextField txtNumeroCliente;
	private JLabel lblPremioSorpresa;
	private JTextField txtPremio;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarPremioSorpresa dialog = new ConfigurarPremioSorpresa();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarPremioSorpresa() {
		setBounds(100, 100, 450, 170);
		getContentPane().setLayout(null);
		
		lblNmeroDeClientes = new JLabel("N\u00FAmero de clientes");
		lblNmeroDeClientes.setBounds(25, 21, 91, 14);
		getContentPane().add(lblNmeroDeClientes);
		
		txtNumeroCliente = new JTextField();
		txtNumeroCliente.setBounds(129, 18, 86, 20);
		getContentPane().add(txtNumeroCliente);
		txtNumeroCliente.setColumns(10);
		
		lblPremioSorpresa = new JLabel("Premio Sorpresa");
		lblPremioSorpresa.setBounds(25, 51, 91, 14);
		getContentPane().add(lblPremioSorpresa);
		
		txtPremio = new JTextField();
		txtPremio.setBounds(129, 48, 86, 20);
		getContentPane().add(txtPremio);
		txtPremio.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(305, 17, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(305, 47, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
