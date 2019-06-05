package ll;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConfigurarObsequio extends JDialog {
	private JLabel lblCantidadMnimaDe;
	private JLabel lblObsequio;
	private JTextField txtCantidadMinima;
	private JTextField txtObsequio;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarObsequio dialog = new ConfigurarObsequio();
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
	public ConfigurarObsequio() {
		setTitle("Configurar Obsequio");
		setBounds(100, 100, 505, 213);
		getContentPane().setLayout(null);
		
		lblCantidadMnimaDe = new JLabel("Cantidad m\u00EDnima de colchones adquiridos");
		lblCantidadMnimaDe.setBounds(26, 21, 214, 14);
		getContentPane().add(lblCantidadMnimaDe);
		
		lblObsequio = new JLabel("Obsequio");
		lblObsequio.setBounds(26, 46, 46, 14);
		getContentPane().add(lblObsequio);
		
		txtCantidadMinima = new JTextField();
		txtCantidadMinima.setBounds(250, 18, 86, 20);
		getContentPane().add(txtCantidadMinima);
		txtCantidadMinima.setColumns(10);
		
		txtObsequio = new JTextField();
		txtObsequio.setBounds(250, 43, 86, 20);
		getContentPane().add(txtObsequio);
		txtObsequio.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(366, 17, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(366, 42, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
