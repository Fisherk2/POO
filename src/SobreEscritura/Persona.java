/*
SUBCLASE
 */
package SobreEscritura;

public class Persona extends Animal {

    @Override //Sirve para sobre escribir los metodos de la clase padre
    public void comer() {
        System.out.println("Estoy comiendo cheetos");
    }

    @Override //Se debe hacer por cada metodo declarado
    public void hablar() {
        System.out.println("Hola");
    }

}
