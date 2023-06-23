
package vehiculos;

import javax.swing.JOptionPane;

public class Vehiculos {

        public static void main(String[] args) {
        
        Autos A =new Autos ();
        Motos M =new Motos ();

        int rodados = JOptionPane.showOptionDialog(null,
            "Seleccione el vehiculo : ",
            "Consesionario",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,
            new Object[]{"Autos","Motos"},"");
        
        switch(rodados){
            case 0: A.getAutos(); A.getImpresion();
            break;
            
            case 1: M.getMotos(); M.getImpresion();
            break;
  
        }
        
}
}
