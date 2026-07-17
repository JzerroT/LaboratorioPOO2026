package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Equipamiento;

class EquipamientoTest {

	@Test
	void esLegendarioTest_true() 
	{
		Equipamiento e1 = new Equipamiento();
		e1.setNivelRareza(10);
		e1.setPrecioMercado(12000000);
		
		assertEquals(true , e1.esLegendario() );
	}
	
	@Test
	void esDeBajaCalidadTest_true()
	{
		Equipamiento e1= new Equipamiento();
		e1.setNivelRareza(2);
		e1.setDurabilidad(0);
		
		assertEquals(true, e1.esDeBajaCalidad());
	}
	
	@Test
	void esOfensivoTest_true()
	{
		Equipamiento e1 = new Equipamiento();
		e1.setMedidorDefensa(35);
		
		assertEquals(true , e1.esOfensivo());
	}
	
	@Test
	void esDefensivoTest_true()
	{
		Equipamiento e1 = new Equipamiento();
		e1.setMedidorDefensa(120);
		
		assertEquals(true , e1.esDefensivo());
	}
	
	

}
