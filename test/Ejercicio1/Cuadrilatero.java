/*
Clase cuadrilatero
 */
package Ejercicio1;

public class Cuadrilatero {

    //Atributos
    private float lado1, lado2;

    //CONTRUCTORES
    public Cuadrilatero(float lado1, float lado2) { //Mientras sea cuadrilatero
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1) { //Mientras sea un cuadrado
        this.lado1 = this.lado2 = lado1;
    }
    //GETTERS
    public float getPerimetro() {
        float perimetro = (lado1 + lado2) * 2; //La suma de los lados del cuadrilatero
        return perimetro;
    }

    public float getArea() {
        float area = lado1 * lado2; //El producto de sus lados
        return area;
    }
}
