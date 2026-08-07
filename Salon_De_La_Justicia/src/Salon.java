import java.util.ArrayList;
public class Salon 
{
	ArrayList<Superheroe> superheroes = new ArrayList<>();
	
	public Salon()
	{
		
	}
	
	public void agregarSuperheroe(Superheroe s)
	{
		superheroes.add(s);
	}
	
	public ArrayList<Superheroe> losQueTienenMasDe3Asistentes()
	{
		ArrayList<Superheroe> conMasAsistentes = new ArrayList<>();
		for ( Superheroe s: superheroes)
		{
			if(s.tieneMasDe3Asistentes())
			{
				conMasAsistentes.add(s);
			}
		}
		
		return conMasAsistentes;
		
	}
	
	public ArrayList<Superheroe> losQueNoLleganAFinDeMes()
	{
		ArrayList<Superheroe> pobres = new ArrayList<>();
		
		for (Superheroe s:superheroes)
		{
			if(s.llegaAFinDeMes() == false)
			{
				pobres.add(s);
			}
			
		}
		return pobres;
	}
	
	public float presupuestoInsumos()
	{
		int restantes = 0;
		for(Superheroe s: superheroes)
		{
			restantes += s.restante();
		}
		return restantes;
	}
	
	public int cantidadAsistentesQueGananMasDe60000()
	{
		int cantidad = 0;
		for(Superheroe s: superheroes)
		{
			cantidad += s.cantidadAsistentesCobranMasDe60000();
		
		}
		return cantidad;
	}

}
