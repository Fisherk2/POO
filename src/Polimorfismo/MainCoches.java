/*
POLIMORFISMO
 */
package Polimorfismo;

public class MainCoches {

    public static void main(String[] args) {

        //Objetos
        Vehiculo objCoches[] = new Vehiculo[4]; //Reservamos en memoria 4 objetos

        //Enviamos los argumentos de nuestro objeto al constructor de la SuperClase
        objCoches[0] = new Vehiculo("123456", "Cualquiera", "General");
        //Enviamos los argumentos de nuestro objeto al constructor de la SubClase
        objCoches[1] = new Turismo(4, "GTO", "Ferrari", "Modenna");
        objCoches[2] = new Deportivo(6, "GTO", "Toyota", "Supra");
        objCoches[3] = new Furgoneta(5000, "GTO", "Ford", "Super Duty");

        //Invocaciones
        for (Vehiculo coches : objCoches) { //For Each
            System.out.println(coches.mostrarDatos()+"\n"); //Mostramos datos por todos los espacios del arreglo
        }
    }

}
