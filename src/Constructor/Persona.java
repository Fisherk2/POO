/*
Clase persona
 */
package Constructor;

public class Persona {

    //ATRIBUTOS
    String nombre;
    int edad;

    //METODOS
    public Persona(String name, int age) { //Constructor usando nombre de parametros distintos
        nombre = name; //El valor del parametro se almacena en una variable local
        edad = age;
    }
        public Persona(int edad, String nombre) { //Constructor usando nombres iguales
        this.nombre = nombre; //El valor del parametro se almacena en una variable local
        this.edad = edad; //El  this. sirve para especificar que variable es la que se almacena los valores de los parametros
    }

    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);

    }
}
