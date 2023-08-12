package Aula02;

public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void estadoCaneta(){
        System.out.println("Modelo da caneta: "+this.modelo);
        System.out.println("Cor da Caneta: "+ this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        
    }
    void rabiscar(){
        
    }
    void tampar(){
        
    }
    void destampar(){
        
    }
}
