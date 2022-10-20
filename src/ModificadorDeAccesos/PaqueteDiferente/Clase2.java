/*
CLASE ORIGINAL
 */
package ModificadorDeAccesos.PaqueteDiferente;

public class Clase2 {

    public static void main(String[] args) {
        //OBJETOS
        Clase1 obj1 = new Clase1();

        //INVOCACIONES
        obj1.atributo1 = 15; //El atributo esta por default, por lo tanto solo puede manejarse en este paquete
        obj1.atributo2 = 15; //El atributo es publico, por lo tanto puedo manejarlo en paquetes distintos
        obj1.atributo3 = 15; //El atributo es privado, por lo tanto solo se puede manejar en la clase de este paquete
    }
}
