package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Mundo;
import Modelo.Personaje;

import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Mundo personajes = new  Mundo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 15, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, contentPane);
		panel.setBackground(Color.CYAN);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, -5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 849, SpringLayout.WEST, contentPane);
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel = new JLabel("Crear Personaje");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 353, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, 73, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -274, SpringLayout.EAST, panel);
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 27));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Niv_Locura");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 115, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 111, SpringLayout.WEST, panel);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Secretos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 75, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel_1);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ubicación");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 88, SpringLayout.SOUTH, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel_1);
		panel.add(lblNewLabel_3);
		
		//Ubicacion
		JSpinner spinner = new JSpinner();
		sl_panel.putConstraint(SpringLayout.NORTH, spinner, -9, SpringLayout.NORTH, lblNewLabel_3);
		sl_panel.putConstraint(SpringLayout.WEST, spinner, 79, SpringLayout.EAST, lblNewLabel_3);
		sl_panel.putConstraint(SpringLayout.SOUTH, spinner, -81, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, spinner, 150, SpringLayout.EAST, lblNewLabel_3);
		panel.add(spinner);
		
		//Secretos
		JSpinner spinner_1 = new JSpinner();
		sl_panel.putConstraint(SpringLayout.NORTH, spinner_1, -9, SpringLayout.NORTH, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.WEST, spinner_1, 0, SpringLayout.WEST, spinner);
		sl_panel.putConstraint(SpringLayout.SOUTH, spinner_1, -65, SpringLayout.NORTH, spinner);
		sl_panel.putConstraint(SpringLayout.EAST, spinner_1, 0, SpringLayout.EAST, spinner);
		panel.add(spinner_1);
		
		//Niv_Locura
		JSpinner spinner_2 = new JSpinner();
		sl_panel.putConstraint(SpringLayout.NORTH, spinner_2, -11, SpringLayout.NORTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, spinner_2, 0, SpringLayout.WEST, spinner);
		sl_panel.putConstraint(SpringLayout.SOUTH, spinner_2, -54, SpringLayout.NORTH, spinner_1);
		sl_panel.putConstraint(SpringLayout.EAST, spinner_2, 0, SpringLayout.EAST, spinner);
		panel.add(spinner_2);
		
		JButton btnNewButton = new JButton("CrearPersonaje");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 136, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton, -271, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, -164, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, -136, SpringLayout.EAST, panel);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int niv_Locura = (int) spinner_2.getNextValue() - 1;
				int secretos = (int) spinner_1.getNextValue() - 1;
				int ubicacion = (int) spinner.getNextValue() - 1;
				
				Personaje random = new Personaje(secretos, ubicacion, niv_Locura);
				
				personajes.agregarPersonajes(random);
			}
		});
		panel.add(btnNewButton);
	}
}
