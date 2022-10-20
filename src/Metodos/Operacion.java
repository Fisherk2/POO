/*
 Clase Operacion
 */
package Metodos;

import javax.swing.JOptionPane;

public class Operacion {

    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos
    public void leerNumeros() { //Metodo que no retorna valores (VOID) para pedirle al usuario que nos digite dos numeros
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBA UN NUMERO"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBA UN NUMERO"));
    }

    public void sumar() { //Metodos que no retorna que suma/resta/multiplica/divide los valores ingresador por el usuario
        suma = numero1 + numero2;
    }

    public void resta() {
        resta = numero1 - numero2;
    }

    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    public void dividir() {
        division = numero1 / numero2;
    }

    public void impresion() { //Metodo que no retorna que imprime resultados
        System.out.println("La suma de los valores ingresados es: " + suma);
        System.out.println("La resta de los valores ingresados es: " + resta);
        System.out.println("La multiplicacion de los valores ingresados es: " + multiplicacion);
        System.out.println("La division de los valores ingresados es: "+division);

    }
}
