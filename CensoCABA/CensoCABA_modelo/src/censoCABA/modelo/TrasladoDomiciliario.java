package censoCABA.modelo;

import java.time.LocalDate;

public class TrasladoDomiciliario {
    private Persona persona;
    private Barrio barrioOrigen;
    private Barrio barrioDestino;
    private LocalDate fechaTraslado;

    public TrasladoDomiciliario(Persona persona, Barrio barrioOrigen,
                                Barrio barrioDestino, LocalDate fechaTraslado) {
        this.persona = persona;
        this.barrioOrigen = barrioOrigen;
        this.barrioDestino = barrioDestino;
        this.fechaTraslado = fechaTraslado;
    }

    public boolean esValido() {
        return persona != null
                && barrioOrigen != null
                && barrioDestino != null
                && fechaTraslado != null
                && !barrioOrigen.equals(barrioDestino);
    }

    public Persona getPersona() {
        return persona;
    }

    public Barrio getBarrioOrigen() {
        return barrioOrigen;
    }

    public Barrio getBarrioDestino() {
        return barrioDestino;
    }

    public LocalDate getFechaTraslado() {
        return fechaTraslado;
    }
}
