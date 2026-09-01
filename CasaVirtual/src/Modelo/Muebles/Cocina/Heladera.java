package Modelo.Muebles.Cocina;

import Modelo.Tipos.Calidad;
import Modelo.Tipos.Material;
import Modelo.Tipos.Posicion;
import Modelo.Tipos.Zona;
import java.util.ArrayList;

public class Heladera extends MuebleCocina 
{
	private ArrayList<String> comidas = new ArrayList<>();

	public Heladera(String nombre, Posicion posicion, Material material, Zona zona, Calidad calidad,
			float temperaturaMinima, float temperaturaMaxima) 
	{
		super(nombre, posicion, material, 1, zona, calidad, temperaturaMinima, temperaturaMaxima);
		encender();
		regularTemperatura(4);
		comidas.add("un tupper de milanesas");
		comidas.add("una porcion de tarta");
	}

	@Override
	public String[] accionesDisponibles() 
	{
		return new String[] { "sacar comida", "guardar comida", "dejar la puerta abierta", "golpear" };
	}

	@Override
	public String hacer(String accion) 
	{
		switch (accion) 
		{
			case "sacar comida":
				return sacarComida();
			case "guardar comida":
				return guardarComida("sobras");
			case "dejar la puerta abierta":
				return regularTemperatura(getTemperaturaMaxima() + 10);
			case "golpear":
				return romperPorDestruccionFisica();
			default:
				return "La heladera no sabe hacer eso.";
		}
	}

	@Override
	public String cocinar(String comida) 
	{
		return getNombre() + " no cocina, solo enfria " + comida + ".";
	}

	public String guardarComida(String comida) 
	{
		if (estaRoto()) 
		{
			return getNombre() + " esta rota, la comida se echa a perder.";
		}
		comidas.add(comida);
		usar();
		return "Guardaste " + comida + " en " + getNombre() + ".";
	}

	public String sacarComida() 
	{
		if (estaRoto()) 
		{
			return getNombre() + " esta rota (" + getMotivoRotura() + ").";
		}
		if (comidas.isEmpty()) 
		{
			return getNombre() + " esta vacia.";
		}
		String comida = comidas.remove(0);
		usar();
		return "Sacaste " + comida + " de " + getNombre() + ".";
	}

	public ArrayList<String> getComidas() { return comidas; }
}
