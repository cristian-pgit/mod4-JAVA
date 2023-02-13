import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class ValidadorAlumno {
    
    public ValidadorAlumno(){

    }
    //Valida Nombre
    public static String validarNombreApellido(BufferedReader br) throws IOException{
        boolean ok = false;
        String data = null;
        while (!ok) {
            System.out.print("Ingrese un nombre: ");
            data = br.readLine();
            if (data.length()>3){
                ok = true;
            }
         }
        return data;
    }

    /*
     * Validar identificacion
     */
    public static String validarRun(List<Alumno> alumnos, BufferedReader br) throws IOException{
        boolean ok = false;
        String run = null;
        while (!ok) {

            System.out.print("Ingrese RUN: ");
            run = br.readLine();
            
            //limpiar run eliminado . y guiones
            run = run.toUpperCase(); //vuelve la K a mayuscula
            run = run.replace(".", "");
            run = run.replace("-", "");  
            //dividendo rut en numero y digito verificador
            String runA = run.substring(0, run.length() - 1);
            runA = runA.replaceAll("[A-Za-z]", "");
            //obtener digito verificador
            char dv = run.charAt(run.length() - 1);
            
            if(!runA.matches("[0-9]+")){
                System.out.println("El rut contiene caracteres no validos");
            }  else {
                    //invertir rut para su calculo
                    Object[] array = invertir(runA.split(""));
                                
                    //obtener resultado de rut
                    int rutSumado = cacularSumaRut(array);

                    int resto = rutSumado % 11;
                    String digito = String.valueOf(11 - resto);
                    if (digito.equals("11")) {
                        digito = "0";
                    }
                    
                    if (digito.equals("10")) {
                        digito = "K";
                    }

                    if (dv == digito.charAt(0)){
                        Alumno alu = new Alumno();
                        alu.setIdentificacion(run);
                        if (!alumnos.contains(alu)){
                            ok = true; 
                        } else {
                            System.out.println("El rut ya se encuentra ingrsado.");
                        }
                        
                    } else {
                        System.out.println("El rut no es valido");
                    }
            }

        }
        return run;
    }
    private static int cacularSumaRut(Object[] array) {
        int rutSumado = 0;
        int a = 2;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt((String) array[i]) * a;
            rutSumado += Integer.parseInt(String.valueOf(array[i]));
            if (a == 7) {
                a = 1;
            }
            a++;
        }
        return rutSumado;
    }
    //invertir run para su derivacion
    public static Object[] invertir(Object[] array) {
        Object[] invertir_int = new Object[array.length];
        int maximo = array.length;
      
        for (int i = 0; i < array.length; i++) {
          //Object j = array[maximo - 1];
          invertir_int[maximo - 1] = array[i];
          maximo--;
          }
        return invertir_int;
    }

    
    /*
     * Validar Nacionalidad
     */
    public static String validaNacionalidad(BufferedReader br) throws IOException{ 
        boolean ok = false;
        String nac = null;
        while (!ok) {
            System.out.print("Ingrese nacionalidad: ");
            nac = br.readLine();
            if (nac.length()>3){
                ok = true;
            }
         }
        return nac;
    }
    /*
     * Validar Direccion
     */
    public static String validaDireccion(BufferedReader br) throws IOException{ 
        boolean ok = false;
        String dir = null;
        while (!ok) {
            System.out.print("Ingrese dirección: ");
            dir = br.readLine();
            if (dir.length()>0){
                ok = true;
            }
         }
        return dir;
    }
    /*
     * Validar Numero de telefono
     */
    public static String validaMovil(BufferedReader br) throws IOException{
        boolean ok = false;
        String fono = null;
        while (!ok) {
            boolean largo = false;
            boolean esDigito = false;
            System.out.print("Ingrese un telefono de contacto: ");
            fono = br.readLine();
            if(fono.length() == 11){
                largo = true;
            }
            if(fono.matches("[0-9]+")){
                esDigito = true;
            }
            ok = largo && esDigito;
        }
        return fono;
    }
    /*
     * Validar Genero
     */
    public static char validaGenero(BufferedReader br) throws IOException{
        boolean ok = false;
        String gen = "";
        while (!ok) {
            System.out.print("Seleccione Genero: ");
            gen = br.readLine();
            if("F".equals(gen.toUpperCase()) || 
                "M".equals(gen.toUpperCase()) || "O".equals(gen.toUpperCase())){
                ok = true;
            }
        }
        return gen.charAt(0); 
    }
    
     /*
     * Validar formato de Correo
     */
    public static String validarCorreo(BufferedReader br) throws IOException{
        boolean ok = false;
        String mail = null;
        while (!ok) {
            System.out.print("Ingrese un Correo Electronico:");
            mail = br.readLine();
            if (mail.length() <= 30)
                ok = true;           
        }
        return mail;
    }

    
}
