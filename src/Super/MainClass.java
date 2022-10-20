/*
 * NOMBRE: Fisher
 * FECHA: 8/01/22
 * PROYECTO: POO
 */
package Super;

/**
 * PALABRA RESERVADA SUPER: La palabra super en Java es una variable de
 * referencia que se usa para referir objetos de la super clase. Se usa
 * principalmente en los contextos con variables, metodos y constructores. La
 * llamada a super( ) debe ser la primera instruccion en el constructor de la
 * clase derivada. Si un constructor no invoca explicitamente un constructor de
 * superclase, el compilador de Java inserta automaticamente una llamada al
 * constructor si nargumento de la superclase. Si la superclase no tiene un
 * constructor sin argumentos, obtendra un error de compilacion. Si un
 * constructor de una subclase invoca un constructor de su superclase, ya sea
 * explicita o implicitamente, puede pensar que se llamo a toda una cadena de
 * cosntructores, hasta llegar hasta la clase Object (Esto se llama
 * encadenamiento de constructores). Tambien se usa para especificar un limite
 * inferior en un parametro de tipo en Genericos.
 *
 * @author Fisher
 */
public class MainClass {

    public static void main(String[] args) {
        //Creacion de objetos
        Hija subClase = new Hija();
        //Aunque instanciamos y declaramos un metodo de la clase hija, se ejecutara el metodo de la clase padre
        subClase.Saludar();

    }

}
