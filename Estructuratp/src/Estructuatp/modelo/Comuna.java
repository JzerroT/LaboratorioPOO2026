package Estructuatp.modelo;
import java.util.ArrayList;

public class Comuna {
	private int numeroComuna;
	private String sedeComunal;
	ArrayList <Barrio>barrios=new ArrayList<>();
	
	public Comuna (int numeroComuna, String sedeComunal) 
	{
		this.numeroComuna=numeroComuna;
		this.sedeComunal=sedeComunal;
		
	}
	
	public void agregarBarrios(Barrio b) 
	{
		barrios.add(b);
	}
	public int cantidadDeBarrios() 
	{
		for(Barrio b: barrios) {
		int cantidad = b.size();
		}
	}
	
	public boolean esAtencionPrioritaria() 
	{
		
	}

}
