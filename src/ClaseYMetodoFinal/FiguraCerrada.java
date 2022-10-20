package ClaseYMetodoFinal;

/**
 * Clase hija que hereda de Figura que sea imposible heredar
 *
 * @author Fisher
 */
final public class FiguraCerrada extends Figura { //ESTA CLASE NO PUEDE TENER HERENCIA

    private int nLados;

    public FiguraCerrada(int nLados, double tamaño) {
        super(tamaño);
        this.nLados = nLados;
    }

    public final void dibujar() { //NO PUEDE EXISTIR UN METODO CON EL MISMO NOMBRE EN UNA CLASE HEREDADA
        System.out.println("Dibujo en una figura cerrada");
    }

}
