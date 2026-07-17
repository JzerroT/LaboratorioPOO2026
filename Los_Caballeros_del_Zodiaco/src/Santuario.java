import java.util.ArrayList;
public class Santuario 
{
	private ArrayList<Caballero> santuario = new ArrayList<>();
	
	
	public void agregarPersonaje(Caballero c )
	{
		santuario.add(c);
	}
	
	
	
	public Caballero menosMalvado()
	{
		Caballero menosMalvado = santuario.get(0);
		
		for(Caballero c: santuario)
		{
			if(c.getMaldad() < menosMalvado.getMaldad())
			{
				menosMalvado = c;
			}
		}
		return menosMalvado;
	}
	
	public double porcentajePrecoces()
	{
		int contador=0;
		for(Caballero c: santuario)
		{
			contador++;
		}
		double porcentaje = (contador *100) /santuario.size();
		return porcentaje;
	}
	
	public ArrayList<Caballero> masPoderosos()
	{
		ArrayList<Caballero> poderosos=new ArrayList<>();
		for(Caballero c:santuario)
		{
			if ( c.esPoderoso())
			{
				poderosos.add(c);
			}
		}
		return poderosos;
	}
	
	public ArrayList<Constelacion> Constelacionescercanas()
	{
		ArrayList<Constelacion> cercanas = new ArrayList<> ();
		for(Caballero c: santuario)
		{
			if(c.tieneConstelacionesCercanas())
			{
				cercanas.add(c.getC());
			}
		}
		return cercanas;
	}
	
 

}
