package Modelo;

public class Jugador 
{
	private int nivel;
	private int añosExperiencia;
	private int balanceEconomico;
	private Equipamiento equipamiento;
	private TipoDeClase clase;
	
	public Jugador(int nivel , int añosExperiencia , int balanceEconomico , Equipamiento equipamiento , TipoDeClase clase)
	{
		this.nivel= nivel;
		this.añosExperiencia=añosExperiencia;
		this.balanceEconomico = balanceEconomico;
		
		
		
	}
	public Jugador()
	{
		
	}
	
	
	public boolean estaPreparado()
	{
		if(equipamiento.esLegendario() && nivel >= 120)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean esVeterano()
	{
		if(añosExperiencia > 5 && nivel > 90)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean esPayToWin()
	{
		if(añosExperiencia <2 && equipamiento.esLegendario())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean esTanque()
	{
		if (equipamiento.esDefensivo() && equipamiento.esLegendario())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean esNovato()
	{
		if (añosExperiencia < 1 || nivel < 15)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean esAsesino()
	{
		if ( estaPreparado() && (clase == TipoDeClase.NINJA || clase ==TipoDeClase.STRIKER))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean estaComplicado()
	{
		if ( balanceEconomico < 10000 && equipamiento.esDeBajaCalidad())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public Equipamiento getEquipamiento()
	{
		return equipamiento;
	}
	
	public void setNivel(int nivel)
	{
		this.nivel=nivel;
	}
	
	public void setEquipamiento(Equipamiento equipamiento)
	{
		this.equipamiento=equipamiento;
	}
	
	public void setTipoDeClase(TipoDeClase clase)
	{
		this.clase=clase;
	}
	
	public void setAñosExperiencia(int añosExperiencia)
	{
		this.añosExperiencia=añosExperiencia;
	}
	
	public void setBalanceEconomico(int balanceEconomico)
	{
		this.balanceEconomico=balanceEconomico;
	}

}
