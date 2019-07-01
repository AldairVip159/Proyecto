package ll;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import clase.Datos;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.server.UnicastRemoteObject;
import java.awt.event.ActionEvent;

public class Inicio extends JDialog implements ActionListener {
	private JLabel lblUsuario;
	private JTextField txtUsuario;
	private JLabel lblNewLabel;
	private JTextField txtContrase�a;
	private JButton btnIngresar;

	String usuario, contrase�a;
	private JButton button;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio dialog = new Inicio();
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
	public Inicio() {
		getContentPane().setFont(new Font("Verdana", Font.ITALIC, 14));
		setBounds(100, 100, 215, 300);
		getContentPane().setLayout(null);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblUsuario.setBounds(76, 43, 60, 14);
		getContentPane().add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(43, 68, 121, 20);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblNewLabel = new JLabel("Contrase\u00F1a");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblNewLabel.setBounds(61, 112, 86, 14);
		getContentPane().add(lblNewLabel);
		
		txtContrase�a = new JTextField();
		txtContrase�a.setFont(new Font("Wingdings 3", Font.BOLD, 11));
		txtContrase�a.setColumns(10);
		txtContrase�a.setBounds(43, 137, 121, 20);
		getContentPane().add(txtContrase�a);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(44, 183, 120, 35);
		getContentPane().add(btnIngresar);
		
		button = new JButton("<-");
		button.addActionListener(this);
		button.setBounds(10, 9, 45, 35);
		getContentPane().add(button);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			actionPerformedButton(e);
		}
		if (e.getSource() == btnIngresar) {
			actionPerformedBtnIngresar(e);
		}
	}
	protected void actionPerformedBtnIngresar(ActionEvent e) {
		IngresoDeCuenta();
	}
	void GetVariable(){
		usuario = txtUsuario.getText();
		contrase�a = txtContrase�a.getText();
	}
	void IngresoDeCuenta(){
		
		boolean cuenta = false;
		
		while(!cuenta){
			GetVariable();
			if(usuario.equalsIgnoreCase(Datos.UsuarioTrabajador) && contrase�a.equalsIgnoreCase(Datos.Contrase�aTrabajador)){
				JOptionPane.showMessageDialog(null, "Bienvenido Trabajador");
					cuenta = true;
					InicioT IT = new InicioT();
						IT.setVisible(true);
					this.dispose();
					
			}
			else if(usuario.equalsIgnoreCase(Datos.UsuarioAdmin) && contrase�a.equalsIgnoreCase(Datos.Contrase�aAdmin)){
				JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
					cuenta = true;
					InicioA IA = new InicioA();
						IA.setVisible(true);
					this.dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, "Hola");
					cuenta = true;
					Inicio I = new Inicio();
						I.setVisible(true);
					this.dispose();
			}
		}
	}
	protected void actionPerformedButton(ActionEvent e) {
		this.dispose();
		Proyecto P = new Proyecto();
			P.setVisible(true);
	}
}
