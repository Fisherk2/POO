package Ejercicio3;

public class Triangulo_Isosceles {
    //Atributos
    private double base;
    private double lado;
    
    //Contructor
    public Triangulo_Isosceles(double base, double lado){
        this.base=base;
        this.lado=lado;
    }
    
    //Metodos
    public double obtenerPerimetro(){
        double perimetro=(2*lado)+base;
        return perimetro;
    }
    
    public double obtenerArea(){
        double area=(base*(Math.sqrt((Math.pow(lado, 2))-(Math.pow(base, 2)/4))))/2;
        return area;
    }
}
