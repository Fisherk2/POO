/*
 SUPERCLASE (CLASE PADRE)
 */
package Herencia;

public class Persona {

    //Atributos
    protected String nombre, apellido; //Se pueden manipular los valores solo en esta clase y en las que hereda
    private int edad;

    //Constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
