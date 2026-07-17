
public class App {

	public static void main(String[] args) 
	{
		MiArrayList lista = new MiArrayList();
		lista.agregar(3);
		lista.agregar(2);
		lista.agregar(8);
		
		lista.borrar(2);
		
		lista.mostrar();
		System.out.println(lista.capacidad());

	}

}
