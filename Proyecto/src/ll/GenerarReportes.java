package ll;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GenerarReportes extends JDialog {
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

}
