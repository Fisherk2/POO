package DownCasting;

/**
 *
 * @author Fisher
 */
public class MainCoches {

    /*
    CONVERSION DESCENDIENTE DE TIPOS (DOWNCASTING)
    
    Es hacer que una Superclase sea la Subclase que hereda, esta Superclase debe haber hecho un UPCASTING antes de realizar 
    el DOWNCASTING
    
     */
    public static void main(String[] args) {

        //UPCASTING version corta
        Vehiculo cocheDeportivo = new Deportivo(8, "ggggggg", "BMW", "A5");//Guardamos los valores de Deportivo en la clase Vehiculo
        //DOWNCASTING
        Deportivo nuevoDeportivo = (Deportivo)cocheDeportivo; //Se hace un CAST para convertir nuestro objeto Vehiculo en objeto Deportivo
        System.out.println(nuevoDeportivo);
    }

}
