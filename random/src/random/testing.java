package random;

import java.util.Scanner;

public class testing {
	
	public static void main (String[]Args) {
		String userData [][] = new String [100][10];  //Arreglo/Matriz para ingreso y almacenamiento de los datos
		Scanner sc = new Scanner(System.in);
		boolean activo = true; // boolean para servir de interruptor de ciclo while
		while(activo){ //Inicia ciclo while para mantener en repeticion el menu de opciones.
	        System.out.println(" ");
	        System.out.println("Bienvenido");
	        System.out.println("Ingrese opción");
	        System.out.println("1 - Registrar Usuario");
	        System.out.println("2 - Mostrar Usuarios");
	        System.out.println("3 - Contar Usuarios por Categoria");
	        System.out.println("4 - Modificar Usuario");
	        System.out.println("5 - Eliminar Usuario");
	        System.out.println("6 - Salir");
	        int index = 0;
	        try{										//Try and Catch, Intenta recibir el index(opcion), en caso de recibir un ingreso que cause error
	            index = Integer.parseInt(sc.nextLine());//sino intenta atrapar el error y lanzar un mensaje al usuario de que la opcion no es valida.
	        } catch (Exception e){						//de ahi volveria al loop donde muestra el menu, hasta que eliga una de las opciones validas.
	            System.out.println("OPCIÓN NO VALIDA");
	        }
	       
	        switch(index){					//Switch permite derivar al usuario a ejecutar un grupo de acciones en especifico, determinadas por su case
	            case 1: // Crear alumno
	               registrarUsuario(userData, sc);
	                break;
	            case 2: //Mostrar Usuarios
	               
	                
	                break;
	            case 3: //Contar Usuarios por Categoria
	                
	                break;
	            case 4: //Modificar Usuario
	               
	                break;
	            case 5: //Eliminar Usuario
	                
	                break;                    
	            case 6: //Terminar
	                activo = false;
	                break;
	            default:
	                System.out.println("OPCIÓN NO VALIDA");
	        }
	        
	    	}
		sc.close(); //cierra el scanner.
	}
	
	public static int recArray() {
		int i;
		for (i=0; i<100; i++);
		for (int j= 0; j <10; j++);
		return i;
	}

	public static void registrarUsuario(String userData[][], Scanner sc) {
		String alto="0";
		String nombre="";
		boolean stop=false;
		while(stop){
			System.out.print("Ingrese nombre: ");
			nombre = sc.nextLine();
			if(nombre.isEmpty()){
				System.out.println("no puede estar vacio");
				System.out.println("ingrese nuevamente");
			} else if (nombre.equalsIgnoreCase(alto)){
				stop=true;
			} else {
				for (int i=0; i<100; i++)
     			for (int j= 0; j <10; j++){
				nombre = sc.nextLine();
				userData[i][j] = nombre;
				System.out.print(nombre+" ");
     			}
			}
			
		}		
			
	}
	
			
			
		
		
	
}
	


