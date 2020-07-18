
package listade;

import javax.swing.JOptionPane;

public class ListaDE {

    
    public static void main(String[] args) {
        int opcion;
        String op;
        ListaD c = new ListaD();
        do{
            op = JOptionPane.showInputDialog(null,"\n\tMenú Principal\n"
                    + "\n\t1. Insertar Inicio - Nodo"
                    + "\n\t2. Insertar Fin - Nodo"
                    + "\n\t3. Ver Inicio - Nodo"
                    + "\n\t4. Ver Fin - Nodo"
                    + "\n\t5. Mostrar Lista - Nodo Inicio a Nodo Fin"
                    + "\n\t6. Mostrar Lista - Nodo Fin a Nodo Inicio"
                    + "\n\t7. Mostrar Lista - Nodo Anterior y Nodo Siguiente"
                    + "\n\t8. Busca Dato - Nodo"
                    + "\n\t9. Borra Nodo - Inicio"
                    + "\n\t10. Borra Nodo - Fin"
                    + "\n\t11. Elimina Dato - Nodo"
                    + "\n\t12. Modifica Dato - Nodo"
                    + "\n\n\t0. Salir"
                    + "\n\n\tSelecciona una opción","Menú Principal", JOptionPane.QUESTION_MESSAGE);
            if("1".equals(op) || "2".equals(op) || "3".equals(op) || "4".equals(op) || "5".equals(op) || "6".equals(op) || "7".equals(op) || "7".equals(op) || "8".equals(op) || "9".equals(op) || "10".equals(op) || "11".equals(op) || "12".equals(op) || "0".equals(op)){
                opcion = Integer.parseInt(op);
            }
            else
                if(op == null){
                    opcion = 0;
                }
                else{
                    opcion = -1;
                }
                switch(opcion){
                    case 1: 
                        c.InsertarI();
                        break;
                    case 2:
                        c.InsertarF();
                        break;
                    case 3:
                        
                        if(c.Vacio() == false){
                            c.VerI();
                        }
                        break;
                    case 4:
                        
                        if(c.Vacio() == false){
                            c.VerF();
                        }
                        break;
                    case 5:
                        
                        if(c.Vacio() == false){
                            c.MostrarIF();
                        }
                        break;
                    case 6:
                        
                        if(c.Vacio() == false){
                            c.MostrarFI();
                        }
                        break;
                    case 7:
                        
                        if(c.Vacio() == false){
                            c.MostrarNANS();
                        }
                        break;
                    case 8:
                        
                        if(c.Vacio() == false){
                            c.Busqueda();
                        }
                        break;
                    case 9: 
                        
                        if(c.Vacio() == false){
                           c.BorraI(); 
                        }
                        break;
                    case 10:
                        
                        if(c.Vacio() == false){
                            c.BorraF();
                        }
                        break;
                    case 11:
                        
                        if(c.Vacio() == false){
                            c.BorrarN();
                        }
                        break;
                    case 12:
                        
                        if(c.Vacio() == false){
                            c.Modificar();
                        }
                        break;
                    case 0: 
                        JOptionPane.showMessageDialog(null,"\n\tHasta Luego","\tSalir",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"\n\tOpción inválida","Error",JOptionPane.ERROR_MESSAGE);
                }
        }while(opcion != 0);
    }
    
}
