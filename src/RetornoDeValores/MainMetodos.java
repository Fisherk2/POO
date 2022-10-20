/*
 Clase principal
 */
package RetornoDeValores;

import javax.swing.JOptionPane;

public class MainMetodos {

    public static void main(String[] Op) {

        //INPUT
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo numero"));

        //OBJETOS
        Operacion op = new Operacion();
        //Invocacion de metodos
        int suma = op.sumar(numero1, numero2);//Se envian los argumentos al metodo de la clase Operacion y se almacenan en la variable local
        int resta = op.restar(numero1, numero2);
        int multiplicacion = op.multiplicar(numero1, numero2);
        int division = op.dividir(numero1, numero2);

        //OUTPUT n°1 usando el metodo de la clase Operacion
        op.impresion(suma, resta, multiplicacion, division); //Se envian los argumentos para la impresion de resultados
        //OUTPUT n°2 usando la invocacion de metodos para mostrar los valores retornados
        System.out.println("------------------------------" + "\nFORMA DE IMPRESION 2" + "\n________________________");
        System.out.println("La suma de los valores ingresados es: " + op.sumar(numero1, numero2));
        System.out.println("La resta de los valores ingresados es: " + op.restar(numero1, numero2));
        System.out.println("La multiplicacion de los valores ingresados es: " + op.multiplicar(numero1, numero2));
        System.out.println("La division de los valores ingresados es: " + op.dividir(numero1, numero2));
    }
}
