package Modelo.Muebles.Descanso;

import Modelo.Tipos.Calidad;
import Modelo.Tipos.Material;
import Modelo.Tipos.Posicion;
import Modelo.Tipos.Zona;

public class Cama extends MuebleDescanso 
{
	private boolean tendida;

	public Cama(String nombre, Posicion posicion, Material material, Zona zona, Calidad calidad,
			int comodidad, float cargaMaximaKg, int proteccionFrio) 
	{
		super(nombre, posicion, material, 2, zona, calidad, comodidad, cargaMaximaKg, proteccionFrio);
		this.tendida = true;
	}

	@Override
	public String[] accionesDisponibles() 
	{
		return new String[] { "usar para siesta", "usar para terminar el dia", "tender", "saltar encima" };
	}

	@Override
	public String hacer(String accion) 
	{
		switch (accion) 
		{
			case "usar para siesta":
				if (estaRoto()) return usar();
				return usar() + " Dormis una siesta con comodidad " + getComodidad() + "/10.";
			case "usar para terminar el dia":
				if (estaRoto()) return usar() + " No podes dormir aca.";
				return usar() + " Te acostas a dormir. " + abrigar();
			case "tender":
				tendida = true;
				limpiarse();
				return "Tendiste " + getNombre() + ".";
			case "saltar encima":
				ensuciarse();
				tendida = false;
				return romperPorExcesoDeCarga(getCargaMaximaKg() + 50);
			default:
				return "La cama no sabe hacer eso.";
		}
	}

	public boolean estaTendida() { return tendida; }
}
