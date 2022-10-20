/*
EJERCICIO 9: Hacer un programa para calcular el area de poligonos (Triangulos y Rectangulos).
El programa debe ser capaz de almacenar en un arreglo N triangulos y rectangulos,  y al final mostrar el area y los
datos de cada uno. Para ello se tendra lo siguiente:

-Una superClase llamada Poligono
-Una sub Clase llamada Rectangulo
-Una sub clase llamada Triangulo
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPoligonos {

    //ARREGLO DINAMICO (Es un arreglo que sabe cuantos elementos tiene sin necesidar de declarar numero de espacios de memoria)
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    //Entrada que se pueda utilizar en toda esta clase
    static Scanner entrada = new Scanner(System.in);

    //PSVM
    public static void main(String[] args) {

        //Invocaciones
        llenarPoligono();
        mostrarResultados();
    }

    //Metodo que nos llena poligonos
    public static void llenarPoligono() {
        int opcion; //Es para escoger un Triangulo o Rectangulo
        char respuesta; //Es para responder si quiere ingresar otro poligono o no

        //Si el usuario desea ingresar mas datos, seguira el bucle
        do {
            //Si el usuario ingresa un numero mayor a 2 o menor a 1, seguira en bucle
            do {
                System.out.println("Ingrese que poligono desea obtener");
                System.out.println("1.- Triangulo");
                System.out.println("2.- Rectangulo");
                System.out.print("\nOPCION: ");
                opcion = entrada.nextInt();
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1:
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                    break;
            }
            
            //Si el usuario no ingresa Y o N, seguira el bucle.
            boolean byPass;
            do {
                System.out.print("\n¿Desea introducir otro poligono? (Y = Si, N = No): ");
                respuesta = entrada.next().charAt(0);
                
                switch (respuesta) {
                    case 'y':
                        byPass = true;
                        break;
                    case 'Y':
                        byPass = true;
                        break;
                    case 'n':
                        byPass = true;
                        break;
                    case 'N':
                        byPass = true;
                        break;
                    default: byPass=false;
                }
            } while (byPass == false);

            System.out.println("----------------"); //Salto de linea por cada vez que el usuario ingrese poligonos

        } while (respuesta == 'y' || respuesta == 'Y');

    }

    //Rellena los valores para el poligono del triangulo del case 1
    public static void llenarTriangulo() {
        double lado1, lado2, lado3;

        //INPUTS
        System.out.print("\nIngrese el lado 1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Ingrese el lado 2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Ingrese el lado 3 del triangulo: ");
        lado3 = entrada.nextDouble();

        //Almacenamos los argumentos del constructor
        Triangulo objTriangulo = new Triangulo(lado1, lado2, lado3);
        poligono.add(objTriangulo); //Guardamos un triangulo en el arreglo de la SuperClase
    }

    //Rellena los valores para el poligono del rectangulo del case 2
    public static void llenarRectangulo() {
        double lado1, lado2;

        //INPUTS
        System.out.print("\nIngrese el lado 1 del rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Ingrese el lado 2 del rectangulo: ");
        lado2 = entrada.nextDouble();

        //Almacenamos los argumentos del constructor
        Rectangulo objRectangulo = new Rectangulo(lado1, lado2);
        poligono.add(objRectangulo); //Guardamos un rectangulo en el arreglo de la SuperClase
    }

    //Se imprime los datos ingresados
    public static void mostrarResultados() {

        for (Poligono poli : poligono) { //For Each para mostrar todos los valores del arreglo
            System.out.println(poli.toString()); //Dependiendo de la figura, esta imprimira los datos del objeto de las Subclases
            System.out.println("El area es: " + poli.area());
            System.out.println("__________________");//Salto de linea por cada poligono introducido
        }

    }
}//CLASE MAIN
