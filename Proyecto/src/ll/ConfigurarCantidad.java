package ll;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import clase.Datos;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarCantidad extends JDialog implements ActionListener {
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
		setTitle("Configurar Cantidad");
		setBounds(100, 100, 498, 207);
		getContentPane().setLayout(null);
		
		lblCantidadptimaDe = new JLabel("Cantidad \u00F3ptima de colchones vendidos");
		lblCantidadptimaDe.setBounds(23, 25, 205, 14);
		getContentPane().add(lblCantidadptimaDe);
		
		txtCantidadOptima = new JTextField();
		txtCantidadOptima.setBounds(236, 22, 86, 20);
		getContentPane().add(txtCantidadOptima);
		txtCantidadOptima.setColumns(10);
		txtCantidadOptima.setText(""+Datos.cantidadOptima);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(360, 21, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(360, 52, 89, 23);
		getContentPane().add(btnCancelar);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);
		}
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		Datos.cantidadOptima = Integer.parseInt(txtCantidadOptima.getText());
	}
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		this.dispose();
	}
}
