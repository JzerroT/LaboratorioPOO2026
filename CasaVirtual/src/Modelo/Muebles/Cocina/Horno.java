package Modelo.Muebles.Cocina;

import Modelo.Tipos.Calidad;
import Modelo.Tipos.Material;
import Modelo.Tipos.Posicion;
import Modelo.Tipos.Zona;

public class Horno extends MuebleCocina 
{
	private boolean hornallaEncendida;

	public Horno(String nombre, Posicion posicion, Material material, Zona zona, Calidad calidad,
			float temperaturaMinima, float temperaturaMaxima) 
	{
		super(nombre, posicion, material, 1, zona, calidad, temperaturaMinima, temperaturaMaxima);
		this.hornallaEncendida = false;
	}

	@Override
	public String[] accionesDisponibles() 
	{
		return new String[] { "encender", "apagar", "cocinar", "subir al maximo", "patear" };
	}

	@Override
	public String hacer(String accion) 
	{
		switch (accion) 
		{
			case "encender":
				hornallaEncendida = !estaRoto();
				return encender();
			case "apagar":
				hornallaEncendida = false;
				return apagar();
			case "cocinar":
				return cocinar("una pizza casera");
			case "subir al maximo":
				return regularTemperatura(getTemperaturaMaxima() + 100);
			case "patear":
				return romperPorDestruccionFisica();
			default:
				return "El horno no sabe hacer eso.";
		}
	}

	@Override
	public String cocinar(String comida) 
	{
		if (estaRoto()) 
		{
			return getNombre() + " esta roto (" + getMotivoRotura() + "), no cocina.";
		}
		if (!estaEncendido()) 
		{
			return getNombre() + " esta apagado, primero hay que encenderlo.";
		}
		usar();
		regularTemperatura(180);
		return "Cocinaste " + comida + " en " + getNombre() + " a " + getTemperaturaActual() + " grados.";
	}

	public boolean estaLaHornallaEncendida() { return hornallaEncendida; }
}
