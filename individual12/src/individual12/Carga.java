package individual12;

import java.util.Scanner;

public class Carga {
	
	protected String runCarga;
	protected String nombres;
	protected String apellidos;
	protected String runFamiliar;
	protected int parentesco;
	protected int edad;
	
	public Carga() {
		
	}
	
	public Carga(String runCarga, String nombres, String apellidos, String runFamiliar, int parentesco, int edad) {
		this.runCarga = runCarga;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.runFamiliar = runFamiliar;
		this.parentesco = parentesco;
		this.edad = edad;
	}
	public String getRunCarga() {
		return runCarga;
	}
	public String getNombres() {
		return nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getRunFamiliar() {
		return runFamiliar;
	}
	public int getParentesco() {
		return parentesco;
	}
	public int getEdad() {
		return edad;
	}
	public void setRunCarga(String runCarga) {
		this.runCarga = runCarga;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setRunFamiliar(String runFamiliar) {
		this.runFamiliar = runFamiliar;
	}
	public void setParentesco(int parentesco) {
		this.parentesco = parentesco;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String parentesco() {
		String relacion = "";
		if (parentesco == 1) {
			relacion = "Conyuge";
		}
		if (parentesco == 2) {
			relacion = "Hijo/a";
		}
		if (parentesco == 3) {
			relacion = "Otro";
		}
		return relacion;
	}
	
	Scanner sc = new Scanner(System.in);

	@Override
	public String toString() {
		return  "\n\t Run Carga: " +ANSI_GREEN+ runCarga +ANSI_RESET+ 
				"\n\t Nombre Completo: " +ANSI_GREEN+ nombreCompleto(nombres, apellidos) +ANSI_RESET+ 
				"\n\t Run del Familiar: "+ANSI_GREEN+ runFamiliar +ANSI_RESET+ 
				"\n\t Parentesco: " +ANSI_GREEN+ parentesco() +ANSI_RESET+ 
				"\n\t Edad: " +ANSI_GREEN+ edad+ANSI_RESET ;
	}
	
	public static String nombreCompleto(String nombres, String apellidos) {
		return nombres + " " + apellidos;
	}
	
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_RESET = "\u001B[0m";
	

}
