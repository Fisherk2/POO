/*
 Clase Operacion
 */
package ParametrosArgumentos;

public class Operacion {

    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos
    public void sumar(int adicion1, int adicion2) { //Metodos que reciben dos parametros enteros
        suma = adicion1+adicion2; //Los parametros que creamos se pueden utilizar solo y solo en su metodo declarado
    }

    public void restar(int sustraer1, int sustraer2) {
        resta = sustraer1-sustraer2;
    }

    public void multiplicar(int producto1, int producto2) {
        multiplicacion= producto1*producto2;
    }

    public void dividir(int cociente1, int cociente2) {
        division= cociente1/cociente2;
    }

    public void impresion() { //Metodo que no retorna que imprime resultados
        System.out.println("La suma de los valores ingresados es: " + suma);
        System.out.println("La resta de los valores ingresados es: " + resta);
        System.out.println("La multiplicacion de los valores ingresados es: " + multiplicacion);
        System.out.println("La division de los valores ingresados es: " + division);

    }
}
