/*
SUBCLASE DE ANIMAL
 */
package Abstraccion;

public class Carnivoro extends Animal { //Se hereda los metodos de Animal que a su vez, este se hereda de Ser Vivo
    
    @Override //Se debe sobre escribir el metodo de la clase padre
    public void alimentarse(){ //El metodo que hereda debe si o si escribirse para que no genere una excepcion
        System.out.println("El animal carnivoro se alimenta de carne");
    }
    
}
