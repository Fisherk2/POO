package ClaseYMetodoFinal;

/**
 * Clase hija que intenta heredar de FiguraCerrada
 *
 * @author Fisher
 */
public class Cuadrado extends FiguraCerrada { //NO PUEDES HEREDAR DE ESTA CLASE

    private double area;

    public Cuadrado(double area, int nLados, double tamaño) {
        super(nLados, tamaño);
        this.area=area;
    }

    public void dibujar() { //NO PUEDE TENER EL MISMO NOMBRE DEL METODO DE LA CLASE HEREDADA
        System.out.println("Dibujo un CUADRADO");
    }

}
