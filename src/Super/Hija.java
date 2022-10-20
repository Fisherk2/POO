/*
 * NOMBRE: Fisher
 * FECHA: 8/01/22
 * PROYECTO: POO
 */
package Super;

/**
 * Subclase que hereda de Padre
 *
 * @author Fisher
 */
public class Hija extends Padre {

    public void Saludar() {
//        System.out.println("Hola, yo soy la hija");

        //La palabra super nos va ayudar a acceder metodos y atributos de la Super clase.
        super.Saludar(); //INVOCAMOS EL METODO DE LA CLASE PADRE 
    }

}
