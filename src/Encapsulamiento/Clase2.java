/*
 Clase Main
 */
package Encapsulamiento;

public class Clase2 {

    public static void main(String[] args) {
        
        //OBJETOS
        Clase1 objeto1 = new Clase1();
        
        //INVOCACIONES
        objeto1.edad = -5; //No podemos manipular atributos que son privados
        objeto1.setEdad(23);//Solo podemos mandar un valor por medio de SETTERS almacenandolo en su parametro
        System.out.println("La edad es: "+objeto1.getEdad()+" años"); //Llamamos al metodo GET de la clase privada para poder tomar su valor retornado
        
        objeto1.setNombre("Fisher");//Enviamos el valor al parametro del metodo
        System.out.println("El nombre es: "+objeto1.getNombre()); //Llamamos al metodo GET 
    
    
    
    }
}
