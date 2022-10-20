/*
 SUBCLASE
 */
package Polimorfismo;

public class Furgoneta extends Vehiculo {

    //Atributos
    private int carga;

    //Constructor
    public Furgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    //Metodos
    @Override //Sobre escribimos el metodo de la clase padre para devolver un valor diferente cuando se utilice esta clase
    public String mostrarDatos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo
                + "\nPeso en carga: " + carga + " kilos" + "\n";
    }

    public int getCarga() {
        return carga;
    }

}
