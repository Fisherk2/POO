/*
 CONSTANTES
 */
package Constantes;

public class Persona {

    //Atributos
    private final String nombre; //Constante
    private int edad;

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre; //El valor de la constante va ser del constructor ya que fue el primero en alamacenarlo
        this.edad = edad;
    }
    
    //Metodos
    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad + " años");
    }
    
    //SETTERS Y GETTERS
    public void setNombre(String nombre){
        this.nombre=nombre; //Cuando tenemos una constante, esta ya no se puede modificar por programa, solo editanto los atributos manualmente 
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
}
