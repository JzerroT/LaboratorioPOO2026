import java.util.ArrayList;
public class Superheroe 
{
	private String nombre;
	private float presupuesto;
	
	private ArrayList<Asistente> asistentes = new ArrayList<>();
	
	public Superheroe(String nombre , float presupuesto)
	{
		this.nombre=nombre;
		this.presupuesto=presupuesto;
	}
	
	public int cantidadAsistentes()
	{
		int cantidad = 0;
		for(Asistente a:asistentes)
		{
			cantidad++;
		}
		return cantidad;
	}
	
	public boolean tieneMasDe3Asistentes()
	{
		if (cantidadAsistentes() > 3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public float sueldoAPagar()
	{
		float sueldos = 0;
		for(Asistente s: asistentes)
		{
			sueldos += s.sueldo();
		}
		
		return sueldos;
	}
	public float restante ()
	{
		float restante = presupuesto - sueldoAPagar();
		return restante;
	}
	
	public boolean llegaAFinDeMes()
	{
		return presupuesto < sueldoAPagar();
	}
	
	public int cantidadAsistentesCobranMasDe60000()
	{
		int cantidad = 0;
		for(Asistente a:asistentes)
		{
			if(a.sueldoMasDe60000())
			{
				cantidad++;
			}
		}
		
		return cantidad;
	}
	


}
