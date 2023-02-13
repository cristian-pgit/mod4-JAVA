public class Profesor extends Persona{
    private String profesion;

    public Profesor(String nombre) {
    }

    public String getProfesion(){
        return profesion;
    }

    public void setProfesion(String profesion){
        this.profesion = profesion;
    }

    public String saludar(){
        return "";
    }

    public String saludando(){
        return "";
    }
}
