package ejercicio_procrastinar;

public class Persona{ 

	private String nombre;
	private int tareasPendientes;
	private static final int MAXIMO_TAREAS = 100;
	
	public Persona(String nombre , int tareasPendientes)
	{
		this.nombre = nombre;
		this.tareasPendientes = tareasPendientes;
	}
	
	public Persona (int tareasPendientes)
	{
		
		this.tareasPendientes = tareasPendientes;
	}
	
	public Persona(String nombre)
	{
		this.nombre = nombre;
	}
	
	
	
	public boolean cumplidora()
	{
		if (tareasPendientes == 0 )
		{
			return true;
			
		}	
		else
		{
			return false;
		}
	}
	
	public boolean procrastinadora()
	{
		
		if (tareasPendientes> (MAXIMO_TAREAS*0.8f))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void agendarTarea(int mastareas)
	{
		tareasPendientes += mastareas;
		
		
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	public int getTareasPendientes()
	{
		return tareasPendientes;
	}
	public void setTareasPendientes (int tareasPendientes)
	{
		this.tareasPendientes = tareasPendientes;
	}
	
	

	
}



