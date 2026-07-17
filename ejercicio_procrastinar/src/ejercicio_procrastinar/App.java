package ejercicio_procrastinar;

public class App 
{

	public static void main(String[] args) 
	{
		Persona yamile = new Persona ("Yamile ");
		yamile.setTareasPendientes(10);
		
		
		Persona janina = new Persona ("janina " , 90);
		
		Persona justin = new Persona (80);
		justin.setNombre("justin ");
		
		System.out.println(yamile.getNombre() + yamile.getTareasPendientes());
		System.out.println(janina.getNombre() + janina.getTareasPendientes());
		System.out.println(justin.getNombre() + justin.getTareasPendientes());
		
	}
	
	

}
