package grupal1;

import java.io.IOException;
import java.util.Scanner;

public class GestorUsuario {
	public static void main (String[]Args) throws IOException {
		
		Scanner pr = new Scanner(System.in);
		String nombre=null;
		String apellido=null;
		int rut=0;
		long telefono=0;
		
		System.out.println("Ingresar RUT:");
		ingresarRut();
		//String rut = pr.nextLine();
		
		System.out.println("Ingresar Nombre:");
		ingresarNombre();
		//String nombre = pr.nextLine();
		
		System.out.println("Ingresar Apellido:");
		ingresarApellido();
		//String apellido = pr.nextLine();
		
		System.out.println("Ingresar Fono:");
		ingresarTelefono();
		/*String Fono = pr.nextLine();
		int telefono = Integer.parseInt(Fono);*/
		
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
		int ok = 0;
		while (ok == 1) {
			if (edad > 119) {
			System.out.println("No puede ser mayor a 120, ingrese nuevamente:");
			vEdad = pr.nextLine();
			edad =Integer.parseInt(vEdad);
		} else {ok = 1;}
		}
		
		
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
	// validar rut
	public static int ingresarRut() {
		boolean ok = false;
		int rut = 0;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			rut = pr.nextInt();
			if(rut > 999999999 && rut <11111111) {
				System.out.println("Rut no puede estar vacio");
				System.out.println("Ingresar RUT:");
			} else { 
				
				ok = true;}
		}
		return rut;}		
	
	//ingresar Nombre
	public static String ingresarNombre() {
		boolean ok = false;
		String nombre = null;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			nombre = pr.nextLine();
			if(nombre == null || nombre.equals("")) {
				System.out.println("Nombre no puede estar vacio");
				System.out.println("Ingresar Nombre:");
			} else { 
				
				ok = true;}
		}
		return nombre;}
		
	//ingresar apellido
		public static String ingresarApellido() {
			boolean ok = false;
			String apellido = null;
			while ( ok == false) {
				Scanner pr = new Scanner(System.in);
				apellido = pr.nextLine();
				if(apellido == null || apellido.equals("")) {
					System.out.println("Apellido no puede estar vacio");
					System.out.println("Ingresar Apellido:");
				} else { 
					
					ok = true;}
			}
			return apellido;}
		//ingresar Telefono
				public static String ingresarTelefono() {
					boolean ok = false;
					String Fono = null;
					while ( ok == false) {
						Scanner pr = new Scanner(System.in);
						Fono = pr.nextLine();
						if(Fono == null || Fono.equals("") || Fono.length()<14) {
							System.out.println("Telefono no puede estar vacio, debe maximo 15 caracteres");
							System.out.println("Ingresar Telefono:");
						} else { 
							ok = true;}
					}
					return Fono;}
				
				public static long asignarTelefono() {
					boolean ok = false;
					long telefono = 0;
					String Fono = ingresarTelefono();
					telefono =Integer.parseInt(Fono);
					return telefono;}
				
				
		//ingresar afp
		public static String ingresarAfp() {
			boolean ok = false;
			String afp = null;
			while ( ok == false) {
				Scanner pr = new Scanner(System.in);
				afp = pr.nextLine();
				if(afp == null || afp.equals("")) {
					System.out.println("Apellido no puede estar vacio");
					System.out.println("Ingresar Apellido:");
				} else { 
					
					ok = true;}
			}
			return afp;}
			
			
			

			
			
			// 

}
