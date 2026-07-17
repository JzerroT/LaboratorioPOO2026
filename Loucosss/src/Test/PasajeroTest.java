package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Pasajero;

class PasajeroTest 
{

	@Test
	void esperaMasDe60Minutos() {
		Pasajero p1= new Pasajero();
		Pasajero p2 = new Pasajero();
		p1.setMinutosEsperados(100);
		p2.setMinutosEsperados(120);
		
		assertEquals(true , p1.esperaMasDe60Minutos());
		assertEquals(true , p2.esperaMasDe60Minutos());
		
		
	}

}
