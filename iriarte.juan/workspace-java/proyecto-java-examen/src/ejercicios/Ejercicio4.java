package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Ejercicio4 {

	// listas de ejemplo, pueden variarse su contenido, 
	static Integer[] valoresLista1 = {1, 2, 5, 8, 10, 30, 20, 8, 9, 10};
	static Integer[] valoresLista2 = {1, 2, 4, 20, 5, 10, 7, 8, 10, 9};
	static Integer[] valoresLista3 = {1, 2, 4, 20, 5, 10, 7, 8, 9, 10};
	static Integer[] valoresLista4 = {1, 2, 5, 8, 10, 30, 20, 8, 9, 10};
	static Integer[] valoresLista5 = {1, 2, 4, 20, 5, 10, 7, 8, 10, 9};

	/**	 
	 * Para ejecutar el método main se debe hacer boton derecho sobre la clase
	 * "Run As --> Java Application" 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("**** inicializando datos ****");
		
		List<Integer> lista1 = new ArrayList<Integer>(Arrays.asList(valoresLista1));
		List<Integer> lista2 = new ArrayList<Integer>(Arrays.asList(valoresLista2));
		List<Integer> lista3 = new ArrayList<Integer>(Arrays.asList(valoresLista3));// lista2 con los ultimos numeros invertidos en orden
		List<Integer> lista4 = new ArrayList<Integer>(Arrays.asList(valoresLista4));// misma que lista1
		List<Integer> lista5 = new ArrayList<Integer>(Arrays.asList(valoresLista5));// misma que lista2
	
		System.out.println("**** inicializacion exitosa ****");

		// EJERCICIO 4.1: explicar salidas y sugerir mejoras
		//informacion(lista1, 10);
		
		/* EXPLICACION Y MEJORA:
		 * La primer salida imprime la cantidad de numeros pares dentro de lista1.
		 * La segunda salida los numeros impares presentes dentro de lista1.
		 * La tercera salida la posicion (0-based) del elemento 5 que es la mitad de la cantidad de elementos dentro de lista1.
		 * La cuarta salida no tiene sentido ya que siempre imprimira ... 
		 * Una mejora podria ser realizar los 3 if dentro del mismo for para recorrer la lista solamente en una ocasion y no en 3, incluse eliminando un if:
		 * for (Integer n: lista1) {
				if (n % 2 == 0) {
					pares = pares + 1;
				} else {
					impares.add(n);
				}
				
				if (n > numero) {
					c = c + 1;
				}
			}
		 *  
		 *  */
		
		// EJERCICIO 4.2: corregir el metodo
		//List<Integer> union = unionListas(lista1, lista2);
		//System.out.println("union: " + union.toString());
		
		// EJERCICIO 4.3: implementar
		//List<Integer> interseccion = interseccionListas(lista1, lista2);
		//System.out.println("interseccion: " + interseccion.toString());
		
		//EJERCICIO 4.4: implementar
		//List<Integer> orden1 = ordenaListaAscendente(lista1);
		//System.out.println("orden asc: " + orden1);
		
		// EJERCICIO 4.5: implementar
		//List<Integer> orden2 = ordenaListaDescendente(lista2);
		//System.out.println("orden desc: " + orden2);

		// EJERCICIO 4.6: implementar
		//boolean b = tienenMismoContenido(lista1, lista2);
		boolean b = tienenMismoContenido(lista2, lista3);
		System.out.println("mismo contenido: " + b);
		
		b = tienenMismoContenido(lista1, lista2);
		System.out.println("mismo contenido: " + b);
		
		b = tienenMismoContenido(lista1, lista4);
		System.out.println("mismo contenido: " + b);
		
		b = tienenMismoContenido(lista2, lista5);
		System.out.println("mismo contenido: " + b);
	}

	private static void informacion(List<Integer> lista1, Integer numero) {
		// TODO: explicar salidas de los system out y sugerir alguna mejora a la implementacion
		
		int pares = 0;
		for (Integer n: lista1) {
			if (n % 2 == 0) {
				pares = pares + 1;
			}
		}
		
		System.out.println("... " + pares);
		
		List<Integer> impares = new ArrayList<Integer>();
		for (Integer n: lista1) {
			if (n % 2 != 0) {
				impares.add(n);
			}
		}
		
		System.out.println("... " + impares.toString());
		
		int p = lista1.size() / 2;
		
		System.out.println("..." + lista1.indexOf(p));
		
		int c = 0;
		for (Integer n: lista1) {
			if (n > numero) {
				c = c + 1;
			}
		}
		if (c > lista1.size() / 2) {
			System.out.println("...");
		} else if (c > 0) {
			System.out.println("...");
		} else {
			System.out.println("...");
		}
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * retornar una lista que contenga los elementos de ambas listas, sin elementos repetidos 
	 * 
	 */
	private static List<Integer> unionListas(List<Integer> lista1, List<Integer> lista2) {
		// TODO: corregir el metodo para que funcione correctamente 
		
		List<Integer> union = new ArrayList<Integer>();
		
		union.addAll(lista1);
		
		for (Integer m: lista2) {
			if (!union.contains(m)) {
				union.add(m);
			}
		}
		
		return union;
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * retornar una lista que contenga los elementos que estan presentes en ambas listas, sin elementos repetidos 
	 * 
	 */
	private static List<Integer> interseccionListas(List<Integer> lista1, List<Integer> lista2) {
		// TODO:
		HashSet<Integer> interseccion = new HashSet<Integer>();
		
		for (Integer i: lista1) {
			if (lista2.contains(i)) {
				interseccion.add(i);
			}
		}
		
		
		return new ArrayList<Integer>(interseccion);
	}

	/***
	 * @param lista1
	 * 
	 * retornar la lista recibida, ordenada en forma ascendente
	 * 
	 */
	private static List<Integer> ordenaListaAscendente(List<Integer> lista1) {
		// TODO:
		
		lista1.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		});
		return lista1;
	}

	/***
	 * @param lista2
	 * 
	 * retornar la lista recibida, ordenada en forma descendente
	 * 
	 */
	private static List<Integer> ordenaListaDescendente(List<Integer> lista2) {
		// TODO:
		lista2.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o2, o1);
			}
		});
		return lista2;
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * devuelve true si contienen los mismos elementos
	 * NO se considera valido que esten en diferente orden
	 * NO se considera valido que la cantidad de repeticiones de los elementos sea diferente
	 * 
	 */
	private static boolean tienenMismoContenido(List<Integer> lista1, List<Integer> lista2) {
		// TODO:
		boolean result = true;
		
		if (lista1.size() != lista2.size()) {
			result = false;
		} else {
			 
			for (int i=0; i < lista1.size(); i++) {
				if (!lista1.get(i).equals(lista2.get(i))) {
					result = false;
				}
			}
		}
						
		return result;
	}

}
