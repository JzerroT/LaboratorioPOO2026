package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.Jugador;
import Modelo.TipoDeClase;
import Modelo.Equipamiento;
class JugadorTest 
{
	@Test
	void estaPreparadoTest_true()
	{
		Equipamiento e1 = new Equipamiento();
		e1.setNivelRareza(10);
		e1.setPrecioMercado(12000000);
		
		Jugador j1 = new Jugador();
		j1.setNivel(120);
		j1.setEquipamiento(e1);
		assertEquals(true , j1.estaPreparado());
	}
	
	@Test 
	void esVeteranoTest_true()
	{
		Jugador j1= new Jugador();
		j1.setAñosExperiencia(7);
		j1.setNivel(100);
		assertEquals(true , j1.esVeterano());
	}
	
	@Test
	void esPayToWinTest_true()
	{
		Equipamiento e1 = new Equipamiento();
		e1.setNivelRareza(10);
		e1.setPrecioMercado(12000000);
	
		Jugador j1 = new Jugador();
		j1.setAñosExperiencia(1);
		j1.setEquipamiento(e1);
		assertEquals(true ,j1.esPayToWin() );
	}
	
	@Test
	void esTanqueTest_true()
	{
		Equipamiento e1= new Equipamiento();
		e1.setNivelRareza(10);
		e1.setPrecioMercado(12000000);
		e1.setMedidorDefensa(120);
		
		Jugador j1 = new Jugador ();
		j1.setEquipamiento(e1);
	    assertEquals(true , j1.esTanque());
	}
	
	@Test
	void esNovatoTest_true()
	{
		Jugador j1 = new Jugador();
		j1.setNivel(12);
		assertEquals(true , j1.esNovato());
	}

	@Test
	void esAsesinoTest_true() 
	{
		Equipamiento e1 = new Equipamiento();
		e1.setNivelRareza(10);
		e1.setPrecioMercado(12000000);
		
		Jugador j1 = new Jugador();
		j1.setNivel(120);
		j1.setTipoDeClase(TipoDeClase.NINJA);;
		j1.setEquipamiento(e1);
		assertEquals(true, j1.esAsesino());
		
	}
	
	@Test
	void estaComplicadoTest_true()
	{
        Equipamiento e1= new Equipamiento();
		e1.setNivelRareza(2);
		e1.setDurabilidad(0);
		Jugador j1 = new Jugador();
		j1.setBalanceEconomico(9000);
		j1.setEquipamiento(e1);
		
		assertEquals(true , j1.estaComplicado());
	}
	
	
	

}
