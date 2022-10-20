/*
 * NOMBRE: Fisher
 * FECHA: 9/01/22
 * PROYECTO: POO
 */
package Threads;

/**
 * *Clase que va imprimir el bucle la letra H.
 * @author Fisher
 */
public class Hilo4 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("H");
            try {
                Hilo3.sleep(1000);//Frenamos el bucle por un segundo con cada iteracion
            } catch (InterruptedException ex) {
                System.err.println("ERROR EN LA CLASE DEL HILO 4");
            }
        }

    }

}
