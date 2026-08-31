package Modelo;

public class RecorridoInt6ermedio extends Recorrido 
{
	private boolean esDescendente;

	public RecorridoInt6ermedio(float distancia, boolean esDescendente) {
		super(distancia);
		this.esDescendente=esDescendente;
		// TODO Auto-generated constructor stub
	}
	
	public float indiceObtenido() 
	{
		float indice=0;
		if(esDescendente) 
		{
			indice = 0.5f;
			return indice;
		}else 
		{
			indice = 1.5f;
			return indice;
		}
	}
	@Override
	public float tiempoEstimado() {
		float tiempo = (getDistancia()/25) * indiceObtenido();
		return tiempo;
		
		
	}

	@Override
	public float puntajeQueDa() {
		float puntaje = 1 + indiceObtenido();
		return puntaje;
		
	}

}
