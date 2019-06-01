package ll;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Proyecto extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntmConsultarColchn;
	private JMenuItem mntmSalir;
	private JMenuItem mntmModificarColchn;
	private JMenuItem mntmListarColchones;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuento;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarCantidad;
	private JMenuItem mntmConfigurarPremioSorpresa;
	private JMenuItem mntmAcercaDeTienda;

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
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		 
		mntmConsultarColchn = new JMenuItem("Consultar Colch\u00F3n");
		mntmConsultarColchn.addActionListener(this);
		mnMantenimiento.add(mntmConsultarColchn);
		 
		mntmModificarColchn = new JMenuItem("Modificar Colch\u00F3n");
		mntmModificarColchn.addActionListener(this);
		mnMantenimiento.add(mntmModificarColchn);
		 
		mntmListarColchones = new JMenuItem("Listar Colchones");
		mntmListarColchones.addActionListener(this);
		mnMantenimiento.add(mntmListarColchones);
		 
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		 
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		 
		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		 
		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		 
		mntmConfigurarDescuento = new JMenuItem("Configurar descuento");
		mntmConfigurarDescuento.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarDescuento);
		 
		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mntmConfigurarObsequio.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarObsequio);
		 
		mntmConfigurarCantidad = new JMenuItem("Configurar cantidad");
		mntmConfigurarCantidad.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarCantidad);
		 
		mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
		mntmConfigurarPremioSorpresa.addActionListener(this);
	    mnConfiguracin.add(mntmConfigurarPremioSorpresa);
		 
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		 
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmAcercaDeTienda(arg0);
		}
		if (arg0.getSource() == mntmConfigurarPremioSorpresa) {
			actionPerformedMntmConfigurarPremioSorpresa(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCantidad) {
			actionPerformedMntmConfigurarCantidad(arg0);
		}
		if (arg0.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(arg0);
		}
		if (arg0.getSource() == mntmConfigurarDescuento) {
			actionPerformedMntmConfigurarDescuento(arg0);
		}
		if (arg0.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(arg0);
		}
		if (arg0.getSource() == mntmVender) {
			actionPerformedMntmVender(arg0);
		}
		if (arg0.getSource() == mntmListarColchones) {
			actionPerformedMntmListarColchones(arg0);
		}
		if (arg0.getSource() == mntmModificarColchn) {
			actionPerformedMntmModificarColchn(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
		if (arg0.getSource() == mntmConsultarColchn) {
			actionPerformedMntmConsultarColchn(arg0);
		}
	}
	protected void actionPerformedMntmConsultarColchn(ActionEvent arg0) {
		ConsultarColchon CC = new ConsultarColchon();
		CC.setVisible(true);
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		System.exit(0);
	}
	protected void actionPerformedMntmModificarColchn(ActionEvent arg0) {
		ModificarColchones MC = new ModificarColchones();
		MC.setVisible(true);
	}
	protected void actionPerformedMntmListarColchones(ActionEvent arg0) {
		ListarColchones LC = new ListarColchones();
		LC.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent arg0) {
		Ventas V = new Ventas();
		V.setVisible(true);
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) {
		GenerarReportes GR = new GenerarReportes();
		GR.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarDescuento(ActionEvent arg0) {
		ConfigurarDescuento CD = new ConfigurarDescuento();
		CD.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarObsequio(ActionEvent arg0) {
		ConfigurarObsequio CO = new ConfigurarObsequio();
		CO.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarCantidad(ActionEvent arg0) {
		ConfigurarCantidad CC = new ConfigurarCantidad();
		CC.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarPremioSorpresa(ActionEvent arg0) {
		ConfigurarPremioSorpresa CPS = new ConfigurarPremioSorpresa();
		CPS.setVisible(true);
	}
	protected void actionPerformedMntmAcercaDeTienda(ActionEvent arg0) {
		AcercaDeTienda AT = new AcercaDeTienda();
		AT.setVisible(true);
	}
}
