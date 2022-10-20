package UpCasting;

/**
 *
 * @author Fisher
 */
public class MainCoches {

    /*
    CONVERSION ASCENDENTE DE TIPOS (UPCASTING)
    
    Es hacer que una Subclase sea la Superclase que heredaba
    
     */
    public static void main(String[] args) {

        Turismo miVehiculo = new Turismo(4, "ffffff", "Maseratti", "512T");
        
        //UPCASTING
        Vehiculo cocheTurismo = miVehiculo;//Guardamos los valores del Turismo en la clase Vehiculo
        System.out.println(cocheTurismo);
        
        //UPCASTING version corta
        Vehiculo cocheDeportivo = new Deportivo(8, "ggggggg", "BMW", "A5");//Guardamos los valores de Deportivo en la clase Vehiculo
        System.out.println(cocheDeportivo);

    }

}
