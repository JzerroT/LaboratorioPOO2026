package censoCABA.modelo;

public abstract class Barrio {
    private String nombre;
    private double superficieHectareas;

    public Barrio(String nombre, double superficieHectareas) {
        this.nombre = nombre;
        this.superficieHectareas = superficieHectareas;
    }

    public abstract double calcularDensidad(int cantidadPersonas);

    public abstract boolean tieneCriticidadHabitacional();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSuperficieHectareas() {
        return superficieHectareas;
    }

    public void setSuperficieHectareas(double superficieHectareas) {
        this.superficieHectareas = superficieHectareas;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
