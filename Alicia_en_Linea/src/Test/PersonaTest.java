package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import Modelo.Personaje;
class PersonaTest 
{

	@Test
	void estaEnElMundoMaravillaTest_True() 
	{
		Personaje p1 = new Personaje();
		p1.setUbicacion(-50);
		assertEquals(true , p1.estaEnElMundoMaravilla());
	}
	@Test
	void embellecerTest()
	{
		Personaje p1 = new Personaje();
		
		p1.setLocura(70);
		p1.setSecreto(100);
		
		p1.embellecer(20);
		
		assertEquals(90 , p1.getNivelLocura());
		
		assertEquals(90 , p1.getSecreto());
		
	}
	
	@Test
	void esLindo()
	{
		Personaje barbie = new Personaje();
		barbie.setUbicacion(-5);
		barbie.setLocura(90);
		assertEquals(true , barbie.esLindo());
		
	}
	@Test
	void esNormal()
	{
		Personaje ken = new Personaje ();
		ken.setLocura(1);
		ken.setSecreto(500);
		assertEquals( true , ken.esNormal());
		
		
	}
}
