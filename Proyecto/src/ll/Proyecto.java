package ll;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Proyecto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto frame = new Proyecto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Proyecto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		 
		JMenuItem mntmConsultarColchn = new JMenuItem("Consultar Colch\u00F3n");
		mnMantenimiento.add(mntmConsultarColchn);
		 
		JMenuItem mntmModificarColchn = new JMenuItem("Modificar Colch\u00F3n");
		mnMantenimiento.add(mntmModificarColchn);
		 
		JMenuItem mntmListarColchones = new JMenuItem("Listar Colchones");
		mnMantenimiento.add(mntmListarColchones);
		 
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		 
		JMenuItem mntmVender = new JMenuItem("Vender");
		mnVentas.add(mntmVender);
		 
		JMenuItem mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mnVentas.add(mntmGenerarReportes);
		 
		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		 
		JMenuItem mntmConfigurarDescuento = new JMenuItem("Configurar descuento");
		mnConfiguracin.add(mntmConfigurarDescuento);
		 
		JMenuItem mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mnConfiguracin.add(mntmConfigurarObsequio);
		 
		JMenuItem mntmConfigurarCantidad = new JMenuItem("Configurar cantidad");
		mnConfiguracin.add(mntmConfigurarCantidad);
		 
		JMenuItem mntmColchonesVendidos = new JMenuItem("Colchones vendidos");
		mnConfiguracin.add(mntmColchonesVendidos);
		 
		JMenuItem mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
	    mnConfiguracin.add(mntmConfigurarPremioSorpresa);
		 
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		 
		JMenuItem mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mnAyuda.add(mntmAcercaDeTienda);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
