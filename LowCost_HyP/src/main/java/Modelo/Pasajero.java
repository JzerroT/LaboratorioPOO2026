package Modelo;

public class Pasajero {
	private int minutosEsperados;
	private boolean tieneCompromisoImportante;
	private int precioPasaje;
	private boolean esVip;
	
	public Pasajero(int minutosEsperados , int precioPasaje , boolean tieneCompromisoImportante, boolean esVip)
	{
		this.minutosEsperados=minutosEsperados;
		this.tieneCompromisoImportante = tieneCompromisoImportante;
		this.precioPasaje = precioPasaje;
		this.esVip=esVip;
	}
	
	public Pasajero()
	{
		
	}
	
	
	
	public boolean esperaMasDe60Minutos()
	{
		if (minutosEsperados > 60)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean getEsVip()
	{
		return esVip;
	}
	
	public int getminutosEsperados()
	{
		return minutosEsperados;
	}
	
	public int getPrecioPasaje()
	{
		return precioPasaje;
	}
	
	public void setMinutosEsperados(int minutosEsperados)
	{
		this.minutosEsperados=minutosEsperados;
	}
}
