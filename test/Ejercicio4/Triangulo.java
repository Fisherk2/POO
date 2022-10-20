/*
SUBCLASE
 */
package Ejercicio4;

public class Triangulo extends Poligono {

    //Atributos
    private double lado1, lado2, lado3;

    //Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        super(3); //Como ya sabemos el numero de lados que vamos a utilizar, solo mandamos tres al constructor de la clase Padre
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //Metodos
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override //Esta sobre escribiendo el metodo java.lang.Object que viene en la libreria del lenguaje
    //Tiene el mismo proposito que el metodo mostrar datos de los ejercicios anteriores
    public String toString() { //Generar codigo/toString( ); 
        return "TRIANGULO"
                + "\n_________________\n" + super.toString() //Imprimir los valores de la clase Padre
                + "Lado 1= " + lado1 + "\nLado 2= " + lado2 + "\nLado 3= " + lado3 + "\n";
    }

    @Override//Sobre escribimos el metodo abstracto de la SuperClase
    public double area() {
        double area, semiPerimetro;
        semiPerimetro = (lado1 + lado2 + lado3) / 2;
        //Formula de Heron
        area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
        return area;
    }
}
