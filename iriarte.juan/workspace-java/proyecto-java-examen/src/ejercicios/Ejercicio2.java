package ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ejercicios.Persona;
import ejercicios.Persona.TipoDocumento;

/**
 * A. Crear una clase Persona con los siguientes campos
 * (con sus respectivos getters, setters y constructor)
 * 
 * TipoDocumento - enum (dni/libretacivica) 
 * NroDocumento - Integer
 * Nombre - String
 * Apellido - String
 * FechaNacimiento - Date
 * 
 * B. En el método main de la clase "Ejercicio2" crear una nueva instancia
 * de la clase persona y settearle valores reales con tus datos
 * 
 * 
 * C. En el método main de la clase "Ejercicio 2" imprimir los valores en 
 * consola 
 * (crear método main e imprimir valores) 
 *  
 * @author examen
 *
 */
public class Ejercicio2 {

	/**
	 * 
	 */
	public Ejercicio2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona yo = new Persona();
		
		yo.setApellido("Iriarte");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "31-03-1981";
		Date date;
		try {
			date = sdf.parse(dateInString);
			yo.setFechaNacimiento(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		yo.setNombre("Juan");
		yo.setTipoDocumento(TipoDocumento.DNI);
		yo.setNroDocumento(new Integer(28771307));
		
		System.out.println("Apellido: " + yo.getApellido());
		System.out.println("Nombre: " + yo.getNombre());
		System.out.println("Tipo Documento: " + yo.getTipoDocumento());
		System.out.println("Numero Documento: " + yo.getNroDocumento());
		System.out.println("Fecha de Nac: " + sdf.format(yo.getFechaNacimiento()));

	}

}
