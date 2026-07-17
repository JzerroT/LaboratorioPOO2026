package Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Equipamiento;
import Modelo.Jugador;
import Modelo.TipoDeClase;
import Modelo.Clan;
class ClanTest 
{
	@Test
	void losVeretanosTest_valorEsperado()
	{
		Clan clan = new Clan();
		Jugador j1= new Jugador();
		j1.setAñosExperiencia(7);
		j1.setNivel(100);
		clan.agregarJugador(j1);
		ArrayList<Jugador> valorEsperado= new ArrayList<>();
		valorEsperado.add(j1);
		assertEquals(valorEsperado , clan.losVeteranos());
	}
	
	@Test
	void losPayToWinTest_valorEsperado()
	{
		Clan clan = new Clan();
		Equipamiento e1 = new Equipamiento();
		e1.setNivelRareza(10);
		e1.setPrecioMercado(12000000);
	
		Jugador j1 = new Jugador();
		j1.setAñosExperiencia(1);
		j1.setEquipamiento(e1);
		
		clan.agregarJugador(j1);
		
		ArrayList<Jugador> valorEsperado = new ArrayList<>();
		valorEsperado.add(j1);
		assertEquals(valorEsperado , clan.losPayToWin());
		
	}
	
	@Test
	void losTanquesTest_valorEsperado()
	{
		Clan clan = new Clan();
		Equipamiento e1= new Equipamiento();
		e1.setNivelRareza(10);
		e1.setPrecioMercado(12000000);
		e1.setMedidorDefensa(120);
		
		Jugador j1 = new Jugador ();
		j1.setEquipamiento(e1);
		
		clan.agregarJugador(j1);
		
		ArrayList<Jugador> valorEsperado = new ArrayList<>();
		valorEsperado.add(j1);
		assertEquals(valorEsperado , clan.losTanques());
	}
	

	@Test
	void losAsesinosTest_valorEsperado() 
	{
		Clan clan = new Clan();
		Equipamiento e1 = new Equipamiento();
		e1.setNivelRareza(10);
		e1.setPrecioMercado(12000000);
		
		Jugador j1 = new Jugador();
		j1.setNivel(120);
		j1.setTipoDeClase(TipoDeClase.NINJA);;
		j1.setEquipamiento(e1);
		
		clan.agregarJugador(j1);
		
		ArrayList<Jugador> valorEsperado = new ArrayList<>();
		valorEsperado.add(j1);
		assertEquals(valorEsperado , clan.losAsesinos());
	}
	
	@Test
	void hayGlassCanonTest_true()
	{
		Clan clan = new Clan();
		Equipamiento e1 = new Equipamiento();
		e1.setMedidorDefensa(35);
		
		Jugador j1 = new Jugador();
		j1.setEquipamiento(e1);
		
		clan.agregarJugador(j1);
		
		assertEquals(true , clan.hayGlassCanon());
		
	}
	
	@Test
	void cantidadNovatosTest_1()
	{
		Clan clan = new Clan();
        Jugador j1 = new Jugador();
		
		j1.setNivel(12);
		
		clan.agregarJugador(j1);
		
		assertEquals(1 , clan.cantidadNovatos());
	}

}
