package diagnostico;
import java.util.Scanner;
public class dianostico {
	
public static void main (String [] args) {
	
	Scanner scan= new Scanner(System.in);
	
	String rut_usuario;
	String userData [][] = new String [100][10];
	
	
	
	System.out.println("ingrese datos para modificar");
	 rut_usuario = scan.nextLine();
}
boolean encontrado = false;

// buscar el usuario por RUN
for (int i = 0; i < usuarios.length; i++) {
    if (usuarios[i][0] != null && usuarios[i][0].getRun().equals(run)) {
        // usuario encontrado, pedir sus nuevos datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        usuarios[i][0].setNombre(scanner.nextLine());
        System.out.print("Fecha de nacimiento: ");
        usuarios[i][0].setFechaNacimiento(scanner.nextLine());
        System.out.print("RUN: ");
        usuarios[i][0].setRun(scanner.nextLine());
        System.out.print("Dirección: ");
        usuarios[i][1].setDireccion(scanner.nextLine());
        System.out.print("Teléfono: ");
        usuarios[i][1].setTelefono(scanner.nextLine());
        System.out.print("Cantidad de empleados: ");
        usuarios[i][1].setCantidadEmpleados(scanner.nextInt());
        System.out.print("Años de experiencia: ");
        usuarios[i][2].setAniosExperiencia(scanner.nextInt());
        System.out.print("Departamento: ");
        usuarios[i][2].setDepartamento(scanner.nextLine());
        System.out.print("Función: ");
        usuarios[i][3].setFuncion(scanner.nextLine());
        System.out.print("Nombre superior: ");
        usuarios[i][3].setNombreSuperior(scanner.nextLine());
        
        encontrado = true;
        break;
    }
}

if (!encontrado) {
    System.out.println("Usuario no encontrado");
}
}
}




//public void  modificarUsuario(String rut_usuario);

//}
//if (rut_usuario== true  {
    
  //  System.out.println:("ingresar datos" );

//} else {
	
//	  System.out.println:("no se modifican datos ");
//}while(activo){
	// return " Modificar Usuario");

//}
