/*
SUBCLASE
 */
package DownCasting;

public class Turismo extends Vehiculo {
    
    //Atributos
    private int nPuertas;
    
    //Constructor
    public Turismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }
    
    //Metodos
    @Override //Sobre escribimos el metodo de la clase padre para devolver un valor diferente cuando se utilice esta clase
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo
                +"\nNumero de puertas: "+nPuertas+"\n";
    }
    
    public int getnPuertas() {
        return nPuertas;
    }
    
}
