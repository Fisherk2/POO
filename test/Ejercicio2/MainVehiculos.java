/*
EJERCICIO 3: Construir un programa que dada una serie de vehiculos caracterizados por su marca, modelo y precio, imprima
las propiedades del vehiculo mas barato. Para ello, se deberan leer por teclado las caracteristicas de cada vehiculo y crear una 
clase que represente a cada uno de ellos.
 */
package Ejercicio2;

import java.util.Scanner;

public class MainVehiculos {

    public static void main(String[] args) {

        String marca, modelo;
        float precio;
        int numeroVehiculos,indiceCocheBara;
        //Inputs
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();
        
        //OBJETOS
        Vehiculo coches[] = new Vehiculo[numeroVehiculos]; //Creamos los objetos para los coches
        
        for (int i = 0; i < coches.length; i++) {//Continuara el bucle hasta que llegue a la longitud de coches del objeto
            entrada.nextLine(); //Esto sirve para que las cadenas no se peguen en la consola
            System.out.println("\nDigite las caracteristicas del vehiculo "+(i+1));
            
            System.out.print("Introduzca marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca modelo: ");
            modelo=entrada.nextLine();
            System.out.print("Introduzca precio: ");
            precio=entrada.nextFloat();
            
            coches[i]= new Vehiculo(marca, modelo, precio); //Se va almacenar este listado de datos por espacio del arreglo
        }
        
        indiceCocheBara = indiceBarato(coches); //Almacenamos la posicion en una variable local
        System.out.println("\nEl vehiculo mas barato es: ");
        System.out.println(coches[indiceCocheBara].mostrarDatos()); //Se muestra los datos almacenado del espacio de memoria del coche mas barato
    }
    
    //Se hace estatico para no declarar un objeto y usarlo directamente de la clase
    public static int indiceBarato(Vehiculo coches[]){ //Le estamos pasando los valores de los objetos
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio(); //Almacenamos el primer precio del arreglo
        for (int i = 1; i < coches.length; i++) {//Iniciamos desde 1 porque ya tenemos el primer precio
            if (coches[i].getPrecio()<precio) { //Si nuestro valor es menor que el primer precio
                precio = coches[i].getPrecio();//Vaciamos el segundo valor a precio para compararlo con el siguiente iterador
                indice=i; //Sera la posicion final del valor mas pequeño
            }
        }
        
        return indice;
    }

}
