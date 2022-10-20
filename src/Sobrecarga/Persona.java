/*
Clase persona
 */
package Sobrecarga;

public class Persona {

    //ATRIBUTOS
    String nombre;
    int edad;
    String dni;

    //SOBRECARGA DE CONSTRUCTORES
    public Persona(String dni) { //Constructor con un parametro
        this.dni = dni;
        nombre="Alberto"; //Almacenamos valores a las variables locales para que no imprima vacios en la impresion
        edad=20;
    }

    public Persona(String nombre, int edad) { //Constructor con dos parametros
        this.nombre = nombre;
        this.edad = edad;
    }
    //SOBRECARGA DE METODOS
    public void correr() { //Metodo vacio
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maraton");
    }
    
    public void correr(int km){//Metodo con un parametro
        System.out.println("He corrido "+km+" kilometros");
    }
}
