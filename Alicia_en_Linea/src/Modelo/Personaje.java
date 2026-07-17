package Modelo;

public class Personaje 
{
	private int secreto;
	private int ubicacion;
	private int nivelLocura;
	private static final int MAXIMO_LOCURA=100;
	
	public Personaje(int secreto , int ubicacion , int nivelLocura)
	{
		this.secreto = secreto;
		this.ubicacion = ubicacion;
		this.nivelLocura = nivelLocura;
	}
	
	public Personaje()
	{
		
	}
	
	public void embellecer(int locura)
	{
		nivelLocura += locura;
		secreto -= 10;
	}
	
	public boolean estaEnElMundoMaravilla()
	{
		if (ubicacion < 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean esLindo()
	{
		if (nivelLocura > (MAXIMO_LOCURA*0.75f) && estaEnElMundoMaravilla()==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean esNormal()
	{
		if (nivelLocura < 10 && secreto >= 500)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getSecreto()
	{
		return secreto;
	}
	
	public int getUbicacion()
	{
		return ubicacion;
	}
	public int getNivelLocura()
	{
		return nivelLocura;
	}
	
	public void setUbicacion(int ubicacion)
	{
		this.ubicacion=ubicacion;
		
	}
	public void setLocura(int nivelLocura)
	{
		this.nivelLocura=nivelLocura;
	}
	public void setSecreto (int secreto)
	{
		this.secreto=secreto;
	}
	

}
