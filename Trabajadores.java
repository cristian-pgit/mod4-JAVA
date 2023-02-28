package individual10;

import java.util.Scanner;

public class Trabajadores {
	
	private String nombres;
	private String apellidos;
	private String run;
	private int fono;
	private int edad;
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
	
	public Trabajadores() {
		
	}
	
	public Trabajadores(String nombres, String apellidos, String run, int fono, int edad) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.run = run;
		this.fono = fono;
		this.edad = edad;	
	}
	
	
	public static String nombreCompleto(String nombres, String apellidos) {
		return nombres + " " + apellidos;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public static int descomponerRun(String run, Scanner sc) {
		boolean ok = false;
        while (!ok) {
            System.out.print("Ingrese RUN: ");
            run = sc.nextLine();		
			//limpiar run eliminado . y guiones
	        run = run.toUpperCase(); //vuelve la K a mayuscula
	        run = run.replace(".", "");
	        run = run.replace("-", "");
        }
	   //dividendo rut en numero y digito verificador
	   String runA = run.substring(0, run.length() - 1);
	   runA = runA.replaceAll("[A-Za-z]", "");
          
	   return Integer.parseInt(runA);
	}
	
	@Override
	public String toString() {
		return "Trabajadores [nombres=" + nombres + ", apellidos=" + apellidos + ", run=" + run + ", fono=" + fono
				+ ", edad=" + edad + "]";
	}
	

}
