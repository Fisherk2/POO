/*
EJERCICIO 5:
Programa que enseña un catalogo de articulos, que muestra el mayor o menor valor de los atributos de los elementos 
dependiendo del numero de horas o temporadas.
 */
package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fisher
 */
public class MainArticulos {

    public static void main(String[] args) {
        List<Series> listaSeries = new ArrayList<>();
        List<Videojuegos> listaJuegos = new ArrayList<>();
        //Agregamos las series
        listaSeries.add(new Series("El juego del calamar", "Accion", "Fisher", 1));
        listaSeries.add(new Series("Friends", "Drama", "Alberto", 14));
        listaSeries.add(new Series("Juego de Tronos", "Drama", "George R. Martin", 7));
        listaSeries.add(new Series("Breaking Bad", "Thriller", "Vincent", 5));
        //Agregamos videojuegos
        listaJuegos.add(new Videojuegos("Forza Horizon", "Conduccion", "PlayGrounds Games", 7));
        listaJuegos.add(new Videojuegos("Gears of War", "Disparos", "Epic Games", 9));
        listaJuegos.add(new Videojuegos("Halo Reach", "Disparos", "Bungie", 8));
        listaJuegos.add(new Videojuegos("Overwatch", "Disparos", "Blizzard", 1000));
        //Entregamos todos los elementos de la lista videojuegos y series (VENDEMOS TODOS LOS ELEMENTOS DE LA LISTA)
        for (int i = 0; i < listaJuegos.size(); i++) {
            listaJuegos.get(i).entregar();//Por cada objeto de la lista, se activara esEntregado a true
        }
        for (int i = 0; i < listaSeries.size(); i++) {
            listaSeries.get(i).entregar();//Por cada objeto de la lista, se activara esEntregado a true
        }
        //Vamos a contar el numero de articulos entregados y los devolveremos
        int entregados = 0;
        for (int i = 0; i < listaSeries.size(); i++) {
            if (listaSeries.get(i).comprobarExistenciaEntregas()) {
                entregados++;// Sumamos por cada articulo que fue entregado
                listaSeries.get(i).devolver();//Por cada objeto de la lista, se activara esEntregado a false
            }
        }
        for (int i = 0; i < listaJuegos.size(); i++) {
            if (listaJuegos.get(i).comprobarExistenciaEntregas()) {
                entregados++;// Sumamos por cada articulo que fue entregado
                listaJuegos.get(i).devolver();//Por cada objeto de la lista, se activara esEntregado a false
            }
        }
        System.out.println("La cantidad de articulos entregados fue: " + entregados);
        //Buscamos el articulo con el mayor numero de temporadas y con mayor numero de horas de juego
        Series serieMayor = listaSeries.get(0);//Comenzamos con el primer articulo de series
        Videojuegos juegoMayor = listaJuegos.get(0);//Comenzamos con el primer articulo de series
        for (int i = 0; i < listaJuegos.size(); i++) {
            //Videojuegos.MAYOR = 1
            if (listaJuegos.get(i).comparar(juegoMayor) == Videojuegos.MAYOR) {
                juegoMayor = listaJuegos.get(i);//Almacenamos el juego con mayor numero de horas
            }
        }
        for (int i = 0; i < listaSeries.size(); i++) {
            //Series.MAYOR = 1
            if (listaSeries.get(i).comparar(serieMayor) == Series.MAYOR) {
                serieMayor = listaSeries.get(i);//Almacenamos la serie con mayor numero de temporadas
            }
        }
        //Buscamos el articulo con menor numero de temporadas y con menor numero de horas de juego
        Series serieMenor = listaSeries.get(0);//Comenzamos con el primer articulo de series
        Videojuegos juegoMenor = listaJuegos.get(0);//Comenzamos con el primer articulo de videojuegos
        for (int i = 0; i < listaJuegos.size(); i++) {
            //Videojuegos.MENOR = 1
            if (listaJuegos.get(i).comparar(juegoMenor) == Videojuegos.MENOR) {
                juegoMenor = listaJuegos.get(i);//Almacenamos el juego con menor numero de horas
            }
        }
        for (int i = 0; i < listaSeries.size(); i++) {
            //Series.MENOR = 1
            if (listaSeries.get(i).comparar(serieMenor) == Series.MENOR) {
                serieMenor = listaSeries.get(i);//Almacenamos el juego con menor numero de temporadas
            }
        }
        System.out.println("\n-El videojuego con mas horas de juego es: \n" + juegoMayor
                + "\n-El videojuego con menos horas de juego es: \n" + juegoMenor);
        System.out.println("\n-La serie con mayor numero de temporadas es: \n" + serieMayor
                + "\n-La serie con menor nuemro de temporadas es: \n" + serieMenor);

    }

}
