package ejercicios;

import java.util.Date;

public class Persona {
	
	public enum TipoDocumento {
	    DNI,
	    LIBRETACIVICA
	}
	
	TipoDocumento tipoDocumento;
	Integer nroDocumento; 
	String nombre;
	String apellido;
	Date fechaNacimiento;

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(	TipoDocumento tipoDocumento, Integer nroDocumento, String nombre,
			String apellido, Date fechaNacimiento) {
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Integer getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(Integer nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
