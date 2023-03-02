package individual13;

import java.util.Scanner;

import javax.sound.midi.Soundbank;


public class Main {
	
	public static void main (String []Args) {
			
			Scanner sc = new Scanner(System.in);
			
			
			Trabajador empleado1 = new Trabajador ();
			empleado1.setRun("00000001-1");
			empleado1.setNombres("Marcy Anna");
			empleado1.setApellidos("LeMars");
			empleado1.setFono(55555555);
			empleado1.setEdad(1500);
			
			Trabajador empleado2 = new Trabajador ();
			empleado2.setRun("1000000-1");
			empleado2.setNombres("Pin");
			empleado2.setApellidos("Ocho");
			empleado2.setFono(26904000);
			empleado2.setEdad(59);
			
			Trabajador empleado3 = new Trabajador ();
			empleado3.setRun("50000000-5");
			empleado3.setNombres("LeBron");
			empleado3.setApellidos("James");
			empleado3.setFono(12341234);
			empleado3.setEdad(27);
			
			System.out.println(empleado1);
			System.out.println();
			System.out.println(empleado2);
			System.out.println();
			System.out.println(empleado3);
			System.out.println();
			
			Carga car1 = new Carga ("00000001-1","Mar","Ciano", "11111111-1", 1, 950);
			Carga car2 = new Carga ("00000001-1","Marcia","Nita", "22222222-2", 2, 250);
			Carga car3 = new Carga ("1000000-1","Lucy","Mun-Ra", "33333333-3", 1, 300);
			Carga car4 = new Carga ("50000000-5","Elza","Pato Roto", "44444444-4", 1, 21);
			Carga car5 = new Carga ("50000000-5","Lola","Mento", "55555555-5", 3, 16);
			
			empleado1.anadirCarga(car1);
			empleado1.anadirCarga(car2);
			
			empleado2.anadirCarga(car3);
			
			empleado3.anadirCarga(car4);
			empleado3.anadirCarga(car5);
						
			System.out.println(empleado1);
			empleado1.mostrarDatos();
			System.out.println();
			System.out.println(empleado2);
			empleado2.mostrarDatos();
			System.out.println();
			System.out.println(empleado3);
			empleado3.mostrarDatos();
			
			System.out.println(ANSI_BOLD+"[ADVERTENCIA]"+ANSI_RESET);
			System.out.println(ANSI_YELLOW+"Nos informan que: "+empleado3.getNombres()+""+empleado3.getApellidos()+" se ha cambiado de sexo.(M-->F)"+ANSI_RESET);
			System.out.print("Favor ingrese nuevo nombre: ");
			empleado3.setNombres(sc.nextLine());
			System.out.println();
			System.out.println(ANSI_BOLD+"[ADVERTENCIA]"+ANSI_RESET);
			System.out.println(ANSI_YELLOW+"Nos informan que la edad de: "+car3.getNombres()+""+car3.getApellidos()+" estaba incorrecta (muy poco)"+ANSI_RESET);
			System.out.print("Favor ingrese la edad correcta: ");
			car3.setEdad(sc.nextInt());
			sc.nextLine();
			System.out.println();
			System.out.println(ANSI_RED+ANSI_BOLD+"[ADVERTENCIA]"+ANSI_RESET);
			System.out.println(ANSI_YELLOW+"Nos informan que la : "+car5.parentesco()+" de "+empleado3.getNombres()+" "+empleado3.getApellidos()+
					" cumplio anos (tenia: "+car5.getEdad()+") favor actualize edad"+ANSI_RESET);
			System.out.print("Favor ingrese nueva edad: ");
			car5.setEdad(sc.nextInt());
			System.out.println();
			
			System.out.println(empleado1);
			empleado1.mostrarDatos();
			System.out.println();
			System.out.println(empleado2);
			empleado2.mostrarDatos();
			System.out.println();
			System.out.println(empleado3);
			empleado3.mostrarDatos();
			
			System.out.println("Buenas Tardes");
			
	sc.close();
	}

	
	
	
	public static final String ANSI_BOLD = "\033[0;1m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_RESET = "\u001B[0m";
}
