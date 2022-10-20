/*
MAIN CLASS
 */
package Constantes;

public class Principal {

    public static void main(String[] args) {

        //OBJETOS
        Persona persona1 = new Persona("Fisher", 23);
        
        //Invocaciones
        persona1.setEdad(24);
        persona1.setNombre("Alberto");
        persona1.mostrarDatos();
        
        
    }
}
