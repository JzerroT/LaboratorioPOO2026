import Modelo.Hogar.ArmadorDeCasa;
import Modelo.Hogar.Casa;
import Modelo.Hogar.Persona;
import Modelo.Muebles.Mueble;
import Modelo.Tipos.Zona;
import Vista.MenuConsola;

/**
 * Punto de entrada: coordina el modelo (Casa, Persona, Muebles) con la vista
 * (MenuConsola). No imprime nada por su cuenta ni conoce como se dibuja el menu.
 */
public class App 
{
	public static void main(String[] args) 
	{
		Casa casa = ArmadorDeCasa.casaDeEjemplo();
		Persona persona = new Persona("Martin", casa);
		MenuConsola menu = new MenuConsola();

		menu.mostrarBienvenida(casa);

		while (!persona.estaDormida()) 
		{
			menu.mostrarEstado(persona);

			Zona zona = menu.elegirZona();
			if (zona == null) 
			{
				break;
			}
			menu.mostrarResultado(persona.irA(zona));

			Mueble mueble = menu.elegirMueble(casa, zona);
			if (mueble == null) 
			{
				continue;
			}

			String accion = menu.elegirAccion(mueble);
			if (accion == null) 
			{
				continue;
			}

			menu.mostrarResultado(persona.usarMueble(mueble, accion));
		}

		menu.mostrarCierre(persona, casa);
	}
}
