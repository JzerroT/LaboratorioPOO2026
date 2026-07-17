package Modelo;


public class Pasajero 
{
	private int minutosEsperados;
	private boolean tieneCompromisoImportante;
	private int precioPasaje;
	
	public Pasajero(int minutosEsperados , int precioPasaje , boolean tieneCompromisoImportante)
	{
		this.minutosEsperados=minutosEsperados;
		this.tieneCompromisoImportante = tieneCompromisoImportante;
		this.precioPasaje = precioPasaje;
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
