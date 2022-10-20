/*
SUPERCLASE
 */
package Polimorfismo;

public class Vehiculo {
    
    //Atributos
    protected String matricula, marca, modelo;
    
    //Constructor
    public Vehiculo(String matricula, String marca, String modelo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
    }
    
    //Metodos
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\n";
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
}
