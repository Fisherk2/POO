/*
 * NOMBRE: Fisher
 * FECHA: 8/01/22
 * PROYECTO: POO
 */
package Threads;

/**
 * Clase que implementa la clase interface Runnable, segunda manera de crear un
 * hilo.
 *
 * @author Fisher
 */
public class ClaseRunnable implements Runnable {//Implementamos la clase interface Runnable

    //ATRIBUTO
    private int parametro;
    private String StParametro;
    private Thread procesoRunnable; //SERVIRA PARA USAR EL METODO ESTATICO sleep( ) DE LA CLASE THREAD

    //CONSTRUCTOR VACIO
    public ClaseRunnable() {
    }

    //CONSTRUCTOR CON ARGUMENTOS
    public ClaseRunnable(String nombreDelHilo) {
        this.StParametro = nombreDelHilo;
    }

    public void setParametro(int parametro) {
        this.parametro = parametro;
    }

    //Debemos declarar todos los metodos necesarios de la clase interface Runnable
    @Override
    public void run() {
        procesoRunnable = new Thread(this);
        for (int i = 0; i < parametro; i++) {
            //.getName nos devuelve el nombre de este hilo, debemos crear un objeto de la clase Thread para poder declarar ese metodo
            System.out.println(StParametro + " :" + i + " " + procesoRunnable.getName());
            //Podemos fijar el BLOQUEADO de un hilo desde aqui.
            try {
                procesoRunnable.sleep(1000);//Frenamos el bucle por un segundo con cada iteracion
            } catch (InterruptedException ex) {
                System.err.println("ERROR EN EL HILO DE LA CLASE RUNNABLE");
            }
        }
    }

}
