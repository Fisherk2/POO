/*
 Clase principal
 */
package Metodos;

public class MainMetodos {

    public static void main(String[] Operadores) {
       
        //Creacion de objetos
        Operacion op = new Operacion(); 
        //Llamamos metodos de la clase Operacion
        op.leerNumeros();
        op.sumar();
        op.resta();
        op.multiplicar();
        op.dividir();
        op.impresion();
    }
}
