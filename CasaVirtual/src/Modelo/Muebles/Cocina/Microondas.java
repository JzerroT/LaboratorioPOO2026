package Modelo.Muebles.Cocina;

import Modelo.Tipos.Calidad;
import Modelo.Tipos.Material;
import Modelo.Tipos.Posicion;
import Modelo.Tipos.Zona;

public class Microondas extends MuebleCocina 
{
	private int potencia; // 1 a 10

	public Microondas(String nombre, Posicion posicion, Material material, Zona zona, Calidad calidad,
			float temperaturaMinima, float temperaturaMaxima, int potencia) 
	{
		super(nombre, posicion, material, 1, zona, calidad, temperaturaMinima, temperaturaMaxima);
		this.potencia = potencia;
	}

	@Override
	public String[] accionesDisponibles() 
	{
		return new String[] { "encender", "apagar", "calentar comida", "meter un tenedor" };
	}

	@Override
	public String hacer(String accion) 
	{
		switch (accion) 
		{
			case "encender":
				return encender();
			case "apagar":
				return apagar();
			case "calentar comida":
				return cocinar("un plato de comida");
			case "meter un tenedor":
				return romperPorQuemaduraElectrica();
			default:
				return "El microondas no sabe hacer eso.";
		}
	}

	@Override
	public String cocinar(String comida) 
	{
		if (estaRoto()) 
		{
			return getNombre() + " esta roto (" + getMotivoRotura() + "), no calienta.";
		}
		if (!estaEncendido()) 
		{
			return getNombre() + " esta apagado, primero hay que encenderlo.";
		}
		usar();
		regularTemperatura(70);
		return "Calentaste " + comida + " en " + getNombre() + " con potencia " + potencia + "/10.";
	}

	public int getPotencia() { return potencia; }
}
