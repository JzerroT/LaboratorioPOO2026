package Modelo;

import java.util.ArrayList;
public class Vuelo 
{
	private Pasajero [] pasajeros;
	private int cantidadPasajeros = 0;
	private int capacidad;
	private int consumoCombustible;
	
	public Vuelo(int  capacidad , int consumoCombustible)
	{
		this.capacidad=capacidad;
		this.consumoCombustible = consumoCombustible;
		pasajeros = new Pasajero[capacidad];
	}
	
	public Vuelo(int capacidad)
	{
		this.capacidad = capacidad;
		pasajeros = new Pasajero[capacidad]; 
	}
	
	
	public void agregarPasajero(Pasajero p)
	{
		if ( cantidadPasajeros < capacidad)
		{
			pasajeros[cantidadPasajeros] = p;
			cantidadPasajeros++;
		}
	}

	public boolean estaDemorado()
	{
		for(int i = 0; i< cantidadPasajeros; i++)
		{
			if(pasajeros[i].esperaMasDe60Minutos() )
			{
				return true;
			}
		}
		return false;
	}
	
	public Pasajero furiosaVuelo()
	{
		Pasajero masEspera = pasajeros[0];
		
		for (int i = 0; i< cantidadPasajeros; i++)
		{
			if(pasajeros[i].getminutosEsperados() > masEspera.getminutosEsperados())
			{
				masEspera = pasajeros[i];
			}
		}
		return masEspera;
		
	}
	
	
	
	
	public double sumaDePasajes()
	{
		double suma=0;
		for(int i= 0 ; i < cantidadPasajeros; i++)
		{
			suma += pasajeros[i].getPrecioPasaje();
		}
		return suma;
	}
	public double recaudacion()
	{
		double recaudacion = (sumaDePasajes() +(sumaDePasajes() * 0.21f)) - consumoCombustible;
		return recaudacion;
	}
	
	public int getCapacidad()
	{
		return capacidad;
	}

}
