/*
SUBCLASE
 */
package Polimorfismo;

public class Deportivo extends Vehiculo {

    //Atributos
    private int cilindros;

    //Constructor
    public Deportivo(int cilindros, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindros = cilindros;
    }

    //Metodos
    @Override //Sobre escribimos el metodo de la clase padre para devolver un valor diferente cuando se utilice esta clase
    public String mostrarDatos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo
                + "\nNumero de cilindros: " + cilindros + "\n";
    }

    public int getCilindros() {
        return cilindros;
    }
    
}
