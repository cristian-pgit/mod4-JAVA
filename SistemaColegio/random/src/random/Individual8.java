package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Individual8 {
	
	
	public static void main (String[]Args) {
		
		List<String> nombres;
		List<Integer> notas;
		
		Saludar();
		ingresarAlumno_Nota();

		
		
		
	}
	
	public static void Saludar() {
		System.out.println("Hola, Bienvenido al Sistema de funciones miscelaneas");
	}
	
	//setea los asistentes preguntando nombre y luego nota X veces donde 
		private static void ingresarAlumno_Nota() {
			//definir array para nombre asistente y edades
			List<String> nombres = new ArrayList<String>();
			List<Integer> notas = new ArrayList<Integer>();
			//declaro contadores
			int cont = 0;
			String nombre = "n";
			boolean salida = false;
			//se abre conexión a consola
			Scanner pr = new Scanner(System.in);
			//se inicia el blucle
			while (!salida) {
				//generar bucle hasta que se  ingrese un nombre
				boolean hayNombre = false;
				while (!hayNombre) {
					System.out.println("Ingrese el nombre del Alumno: ");
					nombre = pr.nextLine();
					if(nombre.equals("salir")) {
						salida = true;
					} else if(nombre == null || nombre.equals("") || nombre.length()<3) {
						System.out.println("Nombre no puede estar vacio");
					} else { 
						hayNombre = true;
						nombres.add(nombre);
					}
				}
				//generar bucle hasta que se  ingrese edad
				boolean hayNota = false;
				while (!hayNota) {
					System.out.println("Ingrese la Nota del Alumno: ");
					String nota = pr.nextLine();
					if (nota ==  null || nota.isEmpty() || !nota.matches("[0-9]+"))
					{
						System.out.println("Nota no válida");
					} else if (Integer.parseInt(nota)< 10 && Integer.parseInt(nota)> 70) { 
						System.out.println("Disfrute su jubilación");
					} else  {
						hayNota = true;
						notas.add(Integer.parseInt(nota));
					}
				}
				cont++;
			}
			mostrarAlumnos(nombres, notas);
		}
		
		//desplegar datos
		private static void mostrarAlumnos(List<String> nombres, List<Integer> notas) {
			
			
			for (int i=0; i <notas.size(); i++) {
				int suma = notas.get(i);
				int prom = suma/notas.size();
				System.out.println("El Promedio del curso es: "+prom);
			
				
			}
	
		}			
//			int contMayor = 0;
//			int contEntre = 0;
//			int contMenor = 0;	
//			for (int i = 0; i < nombres.size(); i++) {
//				if (notas.get(i)>35){
//					contMayor++;
//					System.out.println("nombre: "+ nombres.get(i) + " - edad: " + notas.get(i));
//				} else if (notas.get(i)>=25 && notas.get(i)<=35){
//					contEntre++;
//								System.out.println("nombre: "+ nombres.get(i) + " - edad: " + notas.get(i));
//					} else  {
//						contMenor++;
//					System.out.println("nombre: "+ nombres.get(i) + " - edad: " + notas.get(i));
//					}
//			}
//			System.out.println("Hay "+contMayor + " asistentes con edades mayores a 35");
//			System.out.println("Hay "+contEntre + " asistentes con edades entre 25 a 35");
//			System.out.println("Hay "+contMenor + " asistentes con edades menores a 25");
			
		
	
	

}
