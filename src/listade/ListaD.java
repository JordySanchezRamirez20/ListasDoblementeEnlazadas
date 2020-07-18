
package listade;

import javax.swing.JOptionPane;

/**
 *
 * @author jordy
 */
public class ListaD {
    //Atributos
    Nodo Inicio;
    Nodo Fin;
    
    //Constructor

    public ListaD() {
        Inicio = null;
        Fin = null;
    }
    
    boolean Vacio(){
        if(Inicio == null){
            JOptionPane.showMessageDialog(null,"\n\tNo hay lista doblemente enlazada","\tError",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }
    
    void InsertarI(){
        String Dato,Nombre;
        boolean b;
        Dato = JOptionPane.showInputDialog(null,"\n\tDato: ","\tInsertar Inicio - Nodo",JOptionPane.INFORMATION_MESSAGE);
        if(Inicio == null){
            Nombre = JOptionPane.showInputDialog(null,"\n\tNombre: ","\tInsertar Fin - Nodo",JOptionPane.QUESTION_MESSAGE);
            Nodo Nuevo = new Nodo(Dato,Nombre);
            
            Inicio = Nuevo;
            Fin = Nuevo;
            
        }
        else{
            b = Buscar(Dato);
            if(b == false){
                Nombre = JOptionPane.showInputDialog(null,"\n\tNombre: ","\tInsertar Fin - Nodo",JOptionPane.QUESTION_MESSAGE);
                Nodo Nuevo = new Nodo(Dato,Nombre);
                
                Inicio.Anterior = Nuevo;
                Nuevo.Siguiente = Inicio;
                Inicio = Nuevo;
            }
        }
    }
    
    void InsertarF(){
        String Dato,Nombre;
        boolean b;
        Dato = JOptionPane.showInputDialog(null,"\n\tDato: ","\tInsertar Fin - Nodo",JOptionPane.QUESTION_MESSAGE);
        if(Inicio == null){
            Nombre = JOptionPane.showInputDialog(null,"\n\tNombre: ","\tInsertar Fin - Nodo",JOptionPane.QUESTION_MESSAGE);
            Nodo Nuevo = new Nodo(Dato,Nombre);
            
            Inicio = Nuevo;
            Fin = Nuevo;
            
        }
        else{
            b = Buscar(Dato);
            if(b == false){
                Nombre = JOptionPane.showInputDialog(null,"\n\tNombre: ","\tInsertar Fin - Nodo",JOptionPane.QUESTION_MESSAGE);
                Nodo Nuevo = new Nodo(Dato,Nombre);
                
                Fin.Siguiente = Nuevo;
                Nuevo.Anterior = Fin;
                Fin = Nuevo;
            }
        }
    }
    
    boolean Buscar(String Dato){
        Nodo Aux = Inicio;
        while(Aux != null){
            if(Dato.equals(Aux.Dato)){
                JOptionPane.showMessageDialog(null,"\n\tEl dato ya existe","\tError",JOptionPane.ERROR_MESSAGE);
                return true;
            }
            Aux = Aux.Siguiente;
        }
        return false;
    }
    
    void VerI(){
       Nodo Aux = Inicio;
       JOptionPane.showMessageDialog(null,"" + Aux,"\tVer Inicio - Nodo",JOptionPane.INFORMATION_MESSAGE);
    }
    
    void VerF(){
        Nodo Aux = Fin;
        JOptionPane.showMessageDialog(null,"" + Aux,"\tVer Fin - Nodo",JOptionPane.INFORMATION_MESSAGE);
    }
    
    void MostrarIF(){
        Nodo Aux = Inicio;
        String D = "";
        while(Aux != null){
             D = D + Aux;
             Aux = Aux.Siguiente;
        }
        JOptionPane.showMessageDialog(null,"" + D,"\n\tMostrar Lista - Nodo Inicio a Nodo Fin",JOptionPane.INFORMATION_MESSAGE);
    }
    
    void MostrarFI(){
        Nodo Aux = Fin;
        String f = "";
        while(Aux != null){
            f = f + Aux;
            Aux = Aux.Anterior;
        }
        JOptionPane.showMessageDialog(null,"" + f,"\tMostrar Lista - Nodo Fin a Nodo Inicio",JOptionPane.INFORMATION_MESSAGE);
    }
    
    void MostrarNANS(){
        Nodo Aux = Inicio;
        while(Aux != null){
            JOptionPane.showMessageDialog(null,"\n\tNodo Anterior: " + Aux.Anterior + "\n\tNodo Actual: " + Aux + "\n\tNodo Siguiente: " + Aux.Siguiente,"\tNodo Anterio a Nodo Siguiente",JOptionPane.INFORMATION_MESSAGE);
            Aux = Aux.Siguiente;
        }
    }
    void Busqueda(){
        Nodo Aux = Inicio;
        String Dato;
        int b = 0;
        Dato = JOptionPane.showInputDialog(null,"\n\tDato: ","\tBusca Dato - Nodo",JOptionPane.QUESTION_MESSAGE);
        while(Aux != null){
            if(Dato.equals(Aux.Dato)){
                JOptionPane.showMessageDialog(null,"" + Aux,"\tBusca Dato - Nodo",JOptionPane.INFORMATION_MESSAGE);
                b = 1;
                break;
            }
            Aux = Aux.Siguiente;
        }
        if(b == 0){
            JOptionPane.showMessageDialog(null,"\n\tEl dato no existe","\tError",JOptionPane.ERROR_MESSAGE);
        }
    }
    void BorraI(){
         JOptionPane.showMessageDialog(null,"\n\t" + Inicio, "\tBorra Nodo - Inicio",JOptionPane.WARNING_MESSAGE);
        if(Inicio == Fin){
            Inicio = null;
            Fin = null;
        }
        else{
            Inicio = Inicio.Siguiente;
            Inicio.Anterior = null;
        }
    }
    
    void BorraF(){
        JOptionPane.showMessageDialog(null,"\n\t" + Fin, "\tBorra Nodo - Fin",JOptionPane.WARNING_MESSAGE);
        if(Inicio == Fin){
            Inicio = null;
            Fin = null;
        }
        else{
            Fin = Fin.Anterior;
            Fin.Siguiente = null;
        }
    }
        
    void Modificar(){
        Nodo Aux = Inicio;
        String Dato;
        int b = 0; 
        Dato = JOptionPane.showInputDialog(null,"\n\tDato: ","\tModifica Dato - Nodo",JOptionPane.QUESTION_MESSAGE);
        while(Aux != null){
            if(Dato.equals(Aux.Dato)){
                b=1;
                Aux.Nombre = JOptionPane.showInputDialog(null,"\n\tNombre a modificar: ","\tModifica Nombre - Nodo",JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(null,"\n\tSe modificó con éxito","\tModifica Dato - Nodo",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            Aux = Aux.Siguiente;
        }
        if(b == 0){
            JOptionPane.showMessageDialog(null,"\n\tEl dato no existe","\tModifica Dato - Nodo",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    void BorrarN(){
        Nodo Aux = Inicio;
        String Dato;
        int b = 0;
        Dato = JOptionPane.showInputDialog(null,"\n\tDato: ","\tBorrar Nodo",JOptionPane.INFORMATION_MESSAGE);
        while(Aux!=null){
            if(Dato.equals(Aux.Dato)){
                b = 1;
                JOptionPane.showMessageDialog(null,"\n\t" + Aux,"\tBorrar Nodo",JOptionPane.WARNING_MESSAGE);
                if(Inicio == Fin){
                    Inicio = null;
                    Fin = null;
                }else{
                    if(Aux == Inicio){
                        Inicio = Inicio.Siguiente;
                        Inicio.Anterior = null;
                    }
                    else
                        if(Aux == Fin){
                            Fin = Fin.Anterior;
                            Fin.Siguiente = null;
                        }
                        else{
                             Aux.Anterior.Siguiente = Aux.Siguiente;
                             Aux.Siguiente.Anterior = Aux.Anterior;
                        }
                    }
                    break;
            }
            Aux = Aux.Siguiente;
        }
        if(b == 0){
            JOptionPane.showMessageDialog(null,"\n\tEl dato no existe","\tError",JOptionPane.ERROR_MESSAGE);
        }
    }
}
