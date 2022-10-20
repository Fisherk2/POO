/*
EJERCICIO 3: Diseñar un programa para trabajar con triangulos isosceles. Para ello defina los atributos necesarios que se
requieren, proporcione metodos de consulta, un metodo constructor e implemente metodos para calcular el perimetro y el
area de un triangulo, ademas implementar un metodo que a partir de un arreglo de triangulos devuelva el area del triangulo
de mayor superficie.
 */
package Ejercicio3;

import java.util.Scanner;

public class MainTriangulo {

    public static void main(String[] args) {

        double base, lado;
        int nTriangulos;

        //Numero de triangulos
        Scanner inputs = new Scanner(System.in);
        System.out.print("Digite el numero de triangulos que va calcular: ");
        nTriangulos = inputs.nextInt();

        //Objetos
        Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[nTriangulos]; //Arreglo con N triangulos

        for (int i = 0; i < triangulos.length; i++) {
            inputs.nextLine(); //Esto para que no se amontone los datos que se vayan a ingresar
            System.out.println("\nDigite los valores del triangulo " + (i + 1));

            System.out.print("Base: ");
            base = inputs.nextDouble();
            System.out.print("Lado: ");
            lado = inputs.nextDouble();
            //Enviamos los valores por cada espacio del arreglo
            triangulos[i] = new Triangulo_Isosceles(base, lado);

            //Imprimimos los datos por cada triangulo introducido
            System.out.println("\nEl perimetro de triangulo es: " + triangulos[i].obtenerPerimetro());
            System.out.println("El area de triangulo es: " + triangulos[i].obtenerArea());
        }
        System.out.println("\nEl area mas grande registrada fue: "+areaTrianguloMayor(triangulos));
        
    }//PSVM

    public static double areaTrianguloMayor(Triangulo_Isosceles triangulos[]) {//Tomamos los valores de los objetos del triangulo
        double area;

        area = triangulos[0].obtenerArea();
        for (int i = 1; i < triangulos.length; i++) {
            if(triangulos[i].obtenerArea()>area){ //Si la primer area es menor a la siguiente, la siguiente se almacena en area
                area=triangulos[i].obtenerArea(); //Se almacena el valor mas alto
            }
            
        }
        return area;
    }//Revision del area mas grande

}
