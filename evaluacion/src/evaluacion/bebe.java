package evaluacion;

public class bebe {

	private int hambre;
	private int sucio;
	
	public bebe(int hambre, int sucio) 
	{
		this.hambre = hambre;
		this.sucio = sucio;
		
	}
	
	public boolean estoyTranquilo() 
	{
		if(hambre <= 0 && estoyLimpio() == true)
		{
			return true;
		}else 
		{
			return false;
		}
		
	}
	
	public boolean estoyLimpio() 
	{
		if(sucio <= 10) 
		{
			return true;
		}else 
		{
			return false;
		}
			
	}
	
	public boolean duermo() 
	{
		if(estoyTranquilo() == true) 
		{
			return true;
			
		}else 
		{
			return false;
		}
		
	}
	
	public boolean lloro() 
	{
		if(hambre > 0 || estoyLimpio() == false) 
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	public void cuandoComo(int cantidadComida) 
	{
		hambre = hambre - cantidadComida;
		sucio = sucio + cantidadComida;
	}
	
	public boolean soyVigilante(boolean atento) 
	{
		if(estoyTranquilo() == true &&  atento == true) 
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	
}


