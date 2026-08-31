package Modelo;
import java.util.ArrayList;
public class Ciclista 
{
	private String nombre;
	private int velocidadPromedio;
	ArrayList<Recorrido> recorridos= new ArrayList<>();
	
	public Ciclista(String nombre, int velocidadPromedio)
	{
		this.nombre=nombre;
		this.velocidadPromedio=velocidadPromedio;
	}
	
	public void agregarRecorrido(Recorrido recorrido) 
	{
		recorridos.add(recorrido);
	}
	
	public float cantidadPuntaje() 
	{
		float puntajeTotal=0;
		for(Recorrido r: recorridos)
		{
			puntajeTotal+=r.puntajeQueDa();
		}
		return puntajeTotal;
		
	}
	
	public float cantidadTiempo() 
	{
		float tiempoTotal=0;
		for(Recorrido r:recorridos)
		{
			tiempoTotal+=r.tiempoEstimado();
		}
		return tiempoTotal;
	}
	
	public float cantidadDistancia() 
	{
		float distanciaTotal=0;
		for(Recorrido r: recorridos) 
		{
			distanciaTotal+=r.getDistancia();
		}
		return distanciaTotal;
	}
	
	public boolean terminoEnMenosDe20Hs() 
	{
		if((cantidadDistancia()/velocidadPromedio) < 2 ) 
		{
			return true;
		}else {
			return false;
		}
	}
}
