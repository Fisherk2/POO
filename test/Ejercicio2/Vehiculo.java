package Ejercicio2;

public class Vehiculo {
    
    //Atributos
    private String marca,modelo;
    private float precio;
    
    public Vehiculo(String marca, String modelo, float precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: $"+precio; //Son los datos del vehiculo en general
    }
}
