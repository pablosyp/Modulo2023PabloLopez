
package m2.ej.n.pkg7;

import Libreria.ficha;
import Libreria.programas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class M2EJN7 {

    private static int fichaT;

    public static void main(String[] args) {
        ImageIcon Icon = new ImageIcon("src/Imagenes/lavarropas1.png");
        
        JOptionPane.showMessageDialog(null, 
                "Bienvenido a su nuevo Lava Vintage",
                "DREAN",
                JOptionPane.INFORMATION_MESSAGE,
                Icon);

        int Carga = JOptionPane.showOptionDialog(null,
               "Por favor seleccione la carga:",
               "Llenado de agua",
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,Icon,
               new Object []{"Media carga", "Carga completo" },"CARGA");

        int Lavado = JOptionPane.showOptionDialog(null,
               "Por favor seleccione Lavado:",
               "Lavado",
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,Icon,
               new Object []{"1 - Normal", "2 - Lana", "3 - Ropa Sucia", "4 - Economico", "5 - Ropa de Bebe"},"LAVADO");
        
        int Secado = JOptionPane.showOptionDialog(null,
               "Por favor seleccione Centrifugado:",
               "Secado",
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,Icon,
               new Object []{"1 - 500 REVOLUCIONES", "2 - 1000 REVOLUCIONES", "3 - Desactivado"},"SECADO");
 
        programas V = new programas (Carga,Lavado,Secado);

        V.ciclofinalizado();
        
        ficha F = new ficha (fichaT);
        F.fichaT();
       
    }
    
}
