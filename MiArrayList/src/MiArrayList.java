
public class MiArrayList 
{
	private int [] lista= new int [0];
	private int tamaño=0;
	
	public MiArrayList ()
	{
		
	}
	
	public void agregar(int numero)
	{
		if (tamaño==lista.length)
		{
			int [] nuevo = new int [lista.length+1];
			for(int i = 0; i < tamaño ; i++)
			{
				nuevo[i] = lista[i];
			}
			lista=nuevo;
		}
		lista[tamaño] = numero;
		tamaño++;
	}
	
	public void borrar(int indice)
	{
		if (indice >= 0 && indice < tamaño)
		{
			int [] nuevo = new int [tamaño-1];
			for(int i = 0; i < indice; i++)
			{
				nuevo[i] = lista[i];
			}
			
			for(int i = indice + 1; i<tamaño; i++)
			{
				nuevo[i-1] = lista[i];
			}
			lista = nuevo;
			tamaño--;
		}
	}
	
	public int sumar()
	{
		int suma = 0;
		for(int i = 0; i < tamaño; i++)
		{
			suma+=lista[i];
		}
		return suma;
	}
	
	public void mostrar()
	{
		for (int i = 0; i < tamaño; i++)
		{
			System.out.println(lista[i] + " ");
		}
	}
	
	public int capacidad()
	{
		return tamaño;
	}

}
