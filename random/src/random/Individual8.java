package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Individual8 {
	
	
	public static void main (String[]Args) {
		
		
		Saludar();
		ingresarAlumno_Nota();

		
		
		
	}
	
	public static void Saludar() {
		System.out.println("Hola, Bienvenido al Sistema de funciones miscelaneas");
	}
	
	//pregunta nombre y luego nota X veces donde 
		private static void ingresarAlumno_Nota() {
			//definir array para nombre alumno y nota
			List<String> nombres = new ArrayList<String>();
			List<Integer> notas = new ArrayList<Integer>();
			//declaro contadores
			boolean minimo = false;
			String nombre = "";
			String salida = "salir";
			//se abre conexión a consola
			Scanner pr = new Scanner(System.in);
			//se inicia el blucle
			while (!nombre.equalsIgnoreCase(salida) || !minimo) {
				//generar bucle hasta que se  ingrese un nombre
				boolean hayNombre = false;
				while (!hayNombre) {
					System.out.println("Ingrese el Nombre del Alumno: ");
					nombre = pr.nextLine();
					if (nombre.equalsIgnoreCase(salida)) {
						hayNombre = true;
						continue;
					}
					if (nombre == null || nombre.isEmpty()) {
						System.out.println("Nombre no válido, ingese nuevamente");
					} else {
						hayNombre = true;
						nombres.add(nombre);
					}
				}
				
				if (nombre.equalsIgnoreCase(salida)) {
					continue;
				}
				//generar bucle hasta que se ingrese edad
				boolean hayNota = false;
				while (!hayNota) {
					System.out.println("Ingrese la Nota del Alumno: ");
					String nota = pr.nextLine();
					if (nota.isEmpty() || !nota.matches("[0-9]+") || nota.length() !=2 
							|| !nota.matches("^[1-6][0-9]|70$") )
					{
						System.out.println("Nota no válida");
					} else  {
						hayNota = true;
						notas.add(Integer.parseInt(nota));
						
					}
				}
				if (notas.size()>=2) {
					minimo = true;
				}
			}
			mostrarAlumnos(nombres, notas);
		}
		
		//desplegar datos
		private static void mostrarAlumnos(List<String> nombres, List<Integer> notas) {
			int n = nombres.size();
		    int suma = 0;
		    
		    // Crear mapa para asignar nombre y nota
		    Map<String, Integer> map = new HashMap<>();
		    for (int i = 0; i < n; i++) {
		        map.put(nombres.get(i), notas.get(i));
		        suma += notas.get(i);
		    }
		    
		 // Calcular promedio
		    double prom = (double) suma / n;
		    System.out.println("El Promedio del curso es: " + prom);
		    
		 // Sortear entradas segun su valor
		    List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		    Collections.sort(list, Map.Entry.comparingByValue());

		 // obtener valores +alto y +bajo
		    Map.Entry<String, Integer> masAlta = list.get(n - 1);
		    Map.Entry<String, Integer> masBaja = list.get(0);
		    System.out.println("La nota mas alta es: " + masAlta.getValue() + " de " + masAlta.getKey());
		    System.out.println("La nota mas baja es: " + masBaja.getValue() + " de " + masBaja.getKey());
		}
		
	
	

}
