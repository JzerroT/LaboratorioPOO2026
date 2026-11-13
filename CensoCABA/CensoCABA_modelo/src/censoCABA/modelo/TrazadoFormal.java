package censoCABA.modelo;

public class TrazadoFormal extends Barrio {
    private int cantidadEdificiosPH;
    private double porcentajeAsfalto;

    public TrazadoFormal(String nombre, double superficieHectareas,
                         int cantidadEdificiosPH, double porcentajeAsfalto) {
        super(nombre, superficieHectareas);
        this.cantidadEdificiosPH = cantidadEdificiosPH;
        this.porcentajeAsfalto = porcentajeAsfalto;
    }

    @Override
    public double calcularDensidad(int cantidadPersonas) {
        if (cantidadEdificiosPH <= 0) {
            return 0;
        }
       
        return (double) cantidadPersonas / cantidadEdificiosPH;
    }

    @Override
    public boolean tieneCriticidadHabitacional() {
        return porcentajeAsfalto < 95.0;
    }

    public int getCantidadEdificiosPH() {
        return cantidadEdificiosPH;
    }

    public void setCantidadEdificiosPH(int cantidadEdificiosPH) {
        this.cantidadEdificiosPH = cantidadEdificiosPH;
    }

    public double getPorcentajeAsfalto() {
        return porcentajeAsfalto;
    }

    public void setPorcentajeAsfalto(double porcentajeAsfalto) {
        this.porcentajeAsfalto = porcentajeAsfalto;
    }
}
