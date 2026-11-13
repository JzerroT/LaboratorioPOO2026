package Estructuatp.modelo;

public class ComplejoHabitacional extends Barrio{
	  private int cantidadMonoblocks;
	    private boolean consorcioActivo;

	    public ComplejoHabitacional(String nombre, double superficieHectareas,
	                                int cantidadMonoblocks, boolean consorcioActivo) {
	        super(nombre, superficieHectareas);
	        this.cantidadMonoblocks = cantidadMonoblocks;
	        this.consorcioActivo = consorcioActivo;
	    }

	    @Override
	    public double calcularDensidad(int cantidadPersonas) {
	        if (cantidadMonoblocks <= 0) {
	            return 0;
	        }
	        return (double) cantidadPersonas / cantidadMonoblocks;
	    }

	    @Override
	    public boolean tieneCriticidadHabitacional() {
	        return !consorcioActivo;
	    }

	    public int getCantidadMonoblocks() {
	        return cantidadMonoblocks;
	    }

	    public void setCantidadMonoblocks(int cantidadMonoblocks) {
	        this.cantidadMonoblocks = cantidadMonoblocks;
	    }

	    public boolean isConsorcioActivo() {
	        return consorcioActivo;
	    }

	    public void setConsorcioActivo(boolean consorcioActivo) {
	        this.consorcioActivo = consorcioActivo;
	    }

}
