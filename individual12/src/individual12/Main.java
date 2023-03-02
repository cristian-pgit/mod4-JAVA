package individual12;

import java.util.Scanner;

import javax.sound.midi.Soundbank;


public class Main {
	
	public static void main (String []Args) {
			
			Scanner sc = new Scanner(System.in);
			
			
			Trabajador empleado1 = new Trabajador ("Augusto", "Perez", "11111111-1", 12341234, 26);
			Trabajador empleado2 = new Trabajador ("Augusta", "Pereza", "00000000-0", 12341234, 35);
			
			Carga car1 = new Carga ("11111111-1","Lola","Mento", "22222222-2", 2, 19);
			Carga car2 = new Carga ("11111111-1","Alan","Brito", "33333333-3", 3, 19);
			Carga car3 = new Carga ("11111111-1","Elza","Pato", "44444444-4", 1, 31);
			Carga car4 = new Carga ("66666666-6","Elza","Pato Roto", "44444444-4", 1, 19);
			
			empleado1.anadirCarga(car1);
			empleado1.anadirCarga(car2);
			empleado1.anadirCarga(car3);
			empleado2.anadirCarga(car4);
						
			
			System.out.println(empleado1);
			empleado1.mostrarDatos();
			System.out.println();
			System.out.println(empleado2);
			empleado2.mostrarDatos();
			
			
			System.out.println("Desea crear un nuevo Trabajador? (y/n)");
			String ans = sc.nextLine();
			if (ans.equals("y")) {
				Trabajador tra1 = new Trabajador();
				System.out.print("Ingrese Rut del Trabajador (00000000-X): ");
				tra1.setRun(sc.nextLine());
				System.out.print("Ingrese Nombres: ");
				tra1.setNombres(sc.nextLine());
				System.out.print("Ingrese Apellidos: ");
				tra1.setApellidos(sc.nextLine());
				System.out.print("Ingrese Fono: ");
				tra1.setFono(sc.nextInt());
				System.out.print("Ingrese Edad: ");
				tra1.setEdad(sc.nextInt());
				sc.nextLine();
				boolean sigue = true;
				while (sigue) {
				    System.out.print("Desea Anadir Cargas Familiares? (y/n)");
				    String ans2 = sc.nextLine();
				    if (ans2.equals("y")) {
				        Carga carga = new Carga();
				        System.out.print("Ingrese Rut del Trabajador (00000000-X): ");
				        carga.setRunCarga(sc.nextLine());
				        System.out.print("Ingrese Nombres: ");
				        carga.setNombres(sc.nextLine());
				        System.out.print("Ingrese Apellidos: ");
				        carga.setApellidos(sc.nextLine());
				        System.out.print("Ingrese Rut del Familiar (00000000-X): ");
				        carga.setRunFamiliar(sc.nextLine());
				        System.out.print("Ingrese Parentesco (1 - Cónyuge, 2 - Hijo/a, 3 -Otro): ");
				        carga.setParentesco(sc.nextInt());
				        System.out.print("Ingrese Edad: ");
				        carga.setEdad(sc.nextInt());
				        sc.nextLine();
				        tra1.anadirCarga(carga);    
				    } else if (ans2.equals("n")) {
				        sigue = false;
				    } else {
				        System.out.println("Respuesta no válida. Por favor ingrese 'y' o 'n'.");
				    }
				    sc.nextLine(); // consume the newline character left in the buffer
				}
				System.out.println(tra1);
				tra1.mostrarDatos();
			}
		//	
			System.out.println("Buenas Tardes");
			
	sc.close();
	}

}
