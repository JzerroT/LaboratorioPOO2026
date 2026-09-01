package Modelo.Muebles.Cocina;

import Modelo.Muebles.Mueble;
import Modelo.Tipos.Calidad;
import Modelo.Tipos.Material;
import Modelo.Tipos.Posicion;
import Modelo.Tipos.Zona;

public abstract class MuebleCocina extends Mueble 
{
	private float temperaturaMaxima;
	private float temperaturaMinima;
	private float temperaturaActual;
	private boolean encendido;

	public MuebleCocina(String nombre, Posicion posicion, Material material, int capacidadPersonas,
			Zona zona, Calidad calidad, float temperaturaMinima, float temperaturaMaxima) 
	{
		super(nombre, posicion, material, capacidadPersonas, zona, calidad);
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
		this.temperaturaActual = 20;
		this.encendido = false;
	}

	public String encender() 
	{
		if (estaRoto()) 
		{
			return getNombre() + " esta roto (" + getMotivoRotura() + "), no enciende.";
		}
		encendido = true;
		return getNombre() + " encendido.";
	}

	public String apagar() 
	{
		encendido = false;
		temperaturaActual = 20;
		return getNombre() + " apagado.";
	}

	public String regularTemperatura(float temperatura) 
	{
		if (estaRoto()) 
		{
			return getNombre() + " esta roto, no responde.";
		}
		if (temperatura > temperaturaMaxima) 
		{
			return romperPorQuemaduraElectrica();
		}
		if (temperatura < temperaturaMinima) 
		{
			return getNombre() + " no puede bajar de " + temperaturaMinima + " grados.";
		}
		temperaturaActual = temperatura;
		return getNombre() + " ahora esta a " + temperaturaActual + " grados.";
	}

	// funciones especificas de los muebles de cocina
	public abstract String cocinar(String comida);

	public String romperPorQuemaduraElectrica() 
	{
		romperse("quemadura electrica por superar los " + temperaturaMaxima + " grados");
		encendido = false;
		return "ZAP! " + getNombre() + " se quemo electricamente.";
	}

	public String romperPorDestruccionFisica() 
	{
		romperse("destruccion fisica");
		encendido = false;
		return "CRASH! " + getNombre() + " quedo destruido fisicamente.";
	}

	public boolean estaEncendido() { return encendido; }
	public float getTemperaturaActual() { return temperaturaActual; }
	public float getTemperaturaMaxima() { return temperaturaMaxima; }
	public float getTemperaturaMinima() { return temperaturaMinima; }
}
