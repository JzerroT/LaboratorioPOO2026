package actividad_clases2;

import java.util.Scanner;

public class app 
{

	public static void main(String[] args) 
	{
		System.out.println(edad());
		
		ejercicio1();
		
		
		System.out.println(resultado_suma());
		System.out.println(resultado_resta());
		System.out.println(resultado_multiplicacion());
		System.out.println(resultado_division());
		System.out.println(resultado_modulo());
		
		

	}
	
	public static void ejercicio1()
	{
		String nombre = "Yami";
		int edad = 17;
		double altura = 1.58;
		char letra = 'Y'; 
		boolean opcion = true;
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(altura);
		System.out.println(letra);
		System.out.println(opcion);
	}
	public static int resultado_suma ()
	{
		Scanner lectura = new Scanner(System.in);
		int numero1 = lectura.nextInt();
		int numero2 = lectura.nextInt();
		
		int resultado = numero1 + numero2;
		return resultado;
		
	}
	public static int resultado_resta()
	{
		Scanner lectura = new Scanner(System.in);
		int numero1 = lectura.nextInt();
		int numero2 = lectura.nextInt();
		int resultado = numero1 - numero2;
		return resultado;
		
	}
	
	public static int resultado_multiplicacion ()
	{
		Scanner lectura = new Scanner(System.in);
		int numero1 = lectura.nextInt();
		int numero2 = lectura.nextInt();
		int resultado = numero1 * numero2;
		return resultado;
		
	}
	public static int resultado_division ()
	{
		Scanner lectura = new Scanner(System.in);
		int numero1 = lectura.nextInt();
		int numero2 = lectura.nextInt();
		int resultado = numero1 / numero2;
		return resultado;
		
	}
	public static int resultado_modulo ()
	{
		Scanner lectura = new Scanner(System.in);
		int numero1 = lectura.nextInt();
		int numero2 = lectura.nextInt();
		int resultado = numero1 % numero2;
		return resultado;
		
	}
	
	
	public static String edad()
	{
		Scanner lectura = new Scanner(System.in);
		int edad_persona = lectura.nextInt();
		if (edad_persona >=65)
		{
			return "es una persona jubilada";
		}
		else if (edad_persona >= 18)
		{
			return "es mayor de edad";
		}
		else
		{
			return "es menor de edad";
		}
		

		
	}

}
