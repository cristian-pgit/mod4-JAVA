package random;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main (String[]Args) {
		
		
		int intentos = 0;
		while (intentos < 3) {
			System.out.println("Favor ingrese la constrasena");
			
			String clave = "M4r4vI110$0";
			Scanner sc = new Scanner(System.in);
			String entrada = sc.nextLine();
			if(entrada.equals(clave)) {
				System.out.println("Felicidades");
				System.out.println("Ingresando al Sistema...");
				sc.close();
				intentos = 3;
			} else {
				System.out.println("Contrasena incorrecta");
				System.out.println("Vuelva a intentar, le quedan: "+(2-intentos));
				intentos++;
				if(intentos==3) {
					System.out.println("Se han agotado sus opciones.");
					System.out.println("El computador se formateara en:");
					System.out.println("3");
					System.out.println("2");
					System.out.println("1");
				}
			}
			
		}
		
	}
}
