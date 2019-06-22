package ll;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import clase.Datos;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vender extends JDialog implements ActionListener {
	private JLabel lblMarca;
	private JLabel lblPrecios;
	private JLabel lblCantidad;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JComboBox cboMarca;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	
	double P1=Datos.porcentaje1, P2=Datos.porcentaje2, P3=Datos.porcentaje3, P4=Datos.porcentaje4;
	int CO=Datos.cantidadMinimaObsequiable;
	double precio, IC, ID, IP;
	int cantidad, obsequio, marca;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender dialog = new Vender();
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
	public Vender() {
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMarca.setBounds(33, 27, 46, 14);
		getContentPane().add(lblMarca);
		
		lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrecios.setBounds(33, 52, 75, 14);
		getContentPane().add(lblPrecios);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantidad.setBounds(33, 77, 75, 14);
		getContentPane().add(lblCantidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(118, 51, 86, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(118, 76, 86, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cboMarca = new JComboBox();
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.setBounds(118, 26, 86, 20);
		getContentPane().add(cboMarca);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(301, 25, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(301, 68, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 106, 414, 144);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
	}
	protected void actionPerformedBtnVender(ActionEvent e) {
		marca = GetMarca();
		cantidad = GetCantidad();
		precio = GetPrecio(marca);
		IC = GetImporteDeCompra(precio, cantidad);
		ID = GetImporteDeDescuento(IC, P1, P2, P3, P4, cantidad);
		IP = GetImportePagar(IC, ID);
		
	}
	int GetMarca(){
		return cboMarca.getSelectedIndex();
	}
	int GetCantidad(){
		return Integer.parseInt(txtCantidad.getText());
	}
	double GetPrecio(int m){
		switch (m) {
		case 0:
			return Datos.precio0;
		case 1:
			return Datos.precio1;
		case 2:
			return Datos.precio2;
		case 3:
			return Datos.precio3;
		default:
			return Datos.precio4;
		}
	}
	double GetImporteDeCompra(double p,int c){
		return p * c;
	}
	double GetImporteDeDescuento(double ic,double P1,double P2,double P3,double P4,int c){
		if (c <= 1 && c >= 5){
			return P1 * ic;
		}
		else if (c <= 6 && c >= 10){
			return P2 * ic;
		}
		else if (c <= 11 && c >= 15){
			return P3 * ic;
		}
		else if (c < 15){
			return P4 * ic;
		}
		else{
			return 0;
		}
	}
	double GetImportePagar(double ic,double id){
		return ic - id;
	}
	void GetObsequio(){
		if(cantidad <= CO){
			// eror ===== obsequio = Datos.obsequio;
		}
	}
}
