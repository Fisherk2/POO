/*
SUBCLASE (CLASE HIJA)
 */
package Herencia;

public class Estudiante extends Persona {

    //Atributos de solo caracteristicas de la clase
    private int codigoEstudiante;
    private float notaFinal;

    //Constructor
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) { //Los parametros deben estar los atributos de la clase padre y los de esta clase
        super(nombre, apellido, edad); //Se toman los valores de los parametros de la SuperClase y se almacenan en los parametros del constructor de la SubClase
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    //Metodos
    public void mostrarDatos() { //Se pueden invocar los metodos de la clase padre ya que fueron heredados a esta clase
        System.out.println("Nombre: " + nombre //Como esta en protected, se puede manipular los valores de la SuperClase
                + "\nApellido: " + apellido
                + "\nEdad: " + getEdad() //Como esta en privado, tendremos que llamar a su metodo GET para saber su valor
                + "\nCodigo de Estudiante: " + codigoEstudiante
                + "\nNota Final: " + notaFinal); 
    }

}
