package Modelo;

public abstract class Recorrido
{
	private float distancia;
	
	public Recorrido(float distancia)
	{
		this.distancia=distancia;
	}
	
	public abstract float tiempoEstimado();
	public abstract float puntajeQueDa();
	
	public float getDistancia() 
	{
		return distancia;
	} 

}
