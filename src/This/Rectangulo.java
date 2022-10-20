/*
 * NOMBRE: Fisher
 * FECHA: 08/01/22
 * PROYECTO: POO
 */
package This;

/**
 * Clase que almacenara los datos de una figura rectangular.
 *
 * @author Fisher
 */
public class Rectangulo {

    //ATRIBUTOS
    private int base, altura, area;

    //CONSTRUCTOR
    public Rectangulo(int base, int altura) {
        //La variable local = variable de los parametros del constructor
        this.base = base;
        this.altura = altura;
    }
    
    private void CalculoArea() {
        area = base * altura;
    }
    public void ImprimirArea(){
        CalculoArea();
        System.out.println("El area es: "+area+" unidades cuadradas");
    }

}
