
package ejercicio.n.pkg15.juego.del.vaso;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EjercicioN15JuegoDelVaso {

    public static void main(String[] args) {
        //Generar random pelotita
        Random RD = new Random();
        int pelotita = RD.nextInt(3);

        //Imagenes 
        ImageIcon Bien = new ImageIcon("src/Imagenes/pelotita-bien.png");
        ImageIcon Mal = new ImageIcon("src/Imagenes/pelotita-mal.png");
        ImageIcon Icon = new ImageIcon("src/Imagenes/pelotita-icon.png");
        
        //Mostrar vasos
        int seleccion = JOptionPane.showOptionDialog(null,
                "Encuentre la pelotita en los vasos",
                "Juego del Baso",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,Icon,
                new Object [] {"Vaso 1","Vaso 2","Vaso 3"},"Vaso 1");
        //Logica del Juego
         if (pelotita==seleccion){
            JOptionPane.showMessageDialog(null,"MUY BIEN","Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,Bien);
        } else {
            JOptionPane.showMessageDialog(null,"MUY MAL","Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,Mal);
        }
        
        
        
    }
    
}
