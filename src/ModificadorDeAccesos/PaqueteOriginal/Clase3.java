/*
CLASE DE PAQUETE DIFERENTE
 */
package ModificadorDeAccesos.PaqueteOriginal;

import ModificadorDeAccesos.PaqueteDiferente.Clase1; //Importamos los atributos y metodos de la Clase 1

public class Clase3 {

    public static void main(String[] args) {
        //OBJETOS
        Clase1 obj1 = new Clase1();
        
        //INVOCACIONES
        obj1.atributo1 = 15; //El atributo esta por default, por lo tanto solo puede manejarse en el paquete original
        obj1.atributo2 = 15; //El atributo es publico, por lo tanto puedo manejarlo en este paquete diferente al original
        obj1.atributo3 = 15; //El atributo es privado, por lo tanto solo se puede manejar en la clase del paquete original
    }
}
