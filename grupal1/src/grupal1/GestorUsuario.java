package grupal1;

import java.io.IOException;
import java.util.Scanner;

public class GestorUsuario {
	public static void main (String[]Args) throws IOException {
		
		//String rut;
		//String nombre;
		//String apellido;
		//int telefono;
		//String afp;
		//int sistemaSalud;
		//String direccion;
		//String comuna;
		//int edad;
		
		Scanner pr = new Scanner(System.in);
		
		System.out.println("Ingresar RUT:");
		String rut = pr.nextLine();
		
		System.out.println("Ingresar Nombre:");
		String nombre = pr.nextLine();
		
		System.out.println("Ingresar Apellido:");
		String apellido = pr.nextLine();
		
		System.out.println("Ingresar Fono:");
		String Fono = pr.nextLine();
		int telefono = Integer.parseInt(Fono);
		
		System.out.println("Ingresar AFP:");
		String afp = pr.nextLine();
		
		System.out.println("Ingresar Sistema de Salud:");
		String eSS = pr.nextLine();
		int sistemaSalud = Integer.parseInt(eSS);
		
		System.out.println("Ingresar Direccion:");
		String direccion = pr.nextLine();
		
		System.out.println("Ingresar Comuna:");
		String comuna = pr.nextLine();
		
		System.out.println("Ingresar Edad:");
		String vEdad = pr.nextLine();
		int edad =Integer.parseInt(vEdad);
		
		String sisSalud;
			
		
		if (sistemaSalud == 1) {
			sisSalud = "Fonasa";
		} else {
			sisSalud = "Isapre";
		}
		
		
		System.out.println("Hola,"+nombre+" "+apellido+" tu Rut es:"+rut+" tienes:"+edad+" anos"+" "+"tu telefono es:"+telefono);
		System.out.println("Vives en: "+direccion+" "+" en la comuna de:"+comuna);
		
		System.out.println("Tu AFP es: "+afp+" "+"y tu sistema de salud es: "+sisSalud);
		
		
		
		
		
		
	}

}
