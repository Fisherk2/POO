/*
 * NOMBRE: Fisher
 * FECHA: 8/01/22
 * PROYECTO: POO
 */
package Threads;

/**
 * HILOS EN JAVA: Un hilo (Thread), es un flujo de control dentro de un
 * programa, el cual permite tener multiples procesos corriendo de forma
 * simultanea. Con ayuda de los hilos, podemos ejecutar dos o mas procesos al
 * mismo tiempo, sin tener que esperar a que finalice un proceso para poder
 * ejecutar el siguiente. Un hilo y un proceso se diferencian en cuestiones como
 * lo es el espacio de memoria.
 *
 * @author Fisher
 */
public class MainHilos {

    public static void main(String[] args) {
        /*
        PROCESO: Un proceso puede estar compuesto de
        múltiples hilos. 
        HILO: Es un flujo de programa.
         */
        MainHilos navegador = new MainHilos();

        //Normalmente cuando se ejecuta en JAVA, ira en orden descendente
        for (int i = 0; i < 5; i++) { //Primero ejecutara este flujo de programa
            System.out.println("Proceso 1: " + i);
        }
        System.out.println("-------------------");
        for (int i = 0; i < 5; i++) { //Despues ejecutara este flujo de programa
            System.out.println("Proceso 2: " + i);
        }
        System.out.println("-------------------");
        //NOTA: La impresion va variar dependiendo de la capacidad de procesamiento de nuestra PC

        navegador.ThreadYRunnable();
        navegador.HiloConParametros();
        navegador.EstadoDeHilos();
        navegador.SincronizacionHilos();
    }

    /**
     * Metodo que crea dos hilos, uno con la Clase Thread y otro con la clase
     * Runnable
     */
    private void ThreadYRunnable() {
        ClaseThread hilo1 = new ClaseThread();
        ClaseThread hilo3 = new ClaseThread();
        //Para usar una clase que implementa Runnable, debemos instanciar un objeto de tipo Thread
        Thread hilo2 = new Thread(new ClaseRunnable());//Le pasamos de parametro un objeto del tipo que de la clase que implementamos
        //Para que los hilos funcionen correctamente, primero debemos crear los objetos antes de invocar el metodo start( )
        hilo1.start();//Este flujo de programa se esta arrancando de manera simultanea
        hilo2.start();//Este flujo de programa se esta arrancando de manera simultanea
        hilo3.start();//Este flujo de programa se esta arrancando de manera simultanea
    }

    /**
     * Formas de pasar parametros cuando se manejan las dos formas de hacer
     * hilos.
     */
    private void HiloConParametros() {
        ClaseThread hilo1 = new ClaseThread("Hilo 1");//Enviara el nombre del hilo como parametro
        ClaseThread hilo3 = new ClaseThread("Hilo 3");//Enviara el nombre del hilo como parametro
        ClaseRunnable proceso2 = new ClaseRunnable("Hilo 2");
        Thread hilo2 = new Thread(proceso2);
        //Pasamos los parametros por medio de un metodo SET
        hilo1.setParametro(3);
        proceso2.setParametro(4);
        hilo3.setParametro(5);

        hilo1.start();//Este flujo de programa se esta arrancando de manera simultanea
        hilo2.start();//Este flujo de programa se esta arrancando de manera simultanea
        hilo3.start();//Este flujo de programa se esta arrancando de manera simultanea

    }

