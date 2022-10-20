/*
Clase COCHE
 */
package ClasesYObjetos;

public class Coche { //Creacion de clases
    //Atributos de la clase
    String color;
    String marca;
    int km;

    //Metodos de la clase
    public static void main(String[] args) {
        
        //Objeto 1
        System.out.println("Coche 1"
                +"\n________________________________");
        Coche coche1 = new Coche(); //Creacion de objetos
        
        coche1.color = "Blanco"; //Se usa un punto despues del nombre del objeto para usar los atributos de la clase
        coche1.marca = "Audi";
        coche1.km = 0;
        
        //Impresion
        System.out.println("El color del coche 1 es: " + coche1.color);
        System.out.println("La marca del coche 1 es: " + coche1.marca);
        System.out.println("El kilometraje del coche 1 es: "+coche1.km);
        
        //Objeto 2
        System.out.println("\nCoche 2"
                +"\n________________________________");
        Coche coche2 = new Coche();
        
        coche2.color="Rojo";
        coche2.marca="Ferrari";
        coche2.km=300;
        
        //Impresion
        System.out.println("El color del coche 2 es: " + coche2.color);
        System.out.println("La marca del coche 2 es: " + coche2.marca);
        System.out.println("El kilometraje del coche 2 es: "+coche2.km);

    }
}
