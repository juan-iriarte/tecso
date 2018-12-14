/**
 * 
 */
package ejercicios;

/**
 * A. Crear una clase Alumnno con los siguientes campos
 * (con sus respectivos getters, setters y constructor)
 * 
 * Persona
 * Legajo - Integer
 * 
 *  
 * @author examen
 *
 */
public class Ejercicio3 {
	public class Alumno{
		
		Persona persona;
		Integer legajo;
		
		public Alumno() {
			
		}
		
		
		public Alumno(Persona persona, Integer legajo) {
			this.persona = persona;
			this.legajo = legajo;			
		}


		public Persona getPersona() {
			return persona;
		}


		public void setPersona(Persona persona) {
			this.persona = persona;
		}


		public Integer getLegajo() {
			return legajo;
		}


		public void setLegajo(Integer legajo) {
			this.legajo = legajo;
		}		
		
	}


	/**
	 * 
	 */
	public Ejercicio3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


