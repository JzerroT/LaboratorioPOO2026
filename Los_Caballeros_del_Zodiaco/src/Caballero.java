
public class Caballero 
{
	private String nombre;
	private int edadArmadura;
	private int maldad;
	private Constelacion constelacion;
	
	public Caballero(String nombre , int edadArmadura , int maldad , Constelacion constelacion)
	{
		this.nombre=nombre;
		this.edadArmadura = edadArmadura;
		this.maldad=maldad;
		this.constelacion=constelacion;
	}
	
	
	
	public boolean esPrecoz()
	{
		if(edadArmadura < 12)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean esPoderoso()
	{
		if (esPrecoz() && constelacion.getBandaCeleste())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean tieneConstelacionesCercanas()
	{
		if(constelacion.estaCercaDelSol())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String getNombre()
	{
		return nombre;
	}
	public int getEdadArmadura()
	{
		return edadArmadura;
	}
	public int getMaldad()
	{
		return maldad;
	}
	public Constelacion getC()
	{
		return constelacion;
	}



	


}
