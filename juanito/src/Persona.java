public class Persona 
{
	int capacidadEstomago;
	int cantidadDeComidaIngerida;
	
	
	public void comer(int cantidadAlimento)
	{
		if (TienePanzaLlena() == true)
		{
			System.out.println("No puede comer");
		}
		else
		{
			System.out.println("");
			cantidadDeComidaIngerida += cantidadAlimento;
			if (cantidadDeComidaIngerida > capacidadEstomago)
			{
				cantidadDeComidaIngerida = capacidadEstomago;
			}
		}
		
	}
	


	public boolean TienePanzaLlena()
	{
		if (cantidadDeComidaIngerida>=(capacidadEstomago*0.9f))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void digerir()
	{
		cantidadDeComidaIngerida = 0;
		
	}
	
	public void crecer()
	{
		capacidadEstomago += 5;
		
	}
	
	public void aprender()
	{
		if (TienePanzaLlena())
		{
			System.out.println("Aprendi");
		
		}
		else
		{
			System.out.println("No aprendi");
		}
	}
	
}
     

