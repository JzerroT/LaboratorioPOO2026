package Estructuatp.modelo;
import java.time.LocalDate;

public class Persona {
	 private String dni;
	    private String nombreCompleto;
	    private LocalDate fechaNacimiento;
	    private SituacionLaboral situacionLaboral;
	    private Barrio barrio;

	    public Persona(String dni, String nombreCompleto, LocalDate fechaNacimiento,
	                   SituacionLaboral situacionLaboral, Barrio barrio) {
	        this.dni = dni;
	        this.nombreCompleto = nombreCompleto;
	        this.fechaNacimiento = fechaNacimiento;
	        this.situacionLaboral = situacionLaboral;
	        this.barrio = barrio;
	    }

	    public void modificarDatos(String nombreCompleto, LocalDate fechaNacimiento,
	                               SituacionLaboral situacionLaboral) {
	        this.nombreCompleto = nombreCompleto;
	        this.fechaNacimiento = fechaNacimiento;
	        this.situacionLaboral = situacionLaboral;
	    }

	    public void asociarBarrio(Barrio barrio) {
	        this.barrio = barrio;
	    }

	    public String getDni() {
	        return dni;
	    }

	    public void setDni(String dni) {
	        this.dni = dni;
	    }

	    public String getNombreCompleto() {
	        return nombreCompleto;
	    }

	    public void setNombreCompleto(String nombreCompleto) {
	        this.nombreCompleto = nombreCompleto;
	    }

	    public LocalDate getFechaNacimiento() {
	        return fechaNacimiento;
	    }

	    public void setFechaNacimiento(LocalDate fechaNacimiento) {
	        this.fechaNacimiento = fechaNacimiento;
	    }

	    public SituacionLaboral getSituacionLaboral() {
	        return situacionLaboral;
	    }

	    public void setSituacionLaboral(SituacionLaboral situacionLaboral) {
	        this.situacionLaboral = situacionLaboral;
	    }

	    public Barrio getBarrio() {
	        return barrio;
	    }

}
