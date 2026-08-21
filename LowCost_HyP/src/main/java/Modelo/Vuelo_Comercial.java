package Modelo;

public class Vuelo_Comercial extends Vuelo{
	public Vuelo_Comercial(int  capacidad , int consumoCombustible) {
		super(capacidad ,consumoCombustible);
	}
	public double recaudacion()
	{
		double recaudacion = (sumaDePasajes() +(sumaDePasajes() * 0.21f)) - getConsumoCombustible();
		return recaudacion;
	}
	
}
