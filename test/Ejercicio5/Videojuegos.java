package Ejercicio5;

/**
 * Clase almacenara todos los datos de un videojuego.
 *
 * @author Fisher
 */
public class Videojuegos implements Entregable {

    //ESTOS ATRIBUTOS SIRVEN PARA EL USO DE COMPAR( ) DE LA CLASE ENTREGABLE
    public final static int MAYOR = 1;
    public final static int MENOR = -1;
    public final static int IGUAL = 0;
    //ATRIBUTOS DE LA SERIE
    private String tituloVideojuego, generoVideojuego, compañiaVideojuego;
    private int horasDeJuego;
    private boolean esEntregado;

    public Videojuegos(String tituloVideojuego, String generoVideojuego, String compañiaVideojuego, int horasDeJuego) {
        this.tituloVideojuego = tituloVideojuego;
        this.generoVideojuego = generoVideojuego;
        this.compañiaVideojuego = compañiaVideojuego;
        this.horasDeJuego = horasDeJuego;
        this.esEntregado = false; //Por defecto, cuando se crea un objeto, este esta en Stock, osea, no es vendido el articulo todavia
    }

    @Override
    public String toString() { //Cuando se llame este metodo, imprimira los datos de la serie
        return "\nInformacion del videojuego\n"
                + "\nTitulo: " + tituloVideojuego
                + "\nNumero de Horas de Juego: " + horasDeJuego
                + "\nGenero: " + generoVideojuego
                + "\nCompañia: " + compañiaVideojuego+"\n";
    }

    //METODOS ABSTRACTOS DE LA INTERFACE ENTREGABLE
    @Override
    public void entregar() {
        esEntregado = true;
    }

    @Override
    public void devolver() {
        esEntregado = false;
    }

    @Override
    public boolean comprobarExistenciaEntregas() {
        if (esEntregado) {
            return true; //ARTICULO NO DISPONIBLE
        }
        return false;//ARTICULO DISPONIBLE
    }

    @Override
    public int comparar(Object obj) {//Cuando se llame este metodo, comparara videojuego en videojuego por numero de horas
        int estado = MENOR;// -1
        //Hacemos un casting al objeto que tenemos de parametro para usar el metodo get de esta clase
        Videojuegos videojuego = (Videojuegos) obj;
        //COMPARAMOS EL NUMERO DE HORAS DE JUEGO DEL VIDEOJUEGO
        if (horasDeJuego > videojuego.getHorasDeJuego()) {
            estado = MAYOR; // 1
        } else if (horasDeJuego == videojuego.getHorasDeJuego()) {
            estado = IGUAL;// 0
        }
        return estado;
    }

    //EQUALS SOLO PARA EL TITULO Y LA COMPAÑIA, YA QUE ESTOS SON IRREPETIBLES (OPCIONAL, INSERTARLO POR IDE)
    /**
     * Metodo que va comparar el titulo y la compañia de un videojuego
     *
     * @param videojuego
     * @return
     */
    public boolean esIgualAEsteVideojuego(Videojuegos videojuego) {
        //Si el titulo del videojuego y la compañia de esta clase, es igual al del objeto que recibimos de argumento, significa que son los mismos
        if (tituloVideojuego.equalsIgnoreCase(videojuego.getTituloVideojuego()) && compañiaVideojuego.equalsIgnoreCase(videojuego.getCompañiaVideojuego())) {
            return true;
        }
        return false;
    }

    //GETTERS Y SETTERS
    public String getTituloVideojuego() {
        return tituloVideojuego;
    }

    public void setTituloVideojuego(String tituloVideojuego) {
        this.tituloVideojuego = tituloVideojuego;
    }

    public String getGeneroVideojuego() {
        return generoVideojuego;
    }

    public void setGeneroVideojuego(String generoVideojuego) {
        this.generoVideojuego = generoVideojuego;
    }

    public String getCompañiaVideojuego() {
        return compañiaVideojuego;
    }

    public void setCompañiaVideojuego(String compañiaVideojuego) {
        this.compañiaVideojuego = compañiaVideojuego;
    }

    public int getHorasDeJuego() {
        return horasDeJuego;
    }

    public void setHorasDeJuego(int horasDeJuego) {
        this.horasDeJuego = horasDeJuego;
    }

    public boolean isEsEntregado() {
        return esEntregado;
    }

    public void setEsEntregado(boolean esEntregado) {
        this.esEntregado = esEntregado;
    }

}
