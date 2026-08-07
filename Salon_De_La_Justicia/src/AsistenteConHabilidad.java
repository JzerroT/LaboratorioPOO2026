
public class AsistenteConHabilidad extends Asistente {

	public AsistenteConHabilidad(String nombre, int sueldoBase)
	{
		super(nombre, sueldoBase);
		// TODO Auto-generated constructor stub
	}
	
	public float sueldo()
	{
		return getSueldoBase() *1.2f;
	}

}
