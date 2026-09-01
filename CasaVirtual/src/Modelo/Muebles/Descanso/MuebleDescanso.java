package Modelo.Muebles.Descanso;

import Modelo.Muebles.Mueble;
import Modelo.Tipos.Calidad;
import Modelo.Tipos.Material;
import Modelo.Tipos.Posicion;
import Modelo.Tipos.Zona;

public abstract class MuebleDescanso extends Mueble 
{
	private int comodidad;          // 1 a 10
	private float cargaMaximaKg;
	private int proteccionFrio;     // 1 a 10

	public MuebleDescanso(String nombre, Posicion posicion, Material material, int capacidadPersonas,
			Zona zona, Calidad calidad, int comodidad, float cargaMaximaKg, int proteccionFrio) 
	{
		super(nombre, posicion, material, capacidadPersonas, zona, calidad);
		this.comodidad = comodidad;
		this.cargaMaximaKg = cargaMaximaKg;
		this.proteccionFrio = proteccionFrio;
	}

	// funcion especifica de los muebles de descanso
	public String romperPorExcesoDeCarga(float pesoKg) 
	{
		if (pesoKg > cargaMaximaKg) 
		{
			romperse("exceso de carga: " + pesoKg + " kg sobre un maximo de " + cargaMaximaKg + " kg");
			return "CRACK! " + getNombre() + " se rompio por exceso de carga.";
		}
		return getNombre() + " soporto " + pesoKg + " kg sin problemas.";
	}

	public String abrigar() 
	{
		if (estaRoto()) 
		{
			return getNombre() + " esta roto, no abriga nada.";
		}
		return getNombre() + " te abriga con una proteccion frente al frio de " + proteccionFrio + "/10.";
	}

	public int getComodidad() { return comodidad; }
	public float getCargaMaximaKg() { return cargaMaximaKg; }
	public int getProteccionFrio() { return proteccionFrio; }
}
