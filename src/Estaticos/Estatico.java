/*
MIEMBROS ESTATICOS DE UNA CLASE
 */
package Estaticos;

public class Estatico {

    private static String frase = "Primera frase"; //Atributo estatico

    public static int sumar(int n1, int n2) { //Metodo estatico
        int suma = n1 + n2;
        return suma;
    }

    public static void main(String[] huehuehue) {

        //Objetos
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();

        //INVOCACIONES
        ob2.frase = "Segunda frase"; //Como es la ultima modificacion del atributo, esta sera la definitiva en todos los objetos creados
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);

        //METODO SIN CREACION DE OBJETOS
        Estatico.frase = "Tercera frase"; //Invocamos por medio de la clase
        System.out.println(Estatico.frase);
        System.out.println("La suma es " + Estatico.sumar(5, 5)); //Podemos llamar al metodo sin declarar un objeto
    }

}
