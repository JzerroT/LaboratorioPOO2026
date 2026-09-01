package Modelo.Hogar;

import Modelo.Muebles.Cocina.Heladera;
import Modelo.Muebles.Cocina.Horno;
import Modelo.Muebles.Cocina.Microondas;
import Modelo.Muebles.Comunicacion.Telefono;
import Modelo.Muebles.Descanso.Cama;
import Modelo.Muebles.Descanso.Silla;
import Modelo.Muebles.Descanso.Sillon;
import Modelo.Tipos.Calidad;
import Modelo.Tipos.Material;
import Modelo.Tipos.Posicion;
import Modelo.Tipos.Zona;

/**
 * Arma la casa de ejemplo: 3 muebles de descanso, 3 de cocina y el telefono.
 */
public class ArmadorDeCasa 
{
	public static Casa casaDeEjemplo() 
	{
		Casa casa = new Casa("Casa virtual de Martin");

		casa.agregarMueble(new Cama("Cama", new Posicion(1, 0, 4), Material.MADERA,
				Zona.DORMITORIO, Calidad.BUENA, 9, 200, 8));
		casa.agregarMueble(new Silla("Silla", new Posicion(3, 0, 2), Material.MADERA,
				Zona.COMEDOR, Calidad.MEDIA, 4, 120, 1));
		casa.agregarMueble(new Sillon("Sillon", new Posicion(0, 0, 6), Material.TELA, 3,
				Zona.LIVING, Calidad.BUENA, 8, 300, 6));

		casa.agregarMueble(new Horno("Horno", new Posicion(5, 0, 1), Material.METAL,
				Zona.COCINA, Calidad.MEDIA, 20, 250));
		casa.agregarMueble(new Heladera("Heladera", new Posicion(6, 0, 1), Material.METAL,
				Zona.COCINA, Calidad.BUENA, -18, 10));
		casa.agregarMueble(new Microondas("Microondas", new Posicion(5, 1, 1), Material.METAL,
				Zona.COCINA, Calidad.MALA, 20, 100, 8));

		casa.agregarMueble(new Telefono("Telefono", new Posicion(2, 1, 5), Material.PLASTICO,
				Zona.LIVING, Calidad.MEDIA));

		return casa;
	}
}
