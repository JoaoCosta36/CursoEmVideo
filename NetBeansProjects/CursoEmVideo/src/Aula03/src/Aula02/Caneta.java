package Aula02;

public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void estadoCaneta(){
        System.out.println("Modelo da caneta: "+this.modelo);
        System.out.println("Cor da Caneta: "+ this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga); 
    }
    public void escrever(){
         
    }
    public void rabiscar(){
        
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
