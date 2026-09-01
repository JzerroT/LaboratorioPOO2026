package Vista;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Hogar.Casa;
import Modelo.Hogar.Persona;
import Modelo.Muebles.Mueble;
import Modelo.Tipos.Zona;

/**
 * Unica clase que habla con el usuario: el modelo no imprime ni lee nada.
 */
public class MenuConsola 
{
	private Scanner teclado = new Scanner(System.in);

	public void mostrarBienvenida(Casa casa) 
	{
		System.out.println("=== " + casa.getNombre() + " ===");
		System.out.println("El programa termina cuando la persona se va a dormir en su cama.");
	}

	public void mostrarEstado(Persona persona) 
	{
		System.out.println("\n" + persona.estado());
	}

	public void mostrarResultado(String texto) 
	{
		System.out.println("-> " + texto);
	}

	public Zona elegirZona() 
	{
		Zona[] zonas = Zona.values();
		System.out.println("A donde queres ir?");
		for (int i = 0; i < zonas.length; i++) 
		{
			System.out.println("  " + (i + 1) + ") Ir a " + zonas[i]);
		}
		System.out.println("  0) Terminar el programa");

		int opcion = leerOpcion(0, zonas.length);
		if (opcion == 0) 
		{
			return null;
		}
		return zonas[opcion - 1];
	}

	public Mueble elegirMueble(Casa casa, Zona zona) 
	{
		ArrayList<Mueble> muebles = casa.mueblesDe(zona);
		if (muebles.isEmpty()) 
		{
			System.out.println("No hay muebles en " + zona + ".");
			return null;
		}

		System.out.println("Muebles en " + zona + ":");
		for (int i = 0; i < muebles.size(); i++) 
		{
			System.out.println("  " + (i + 1) + ") Usar " + muebles.get(i).getNombre()
					+ "  -> " + muebles.get(i).descripcion());
		}
		System.out.println("  0) Volver");

		int opcion = leerOpcion(0, muebles.size());
		if (opcion == 0) 
		{
			return null;
		}
		return muebles.get(opcion - 1);
	}

	public String elegirAccion(Mueble mueble) 
	{
		String[] acciones = mueble.accionesDisponibles();
		System.out.println("Que desea hacer con " + mueble.getNombre() + "?");
		for (int i = 0; i < acciones.length; i++) 
		{
			System.out.println("  " + (i + 1) + ") " + acciones[i]);
		}
		System.out.println("  0) Volver");

		int opcion = leerOpcion(0, acciones.length);
		if (opcion == 0) 
		{
			return null;
		}
		return acciones[opcion - 1];
	}

	public void mostrarCierre(Persona persona, Casa casa) 
	{
		System.out.println("\n" + persona.resumenDelDia());
		System.out.println("Muebles rotos en la casa: " + nombresDe(casa.mueblesRotos()));
		System.out.println("Muebles sucios en la casa: " + nombresDe(casa.mueblesSucios()));
		System.out.println("Buenas noches, " + persona.getNombre() + ".");
	}

	private int leerOpcion(int minimo, int maximo) 
	{
		while (true) 
		{
			System.out.print("Opcion: ");
			if (!teclado.hasNextLine()) 
			{
				return 0;
			}
			String linea = teclado.nextLine().trim();
			try 
			{
				int opcion = Integer.parseInt(linea);
				if (opcion >= minimo && opcion <= maximo) 
				{
					return opcion;
				}
			} 
			catch (NumberFormatException e) 
			{
				// se vuelve a pedir
			}
			System.out.println("Opcion invalida, elegi entre " + minimo + " y " + maximo + ".");
		}
	}

	private String nombresDe(ArrayList<Mueble> muebles) 
	{
		if (muebles.isEmpty()) 
		{
			return "ninguno";
		}
		StringBuilder sb = new StringBuilder();
		for (Mueble m : muebles) 
		{
			if (sb.length() > 0) sb.append(", ");
			sb.append(m.getNombre());
		}
		return sb.toString();
	}
}
