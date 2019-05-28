package ll;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clase.Datos;

public class ConsultarColchon extends JDialog implements ActionListener {
	private JTextField txtPrecio;
	private JTextField txtG;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarColchon dialog = new ConsultarColchon();
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
	public ConsultarColchon() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblMarca = new JLabel("Marca :");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMarca.setBounds(20, 23, 63, 22);
		getContentPane().add(lblMarca);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		comboBox.setBounds(135, 26, 92, 20);
		getContentPane().add(comboBox);
		
		JLabel lblPrecio = new JLabel("Precio (S/) :");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrecio.setBounds(20, 56, 76, 14);
		getContentPane().add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(135, 55, 92, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblGaranta = new JLabel("Garant\u00EDa (Anos) :");
		lblGaranta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGaranta.setBounds(20, 81, 103, 14);
		getContentPane().add(lblGaranta);
		
		txtG = new JTextField();
		txtG.setEditable(false);
		txtG.setBounds(135, 80, 92, 20);
		getContentPane().add(txtG);
		txtG.setColumns(10);
		
		JLabel lblTamano = new JLabel("Tamano :");
		lblTamano.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTamano.setBounds(20, 106, 73, 14);
		getContentPane().add(lblTamano);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(135, 105, 92, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblMaterial = new JLabel("Material :");
		lblMaterial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMaterial.setBounds(20, 131, 63, 14);
		getContentPane().add(lblMaterial);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(135, 130, 92, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			actionPerformedComboBox(e);
		}
	}
	protected void actionPerformedComboBox(ActionEvent e) {
		
		int Marca = comboBox.getSelectedIndex();
		
	    switch (Marca) {
		case 0:
		   
		}
	}
}
