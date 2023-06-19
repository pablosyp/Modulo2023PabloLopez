
package veterinaria;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ver {
    
    Perro animal = new Perro();
    ImageIcon animales =new ImageIcon ("srv/imagenes/animales.png");
    
    
    JOptionPane.showMessageDialog (null,
            ""+ animal.getNombre() +
            ""+ animal.getRaza() +
            JOptionPane.INFORMATION_MESSAGE,
            animales);
   
    

            
    
}
