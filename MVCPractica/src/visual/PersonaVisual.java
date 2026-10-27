package visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.DAO;
import modelo.Persona;

public class PersonaVisual extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tablaPersona;
	private Object [] columnas = new Object[] {"Nombre", "Edad", "Nivel Estudios", "Hijos?", "DNI"};
	DefaultTableModel modelo;
	JScrollPane scrollPane;

	/**
	 * Create the panel.
	 */
	public PersonaVisual(JFrame pantalla) {
		setLayout(null);
		tablaPersona = new JTable();
		pantalla.setBounds(100,100,500,500);
		llenarTabla();
	}
	
	public void llenarTabla() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 61, 349, 164);
		add(scrollPane);
		modelo = new DefaultTableModel(columnas, 0);
		tablaPersona.setModel(modelo);
		scrollPane.setViewportView(tablaPersona);
		DAO d = new DAO();
		for(Persona p: d.consultar()) {
			p.getNacimiento().atStartOfDay();
			modelo.addRow(new Object[] {p.getNombre(), p.getNacimiento(), p.getTieneHijos(), p.getIdEstudio(), p.getDni()});
		}
		scrollPane.setVisible(true);
		scrollPane.validate();
	}
}
