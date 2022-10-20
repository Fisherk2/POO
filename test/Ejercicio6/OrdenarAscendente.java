package Ejercicio6;
import java.util.Comparator;


/**
 *Clase que servira para ordenar nuestra lista de forma ascendente
 * @author Fisher
 */
public class OrdenarAscendente implements Comparator<String>{
    
    //Declaramos solo el metodo compare que nos pide el metodo interface para ordenar nuestra lista
    @Override
    public int compare(String obj1, String obj2) {
        return obj1.compareTo(obj2);//Ordenara los valores de forma ascendente
    }
    
}
