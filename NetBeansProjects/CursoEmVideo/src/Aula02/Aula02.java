package Aula02;

/**
 *
 * @author jcosta
 */
public class Aula02 {

    public static void main(String[] args) {
        //Caneta 1
        System.out.println("CANETA 1\n");
        Caneta c1 = new Caneta();
        c1.cor="azul";
        c1.ponta=0.5f;
        c1.tampada=false;
        c1.estadoCaneta();
        //Caneta 2
        System.out.println("CANETA 2\n");
        Caneta c2 = new Caneta();
        c2.cor="vermelha";
        c2.ponta=0.7f;
        c2.tampada=true;
        c2.estadoCaneta();
        
        
    }
    
}
