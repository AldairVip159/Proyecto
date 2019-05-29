package ll;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import clase.Datos;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ModificarColchones extends JDialog implements ActionListener {
	private JTextField txtPrecio;
	private JTextField txtGarantía;
	private JTextField txtTamano;
	private JTextField txtMaterial;
	private JComboBox cboMarca;
	private JButton btnGuardar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarColchones dialog = new ModificarColchones();
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
	public ModificarColchones() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblMarca = new JLabel("Marca :");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMarca.setBounds(20, 23, 63, 22);
		getContentPane().add(lblMarca);
		
		JLabel lblPrecio = new JLabel("Precio (S/) :");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrecio.setBounds(20, 56, 76, 14);
		getContentPane().add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setText(""+Datos.precio0);
		txtPrecio.setBounds(135, 55, 230, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblGaranta = new JLabel("Garant\u00EDa (Anos) :");
		lblGaranta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGaranta.setBounds(20, 81, 103, 14);
		getContentPane().add(lblGaranta);
		
		txtGarantía = new JTextField();
		txtGarantía.setText(""+Datos.garantia0);
		txtGarantía.setBounds(135, 80, 230, 20);
		getContentPane().add(txtGarantía);
		txtGarantía.setColumns(10);
		
		JLabel lblTamano = new JLabel("Tamano :");
		lblTamano.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTamano.setBounds(20, 106, 73, 14);
		getContentPane().add(lblTamano);
		
		txtTamano = new JTextField();
		txtTamano.setText(""+Datos.tamaño0);
		txtTamano.setBounds(135, 105, 230, 20);
		getContentPane().add(txtTamano);
		txtTamano.setColumns(10);
		
		JLabel lblMaterial = new JLabel("Material :");
		lblMaterial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMaterial.setBounds(20, 127, 113, 22);
		getContentPane().add(lblMaterial);
		
		txtMaterial = new JTextField();
		txtMaterial.setText(""+Datos.material0);
		txtMaterial.setBounds(135, 130, 230, 20);
		getContentPane().add(txtMaterial);
		
		cboMarca = new JComboBox();
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.setBounds(135, 26, 230, 20);
		getContentPane().add(cboMarca);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(259, 189, 89, 23);
		getContentPane().add(btnGuardar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(90, 189, 89, 23);
		getContentPane().add(btnCerrar);
		

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		if (arg0.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(arg0);
		}
		if (arg0.getSource() == cboMarca) {
			actionPerformedCboMarca(arg0);
		}
	}
	protected void actionPerformedCboMarca(ActionEvent arg0) {
		
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
	protected void actionPerformedBtnGuardar(ActionEvent arg0) {
		
		}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {System.exit(0);}
}
