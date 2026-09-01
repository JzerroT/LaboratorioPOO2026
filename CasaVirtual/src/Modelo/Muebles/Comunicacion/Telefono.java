package Modelo.Muebles.Comunicacion;

import Modelo.Muebles.Mueble;
import Modelo.Tipos.Calidad;
import Modelo.Tipos.Material;
import Modelo.Tipos.Posicion;
import Modelo.Tipos.Zona;

public class Telefono extends Mueble 
{
	private boolean pedidoEnCamino;
	private String ultimoPedido;

	public Telefono(String nombre, Posicion posicion, Material material, Zona zona, Calidad calidad) 
	{
		super(nombre, posicion, material, 1, zona, calidad);
		this.pedidoEnCamino = false;
		this.ultimoPedido = "";
	}

	@Override
	public String[] accionesDisponibles() 
	{
		return new String[] { "pedir una pizza", "llamar a un amigo", "recibir el pedido" };
	}

	@Override
	public String hacer(String accion) 
	{
		switch (accion) 
		{
			case "pedir una pizza":
				return pedir("una pizza grande de muzzarella");
			case "llamar a un amigo":
				usar();
				return "Estuviste media hora hablando por " + getNombre() + ".";
			case "recibir el pedido":
				return recibirPedido();
			default:
				return "El telefono no sabe hacer eso.";
		}
	}

	public String pedir(String pedido) 
	{
		if (estaRoto()) 
		{
			return getNombre() + " esta roto (" + getMotivoRotura() + "), no hay tono.";
		}
		usar();
		pedidoEnCamino = true;
		ultimoPedido = pedido;
		return "Pediste " + pedido + " por " + getNombre() + ". Llega en 30 minutos.";
	}

	public String recibirPedido() 
	{
		if (!pedidoEnCamino) 
		{
			return "No hay ningun pedido en camino.";
		}
		pedidoEnCamino = false;
		return "Llego " + ultimoPedido + ". A comer!";
	}

	public boolean hayPedidoEnCamino() { return pedidoEnCamino; }
	public String getUltimoPedido() { return ultimoPedido; }
}
