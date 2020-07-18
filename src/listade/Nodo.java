package listade;

/**
 *
 * @author jordy
 */
public class Nodo {

    //Atributos de la clase
    String Dato;
    String Nombre;
    
    Nodo Siguiente;
    Nodo Anterior;

    //Constructor
    public Nodo(String dato,String nombre) {
        Dato = dato;
        Nombre = nombre;
        Anterior = null;
        Siguiente = null;

    }

    @Override
    public String toString() {
        return "\n\tDato: " + Dato +"\n\tNombre: " + Nombre + "\n";
    }

    
}
