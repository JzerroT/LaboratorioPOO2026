package Modelo;

public class App {

	public static void main(String[] args) 
	{
		Mundo mundo = new Mundo();
		Personaje justin = new Personaje(440 , 200 , 100);
		justin.embellecer(25);
		Personaje barbie = new Personaje (500 , -3 , 120);
		barbie.embellecer(10);
		
		mundo.agregarPersonajes(barbie);
		mundo.agregarPersonajes(justin);
		
		System.out.println(barbie);
		System.out.println(justin);
		
		System.out.println(mundo.personajesLindos());
		System.out.println(mundo.hayPersonajesNormales());
		System.out.println(mundo.personajesEnMaravilla());
		System.out.println(mundo.personajeMasLoco());
		System.out.println(mundo.hayMasNormales());
 
        
       
	}

}
