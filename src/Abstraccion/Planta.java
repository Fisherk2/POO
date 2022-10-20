/*
SUBCLASE DE SER VIVO
 */
package Abstraccion;

public class Planta extends SerVivo {

    @Override //Se debe sobre escribir el metodo de la clase padre
    public void alimentarse() { //El metodo que hereda debe si o si escribirse para que no genere una excepcion
        System.out.println("Se alimenta a travez de la fotosintesis");
    }

}
