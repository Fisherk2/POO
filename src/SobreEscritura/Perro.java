/*
SUBCLASE
 */
package SobreEscritura;

public class Perro extends Animal {

    @Override //Sirve para sobre escribir los metodos de la clase padre
    public void comer() {
        System.out.println("Estoy comiendo croquetas");
    }

    @Override //Se debe hacer por cada metodo declarado
    public void hablar() {
        System.out.println("Guau guau");
    }
}
