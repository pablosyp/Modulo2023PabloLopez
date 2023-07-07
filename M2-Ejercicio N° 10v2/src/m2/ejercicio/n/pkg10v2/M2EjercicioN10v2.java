
package m2.ejercicio.n.pkg10v2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class M2EjercicioN10v2 {

    public static void main(String[] args) {
        ImageIcon Icon = new ImageIcon("src/Imagenes/lavarropas1.png");
        
        JOptionPane.showMessageDialog(null, 
                "Bienvenido a su nuevo Lava Vintage",
                "DREAN",
                JOptionPane.INFORMATION_MESSAGE,
                Icon);
        
        M2Ejercicio10Encap lavarropas = new M2Ejercicio10Encap();
        
        System.out.print("\n La carga seleccionada es :" +lavarropas.Carga());
        lavarropas.setCarga("2 - Carga Completa");
        System.out.println("\n Este modelo cuenta con unica carga : " +lavarropas.getCarga());
        System.out.println(lavarropas.Lavado());
        System.out.println(lavarropas.Secado());
        System.out.println(lavarropas.fichaT());
    }
    
        
}
