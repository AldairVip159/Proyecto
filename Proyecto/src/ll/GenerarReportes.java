package ll;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import clase.Datos;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ll.Vender;

public class GenerarReportes extends JDialog implements ActionListener {
	private JLabel lblTipodeReportes;
	private JComboBox cboTipo;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarReportes dialog = new GenerarReportes();
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
	public GenerarReportes() {
		setTitle("Generar Reportes");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblTipodeReportes = new JLabel("Tipo de Reportes");
		lblTipodeReportes.setBounds(24, 25, 88, 14);
		getContentPane().add(lblTipodeReportes);
		
		cboTipo = new JComboBox();
		cboTipo.addActionListener(this);
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Ventas por Marca", "Marcas con venta \u00F3ptima", "Precios en relaci\u00F3n al promedio", "Precio promedios, medios y mayor"}));
		cboTipo.setBounds(121, 22, 187, 20);
		getContentPane().add(cboTipo);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(324, 21, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 55, 414, 195);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	
	

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboTipo) {
			actionPerformedCboTipoJComboBox(arg0);
		}
	}
	protected void actionPerformedCboTipoJComboBox(ActionEvent arg0) {
		
		int marca=cboTipo.getSelectedIndex();
		
		switch (marca) {
		case 0:
			textArea.setText("\t  Ventas de Colchones");
			textArea.append("\n");
			textArea.append("\n Marca \t\t: "+Datos.marca0);
			textArea.append("\n Cantidad de ventas \t: "+Datos.contador0);
			textArea.append("\nCantidad de unidades vendidas: "+Datos.acumulador0);
			textArea.append("\n Importe total acumulado \t: S/."+Datos.acumuladorIC0);
			textArea.append("\n");
			textArea.append("\n Marca \t\t: "+Datos.marca1);
			textArea.append("\n Cantidad de ventas \t: "+Datos.contador1);
			textArea.append("\nCantidad de unidades vendidas: "+Datos.acumulador1);
			textArea.append("\n Importe total acumulado \t: S/."+Datos.acumuladorIC1);
			textArea.append("\n");
			textArea.append("\n Marca \t\t: "+Datos.marca2);
			textArea.append("\n Cantidad de ventas \t: "+Datos.contador2);
			textArea.append("\nCantidad de unidades vendidas: "+Datos.acumulador2);
			textArea.append("\n Importe total acumulado \t: S/."+Datos.acumuladorIC2);
			textArea.append("\n");
			textArea.append("\n Marca \t\t: "+Datos.marca3);
			textArea.append("\n Cantidad de ventas \t: "+Datos.contador3);
			textArea.append("\nCantidad de unidades vendidas: "+Datos.acumulador3);
			textArea.append("\n Importe total acumulado \t: S/."+Datos.acumuladorIC3);
			textArea.append("\n");
			textArea.append("\n Marca \t\t: "+Datos.marca4);
			textArea.append("\n Cantidad de ventas \t: "+Datos.contador4);
			textArea.append("\nCantidad de unidades vendidas: "+Datos.acumulador4);
			textArea.append("\n Importe total acumulado \t: S/."+Datos.acumuladorIC4);
			textArea.append("\n");
			textArea.append("\n");
			textArea.append("\n Importe total general acumulado:S/."+Datos.acumaladorICT);
			textArea.append("\n Cantidad total general de ventas :"+Datos.acumuladorT);
			break;

		default:
			break;
		}
		
	}
}
