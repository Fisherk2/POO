/*
 EJERCICIO 1: Construir un programa que calcule el area y el perimetro de un cuadrilatero dada la longitud de sus dos lados.
Los valores de la longitud deberan introducirse por linea de ordenes. Si es un cuadrado, solo se proporcionara la longitud de uno 
de los lados al cosntructor.
 */
package Ejercicio1;

import javax.swing.JOptionPane;

public class MainAreaPerimetro {

    public static void main(String[] args) {

        float lado1, lado2;
        //OBJETOS
        Cuadrilatero c1;

        //Inputs
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL LADO 1"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL LADO 2"));

        if (lado1 == lado2) { //Si los lados son de mismas dimensiones
            c1 = new Cuadrilatero(lado1); //Cuadrado
        } else {
            c1 = new Cuadrilatero(lado1, lado2); //Cuadrilatero
        }
        
        //Output
        System.out.println("El perimetro es: " + c1.getPerimetro()+" unidades");
        System.out.println("El area es: " + c1.getArea()+" unidades cuadradas");

    }

}
