package vespertino_actividad1.pkg1;

/**
 *
 * @author Jotape
 */
public class Tienda {
    RadioReloj r1,r2,r3;
    int contadorRadioReloj;
    
    public Tienda(RadioReloj R1, RadioReloj R2, RadioReloj R3){
        r1 = R1;
        r2 = R2;
        r3 = R3;
        contadorRadioReloj = 3;
    }

    public RadioReloj getR1() {
        return r1;
    }

    public void setR1(RadioReloj r1) {
        this.r1 = r1;
    }

    public RadioReloj getR2() {
        return r2;
    }

    public void setR2(RadioReloj r2) {
        this.r2 = r2;
    }

    public RadioReloj getR3() {
        return r3;
    }

    public void setR3(RadioReloj r3) {
        this.r3 = r3;
    }

    public int getContadorRadioReloj() {
        return contadorRadioReloj;
    }

    public void setContadorRadioReloj(int contadorRadioReloj) {
        this.contadorRadioReloj = contadorRadioReloj;
    }
    public void imprimir(){
        int numero = 1;
        if(r1 != null){
            System.out.println(numero+" - "+r1.getColor());
            numero ++;
        }if(r2 != null){
            System.out.println(numero+" - "+r2.getColor());
            numero ++;
        }
        if(r3 != null){
            System.out.println(numero+" - "+r3.getColor());
            numero ++;
        }
    }
    public void pintarRadioRelojs(String color){
        r1.setColor(color);
        r2.setColor(color);
        r3.setColor(color);
    }
}
