/*
SUBCLASE QUE HEREDA DE MUSICO Y ESTUDIANTE AL MISMO TIEMPO (Herencia multiple)
 */
package Interfaces;

/**
 *
 * @author Fisher
 */
public class MusicoEstudiante implements Musico, Estudiante { //Hereda dos clases al mismo tiempo usando IMPLEMENTS

    //DECLARACION OBLIGATORIA DE TODOS LOS METODOS ABSTRACTOS QUE SE HEREDA DE LAS DOS SUPERCLASES
    @Override
    public void tocarMusica() { //Metodo que viene de la clase Musico
        System.out.println("Estoy tocando musica");
    }

    @Override
    public void hablar() { //Metodo que viene de la clase Persona
        System.out.println("Estoy hablando de musica");
    }

    @Override
    public void estudiar() { //Metodo que viene de la clase Estudiante
        System.out.println("Estoy estudiando Musica");
    }

}
