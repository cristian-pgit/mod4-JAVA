import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inicio{
    public static void main(String[] args){
        List<Alumno> alumnos = new ArrayList<Alumno>();
        boolean activo = true;
        while(activo){
            System.out.println(" ");
            System.out.println("Bienvenido");
            System.out.println("Ingrese opción");
            System.out.println("1 - Crear alumno");
            System.out.println("2 - Mostrar alumnos");
            System.out.println("3 - Modificar alumnos");
            System.out.println("4 - Borrar alumnos");
            System.out.println("5 - Ingresar nota a alumno");
            System.out.println("6 - Mostrar promedio de alumno");
            System.out.println("7 - Mostrar promedio de alumnos");
            System.out.println("8 - Salir"); // 8 - Salir
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int index = 0;
            try{
                index = Integer.parseInt(br.readLine());
            } catch (Exception e){
                System.out.println("OPCIÓN NO VALIDA");
            }
            Alumno alumno = null;
            switch(index){
                case 1: // Crear alumno
                    alumnos.add(crearAlumnos(alumnos));
                    break;
                case 2: //mostrar alumno
                    mostrarAlumnos(alumnos);
                    
                    break;
                case 3: //modificar alumno
                    alumno =  buscarAlumno(alumnos);
                    if (alumno != null){
                        mostrarAlumno(alumno);
                        modificarAlumno(alumno);
                    }
                    break;
                case 4: //borrar alumno
                    for (int x = 0; x < alumnos.size(); x++){
                        System.out.println((x+1)+" - "+alumnos.get(x).getNombre());
                    }                   
                    System.out.println("Ingrese el numero del alumno que desee borrar");
                    try{
                        br = new BufferedReader(new InputStreamReader(System.in));
                        int num = Integer.parseInt(br.readLine());
                        alumnos.remove(num-1);
                        System.out.println("ALUMNO BORRADO EXITOSAMENTE");
                    }catch (Exception e){
                        System.out.println("HUBO UN ERROR. INTENTE DE NUEVO");
                    }
                    break;
                case 5: //asignar nota a alumno
                    alumno =  buscarAlumno(alumnos);
                    if (alumno != null){
                        mostrarAlumno(alumno);
                        alumno.setNotas(crearNotas());
                    }
                    break;
                case 6://ver notas promedio alumno
                    alumno =  buscarAlumno(alumnos);
                    if (alumno != null){
                        sacarPromedio(alumno.getNotas());
                        alumno.setPromGeneral(alumno.getNotas().getPromG());
                        if (alumno.getPromGeneral() < 4){
                            System.out.println("El Alumno "+alumno.getNombre()+" tiene un promedio de: "+alumno.getPromGeneral()+" Va a reprobar el año");
                        } else System.out.println("El Alumno "+alumno.getNombre()+" tiene un promedio de: "+alumno.getPromGeneral()+" Aprueba el año");
                    }
                    
                    break;
                case 7: //Mostrar promedio de alumnos en orden descendente.
                    Collections.sort(alumnos);
                    Collections.reverse(alumnos);
                    System.out.println("Lista de Alumnos y su Promedio General <orden descendente>");
                    for (Alumno alu: alumnos){
                        System.out.println(alu.getNombre()+" - "+alu.getPromGeneral());
                    }
                    break;                    
                case 8: //Terminar
                    activo = false;
                    break;
                default:
                    System.out.println("OPCIÓN NO VALIDA");
            }
        }
    }

    private static void mostrarAlumnos( List<Alumno> alumnos) {
        for (int x = 0; x < alumnos.size(); x++){
            System.out.println("ALUMNO "+(x+1));
            mostrarAlumno(alumnos.get(x));
        }
    }

    private static void mostrarAlumno(Alumno alumno){
        System.out.println("Nombre: "+alumno.getNombre());
        System.out.println("RUN: "+alumno.getIdentificacion());
        System.out.println("Nacionalidad: "+alumno.getNacionalidad());
        System.out.println("Dirección: "+alumno.getMovil());
        System.out.println("Genero: "+alumno.getGenero());
        System.out.println("Correo Electronico: "+alumno.getCorreo());
        if (alumno.getNotas()!=null){
            System.out.println("Notas: "+alumno.getNotas().getAllNotas());
        }
        System.out.println("------------------");
    }

    private static Alumno crearAlumnos(List<Alumno> alumnos)
    { 
        Alumno alumno = new Alumno();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String rut = ValidadorAlumno.validarRun(alumnos, br);
            alumno.setIdentificacion(rut);
            alumno.setNombre(ValidadorAlumno.validarNombreApellido(br));
            
            alumno.setNacionalidad(ValidadorAlumno.validaNacionalidad(br));
            alumno.setCorreo(ValidadorAlumno.validaDireccion(br));
            alumno.setMovil(ValidadorAlumno.validaMovil(br));
            alumno.setGenero(ValidadorAlumno.validaGenero(br));
            alumno.setCorreo(ValidadorAlumno.validarCorreo(br));
            System.out.println("ALUMNO CREADO EXITOSAMENTE");
            return alumno;
        } catch(Exception e){
            System.out.println("HUBO UN ERROR. INTENTE DE NUEVO");
            e.printStackTrace();
            return null;
        }
    }

    private static Alumno buscarAlumno(List<Alumno> alumnos){
        Alumno alumno = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try{
                System.out.println("Introduce la ID del alumno que quieres buscar.");
                String id = br.readLine();
                boolean encontrado = false;
                
                for (Alumno alu : alumnos){
                    if (alu.getIdentificacion().equals(id)){
                        encontrado = true;
                        alumno = alu;
                        break;
                    }
                }
                if (!encontrado){
                    System.out.println("ALUMNO NO ENCONTRADO");
                }
            }catch(Exception e){
                System.out.println("HUBO UN ERROR. INTENTE DE NUEVO");
            }
            return alumno;
    }

    private static Alumno modificarAlumno(Alumno alumno) {
        boolean segMo = false; //SEGundo MOdificar
        try{
            while (segMo == false){
            System.out.println("Que desea modificar?");
            System.out.println("Ingrese opción");
            System.out.println("1 - Modificar Nombre"); // se excluye modificar RUN por ser Clave primaria
            System.out.println("2 - Modificar Nacionalidad");
            System.out.println("3 - Modificar Dirección");
            System.out.println("4 - Modificar Número telefonico");
            System.out.println("5 - Modificar Genero");
            System.out.println("6 - Modificar Correo Electronico");
            System.out.println("7 - Modificar Notas");
            System.out.println("8 - Terminar modificación");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int index = 0;
                try{
                    index = Integer.parseInt(br.readLine());
                } catch (Exception e){
                    System.out.println("OPCIÓN NO VALIDA");
                }

                switch(index){
                    case 1:
                        alumno.setNombre(ValidadorAlumno.validarNombreApellido(br));
                        break;
                    case 2:
                        alumno.setNacionalidad(ValidadorAlumno.validaNacionalidad(br));
                        break;
                    case 3:
                        alumno.setCorreo(ValidadorAlumno.validaDireccion(br));
                        break;
                    case 4:
                        alumno.setMovil(ValidadorAlumno.validaMovil(br));
                        break;
                    case 5:
                        alumno.setGenero(ValidadorAlumno.validaGenero(br));
                        break;
                    case 6:
                        alumno.setCorreo(ValidadorAlumno.validarCorreo(br));    
                        break;
                    case 7:
                        alumno.setNotas(crearNotas());
                        break;
                    case 8:
                        segMo = true;
                        break;
                    default:
                        System.out.println("OPCIÓN NO VALIDA");
                }
            }
        } catch (IOException e){
            
        }
        
        return alumno;
    }

    private static Nota crearNotas(){
        Nota notas = new Nota();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            notas.setLen(Nota.notaLen(br));
            notas.setMat(Nota.notaMat(br));
            notas.setHis(Nota.notaHis(br));
            notas.setBio(Nota.notaBio(br));
            notas.setFis(Nota.notaFis(br));
            notas.setQui(Nota.notaQui(br));
            notas.setEfi(Nota.notaEfi(br));
            notas.setIng(Nota.notaIng(br));
            notas.setPromG(sacarPromedio(notas));
            System.out.println("NOTAS ASIGNADAS CORRECTAMENTE");
            return notas;
        } catch(Exception e){
            System.out.println("HUBO UN ERROR. INTENTE DE NUEVO");
            e.printStackTrace();
            return null;
        }
    }

    public static Double sacarPromedio(Nota nota){
        
        double suma = nota.getLen() + nota.getMat() + nota.getHis() + nota.getBio() + nota.getFis() + nota.getQui() + nota.getEfi() + nota.getIng();
        double prom = suma/7;
        double promFinal = Math.round(prom * 100.0) / 100.0;
        
        return promFinal;
    }


}