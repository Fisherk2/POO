/*
SUBCLASE
 */
package Ejercicio4;

public class Rectangulo extends Poligono{
    //Atributos
    private double lado1,lado2;
    
    //Constructor

    public Rectangulo(double lado1, double lado2) {
        super(2); //Como ya sabemos el numero de lados que vamos a utilizar, solo mandamos dos al constructor de la clase Padre
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodos
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override //Esta sobre escribiendo el metodo java.lang.Object que viene en la libreria del lenguaje
    //Tiene el mismo proposito que el metodo mostrar datos de los ejercicios anteriores
    public String toString() { //Generar codigo/toString( ); 
        return "RECTANGULO"
                +"\n_________________\n"+super.toString() //Imprimir los valores de la clase Padre
                +"Lado 1= " + lado1+"\nLado 2= "+lado2+"\n";
    }
    
    @Override //Sobre escribimos el metodo abstracto de la SuperClase
    public double area(){
        double area = lado1*lado2;
        return area;
    }
    
}
