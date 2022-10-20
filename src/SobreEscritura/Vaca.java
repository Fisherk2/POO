/*
 SUBCLASE
 */
package SobreEscritura;

public class Vaca extends Animal {

    @Override //Sirve para sobre escribir los metodos de la clase padre
    public void comer() {
        System.out.println("Estoy comiendo pasto");
    }

    @Override //Se debe hacer por cada metodo declarado
    public void hablar() {
        System.out.println("Muuuu");
    }
}
