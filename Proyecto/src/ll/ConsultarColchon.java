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
	private JTextField txtGarantía;
	private JTextField txtTamano;
	private JTextField txtMaterial;
	private JComboBox cboMarca;

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
		
		cboMarca = new JComboBox();
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.setBounds(135, 26, 230, 20);
		getContentPane().add(cboMarca);
		
		JLabel lblPrecio = new JLabel("Precio (S/) :");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrecio.setBounds(20, 56, 76, 14);
		getContentPane().add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setText(""+Datos.precio0);
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(135, 55, 230, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblGaranta = new JLabel("Garant\u00EDa (Anos) :");
		lblGaranta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGaranta.setBounds(20, 81, 103, 14);
		getContentPane().add(lblGaranta);
		
		txtGarantía = new JTextField();
		txtGarantía.setText(""+Datos.garantia0);
		txtGarantía.setEditable(false);
		txtGarantía.setBounds(135, 80, 230, 20);
		getContentPane().add(txtGarantía);
		txtGarantía.setColumns(10);
		
		JLabel lblTamano = new JLabel("Tamano :");
		lblTamano.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTamano.setBounds(20, 106, 73, 14);
		getContentPane().add(lblTamano);
		
		txtTamano = new JTextField();
		txtTamano.setText(""+Datos.tamaño0);
		txtTamano.setEditable(false);
		txtTamano.setBounds(135, 105, 230, 20);
		getContentPane().add(txtTamano);
		txtTamano.setColumns(10);
		
		JLabel lblMaterial = new JLabel("Material :");
		lblMaterial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMaterial.setBounds(20, 131, 63, 14);
		getContentPane().add(lblMaterial);
		
		txtMaterial = new JTextField();
		txtMaterial.setText(""+Datos.material0);
		txtMaterial.setEditable(false);
		txtMaterial.setBounds(135, 130, 230, 20);
		getContentPane().add(txtMaterial);
		txtMaterial.setColumns(10);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboMarca) {
			actionPerformedComboBox(e);
		}
	}
	protected void actionPerformedComboBox(ActionEvent e) {
		
		int Marca = cboMarca.getSelectedIndex();
		
	    switch (Marca) {
		case 0: 
			txtPrecio.setText(""+Datos.precio0);
			txtGarantía.setText(""+Datos.garantia0);
			txtTamano.setText(""+Datos.tamaño0);
			txtMaterial.setText(""+Datos.material0);
		break;
		case 1: 
			txtPrecio.setText(""+Datos.precio1);
			txtGarantía.setText(""+Datos.garantia1);
			txtTamano.setText(""+Datos.tamaño1);
			txtMaterial.setText(""+Datos.material1);
		break;
		case 2: 
			txtPrecio.setText(""+Datos.precio2);
			txtGarantía.setText(""+Datos.garantia2);
			txtTamano.setText(""+Datos.tamaño2);
			txtMaterial.setText(""+Datos.material2);
		break;
		case 3: 
			txtPrecio.setText(""+Datos.precio3);
			txtGarantía.setText(""+Datos.garantia3);
			txtTamano.setText(""+Datos.tamaño3);
			txtMaterial.setText(""+Datos.material3);
		break;
		case 4: 
			txtPrecio.setText(""+Datos.precio4);
			txtGarantía.setText(""+Datos.garantia4);
			txtTamano.setText(""+Datos.tamaño4);
			txtMaterial.setText(""+Datos.material4);
		break;
		}
	   
	}
}