    /**
     * Forma de darle un estado un hilo, NEW, EJECUTABLE, BLOQUEADO Y MUERTO.
     */
    private void EstadoDeHilos() {
        /*
        Cuando se crea un hilo pero no se ha ejecutado todavia el metodo start( ),
        te lanzara una excepcion de tipo IllegarThreadStateException. 
        Cuando el metodo start( )  crea los recursos del sistema necesariospara ejecutar el hilo,  
        programa el thread para ejecutarse, y llama al metodo run( ) de nuestra clase.
        En este punto el hilo esta en el estado "EJECUTABLE".
        Cuando se encuentra en el estado "BLOQUEADO" (Not Runnable), el hilo se encuentra en
        ejecucion pero existe una tarea o actividad del mismo hilo que lo impide.
        Un hilo puede morir de dos formas: por causas naturales o siendo asesinado (parado).
        Una muerte natural se produce cuando su metodo run( ) termina como es debido,
        mientras que una muerte provocada se produce cuando existe una isntruccion que oblique al 
        hilo a finalizar sin haber concluido su tarea por completo. 
        Este punto del hilo se le denona "MUERTO/FINALIZADO" (Dead).
         */
        //Estado NEW
        ClaseThread hilo1 = new ClaseThread("Hilo 1");
        ClaseRunnable proceso2 = new ClaseRunnable("Hilo 2");
        Thread hilo2 = new Thread(proceso2);
        ClaseThread hilo3 = new ClaseThread("Hilo 3");
        hilo1.setParametro(5);//Esto solo servira para dar funcion al bucle
        proceso2.setParametro(3);
        hilo3.setParametro(10);

        //Estado EJECUTABLE
        hilo1.start();//Este flujo de programa se esta arrancando de manera simultanea

        //Estado BLOQUEADO, debemos capturar la excepcion InterruptedException para que podamos usar el metodo estaticp sleep( )
        try {
            hilo1.sleep(1000);//Frenaremos el algoritmo del hilo por 1 segundo (1000 milisegundos)
        } catch (InterruptedException ex) {
            System.err.println("ERROR, NO SE HA PODIDO INTERRUMPIR EL HILO 1: " + ex);
        }

        //Estado EJECUTABLE
        hilo2.start();//Este flujo de programa se esta arrancando de manera simultanea, pero con retraso de 1 segundos

        //Estado BLOQUEADO, debemos capturar la excepcion InterruptedException para que podamos usar el metodo estaticp sleep( )
        try {
            hilo2.sleep(5000);//Frenaremos el algoritmo del hilo por 5 segundos (5000 milisegundos)
        } catch (InterruptedException ex) {
            System.err.println("ERROR, NO SE HA PODIDO INTERRUMPIR EL HILO 2: " + ex);
        }

        //Estado EJECUTABLE
        hilo3.start();//Este flujo de programa se esta arrancando de manera simultanea
        //Estado MUERTO
        hilo3.stop();//Finalizamos de manera intencional el hilo

        //POR LO TANTO, EL PROGRAMA TERMINA 5 SEGUNDOS DESPUES DE QUE EL HILO 2 HAYA EJECUTADO
    }

    /**
     * Forma de hacer sincronizar multiple hilos.
     */
    private void SincronizacionHilos() {
        /*
        La sincronizacion de hilos permite controlar el tiempo y forma de ejecucion de varios hilos ejecutandose de
        manera simultanea, cuya finalidad, es evitar que un hilo provoque el entorpecimiento de otro hilo al momento
        de estar ejecutando sus respectivas tareas. O bien, para establecer un orden de ejecucion en nuestros programas
        al utilizar hilos.
        
         */
        Thread proceso1 = new Thread(new Hilo1());//RUNNABLE
        Thread proceso2 = new Thread(new Hilo2());//RUNNABLE
        Hilo3 proceso3 = new Hilo3();//THREAD
        Hilo4 proceso4 = new Hilo4();//THREAD

        proceso1.start();//Este flujo de programa se esta arrancando de manera simultanea
        try {
            proceso1.sleep(10);//Va detener el siguiente hilo por un segundo
        } catch (InterruptedException ex) {
            System.err.println("ERROR EN EL HILO 1");
        }
        proceso2.start();//Este flujo de programa se esta arrancando de manera simultanea
        try {
            proceso2.sleep(10);//Va detener el siguiente hilo por un segundo
        } catch (InterruptedException ex) {
            System.err.println("ERROR EN EL HILO 2");
        }
        proceso3.start();//Este flujo de programa se esta arrancando de manera simultanea
        try {
            proceso3.sleep(10);//Va detener el siguiente hilo por un segundo
        } catch (InterruptedException ex) {
            System.err.println("ERROR EN EL HILO 3");
        }
        proceso4.start();//Este flujo de programa se esta arrancando de manera simultanea
        try {
            proceso4.sleep(10);//Va terminar el programa un segundo despues
        } catch (InterruptedException ex) {
            System.err.println("ERROR EN EL HILO 4");
        }

    }

}
