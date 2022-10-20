/*
Clase principal
 */
package Sobrecarga;

public class MainCons {

    public static void main(String[] args) {
        //OBJETOS
        
        //Se debe declarar un objeto diferente por constructor sobrecargado
        Persona p1 = new Persona("Fisher", 23); //Enviamos argumentos al constructor con dos parametros
        Persona p2 = new Persona("kdh32hsk");//Enviamos el argumento al constructor con un parametro
        
        //INVOCACIONES
        p1.correr(); //Metodo vacio
        p1.correr(200);//Metodo con un parametro
        //Un objeto diferente puede usar todos los metodos recargados, mientras se envien los argumentos correctos para completar su proceso
        p2.correr(); //Como el constructor del objeto p2 no almacena las variables nombre y edad de la clase Persona, automaticamente arrojara valores vacios a la impresion
        p2.correr(100);
    
    }//PSVM
    
}
