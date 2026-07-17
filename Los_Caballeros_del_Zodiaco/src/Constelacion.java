
public class Constelacion 
{
	private int distancia;
	private boolean bandaCeleste;
	
	
	public Constelacion(int distancia , boolean bandaCeleste)
	{
		this.distancia = distancia;
		this.bandaCeleste = bandaCeleste;
	}
	
	public boolean estaCercaDelSol()
	{
		if(distancia < 1000000000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean getBandaCeleste()
	{
		return bandaCeleste;
	}


	

}
