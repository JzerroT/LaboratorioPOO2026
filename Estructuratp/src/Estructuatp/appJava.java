package Estructuatp;

import javax.swing.JFrame;

public class appJava {
	public static void main(String[] args) {
		
		JFrame marco = new JFrame();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setBounds(100,100,500,500);
		marco.setContentPane(new InvestigacionResumenPantalla(marco));
		marco.validate();
		
		
		}

}
