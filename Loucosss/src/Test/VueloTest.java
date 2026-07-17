package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.Vuelo;
import Modelo.Pasajero;
class VueloTest {

	@Test
	void VueloDemorado() {
		Pasajero p1= new Pasajero();
		Pasajero p2 = new Pasajero();
		p1.setMinutosEsperados(100);
		p2.setMinutosEsperados(120);
		
		Vuelo v1 = new Vuelo(90);
		Vuelo v2 = new Vuelo(80);
		
		v1.agregarPasajero(p1);
		v2.agregarPasajero(p2);
		assertEquals(true , v1.estaDemorado());
		assertEquals(true , v2.estaDemorado());
		
	}

}
