/*
 * NOMBRE: Fisher
 * FECHA: 08/01/22
 * PROYECTO: POO
 */
package This;

import java.util.Scanner;

/**
 * PALABRA RESERVADA THIS: Cuando utilizamos POO, podemos acceder a variables
 * que se encuentran en otras clases. Esto solo es posible, si creamos una
 * instancia entre las clases. La instancia de clases, es cuando hacemos que dos
 * clases interactuen entre si. Al acceder a variables de instancia de una
 * calse, podemos encontrar con variables que se llamen igual que en la clase de
 * donde estamos accediendo. Cuando esto sucede, debemos utilizar la palabra
 * reservada "this". Porque "this" va indicar, si se estan utilizando las
 * variables de instancia, o las variables de la clase desde el cual estamos
 * accediendo.
 *
 * @author Fisher
 */
public class MainArea {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, altura;

        System.out.print("Ingrese la base del rectangulo: ");
        base = teclado.nextInt();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura = teclado.nextInt();
        
        Rectangulo figura1 = new Rectangulo(base,altura);
        figura1.ImprimirArea();

    }

}
