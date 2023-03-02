package individual13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trabajador {
	
	private String nombres;
	private String apellidos;
	private String run;
	private int fono;
	private int edad;
	private List<Carga> cargas = new ArrayList<Carga>();
	/**
	 * @return para obtener nombre
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres para setear nombre
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return para obtener apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos para setear apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return para obtener run
	 */
	public String getRun() {
		return run;
	}
	/**
	 * @param run para setear run
	 */
	public void setRun(String run) {
		this.run = run;
	}
	/**
	 * @return para obtener fono
	 */
	public int getFono() {
		return fono;
	}
	/**
	 * @param fono para setear fono
	 */
	public void setFono(int fono) {
		this.fono = fono;
	}
	/**
	 * @return para obtener edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad setear edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Trabajador(String nombres, String apellidos, String run, int fono, int edad) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.run = run;
		this.fono = fono;
		this.edad = edad;	
	}
	
	public Trabajador() {
		
	}
	
	
	public static String nombreCompleto(String nombres, String apellidos) {
		return nombres + " " + apellidos;
	}
	public List<Carga> getCargas() {
		return cargas;
	}
	public void setCargas(List<Carga> cargas) {
		this.cargas = cargas;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public static int descomponerRun(String run) {
		//limpiar run eliminado . y guiones
        run = run.toUpperCase(); //vuelve la K a mayuscula
	    run = run.replace(".", "");
	    run = run.replace("-", "");
	    //dividendo rut en numero y digito verificador
	    String runA = run.substring(0, run.length() - 1);
	    runA = runA.replaceAll("[A-Za-z]", "");
        int rund = Integer.parseInt(runA);
	    return rund;
	}
	
	public void anadirCarga(Carga c) {
	    cargas.add(c);
	}

	
	@Override
	public String toString() {
		return 	ANSI_YELLOW+"Trabajador "+ANSI_RESET+
				"\nNombre Completo: " +ANSI_GREEN+ nombreCompleto(getNombres(),getApellidos()) +ANSI_RESET+ 
				", Run: " +ANSI_GREEN+ descomponerRun(getRun()) +ANSI_RESET+ ", Fono: " +ANSI_GREEN+ fono +ANSI_RESET+ 
				", Edad=" +ANSI_GREEN+ edad +ANSI_RESET;
	}
	
	public void mostrarDatos() {
	    int i = 1;
	    for (Carga c : cargas) { 
	        System.out.println(ANSI_WHITE + "----------------- Carga: " + i + " -----------------------" + ANSI_RESET);
            System.out.println(c.toString()); 
            System.out.println(ANSI_PURPLE + "--------------------------------------------------" + ANSI_RESET);
            i++;
	    }
	        
	}


	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_PURPLE = "\u001B[35m";

}
