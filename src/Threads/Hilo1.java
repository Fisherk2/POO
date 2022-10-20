/*
 * NOMBRE: Fisher
 * FECHA: 9/01/22
 * PROYECTO: POO
 */
package Threads;

/**
 * Clase que va imprimir el bucle la letra F.
 *
 * @author Fisher
 */
public class Hilo1 implements Runnable {

    Thread proceso; //SERVIRA PARA USAR EL METODO ESTATICO sleep( ) DE LA CLASE THREAD

    @Override
    public void run() {
        proceso = new Thread(this);
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ".- F");
            try {
                proceso.sleep(1000);//Frenamos el bucle por un segundo con cada iteracion
            } catch (InterruptedException ex) {
                System.err.println("ERROR EN LA CLASE DEL HILO 1");
            }
        }

    }

}
