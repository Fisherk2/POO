package Ejercicio5;

/**
 * Clase que alamacena todos los datos de una serie de television.
 *
 * @author Fisher
 */
public class Series implements Entregable {

    //ESTOS ATRIBUTOS SIRVEN PARA EL USO DE COMPAR( ) DE LA CLASE ENTREGABLE
    public final static int MAYOR = 1;
    public final static int MENOR = -1;
    public final static int IGUAL = 0;
    //ATRIBUTOS DE LA SERIE
    private String tituloSerie, generoSerie, autorSerie;
    private int nTemporadas;
    private boolean esEntregado;

    public Series(String tituloSerie, String generoSerie, String autorSerie, int nTemporadas) {
        this.tituloSerie = tituloSerie;
        this.generoSerie = generoSerie;
        this.autorSerie = autorSerie;
        this.nTemporadas = nTemporadas;
        this.esEntregado = false; //Por defecto, cuando se crea un objeto, este esta en Stock, osea, no es vendido el articulo todavia
    }

    @Override
    public String toString() { //Cuando se llame este metodo, imprimira los datos de la serie
        return "\nInformacion de la serie\n"
                + "\nTitulo: " + tituloSerie
                + "\nNumero de Temporadas: " + nTemporadas
                + "\nGenero: " + generoSerie
                + "\nCreador: " + autorSerie;
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
    public int comparar(Object obj) {//Cuando se llame este metodo, comparara serie en serie por numero de temporadas
        int estado = MENOR;// -1
        //Hacemos un casting al objeto que tenemos de parametro para usar el metodo get de esta clase
        Series serie = (Series) obj;
        //COMPARAMOS EL NUMERO DE TEMPORADAS DE LA SERIE
        if (nTemporadas > serie.getnTemporadas()) {
            estado = MAYOR; // 1
        } else if (nTemporadas == serie.getnTemporadas()) {
            estado = IGUAL;// 0
        }
        return estado;
    }
    //EQUALS SOLO PARA EL TITULO Y EL AUTOR, YA QUE ESTOS SON IRREPETIBLES (OPCIONAL, INSERTARLO POR IDE)

    /**
     * Metodo que va comparar el titulo y el autor de una serie
     *
     * @param serie
     * @return
     */
    public boolean esIgualAEstaSerie(Series serie) {
        //Si el titulo de la serie y el autor de esta clase, es igual al del objeto que recibimos de argumento, significa que son los mismos
        if (tituloSerie.equalsIgnoreCase(serie.tituloSerie) && autorSerie.equalsIgnoreCase(serie.getAutorSerie())) {
            return true;
        }
        return false;
    }

    //GETTERS SETTERS
    public String getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(String tituloSerie) {
        this.tituloSerie = tituloSerie;
    }

    public String getGeneroSerie() {
        return generoSerie;
    }

    public void setGeneroSerie(String generoSerie) {
        this.generoSerie = generoSerie;
    }

    public String getAutorSerie() {
        return autorSerie;
    }

    public void setAutorSerie(String autorSerie) {
        this.autorSerie = autorSerie;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    public boolean isEsEntregado() {
        return esEntregado;
    }

    public void setEsEntregado(boolean esEntregado) {
        this.esEntregado = esEntregado;
    }

}
