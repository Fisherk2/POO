/*
EJERCICIO 6:
Programa que hara los siguiente procesos de un inventario de articulos variados:
1.-Añadir productos
2.-Aumentar stock de un producto
3.-Eliminar stock de un producto
4.-Mostrar productos y su stock
5.-Eliminar producto
6.-Ordenar productos Ascendentemente
7.-Ordenar productos Descendentemente
8.-Salir
 */
package Ejercicio6;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Fisher
 */
public class MainInventario {

    public static void main(String[] args) {
        //Creamos nuestros diccionarios que serviran para administrar nuestro inventario
        HashMap<String, Integer> inventario = new HashMap<>(); //Producto funcionara como index de nuestra diccionario
        TreeMap<String, Integer> inventarioOrdenado;

        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");//Va borrar el salto de linea por espacio que tenia el metodo .next( ); con las cadenas de texto

        int opcion = 0;
        System.out.println("INVENTARIO DE PRODUCTOS"
                + "\n------------------------------");
        while (opcion != 8) {//Mientras no se ingrese la opcion salir, seguira en bucle
            System.out.println("\nSeleccione una opcion"
                    + "\n1.- Añadir producto"
                    + "\n2.- Aumentar el stock de un producto"
                    + "\n3.- Eliminar el stock de un producto"
                    + "\n4.- Mostrar productos y su stock"
                    + "\n5.- Eliminar un producto"
                    + "\n6.- Ordenar productos Ascendentemente"
                    + "\n7.- Ordenar productos Descendentemente"
                    + "\n8.- SALIR");
            try {
                System.out.print("¿Que desea hacer?: ");
                opcion = teclado.nextInt();

                String producto;
                int stock, stockActual;

                switch (opcion) {
                    case 1://Añadir producto
                        System.out.print("\nIngrese el producto agregar: ");
                        producto = teclado.next();
                        //Si el producto ingresado ya existe en el diccionario
                        if (inventario.containsKey(producto)) {
                            System.out.println("El producto que ingreso ya esta en el inventario, porfavor, intente con otro articulo");
                        } else {
                            inventario.put(producto, 0);//Empezamos con cero stock
                            System.out.println("Se ha añadido correctamente su producto"
                                    + "\n----------------");
                        }
                        break;
                    case 2://Aumentar el stock de un producto
                        System.out.print("\nIngrese el producto que quiere agregar stock: ");
                        producto = teclado.next();
                        //Si el producto ingresado ya existe en el diccionario
                        if (inventario.containsKey(producto)) {
                            System.out.print("\nDigite la cantidad de Stock: ");
                            stock = teclado.nextInt();
                            stockActual = inventario.get(producto);//Guardamos el Stock actual del producto
                            //El valor que vamos a ingresar debe ser mayor a cero
                            if (stock > 0) {
                                inventario.put(producto, stockActual + stock);//Añadimos mas Stock 
                                System.out.println("Se ha añadido " + stock + " de stock al producto " + producto + " correctamente"
                                        + "\n-----------------");
                            } else {
                                System.err.println("NO SE PUEDE AÑADIR UN STOCK NEGATIVO");
                            }
                        } else {
                            System.err.println("NO EXISTE EL PRODUCTO QUE INGRESO");
                        }
                        break;
                    case 3://Eliminar el stock de un producto
                        System.out.print("\nIngrese el producto que quiere eliminar stock: ");
                        producto = teclado.next();
                        //Si el producto ingresado ya existe en el diccionario
                        if (inventario.containsKey(producto)) {
                            System.out.print("\nDigite la cantidad de Stock a eliminar: ");
                            stock = teclado.nextInt();
                            stockActual = inventario.get(producto);//Guardamos el Stock actual del producto
                            //El valor que vamos a ingresar debe ser mayor a cero pero menor al stock actual del producto
                            if (stock <= stockActual && stock > 0) {
                                inventario.put(producto, stockActual - stock);//Eliminar mas Stock 
                                System.out.println("Se ha eliminado " + stock + " de stock al producto " + producto + " correctamente"
                                        + "\n-----------------");
                            } else {
                                System.err.println("NO SE PUEDE ELIMINAR EL NUMERO DE STOCK INGRESADO");
                            }
                        } else {
                            System.err.println("NO EXISTE EL PRODUCTO QUE INGRESO");
                        }
                        break;
                    case 4://Mostrar productos y su stock
                        System.out.println("\nLista de producto actual: ");
                        //For con ENTRY para mostrar nuestra lista de elementos
                        for (Entry<String, Integer> entrada : inventario.entrySet()) {
                            System.out.println("Producto: " + entrada.getKey() + " - Stock: " + entrada.getValue());
                        }
                        System.out.println("---------------------------");
                        break;
                    case 5://Eliminar un producto
                        System.out.print("\nIngrese el producto que quiere eliminar permanentemente del inventario : ");
                        producto = teclado.next();
                        //Si el producto ingresado ya existe en el diccionario
                        if (inventario.containsKey(producto)) {
                            inventario.remove(producto); //Eliminamos el elemento de la lista
                            System.out.println("El producto " + producto + " ha sido eliminado correctamente"
                                    + "\n-----------------");
                        } else {
                            System.err.println("NO EXISTE EL PRODUCTO QUE INGRESO");
                        }
                        break;
                    case 6://Ordenar productos Ascendentemente
                        //Le pasamos de parametro un objeto de la clase que implementa COMPARATOR
                        inventarioOrdenado = new TreeMap<>(new OrdenarAscendente());
                        inventarioOrdenado.putAll(inventario);//Llenamos todos los elementos a esta nueva lista 
                        System.out.println("\nLista ordenada ascendentemente de productos actual: ");
                        //For con FOR EACH para mostrar nuestra lista de elementos
                        for (String articulo : inventarioOrdenado.keySet()) {
                            stock = inventarioOrdenado.get(articulo);//Por cada articulo iterado, se imprimira el stock de dicho producto
                            System.out.println("Producto: " + articulo + " - Stock: " + stock);
                        }
                        System.out.println("---------------------------");
                        break;
                    case 7://Ordenar productos Descendentemente
                        //Le pasamos de parametro un objeto de la clase que implementa COMPARATOR
                        inventarioOrdenado = new TreeMap<>(new OrdenarDescendente());
                        inventarioOrdenado.putAll(inventario);//Llenamos todos los elementos a esta nueva lista 
                        System.out.println("\nLista ordenada descendientemente de productos actual: ");
                        //For con FOR EACH para mostrar nuestra lista de elementos
                        for (String articulo : inventarioOrdenado.keySet()) {
                            stock = inventarioOrdenado.get(articulo);//Por cada articulo iterado, se imprimira el stock de dicho producto
                            System.out.println("Producto: " + articulo + " - Stock: " + stock);
                        }
                        System.out.println("---------------------------");
                        break;
                    case 8://SALIR
                        System.out.println("QUE TENGA UN BUEN DIA, HASTA PRONTO");
                        System.out.println("---------------------------");
                        opcion = 8;
                        break;
                    default:
                        System.err.println("\nERROR, PORFAVOR, INGRESE UN VALOR CORRECTO.");
                        break;
                }

            } catch (InputMismatchException ex) {
                System.err.println("\nERROR, VUELVA A INTENTAR, SOLO SE PERMITEN NUMEROS ENTEROS: " + ex);
                teclado.next();
            }

        }//MENU DE OPCIONES

    }//PSVM
}//CLASS
