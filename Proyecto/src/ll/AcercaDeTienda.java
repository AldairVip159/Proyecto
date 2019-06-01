package ll;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;

public class AcercaDeTienda extends JDialog {
	private JLabel lblTienda;
	private JSeparator separator;
	private JLabel lblAutores;
	private JLabel lblJhordanAldairVia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AcercaDeTienda dialog = new AcercaDeTienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AcercaDeTienda() {
		setBounds(100, 100, 431, 222);
		getContentPane().setLayout(null);
		
		lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTienda.setBounds(155, 11, 128, 58);
		getContentPane().add(lblTienda);
		
		separator = new JSeparator();
		separator.setBounds(10, 67, 414, 2);
		getContentPane().add(separator);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAutores.setBounds(176, 80, 93, 30);
		getContentPane().add(lblAutores);
		
		lblJhordanAldairVia = new JLabel("Jhordan Aldair Via Pese");
		lblJhordanAldairVia.setBounds(148, 121, 149, 14);
		getContentPane().add(lblJhordanAldairVia);
	}
}
