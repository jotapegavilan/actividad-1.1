package vespertino_actividad1.pkg1;
/**
 *
 * @author Jotape
 */
public class RadioReloj {
    //Atributos de mi clase RadioReloj
    String color;
    double peso;
    boolean esOriginal;
    Reloj reloj;
    
    
    //Constructor sin parametros
    public RadioReloj(){
        
        
    }
   //Constructor que recibe todos los datos
    public RadioReloj(String c,double p, boolean eo,Reloj r){
        color = c;
        peso = p;
        esOriginal = eo;
        reloj = r;
    }
    
    //mutadores y accesadores
    
    public void setColor(String c){
        color = c;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setPeso(double p){
        peso = p;
    }
    public double getPeso(){
        return peso;
    }
    public void setEsOriginal(boolean eo){
        esOriginal=eo;
    }
    public boolean getEsOriginal(){
        return esOriginal;
    }
    
    public void setReloj(Reloj r){
        reloj = r;
    }
    public Reloj getReloj(){
        return reloj;
    }
    
    public void Imprimir(){
        
    }
    public void eliminarReloj(){
        if(esOriginal==false){
            //Aqui eliminaria el reloj
            reloj = null;
        }
    }
}   

