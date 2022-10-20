/*
 Clase principal
 */
package ParametrosArgumentos;

import javax.swing.JOptionPane;

public class MainMetodos {

    public static void main(String[] Op) {

        //INPUT
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo numero"));
        
        //OBJETOS
        Operacion op = new Operacion();
        //Invocacion de metodos
        op.sumar(numero1, numero2);//Se envian los argumentos al metodo de la clase Operacion
        op.restar(numero1, numero2);
        op.multiplicar(numero1, numero2);
        op.dividir(numero1, numero2);
        
        op.impresion(); //Se muestran resultados
    }
}
