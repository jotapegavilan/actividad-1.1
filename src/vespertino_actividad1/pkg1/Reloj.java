package vespertino_actividad1.pkg1;
/**
 *
 * @author Jotape
 */
public class Reloj {
    int horas, minutos, segundos;
    
    // constructor sin parametros
    public Reloj(){
        
    }    
    // constructor con 3 parametros
    public Reloj(int h, int m, int s){
        horas = h;
        minutos = m;
        segundos = s;
    }
    // accesador horas
    public int getHoras(){
        return horas;
    }
    // mutador horas
    public void setHoras(int h){
        horas = h;
    }
    public int getMinutos(){
        return minutos;
    }
    public void setMinutos(int m){
        minutos = m;
    }    
    public int getSegundos(){
        return segundos;
    }    
    public void setSegundos(int s){
        segundos = s;
    }
    
    //método que imprime por pantalla es un método de tipo void
    public void imprimirHora(){
        System.out.println("La hora es "+horas+":"+minutos+":"+segundos);
    }
    public void aumentarMinutos(){
        
    }
    
    public void imprimirHora_con_formato(){
        
    }
}
