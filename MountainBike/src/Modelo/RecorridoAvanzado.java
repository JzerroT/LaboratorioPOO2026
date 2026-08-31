package Modelo;

public class RecorridoAvanzado extends Recorrido
{
	private int obstaculos;

	public RecorridoAvanzado(float distancia, int obstaculos) {
		super(distancia);
		this.obstaculos=obstaculos;
		
	}

	@Override
	public float tiempoEstimado() {
		float tiempo = (getDistancia()/20)*obstaculos;
		return tiempo;
	}

	@Override
	public float puntajeQueDa() {
		float puntaje = getDistancia() * 0.5f;
		return puntaje;
	}
	
	
}
