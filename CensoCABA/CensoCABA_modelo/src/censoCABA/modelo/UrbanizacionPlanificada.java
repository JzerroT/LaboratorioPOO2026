package censoCABA.modelo;

public class UrbanizacionPlanificada extends Barrio {
    private int numeroLeyIntegracion;
    private boolean conexionFormalAgua;

    public UrbanizacionPlanificada(String nombre, double superficieHectareas,
                                   int numeroLeyIntegracion, boolean conexionFormalAgua) {
        super(nombre, superficieHectareas);
        this.numeroLeyIntegracion = numeroLeyIntegracion;
        this.conexionFormalAgua = conexionFormalAgua;
    }

    @Override
    public double calcularDensidad(int cantidadPersonas) {
        if (getSuperficieHectareas() <= 0) {
            return 0;
        }
        return cantidadPersonas / getSuperficieHectareas();
    }

    @Override
    public boolean tieneCriticidadHabitacional() {
        return !conexionFormalAgua;
    }

    public int getNumeroLeyIntegracion() {
        return numeroLeyIntegracion;
    }

    public void setNumeroLeyIntegracion(int numeroLeyIntegracion) {
        this.numeroLeyIntegracion = numeroLeyIntegracion;
    }

    public boolean isConexionFormalAgua() {
        return conexionFormalAgua;
    }

    public void setConexionFormalAgua(boolean conexionFormalAgua) {
        this.conexionFormalAgua = conexionFormalAgua;
    }
}
