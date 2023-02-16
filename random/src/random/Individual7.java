package random;

import java.util.Scanner;

public class Individual7 {
	
	public static void main (String[]Args) {
		
		
		
		Saludar();
		preguntarString();
	
		
		
		
	}
	
	public static void Saludar() {
		System.out.println("Hola, Bienvenido al Sistema de funciones miscelaneas");
	}
	
	public static void preguntarString() {
		boolean ok=true;
		String cadena = "";

		while(cadena.isEmpty()) {
			System.out.print("Favor, introdusca una palabra: ");
			Scanner sc = new Scanner(System.in);
			 cadena = sc.nextLine();
			if(cadena.isEmpty()) {
				System.out.println("no puede estar vacio");
			} else if 
			(cadena.contains("[1-9]")) {
				System.out.println("no debe contener numeros");
			}
		}
		int vocales = contarVocales(cadena);					
		int consonantes = contarConsonantes(cadena);
		mostrarCaracteres(cadena);
		System.out.println("\nCantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
		
	}
	
		
	
	public static void mostrarCaracteres(String cadena) {		
		for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            System.out.print(c + " ");
        }
	}
	
	public static int contarVocales(String cadena) {
        int vocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (esVocal(c)) {
                vocales++;
            }
        }
        return vocales;
        
    }

    public static int contarConsonantes(String cadena) {
        int consonantes = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (esConsonante(c)) {
                consonantes++;
            }
        }
        return consonantes;
    }
	
	public static boolean esVocal(char cadena) {
		return (cadena == 'a' || cadena == 'e' || cadena == 'i' || cadena == 'o' || cadena =='u');
	}
	
	public static boolean esConsonante (char cadena) {
		return (cadena >= 'a' && cadena <= 'z' && !esVocal(cadena));
	}

}
