package Modelo;

import java.util.ArrayList;
public class Aeropuerto 
{
	private ArrayList<Vuelo> vuelos = new ArrayList<>();
	
	public Aeropuerto()
	{
		
	}
	
	public void agregarVuelo(Vuelo v)
	{
		vuelos.add(v);
	}
	
	public ArrayList<Vuelo> vuelosLowCost()
	{
		ArrayList<Vuelo> lowCost = new ArrayList<>();
		for(Vuelo v : vuelos)
		{
			if (v.estaDemorado() && v.getCapacidad() < 100)
			{
				lowCost.add(v);
			}
		}
		return lowCost;
	}
	
	public Pasajero laMasFuriosa()
	{
		Pasajero laMasFuriosa = vuelos.get(0).furiosaVuelo();
		
		for (Vuelo v: vuelos)
		{
			Pasajero furiosaVuelo = v.furiosaVuelo();
			if (laMasFuriosa.getminutosEsperados()< furiosaVuelo.getminutosEsperados())
			{
				laMasFuriosa = furiosaVuelo;
			}
			
		}
		return laMasFuriosa;
	}
	
	public double recaudacionTotal()
	{
		int recaudacion = 0;
		
		for(Vuelo v: vuelos)
		{
			recaudacion += v.recaudacion();
		}
		return recaudacion;
	}

	

}
