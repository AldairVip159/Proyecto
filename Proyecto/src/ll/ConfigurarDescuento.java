package ll;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import clase.Datos;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarDescuento extends JDialog implements ActionListener {
	private JLabel lblA;
	private JLabel lblA_1;
	private JLabel lblA_2;
	private JLabel lblMsDe;
	private JTextField txtDescuento1;
	private JTextField txtDescuento2;
	private JTextField txtDescuento3;
	private JTextField txtDescuento4;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JButton btnAceptar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarDescuento dialog = new ConfigurarDescuento();
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
	public ConfigurarDescuento() {
		setTitle("Configurar Descuento");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblA = new JLabel("1 a 5 unidades");
		lblA.setBounds(35, 24, 86, 14);
		getContentPane().add(lblA);
		
		lblA_1 = new JLabel("6 a 10 unidades");
		lblA_1.setBounds(35, 49, 86, 14);
		getContentPane().add(lblA_1);
		
		lblA_2 = new JLabel("11 a 15 unidades");
		lblA_2.setBounds(35, 74, 97, 14);
		getContentPane().add(lblA_2);
		
		lblMsDe = new JLabel("M\u00E1s de 15 unidades");
		lblMsDe.setBounds(35, 99, 97, 14);
		getContentPane().add(lblMsDe);
		
		txtDescuento1 = new JTextField();
		txtDescuento1.setBounds(137, 21, 86, 20);
		getContentPane().add(txtDescuento1);
		txtDescuento1.setColumns(10);
		txtDescuento1.setText(""+Datos.porcentaje1);
		
		txtDescuento2 = new JTextField();
		txtDescuento2.setText(""+Datos.porcentaje2);
		txtDescuento2.setBounds(137, 46, 86, 20);
		getContentPane().add(txtDescuento2);
		txtDescuento2.setColumns(10);
		
		txtDescuento3 = new JTextField();
		txtDescuento3.setText(""+Datos.porcentaje3);
		txtDescuento3.setBounds(137, 71, 86, 20);
		getContentPane().add(txtDescuento3);
		txtDescuento3.setColumns(10);
		
		txtDescuento4 = new JTextField();
		txtDescuento4.setText(""+Datos.porcentaje4);
		txtDescuento4.setBounds(137, 96, 86, 20);
		getContentPane().add(txtDescuento4);
		txtDescuento4.setColumns(10);
		
		label = new JLabel("%");
		label.setBounds(233, 24, 46, 14);
		getContentPane().add(label);
		
		label_1 = new JLabel("%");
		label_1.setBounds(233, 99, 46, 14);
		getContentPane().add(label_1);
		
		label_2 = new JLabel("%");
		label_2.setBounds(233, 74, 46, 14);
		getContentPane().add(label_2);
		
		label_3 = new JLabel("%");
		label_3.setBounds(233, 49, 46, 14);
		getContentPane().add(label_3);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(297, 20, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(297, 65, 89, 23);
		getContentPane().add(btnCerrar);
		
	}	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		Datos.porcentaje1 = Double.parseDouble(txtDescuento1.getText());
		Datos.porcentaje2 = Double.parseDouble(txtDescuento2.getText());
		Datos.porcentaje3 = Double.parseDouble(txtDescuento3.getText());
		Datos.porcentaje4 = Double.parseDouble(txtDescuento4.getText());
	}
	protected void actionPerformedBtnCerrar (ActionEvent e){
		Proyecto Pr = new Proyecto();
			Pr.setVisible(true);
	}
}
