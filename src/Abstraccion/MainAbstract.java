/*
 Clases y metodos abstractos
 */
package Abstraccion;

public class MainAbstract {

    public static void main(String[] args) {
        
        //OBJETOS
        SerVivo objSer = new SerVivo(); //Las clases abstractas no pueden ser declaradas
        Animal objAnimal = new Animal();//Las clases abstractas no pueden ser declaradas
        
        Planta objPlanta = new Planta();
        Carnivoro objCarne = new Carnivoro();
        Herbivoro objHerbi = new Herbivoro();
        
        //Invocaciones
        objPlanta.alimentarse();
        objCarne.alimentarse();
        objHerbi.alimentarse();
        
    }
    
}
