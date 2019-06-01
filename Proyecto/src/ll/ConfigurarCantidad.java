package ll;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConfigurarCantidad extends JDialog {
	private JLabel lblCantidadptimaDe;
	private JTextField txtCantidadOptima;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarCantidad dialog = new ConfigurarCantidad();
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
	public ConfigurarCantidad() {
		setBounds(100, 100, 498, 207);
		getContentPane().setLayout(null);
		
		lblCantidadptimaDe = new JLabel("Cantidad \u00F3ptima de colchones vendidos");
		lblCantidadptimaDe.setBounds(23, 25, 205, 14);
		getContentPane().add(lblCantidadptimaDe);
		
		txtCantidadOptima = new JTextField();
		txtCantidadOptima.setBounds(236, 22, 86, 20);
		getContentPane().add(txtCantidadOptima);
		txtCantidadOptima.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(360, 21, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(360, 52, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
