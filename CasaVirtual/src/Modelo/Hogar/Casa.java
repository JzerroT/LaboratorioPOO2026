package Modelo.Hogar;

import Modelo.Muebles.Mueble;
import Modelo.Tipos.Zona;
import java.util.ArrayList;

public class Casa 
{
	private String nombre;
	private ArrayList<Mueble> muebles = new ArrayList<>();

	public Casa(String nombre) 
	{
		this.nombre = nombre;
	}

	public void agregarMueble(Mueble mueble) 
	{
		muebles.add(mueble);
	}

	public ArrayList<Mueble> mueblesDe(Zona zona) 
	{
		ArrayList<Mueble> deLaZona = new ArrayList<>();
		for (Mueble m : muebles) 
		{
			if (m.getZona() == zona) 
			{
				deLaZona.add(m);
			}
		}
		return deLaZona;
	}

	public Mueble buscarPorNombre(String nombre) 
	{
		for (Mueble m : muebles) 
		{
			if (m.getNombre().equalsIgnoreCase(nombre)) 
			{
				return m;
			}
		}
		return null;
	}

	public ArrayList<Mueble> mueblesRotos() 
	{
		ArrayList<Mueble> rotos = new ArrayList<>();
		for (Mueble m : muebles) 
		{
			if (m.estaRoto()) 
			{
				rotos.add(m);
			}
		}
		return rotos;
	}

	public ArrayList<Mueble> mueblesSucios() 
	{
		ArrayList<Mueble> sucios = new ArrayList<>();
		for (Mueble m : muebles) 
		{
			if (!m.estaLimpio() && !m.estaRoto()) 
			{
				sucios.add(m);
			}
		}
		return sucios;
	}

	public void limpiarLaCasa() 
	{
		for (Mueble m : muebles) 
		{
			m.limpiarse();
		}
	}

	public String getNombre() { return nombre; }
	public ArrayList<Mueble> getMuebles() { return muebles; }
}
