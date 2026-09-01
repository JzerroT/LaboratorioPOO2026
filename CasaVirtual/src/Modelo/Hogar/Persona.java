package Modelo.Hogar;

import Modelo.Muebles.Mueble;
import Modelo.Tipos.Zona;
import java.util.ArrayList;

public class Persona 
{
	private String nombre;
	private Casa casa;
	private Zona zonaActual;
	private int energia;   // 0 a 100
	private int hambre;    // 0 a 100 (100 = muerto de hambre)
	private boolean dormida;
	private ArrayList<String> bitacoraDelDia = new ArrayList<>();

	public Persona(String nombre, Casa casa) 
	{
		this.nombre = nombre;
		this.casa = casa;
		this.zonaActual = Zona.DORMITORIO;
		this.energia = 60;
		this.hambre = 50;
		this.dormida = false;
	}

	public String irA(Zona zona) 
	{
		zonaActual = zona;
		energia = acotar(energia - 2);
		String texto = nombre + " fue a " + zona + ".";
		bitacoraDelDia.add(texto);
		return texto;
	}

	public String usarMueble(Mueble mueble, String accion) 
	{
		if (mueble.getZona() != zonaActual) 
		{
			return "Primero tenes que ir a " + mueble.getZona() + ".";
		}
		String resultado = mueble.hacer(accion);
		aplicarEfecto(mueble, accion);
		mueble.dejarDeUsar();
		bitacoraDelDia.add(resultado);
		return resultado;
	}

	private void aplicarEfecto(Mueble mueble, String accion) 
	{
		switch (accion) 
		{
			case "usar para siesta":
				energia = acotar(energia + 25);
				hambre = acotar(hambre + 5);
				break;
			case "usar para terminar el dia":
				if (!mueble.estaRoto()) 
				{
					dormir();
				}
				break;
			case "sentarse":
			case "sentarse a mirar tv":
			case "acostarse":
				energia = acotar(energia + 8);
				break;
			case "cocinar":
			case "calentar comida":
			case "sacar comida":
			case "recibir el pedido":
				hambre = acotar(hambre - 30);
				energia = acotar(energia - 5);
				break;
			case "pedir una pizza":
			case "llamar a un amigo":
				energia = acotar(energia - 3);
				break;
			default:
				energia = acotar(energia - 5);
				break;
		}
	}

	public void dormir() 
	{
		dormida = true;
		energia = 100;
	}

	public String estado() 
	{
		return nombre + " | zona=" + zonaActual + " | energia=" + energia + " | hambre=" + hambre;
	}

	public String resumenDelDia() 
	{
		StringBuilder sb = new StringBuilder("== Un dia en la vida de " + nombre + " ==\n");
		for (int i = 0; i < bitacoraDelDia.size(); i++) 
		{
			sb.append("  ").append(i + 1).append(") ").append(bitacoraDelDia.get(i)).append("\n");
		}
		return sb.toString();
	}

	private int acotar(int valor) 
	{
		if (valor < 0) return 0;
		if (valor > 100) return 100;
		return valor;
	}

	public String getNombre() { return nombre; }
	public Casa getCasa() { return casa; }
	public Zona getZonaActual() { return zonaActual; }
	public int getEnergia() { return energia; }
	public int getHambre() { return hambre; }
	public boolean estaDormida() { return dormida; }
	public ArrayList<String> getBitacoraDelDia() { return bitacoraDelDia; }
}
