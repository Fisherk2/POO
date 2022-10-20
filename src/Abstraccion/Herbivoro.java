/*
SUBCLASE DE ANIMAL
 */
package Abstraccion;

public class Herbivoro extends Animal {
    
    @Override //Se debe sobre escribir el metodo de la clase padre
    public void alimentarse(){ //El metodo que hereda debe si o si escribirse para que no genere una excepcion
        System.out.println("El animar herbivoro se alimenta de plantas");
    }
    
}
