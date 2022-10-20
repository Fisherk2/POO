package SobreEscritura;

public class MainAnimales {

    public static void main(String[] args) {
       
        //OBJETOS
        Persona objPersona = new Persona();
        Perro objPerro = new Perro();
        Vaca objVaca = new Vaca();
        
        //INVOCACIONES
        objPersona.comer();
        objPersona.hablar();
        
        objPerro.comer();
        objPerro.hablar();
        
        objVaca.comer();
        objVaca.hablar();
        
    }
    
}
