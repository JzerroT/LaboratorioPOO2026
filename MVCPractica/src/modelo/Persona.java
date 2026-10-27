package modelo;
import java.sql.Date;
import java.time.LocalDate;

public class Persona {
	private int idPersona,idEstudio,dni;
	private String nombre;
	private LocalDate nacimiento;
	private boolean tieneHijos;
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public int getIdEstudio() {
		return idEstudio;
	}
	public void setIdEstudio(int idEstudio) {
		this.idEstudio = idEstudio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getNacimiento() {
		return nacimiento;
	}
	public Persona(int idPersona, String nombre, LocalDate nacimiento, boolean tieneHijos, int idEstudio, int dni) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.tieneHijos = tieneHijos;
		this.idEstudio = idEstudio;
		this.dni = dni;
	}
	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}
	public boolean getTieneHijos() {
		return tieneHijos;
	}
	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
}
