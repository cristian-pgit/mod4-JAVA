package random;

import java.util.Scanner;

public class Individual7 {
	
	public static void main (String[]Args) {
		
		
		Scanner sc = new Scanner(System.in);
		Saludar();
		preguntarString();
		
		
		
	}
	
	public static void Saludar() {
		System.out.println("Hola, Bienvenido al Sistema de funciones miscelaneas");
	}
	
	public static String preguntarString() {
		boolean ok=true;
		String cadena = null;
		while(ok==true) {
			System.out.print("Favor, introdusca una palabra: ");
			Scanner sc = new Scanner(System.in);
			 cadena = sc.nextLine();
			if(cadena.isEmpty()) {
				System.out.println("no puede estar vacio");
			} else {
				for(int i=0; i < cadena.length(); i++) {
					System.out.println(cadena.charAt(i));
				}
				ok = false;
				
			}
		}
		return cadena;
	}
	
	

}
