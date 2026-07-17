package Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.Aeropuerto;
import Modelo.Vuelo;
import Modelo.Pasajero;
class AeropuertoTest {

	@Test
	void laMasFuriosa() 
	{
		Aeropuerto aeropuerto = new Aeropuerto();
		
		Pasajero p1= new Pasajero(100 , 100 , true);
		Pasajero p2 = new Pasajero(120 , 90 , false);
		
		Vuelo v1 = new Vuelo(100 , 1200);
		Vuelo v2 = new Vuelo(100 , 1200);
		
		v1.agregarPasajero(p1);
		v2.agregarPasajero(p2);
		
		aeropuerto.agregarVuelo(v1);
		aeropuerto.agregarVuelo(v2);
		
		assertEquals(p1 , aeropuerto.laMasFuriosa());
		
	}
	@Test 
	void vuelosLowCost()
	{
		Aeropuerto aeropuerto = new Aeropuerto();
		
		Pasajero p1= new Pasajero();
		Pasajero p2 = new Pasajero();
		p1.setMinutosEsperados(100);
		p2.setMinutosEsperados(120);
		
		Vuelo v1 = new Vuelo(90);
		Vuelo v2 = new Vuelo(80);
		
		
		v1.agregarPasajero(p1);
		v2.agregarPasajero(p2);
		
		aeropuerto.agregarVuelo(v1);
		aeropuerto.agregarVuelo(v2);
		
		ArrayList<Vuelo> valorEsperado = new ArrayList<>();
		valorEsperado.add(v1);
		valorEsperado.add(v2);
		
		assertEquals(valorEsperado , aeropuerto.vuelosLowCost());
		
				
	}

}
