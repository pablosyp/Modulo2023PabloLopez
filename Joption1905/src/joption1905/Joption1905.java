package joption1905;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Joption1905 {

    public static void main(String[] args) {
        //IMPUT Confirm yes/no
        int resp =JOptionPane.showConfirmDialog(null, "Usa mucho el JOption");
            if(JOptionPane.OK_OPTION == resp){
                System.out.println("Perfecto");
            } else {
                System.out.println("No Perfecto");
            }
        //INPUT de Opciones
        ImageIcon Icon = new ImageIcon("src/Imagenes/foto.png");
        int seleccion = JOptionPane.showOptionDialog(null,
            "Seleccione Una Opcion ",
            "Seleccion Multiple",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon,
            new Object[]{"Juan","Pedro","Pablo","Adam"},"Juan");
        
        
        switch(seleccion){
            case 0: JOptionPane.showMessageDialog(null,"Seleciono a Juan");
            break;
            
            case 1: JOptionPane.showMessageDialog(null,"Seleciono a Pedro");
            break;
            
            case 2: JOptionPane.showMessageDialog(null,"Seleciono a Pablo");
            break;
            
            case 3: JOptionPane.showMessageDialog(null,"Seleciono a Adam");
            break;
            
            default:
                 
        }
        /*
        if (seleccion == 0){
            JOptionPane.showMessageDialog(null,"Seleciono a Juan");
            
        }
        */
    }
}

