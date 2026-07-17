package Modelo;

public class Equipamiento 
{
	private int medidorDefensa;
	private int nivelRareza;
	private int precioMercado;
	private int durabilidad;
	
	public Equipamiento(int medidorDefensa , int nivelRareza , int precioMercado , int durabilidad)
	{
		this.medidorDefensa= medidorDefensa;
		this.nivelRareza=nivelRareza;
		this.precioMercado=precioMercado;
		this.durabilidad=durabilidad;
	}
	public Equipamiento ()
	{
		
	}
	
	public boolean esLegendario()
	{
		if ( nivelRareza == 10 && precioMercado > 5000000 )
		{
			return true;
		}
		return false;
	}
	
	public boolean esDeBajaCalidad()
	{
		if(nivelRareza < 3 && durabilidad == 0)
		{
			return true;
		}
		return false;
	}
	
	public boolean esOfensivo()
	{
		if(medidorDefensa < 50 )
		{
			return true;
		}
		return false;
		
	}
	
	public boolean esDefensivo()
	{
		if(medidorDefensa > 100)
		{
			return true;
		}
		return false;
	}
	
	
	public void setNivelRareza(int nivelRareza)
	{
		this.nivelRareza=nivelRareza;
	}
	public void setPrecioMercado(int precioMercado)
	{
		this.precioMercado=precioMercado;
	}
	
	public void setMedidorDefensa(int medidorDefensa)
	{
		this.medidorDefensa=medidorDefensa;
	}
	public void setDurabilidad(int durabilidad)
	{
		this.durabilidad=durabilidad;
	}


}
