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

	int COptima=Datos.cantidadOptima;
	int a1=Datos.acumulador0, a2=Datos.acumulador1, a3=Datos.acumulador2, a4=Datos.acumulador3, a5=Datos.acumulador4;
	
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
		double VPromedio,p0=Datos.precio0,p1=Datos.precio1,p2=Datos.precio2,p3=Datos.precio3,p4=Datos.precio4;
		
		VPromedio = (p0 + p1 + p2 + p3 + p4)/5;
		
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
		case 1:
			textArea.setText("\t              Colchones con venta óptima\n");
			textArea.append(" ========================================================== ");
			
			if (a1 >= COptima){
				if (a2 >= COptima){
					if (a3 >= COptima){
						if (a4 >= COptima){
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
							}
						}
						else {
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
							}
						}
					}
					else{
						if (a4 >= COptima){
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
							}
						}
						else{
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima)\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
							}
						}
					}
				}
				else {
					if (a3 >= COptima){
						if (a4 >= COptima){
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");

							}
						}
						else {
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
							}
							
						}
					}
					else {
						if (a4 >= COptima){
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
							}
						}
						else {
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima)\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca0+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador0+" ( "+(Datos.acumulador0-COptima)+" más que la cantidad óptima )\n");
							}
						}
					}
				}
			}
			else {
				if (a2 >= COptima){
					if(a3 >= COptima){
						if (a4 >= COptima){
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");	
							}
						}
						else {
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
							}
						}
					}
					else {
						if(a4 >= COptima){
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
							}
						}
						else {
							if (a5 >= COptima){
							textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
							textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
							textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
							textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
							}
							else {
							textArea.append("\nMarca \t\t         : "+Datos.marca1+"\n");
							textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador1+" ( "+(Datos.acumulador1-COptima)+" más que la cantidad óptima )\n");
							}
						}
					}
				}		
				else {
					if (a3 >= COptima){
						if (a4 >= COptima){
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
							}
						}
						else {
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca2+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador2+" ( "+(Datos.acumulador2-COptima)+" más que la cantidad óptima )\n");
							}
						}
					}
					else {
						if (a4 >= COptima){
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima )\n");
							}
							else {
								textArea.append("\nMarca \t\t         : "+Datos.marca3+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador3+" ( "+(Datos.acumulador3-COptima)+" más que la cantidad óptima )\n");
							}
						}
						else {
							if (a5 >= COptima){
								textArea.append("\nMarca \t\t         : "+Datos.marca4+"\n");
								textArea.append("Cantidad total de unidades vendidas: "+Datos.acumulador4+" ( "+(Datos.acumulador4-COptima)+" más que la cantidad óptima ) \n");
							}
							else {
								textArea.append("\n\t     ( No existen marcas con venta óptima )");
							}
						}
					}
				}
			}
			break;
		case 2:
			textArea.setText("\t            Precios en relación al Promedio");
			textArea.append("\n========================================================\n\n");
			textArea.append(" Nombre\t:  "+Datos.marca0+"\n");
			textArea.append(" Precio\t:  "+Datos.precio0);
			if (p0 > VPromedio){
				textArea.append("  ( mayor al promedio ) \n\n");
			}
			else if (p0 == VPromedio){
				textArea.append("  ( igual al promedio ) \n\n");
			}
			else {
				textArea.append("  ( menor al promedio ) \n\n");
			}
			textArea.append(" Nombre\t:  "+Datos.marca1+"\n");
			textArea.append(" Precio\t:  "+Datos.precio1);
			if (p1 > VPromedio){
				textArea.append("  ( mayor al promedio ) \n\n");
			}
			else if (p1 == VPromedio){
				textArea.append("  ( igual al promedio ) \n\n");
			}
			else {
				textArea.append("  ( menor al promedio ) \n\n");
			}
			textArea.append(" Nombre\t:  "+Datos.marca2+"\n");
			textArea.append(" Precio\t:  "+Datos.precio2);
			if (p2 > VPromedio){
				textArea.append("  ( mayor al promedio ) \n\n");
			}
			else if (p2 == VPromedio){
				textArea.append("  ( igual al promedio ) \n\n");
			}
			else {
				textArea.append("  ( menor al promedio ) \n\n");
			}
			textArea.append(" Nombre\t:  "+Datos.marca3+"\n");
			textArea.append(" Precio\t:  "+Datos.precio3);
			if (p3 > VPromedio){
				textArea.append("  ( mayor al promedio ) \n\n");
			}
			else if (p3 == VPromedio){
				textArea.append("  ( igual al promedio ) \n\n");
			}
			else {
				textArea.append("  ( menor al promedio ) \n\n");
			}
			textArea.append(" Nombre\t:  "+Datos.marca4+"\n");
			textArea.append(" Precio\t:  "+Datos.precio4);
			if (p4 > VPromedio){
				textArea.append("  ( mayor al promedio ) \n\n");
			}
			else if (p4 == VPromedio){
				textArea.append("  ( igual al promedio ) \n\n");
			}
			else {
				textArea.append("  ( menor al promedio ) \n\n");
			}
			
			textArea.append("\n Precio promedio  :  S/."+VPromedio);
			break;
			
		default:
			textArea.append("\t       Precio promedio, menor y mayor\n");
			textArea.append("\n Precio promedio  :  S/."+VPromedio+"\n\n");
			
			if (p0 > p1 && p0 > p2 && p0 > p3 && p0 > p4){
				textArea.append(" Precio mayor \t     : S/."+p0+"\n\n");
			}
			else if (p1 > p0 && p1 > p2 && p1 > p3 && p1 > p4){
				textArea.append(" Precio mayor \t     : S/."+p1+"\n\n");
			}
			else if (p2 > p0 && p2 > p1 && p2 > p3 && p2 > p4){
				textArea.append(" Precio mayor \t     : S/."+p2+"\n\n");
			}
			else if (p3 > p0 && p3 > p1 && p3 > p2 && p3 > p4){
				textArea.append(" Precio mayor \t     : S/."+p3+"\n\n");
			}
			else {
				textArea.append(" Precio mayor \t     : S/."+p4+"\n\n");
			}
			if (p0 < p1 && p0 < p2 && p0 < p3 && p0 < p4){
				textArea.append(" Precio menor \t     : S/."+p0+"\n\n");
			}
			else if (p1 <p0 && p1 < p2 && p1 < p3 && p1 < p4){
				textArea.append(" Precio menor \t     : S/."+p1+"\n\n");
			}
			else if (p2 < p0 && p2 < p1 && p2 < p3 && p2 < p4){
				textArea.append(" Precio menor \t     : S/."+p2+"\n\n");
			}
			else if (p3 < p0 && p3 < p1 && p3 < p2 && p3 < p4){
				textArea.append(" Precio menor \t     : S/."+p3+"\n\n");
			}
			else {
				textArea.append(" Precio menor \t     : S/."+p4+"\n\n");
			}
			break;
		}
		
	}
}
