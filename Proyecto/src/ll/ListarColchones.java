package ll;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clase.Datos;

public class ListarColchones extends JDialog implements ActionListener {
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarColchones dialog = new ListarColchones();
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
	public ListarColchones() {
		setTitle("Listar Colchones");
		setBounds(100, 100, 601, 440);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 565, 321);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(113, 343, 109, 47);
		btnCerrar.addActionListener(this);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(368, 343, 109, 47);
		btnListar.addActionListener(this);
		getContentPane().add(btnListar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		txtS.setText("\tListado de Colchones\n");
		txtS.append("==============================================================================\n");
		txtS.append("\nMarca\t :  Suavestar\n");
		txtS.append("Precio\t :  S/. "+Datos.precio0+"\n");
		txtS.append("Garantía\t :  "+Datos.garantia0+"\n");
		txtS.append("Tamano\t :  "+Datos.tamaño0+"\n");
		txtS.append("Material\t :  "+Datos.material0+"\n");
		txtS.append("\nMarca\t :  Springwall\n");
		txtS.append("Precio\t :  S/. "+Datos.precio1+"\n");
		txtS.append("Garantía\t :  "+Datos.garantia1+"\n");
		txtS.append("Tamano\t :  "+Datos.tamaño1+"\n");
		txtS.append("Material\t :  "+Datos.material1+"\n");
		txtS.append("\nMarca\t :  Paraiso\n");
		txtS.append("Precio\t :  S/. "+Datos.precio2+"\n");
		txtS.append("Garantía\t :  "+Datos.garantia2+"\n");
		txtS.append("Tamano\t :  "+Datos.tamaño2+"\n");
		txtS.append("Material\t :  "+Datos.material2+"\n");
		txtS.append("\nMarca\t :  Drimer\n");
		txtS.append("Precio\t :  S/. "+Datos.precio3+"\n");
		txtS.append("Garantía\t :  "+Datos.garantia3+"\n");
		txtS.append("Tamano\t :  "+Datos.tamaño3+"\n");
		txtS.append("Material\t :  "+Datos.material3+"\n");
		txtS.append("\nMarca\t :  Cisne\n");
		txtS.append("Precio\t :  S/. "+Datos.precio4+"\n");
		txtS.append("Garantía\t :  "+Datos.garantia4+"\n");
		txtS.append("Tamano\t :  "+Datos.tamaño4+"\n");
		txtS.append("Material\t :  "+Datos.material4+"\n");
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		this.dispose();
	}
}
