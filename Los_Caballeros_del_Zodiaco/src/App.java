
public class App {

	public static void main(String[] args) 
	{
		Santuario santuario = new Santuario();
		
		Constelacion leo = new Constelacion(1000000 , true);
		Constelacion cancer = new Constelacion(1500000 , false);
		
		Caballero yami = new Caballero("yami" , 11 , 75 , leo);
		Caballero jani = new Caballero("jani" , 5 , 100 , cancer);
		
		santuario.agregarPersonaje(jani);
		santuario.agregarPersonaje(yami);
		
		System.out.println(yami);
		System.out.println(jani);

		
		System.out.println(santuario.menosMalvado().getNombre());
		System.out.println(santuario.porcentajePrecoces());
		System.out.println(santuario.masPoderosos());	
		
		System.out.println(santuario.Constelacionescercanas());
 
	}

}
