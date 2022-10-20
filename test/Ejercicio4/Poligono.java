/*
SUPERCLASE
 */
package Ejercicio4;

public abstract class Poligono {
    
    //Atributos
    protected int numeroLados;

    //Contructor
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    
    //Metodos
    public int getNumeroLados() {
        return numeroLados;
    }

    @Override //Esta sobre escribiendo el metodo java.lang.Object que viene en la libreria del lenguaje
    //Tiene el mismo proposito que el metodo mostrar datos de los ejercicios anteriores
    public String toString() { //Generar codigo/toString( ); 
        return "Numero de lados= " + numeroLados+"\n";
    }
    
    //ABSTRACTO (ya que es un metodo que no sabemos como se va calcular en las demas clases)
    public abstract double area();
    
    
}
