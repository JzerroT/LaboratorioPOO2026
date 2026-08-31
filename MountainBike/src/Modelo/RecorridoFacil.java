package Modelo;

public class RecorridoFacil extends Recorrido
{

	public RecorridoFacil(float distancia) {
		super(distancia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float tiempoEstimado() {
		float tiempo = getDistancia()/30;
		return tiempo;
	}

	@Override
	public float puntajeQueDa() {
		float puntaje = 1;
		return puntaje;
	}

}
