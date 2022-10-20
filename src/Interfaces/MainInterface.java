package Interfaces;

/**
 *
 * @author Fisher
 */
public class MainInterface {

    /*
    INTERFACES
    
    Herencia multiple: Hace referencia a la caracteristica de los lenguajes de POO en la que una clase puede 
    heredar atributos y metodos de mas de una SuperClase, este tipo de caracteristicas no se puede hacer directamente
    en JAVA, pero se puede simular con Interfaces.
    
    -Permite simular la herencia multiple.
    -La interfaz solo es public o default
    -Todos sus metodos son abstractos
    -Todos sus atributos son FINAL (constantes)
     */
    public static void main(String[] args) {
        
        MusicoEstudiante musicoEstudi = new MusicoEstudiante();
        musicoEstudi.estudiar();
        musicoEstudi.hablar();
        musicoEstudi.tocarMusica();
        
    }
    
}
