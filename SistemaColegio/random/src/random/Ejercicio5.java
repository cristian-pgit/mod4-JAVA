package random;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio5{
    public static void main(String[] args) throws IOException {
        int opc = 0;
        while (opc != 5){
            System.out.println("Elija una operación: 1)Sumar, 2)Restar, 3)Multiplicar, 4)Dividir, 5)Apagar.");
            System.out.println("solo escriba el numero de la opcion");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String opcSt = br.readLine();
            boolean isDigit = opcSt.matches("[0-9]+");
            if (isDigit){
                opc = Integer.parseInt(opcSt);
                if (opc >5 || opc <1){
                    System.out.println("no existe esta opción, intente de nuevo");
                } else {
                    float x = 0;
                    float y = 0;
                    switch (opc){
                        case 1:
                        	x = tomarX();
                        	y = tomarY();
                            System.out.println("El resultado de la suma es: " +suma(x, y));
                            break;
                        case 2:
                        	x = tomarX();
                        	y = tomarY();
                            System.out.println("El resultado de la resta es: " +resta(x, y));
                            break;
                        case 3:
                        	x = tomarX();
                        	y = tomarY();
                            System.out.println("El resultado de la multiplicación es: " +multiplicacion(x, y));
                            break;
                        case 4:
                        	x = tomarX();
                        	y = tomarY();
                            if (y == 0){
                                System.out.println("No se puede dividir por 0, no se ponga filosofo");    
                            } else
                                System.out.println("El resultado de la división es: " +division(x, y));
                            break;

                        default:
                        	if (opc != 5) {
                        		System.out.println("ha ingresado un valor incorrecto (texto)");
                        	}
                        	
                            break;
                    }
                }
            } else {
            	if (opc != 5)
                System.out.println("ha ingresado un valor incorrecto (texto)");
            } 
            
        } 
        System.out.println("Ya se me frio el cerebro.....>_<!!, a mimir  *se fondea en la cama*");

    }
    
    public static float tomarX() throws IOException {
    	System.out.println("Ingrese primer digito");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String val1 = br2.readLine();
        float valX = 0;
        boolean isDigit = val1.matches("[0-9]+");
        if (isDigit){
           valX = Float.parseFloat(val1);   
        }
        return valX;
    }
    public static float tomarY() throws IOException {
        System.out.println("Ingrese segundo digito");
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String val2 = br3.readLine();
        float valY = 0;
        boolean isDigit = val2.matches("[0-9]+");
        if (isDigit){
            valY = Float.parseFloat(val2);
        }
        return valY;
    }

    public static float suma(float x, float y){
        return x+y;
    }

    public static float resta(float x, float y){
        return x-y;
    }

    public static float multiplicacion(float x, float y){
        return x*y;
    }

    public static float division(float x, float y){
        return x/y;
    }
}