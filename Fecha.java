
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    private int dia;
    private int mes;
    private int anho;
    
    public Fecha(int dia, int mes, int anho){
        assert fechaValida(dia, mes, anho) : "La fecha es invalida";
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAnho(){
        return anho;
    }
    
    private boolean fechaValida(int dia, int mes, int anho){
        return true;
    }
    
}
