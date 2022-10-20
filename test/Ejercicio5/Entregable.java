package Ejercicio5;

/**
 * Clase Interface que ocupamos para la multiherencia de articulos
 *
 * @author Fisher
 */
public interface Entregable {

    /**
     * Metodo que asignara el estado del producto, en este caso, entregar
     * significa que el producto no se encuentra en Stock
     */
    public void entregar();

    /**
     * Metodo que asignara el estado del producto, en este caso, devolver
     * significa que el articulo se encuentra en Stock
     */
    public void devolver();

    /**
     * Metodo que nos devolvera el estado del articulo, si se encuentra en Stock
     * o no.
     *
     * @return Disponibilidad del articulo
     */
    public boolean comprobarExistenciaEntregas();

    /**
     * Metodo que comparara nuestros articulos, ya sea por numero de temporadas u
     * horas de juego, se le pasara el parametro Object porque dentro de cada
     * clase distinta se le hara un CAST dependiendo si es una serie o un
     * videojuego
     *
     * @param objeto
     * @return 
     */
    public int comparar(Object objeto);

}
