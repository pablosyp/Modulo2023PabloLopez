
package Operaciones;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Csoptec {
    protected int cliente,Celular,Tablet,Joystick,disp;
    String marca,modelo,defecto,bateria;
          
    ImageIcon logo = new ImageIcon("src/Imagenes/ST.png");
        
    public void PedirDatos(){
    JOptionPane.showMessageDialog(null,
            "Bienvenidos al Soporte Tecnico",
            "M2C",
            JOptionPane.INFORMATION_MESSAGE, logo);
    }
    public void PedirDatosC(){
    String v1 = (String) JOptionPane.showInputDialog(null,
            "Numero de cliente :",
            "M2C",
            JOptionPane.QUESTION_MESSAGE, logo,
            null,
            "");

    cliente = Integer.parseInt(v1);
    
    }
    public void MostrarResultadoCE(){
    JOptionPane.showMessageDialog(null,
            """
            Datos del Celular :
             Numero de cliente :"""+cliente+ "\n Marca :" +marca+ "\n Modelo :" +modelo+ "\n Bateria :" +bateria+ "\n Defecto :" +defecto,
            "M2C",
            JOptionPane.INFORMATION_MESSAGE, logo);
    }
    public void MostrarResultadoTA(){
    JOptionPane.showMessageDialog(null,
            """
            Datos de la Tablet :
             Numero de cliente :"""+cliente+ "\n Marca :" +marca+ "\n Modelo :" +modelo+ "\n Bateria :" +bateria+ "\n Defecto :" +defecto,
            "M2C",
            JOptionPane.INFORMATION_MESSAGE, logo);
    }
    public void MostrarResultadoJO(){
    JOptionPane.showMessageDialog(null,
            """
            Datos del Joystick :
             Numero de cliente :"""+cliente+ "\n Marca :" +marca+ "\n Modelo :" +modelo+  "\n Bateria :" +bateria+ "\n Defecto :" +defecto,
            "M2C",
            JOptionPane.INFORMATION_MESSAGE, logo);
}

}

