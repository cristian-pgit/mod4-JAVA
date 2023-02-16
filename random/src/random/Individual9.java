package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Individual9 {
	
	public static void main (String [] Args) {
		
		Saludar();
		ingresarNumero();
		
		
	}
	public static void Saludar() {
		System.out.println("Hola, Bienvenido al Sistema de funciones miscelaneas");
	}
	
	//pregunta numero y validacion
		private static void ingresarNumero() {
			//definir array para nombre alumno y nota
			List<Integer> numeros = new ArrayList<Integer>();
			//declaro contadores
			boolean minimo = false;
			String numero = "";
			String salida = "0";
			//se abre conexión a consola
			Scanner pr = new Scanner(System.in);
			//se inicia el blucle
			while (!numero.equalsIgnoreCase(salida) || !minimo) {
				//generar bucle hasta que se  ingrese un numero	
				if (numero.equalsIgnoreCase(salida)) {
					continue;
				}
				//generar bucle hasta que se ingrese numero
				boolean hayNumero = false;
				while (!hayNumero) {
					System.out.println("Ingrese Numero (maximo 2 digitos): ");
					numero = pr.nextLine();
					if (numero.equals("0") && !minimo) {
						System.out.println("Necesita ingresar al menos 3 numeros antes de terminar");
					} else
					if (numero.isEmpty() || !numero.matches("[0-9]+") || numero.length()>2)
					{
						System.out.println("Input no válido");
					} else  {
						hayNumero = true;
						numeros.add(Integer.parseInt(numero));
						if(numero.equals("0")) {
							numeros.remove(numeros.size()-1);
						}
					}
				}
				if (numeros.size()>=3) {
					minimo = true;
				}
			}
			desplegarDatos(numeros);
			promedio(numeros);
			obtMasAlto(numeros);
			obtMasBajo(numeros);
			eliminarPares(numeros);
			eliminarPares(numeros);
			eliminarPares(numeros);
			System.out.println("--Despues de eliminar pares--");
			desplegarDatos(numeros);
			promedio(numeros);
			obtMasAlto(numeros);
			obtMasBajo(numeros);
		}
		
		//desplegar datos
		private static void desplegarDatos(List<Integer> numeros) {
			for(int i=0;i<numeros.size();i++) 
				if (numeros.size()==0) {
					System.out.println("todos los numeros eran pares, por ende todos eliminados");
					System.out.println("no hay numeros que mostrar");
				} else {
					System.out.print(numeros.get(i)+" ");
				}
			System.out.println();
		}
		    
		 // Calcular promedio
		private static double obtPromedio(List<Integer> numeros) {
		        return numeros.stream()
		                .mapToInt(a -> a)
		                .average().orElse(0);
		        
		}
		
		private static void promedio(List<Integer> numeros) {
			 
	        double avg = obtPromedio(numeros);
	        System.out.println("El promedio es: " + avg);
		}
		
		private static void obtMasAlto(List<Integer> numeros) {
			 
	      Collections.sort(numeros);
	      
	      for(int i=0;i<numeros.size();i++) {
	    	  if(numeros.get(i)==null || numeros.size()<1){
			    	System.out.println("No hay valor mas alto pues el array solo contiene 1 numero");
			    } else {
			    	System.out.println("El valor mas alto es: "+ numeros.get(numeros.size()-1));
			    }
	    	  }
		}
		
		private static void obtMasBajo(List<Integer> numeros) {
			 
		    Collections.sort(numeros);
		      
		    for(int i=0;i<numeros.size();i++) 
		    if(numeros.get(i)==null || numeros.size()<1){
		    	System.out.println("No hay valor mas bajo pues el array solo contiene 1 numero");
		    } else {
		    	System.out.println("El valor mas bajo es: "+ numeros.get(numeros.size()-2));  
		    }
		    		
		}
		     
	      
		private static void eliminarPares(List<Integer> numeros) {
			for(int i=0;i<numeros.size();i++)	
			if (numeros.get(i) % 2 == 0){
				numeros.remove(i);
			}
		}
		
	

}
