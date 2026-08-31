package Modelo;
import java.util.ArrayList;
public class Carrera 
{
	ArrayList<Ciclista> ciclistas= new ArrayList<>();
	
	public void agregarCiclista(Ciclista ciclista) {
		ciclistas.add(ciclista);
	}
	
	public ArrayList<Ciclista> ciclistasConMasDe30p()
	{
		ArrayList<Ciclista> ciclistasCon30PMas= new ArrayList<>();
		for(Ciclista c: ciclistas)
		{
			if(c.cantidadPuntaje() > 30) 
			{
				ciclistasCon30PMas.add(c);
			}
		}
		return ciclistasCon30PMas;
	}
	
	public Ciclista clistaConMasTiempo() 
	{
		Ciclista masTiempo = ciclistas.get(0);
		
		for(Ciclista c: ciclistas)
		{
			if(c.cantidadTiempo()> masTiempo.cantidadTiempo()) 
			{
				masTiempo = c;
			}
		}
		return masTiempo;
	}
	
	public boolean hayCiclistasConMenos20Hs() 
	{
		for(Ciclista c: ciclistas) 
		{
			if(c.terminoEnMenosDe20Hs()) 
			{
				return true;
			}
		}
		return false;
	}
	
}
