package Ejercicio6;

import java.util.Comparator;


/**
  *Clase que servira para ordenar nuestra lista de forma descendente
 * @author Fisher
 */
public class OrdenarDescendente implements Comparator<String>{
    
    //Declaramos solo el metodo compare que nos pide el metodo interface para ordenar nuestra lista
    @Override
    public int compare(String obj1, String obj2) {
        return obj2.compareTo(obj1);//Ordenara los valores de forma descendente
    }
    
}
