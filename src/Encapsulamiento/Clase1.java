/*
 ENCAPSULAMIENTO Y METODOS ACCESORES (GETTERS Y SETTERS)
 */
package Encapsulamiento;

public class Clase1 {

    private int edad;
    private String nombre;

    //SETTERS (Establece un valor en en atributo de la clase privada)
    public void setEdad(int edad) { //Se inicializa un parametro para poder declararlo en un atributo de la clase privada
        this.edad = edad; //El valor del parametro lo almacenamos en un atributo privado.
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //GETTERS (Muestra, enseña o toma el valor que se retorna del atributo del metodo)
    public int getEdad() { //Se declara el tipo primitivo que va retornar el metodo
        return edad; //Es el valor que va regresar al metodo
    }

    public String getNombre() {
        return nombre;
    }

}
