/*
 * NOMBRE: Fisher
 * FECHA: 8/01/22
 * PROYECTO: POO
 */
package Threads;

/**
 * Clase que hereda la clase por defecto de JAVA llamado Thread, primera manera
 * de crear un hilo.
 *
 * @author Fisher
 */
public class ClaseThread extends Thread {//Debemos heredar de la clase Thread para usar su metodos y atributos

    //ATRIBUTO
    private int intParametro;

    //CONSTRUCTOR VACIO
    public ClaseThread() {
    }

    //CONSTRUCTOR CON ARGUMENTOS
    public ClaseThread(String nombreDelHilo) {
        //Enviamos al constructor padre el parametro que recibimos de la clase principal, este nombrara al hilo
        super(nombreDelHilo);
    }

    public void setParametro(int parametro) {
        this.intParametro = parametro;
    }

    //Debemos declarar este metodo y sobrescribirlo, ya que lo heredamos de la clase Thread
    @Override
    public void run() {
        for (int i = 0; i < intParametro; i++) {
            //.getName nos devuelve el nombre de este hilo, solo se puede aplicar cuando heredamos directamente de Thread
            System.out.println(this.getName() + ": " + +i);
            //Podemos fijar el BLOQUEADO de un hilo desde aqui.
            try {
                this.sleep(1000); //Imprimira por segundo
            } catch (InterruptedException ex) {
                System.err.println("ERROR, NO SE HA PODIDO INTERRUMPIR EN LA CLASE DEL HILO 1: " + ex);
            }

        }
    }

}
