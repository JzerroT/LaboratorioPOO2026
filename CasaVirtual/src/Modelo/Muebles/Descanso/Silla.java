package Modelo.Muebles.Descanso;

import Modelo.Tipos.Calidad;
import Modelo.Tipos.Material;
import Modelo.Tipos.Posicion;
import Modelo.Tipos.Zona;

public class Silla extends MuebleDescanso 
{
	public Silla(String nombre, Posicion posicion, Material material, Zona zona, Calidad calidad,
			int comodidad, float cargaMaximaKg, int proteccionFrio) 
	{
		super(nombre, posicion, material, 1, zona, calidad, comodidad, cargaMaximaKg, proteccionFrio);
	}

	@Override
	public String[] accionesDisponibles() 
	{
		return new String[] { "sentarse", "pararse encima", "limpiar" };
	}

	@Override
	public String hacer(String accion) 
	{
		switch (accion) 
		{
			case "sentarse":
				return usar() + " Te sentas un rato.";
			case "pararse encima":
				return romperPorExcesoDeCarga(getCargaMaximaKg() + 20);
			case "limpiar":
				limpiarse();
				return "Limpiaste " + getNombre() + ".";
			default:
				return "La silla no sabe hacer eso.";
		}
	}
}
