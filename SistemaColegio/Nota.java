import java.io.BufferedReader;
import java.io.IOException;

public class Nota {
    private Double len;
    private Double mat;
    private Double his;
    private Double bio;
    private Double fis;
    private Double qui;
    private Double efi;
    private Double ing;
    private Double promG;

    private static String regOnlyDecimal = "((?<!^.)\\d+(.(?!$)|$))+";

    public Nota(){
    }   

    public Double getLen(){
        return len;
    }
    public Double getMat(){
        return mat;
    }
    public Double getHis(){
        return his;
    }
    public Double getBio(){
        return bio;
    }
    public Double getFis(){
        return fis;
    }
    public Double getQui(){
        return qui;
    }
    public Double getEfi(){
        return efi;
    }
    public Double getIng(){
        return ing;
    }

    public void setLen(Double len){
        this.len = len;
    }

    public void setMat(Double mat){
        this.mat = mat;
    }

    public void setHis(Double his){
        this.his = his;
    }

    public void setBio(Double bio){
        this.bio = bio;
    }

    public void setFis(Double fis){
        this.fis = fis;
    }

    public void setQui(Double qui){
        this.qui = qui;
    }

    public void setEfi(Double efi){
        this.efi = efi;
    }

    public void setIng(Double ing){
        this.ing = ing;
    }

    public Double getPromG() {
        return promG;
    }

    public void setPromG(Double promG) {
        this.promG = promG;
    }

    /*
     * Validadores de ingreso de notas
     */
    
     public static Double notaLen(BufferedReader br) throws IOException{
        boolean ok = false;
        String nlen = null;
        Double notalen = 0.0d;
        while (!ok) {
            System.out.print("Ingrese nota de Lenguage: ");
            nlen = br.readLine();
            if(nlen.matches(regOnlyDecimal)){
                notalen = Double.parseDouble(String.valueOf(nlen));
                ok = true;
            }
        }
        return notalen;
    }

    public static Double notaMat(BufferedReader br) throws IOException{
        boolean ok = false;
        String nmat = null;
        Double notamat = 0.0d;
        while (!ok) {
            System.out.print("Ingrese nota de Matematicas: ");
            nmat = br.readLine();
            if(nmat.matches(regOnlyDecimal)){
                notamat = Double.parseDouble(String.valueOf(nmat));
                ok = true;
            }
        }
        return notamat;
    }

    public static Double notaHis(BufferedReader br) throws IOException{
        boolean ok = false;
        String nhis = null;
        Double notahis = 0.0d;
        while (!ok) {
            System.out.print("Ingrese nota de Historia: ");
            nhis = br.readLine();
            if(nhis.matches(regOnlyDecimal)){
                notahis = Double.parseDouble(String.valueOf(nhis));
                ok = true;
            }
        }
        return notahis;
    }
    
    public static Double notaBio(BufferedReader br) throws IOException{
        boolean ok = false;
        String nbio = null;
        Double notabio = 0.0d;
        while (!ok) {
            System.out.print("Ingrese nota de Biología: ");
            nbio = br.readLine();
            if(nbio.matches(regOnlyDecimal)){
                notabio = Double.parseDouble(String.valueOf(nbio));
                ok = true;
            }
        }
        return notabio;
    }

    public static Double notaFis(BufferedReader br) throws IOException{
        boolean ok = false;
        String nfis = null;
        Double notafis = 0.0d;
        while (!ok) {
            System.out.print("Ingrese nota de Física: ");
            nfis = br.readLine();
            if(nfis.matches(regOnlyDecimal)){
                notafis = Double.parseDouble(String.valueOf(nfis));
                ok = true;
            }
        }
        return notafis;
    }

    public static Double notaQui(BufferedReader br) throws IOException{
        boolean ok = false;
        String nqui = null;
        Double notaqui = 0.0d;
        while (!ok) {
            System.out.print("Ingrese nota de Química: ");
            nqui = br.readLine();
            if(nqui.matches(regOnlyDecimal)){
                notaqui = Double.parseDouble(String.valueOf(nqui));
                ok = true;
            }
        }
        return notaqui;
    }

    public static Double notaEfi(BufferedReader br) throws IOException{
        boolean ok = false;
        String nefi = null;
        Double notaefi = 0.0d;
        while (!ok) {
            System.out.print("Ingrese nota de Educación Física: ");
            nefi = br.readLine();
            if(nefi.matches(regOnlyDecimal)){
                notaefi = Double.parseDouble(String.valueOf(nefi));
                ok = true;
            }
        }
        return notaefi;
    }

    public static Double notaIng(BufferedReader br) throws IOException{
        boolean ok = false;
        String ning = null;
        Double notaing = 0.0d;
        while (!ok) {
            System.out.print("Ingrese nota de Inglés: ");
            ning = br.readLine();
            if(ning.matches(regOnlyDecimal)){
                notaing = Double.parseDouble(String.valueOf(ning));
                ok = true;
            }
        }
        return notaing;
    }

    public String getAllNotas(){

        StringBuffer retorno = new StringBuffer("\n");
        retorno.append("Lenguaje: "+len.toString()+"\n");
        retorno.append("Matematicas: "+mat.toString()+"\n");
        retorno.append("Historia: "+his.toString()+"\n");
        retorno.append("Física: "+fis.toString()+"\n");
        retorno.append("Química: "+qui.toString()+"\n");
        retorno.append("Educación Física: "+efi.toString()+"\n");
        retorno.append("Inglés: "+ing.toString()+"\n");
        return retorno.toString();
    }

}
