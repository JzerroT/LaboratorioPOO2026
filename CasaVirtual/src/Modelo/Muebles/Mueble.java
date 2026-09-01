package Modelo.Muebles;

import Modelo.Tipos.Calidad;
import Modelo.Tipos.Material;
import Modelo.Tipos.Posicion;
import Modelo.Tipos.Zona;

public abstract class Mueble 
{
	private String nombre;
	private Posicion posicion;
	private Material material;
	private int capacidadPersonas;
	private int personasUsando;
	private Zona zona;
	private Calidad calidad;
	private boolean limpio;
	private boolean roto;
	private String motivoRotura;

	public Mueble(String nombre, Posicion posicion, Material material, int capacidadPersonas, Zona zona, Calidad calidad) 
	{
		this.nombre = nombre;
		this.posicion = posicion;
		this.material = material;
		this.capacidadPersonas = capacidadPersonas;
		this.personasUsando = 0;
		this.zona = zona;
		this.calidad = calidad;
		this.limpio = true;
		this.roto = false;
		this.motivoRotura = "";
	}

	// ---------- funciones basicas: todos los muebles las tienen ----------

	public String usar() 
	{
		if (roto) 
		{
			return nombre + " esta roto (" + motivoRotura + "), no se puede usar.";
		}
		if (personasUsando >= capacidadPersonas) 
		{
			return nombre + " ya esta ocupado por " + personasUsando + " persona(s).";
		}
		personasUsando++;
		ensuciarse();
		return "Estas usando " + nombre + ".";
	}

	public void dejarDeUsar() 
	{
		if (personasUsando > 0) 
		{
			personasUsando--;
		}
	}

	public void mover(float x, float y, float z) 
	{
		this.posicion = new Posicion(x, y, z);
	}

	public void ensuciarse() 
	{
		this.limpio = false;
	}

	public void limpiarse() 
	{
		this.limpio = true;
	}

	public void romperse(String motivo) 
	{
		this.roto = true;
		this.motivoRotura = motivo;
	}

	// ---------- cada tipo de mueble define sus funciones especificas ----------

	public abstract String[] accionesDisponibles();

	public abstract String hacer(String accion);

	// ---------- consultas ----------

	public String descripcion() 
	{
		String estado = roto ? "ROTO" : (limpio ? "limpio" : "sucio");
		return nombre + " [" + zona + "] material=" + material + " calidad=" + calidad
				+ " capacidad=" + capacidadPersonas + " pos=" + posicion + " estado=" + estado;
	}

	public String getNombre() { return nombre; }
	public Posicion getPosicion() { return posicion; }
	public Material getMaterial() { return material; }
	public int getCapacidadPersonas() { return capacidadPersonas; }
	public int getPersonasUsando() { return personasUsando; }
	public Zona getZona() { return zona; }
	public Calidad getCalidad() { return calidad; }
	public boolean estaLimpio() { return limpio; }
	public boolean estaRoto() { return roto; }
	public String getMotivoRotura() { return motivoRotura; }
}
