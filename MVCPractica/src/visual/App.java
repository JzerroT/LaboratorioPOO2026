package visual;

import java.time.LocalDate;

import javax.swing.JFrame;

import dao.DAO;
import modelo.Persona;

public class App {

	public static void main(String[] args) {
		JFrame pantalla = new JFrame();
		pantalla.setContentPane(new PantallaPrincipal(pantalla));
		pantalla.setVisible(true);
		pantalla.setBounds(100,100,500,500);
		pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pantalla.validate();
		LocalDate fecha = LocalDate.of(2008, 7, 18);
		Persona p = new Persona(2, "Thiago", fecha, false, 1, 48879154);
		DAO d = new DAO();
		//d.agregarPersonaPorParametro(p);

	}

}
