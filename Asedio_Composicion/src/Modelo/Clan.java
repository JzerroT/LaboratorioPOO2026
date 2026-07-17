package Modelo;
import java.util.ArrayList;
public class Clan 
{
	private ArrayList<Jugador> jugadores = new ArrayList<>();
	
	public Clan ()
	{
		
	}
	
	public void agregarJugador(Jugador j)
	{
		jugadores.add(j);
	}
	
	public ArrayList<Jugador> losVeteranos()
	{
		ArrayList<Jugador> veteranos = new ArrayList<>();
		for(Jugador j:jugadores)
		{
			if(j.esVeterano())
			{
				veteranos.add(j);
			}
		}
		return veteranos;
	}
	
	public ArrayList<Jugador> losPayToWin()
	{
		ArrayList<Jugador> payToWin = new ArrayList<>();
		for(Jugador j: jugadores)
		{
			if(j.esPayToWin())
			{
				payToWin.add(j);
			}
		}
		return payToWin;
	}
	
	public ArrayList<Jugador> losTanques()
	{
		ArrayList<Jugador> tanques = new ArrayList<>();
		for(Jugador j: jugadores)
		{
			if(j.esTanque())
			{
				tanques.add(j);
			}
		}
		return tanques;
	}
	
	public ArrayList<Jugador> losAsesinos()
	{
		ArrayList<Jugador> asesinos = new ArrayList<>();
		for (Jugador j: jugadores)
		{
			if(j.esAsesino())
			{
				asesinos.add(j);
			}
		}
		return asesinos;
	}
	
	public boolean hayGlassCanon()
	{
		for(Jugador j: jugadores)
		{
			if(j.getEquipamiento().esOfensivo())
			{
				return true;
			}
		}
		return false;
	}
	
	public int cantidadNovatos()
	{
		int cantidad = 0;
		for(Jugador j:jugadores)
		{
			if(j.esNovato())
			{
				cantidad++;
			}
		}
		return cantidad;
	}

}
