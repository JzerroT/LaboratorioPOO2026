package Modelo.Muebles.Descanso;

import Modelo.Tipos.Calidad;
import Modelo.Tipos.Material;
import Modelo.Tipos.Posicion;
import Modelo.Tipos.Zona;

public class Sillon extends MuebleDescanso 
{
	public Sillon(String nombre, Posicion posicion, Material material, int capacidadPersonas,
			Zona zona, Calidad calidad, int comodidad, float cargaMaximaKg, int proteccionFrio) 
	{
		super(nombre, posicion, material, capacidadPersonas, zona, calidad, comodidad, cargaMaximaKg, proteccionFrio);
	}

	@Override
	public String[] accionesDisponibles() 
	{
		return new String[] { "sentarse a mirar tv", "acostarse", "limpiar" };
	}

	@Override
	public String hacer(String accion) 
	{
		switch (accion) 
		{
			case "sentarse a mirar tv":
				return usar() + " Mirar tv en " + getNombre() + " da comodidad " + getComodidad() + "/10.";
			case "acostarse":
				return usar() + " " + abrigar();
			case "limpiar":
				limpiarse();
				return "Limpiaste " + getNombre() + ".";
			default:
				return "El sillon no sabe hacer eso.";
		}
	}
}
