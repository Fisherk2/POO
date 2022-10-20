/*
 Clase Operacion
 */
package RetornoDeValores;

public class Operacion {

    //Metodos
    public int sumar(int adicion1, int adicion2) { //Metodos que reciben dos parametros enteros y las retorna
        int suma = adicion1+adicion2;
        return suma; //Devolvemos el valor de la variable 
    }

    public int restar(int sustraer1, int sustraer2) {
        int resta = sustraer1-sustraer2;
        return resta;
    }

    public int multiplicar(int producto1, int producto2) {
        int multiplicacion= producto1*producto2;
        return multiplicacion;
    }

    public int dividir(int cociente1, int cociente2) {
        int division= cociente1/cociente2;
        return division;
    }

    public void impresion(int suma, int resta, int multiplicacion, int division) { //Metodo que recibe los parametros de las operaciones que se almacenaron en el Main
        System.out.println("FORMA DE IMPRESION 1"+"\n________________________");
        System.out.println("La suma de los valores ingresados es: " + suma);
        System.out.println("La resta de los valores ingresados es: " + resta);
        System.out.println("La multiplicacion de los valores ingresados es: " + multiplicacion);
        System.out.println("La division de los valores ingresados es: " + division);

    }
}
