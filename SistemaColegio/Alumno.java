
public class Alumno extends Persona implements Comparable<Alumno>{
    private String curso;
    private Nota notas;
    private Double promGeneral;
    

    public Double getPromGeneral() {
        return promGeneral;
    }

    public void setPromGeneral(Double promGeneral) {
        this.promGeneral = promGeneral;
    }

    public Alumno(){
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public Nota getNotas(){
        return notas;
    }

    public void setNotas(Nota notas){
        this.notas = notas;
    }

    @Override
    public int compareTo(Alumno o) {
        Alumno otro = o;

        return this.getPromGeneral().compareTo(otro.getPromGeneral());
    } 


    
    
}

