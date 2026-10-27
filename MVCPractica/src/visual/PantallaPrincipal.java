package visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PantallaPrincipal(JFrame pantalla) {
		setLayout(null);
		
		JButton btnPersonaVisual = new JButton("Consultar Personas");
		btnPersonaVisual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setContentPane(new PersonaVisual(pantalla));
				pantalla.setVisible(true);
				pantalla.validate();
			}
		});
		btnPersonaVisual.setBounds(156, 85, 131, 23);
		add(btnPersonaVisual);
		
		JButton btn = new JButton("Agregar Persona");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setContentPane(new AgregarPersonaVisual(pantalla));
				pantalla.setVisible(true);
				pantalla.validate();
			}
		});
		btn.setBounds(149, 162, 149, 23);
		add(btn);
		pantalla.setBounds(100,100,500,500);
		
	}
}
