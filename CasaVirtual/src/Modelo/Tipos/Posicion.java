package Modelo.Tipos;

public class Posicion 
{
	private float x;
	private float y;
	private float z;
	
	public Posicion(float x, float y, float z) 
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public float getX() { return x; }
	public float getY() { return y; }
	public float getZ() { return z; }
	
	@Override
	public String toString() 
	{
		return "(" + x + ", " + y + ", " + z + ")";
	}
}
