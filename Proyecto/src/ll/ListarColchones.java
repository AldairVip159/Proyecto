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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 206);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(55, 228, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(270, 228, 89, 23);
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
		txtS.setText("Listado de Colchones\n");
		txtS.append("\nMarca\t :  Suavestar\n");
		txtS.append("Precio\t :  S/. "+Datos.precio0+"\n");
		txtS.append("Garant�a\t :  "+Datos.garantia0+"\n");
		txtS.append("Tamano\t :  "+Datos.tama�o0+"\n");
		txtS.append("Material\t :  "+Datos.material0+"\n");
		txtS.append("\nMarca\t :  Springwall\n");
		txtS.append("Precio\t :  S/. "+Datos.precio1+"\n");
		txtS.append("Garant�a\t :  "+Datos.garantia1+"\n");
		txtS.append("Tamano\t :  "+Datos.tama�o1+"\n");
		txtS.append("Material\t :  "+Datos.material1+"\n");
		txtS.append("\nMarca\t :  Paraiso\n");
		txtS.append("Precio\t :  S/. "+Datos.precio2+"\n");
		txtS.append("Garant�a\t :  "+Datos.garantia2+"\n");
		txtS.append("Tamano\t :  "+Datos.tama�o2+"\n");
		txtS.append("Material\t :  "+Datos.material2+"\n");
		txtS.append("\nMarca\t :  Drimer\n");
		txtS.append("Precio\t :  S/. "+Datos.precio3+"\n");
		txtS.append("Garant�a\t :  "+Datos.garantia3+"\n");
		txtS.append("Tamano\t :  "+Datos.tama�o3+"\n");
		txtS.append("Material\t :  "+Datos.material3+"\n");
		txtS.append("\nMarca\t :  Drimer\n");
		txtS.append("Precio\t :  S/. "+Datos.precio3+"\n");
		txtS.append("Garant�a\t :  "+Datos.garantia3+"\n");
		txtS.append("Tamano\t :  "+Datos.tama�o3+"\n");
		txtS.append("Material\t :  "+Datos.material3+"\n");
		txtS.append("\nMarca\t :  Cisne\n");
		txtS.append("Precio\t :  S/. "+Datos.precio4+"\n");
		txtS.append("Garant�a\t :  "+Datos.garantia4+"\n");
		txtS.append("Tamano\t :  "+Datos.tama�o4+"\n");
		txtS.append("Material\t :  "+Datos.material4+"\n");
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		System.exit(0);
	}
}
