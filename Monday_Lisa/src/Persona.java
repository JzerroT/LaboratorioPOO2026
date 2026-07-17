
public class Persona 
{
	private int minutosDormidos;
	private int probabilidadLluvia;
	
	
	
	public Persona(int minutosDormidos , int probabilidadLluvia)
	{
		this.minutosDormidos = minutosDormidos;
		this.probabilidadLluvia = probabilidadLluvia;
	}
	
	public boolean sigoDurmiendo()
	{
		if (probabilidadLluvia>=(90))
		{
			return true;
		}
		else
		{
			return false;
		}
	
		
	}
	
	public boolean masLunesImposible()
	{
		if (sigoDurmiendo() == true && minutosDormidos<120)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void aplazarAlarma(int minutos)
	{
		minutosDormidos+=minutos;
	}

	


}
