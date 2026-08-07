
public class Asistente 
{
	private String nombre ;
	private int sueldoBase;
	
	public Asistente(String nombre , int sueldoBase)
	{
		this.nombre=nombre;
		this.sueldoBase=sueldoBase;
		
	}
	
	public float sueldo()
	{
		return sueldoBase;
	}
	
	public int getSueldoBase()
	{
		return sueldoBase;
	}
	
	public boolean sueldoMasDe60000()
	{
		return sueldo() > 60000;
	}

}
