
package Operaciones;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Cpadre {
    protected int valor1,valor2,resultado;
    
ImageIcon logo = new ImageIcon("src/Imagen/Imagen.png");    
//Metodo para pedir los valores
public void PedirDatos(){
    JOptionPane.showMessageDialog(null,
            "bienvenidos a Calculin",
            "Podra realizar las operaciones con Herencia",
            JOptionPane.INFORMATION_MESSAGE, logo);
    
    String v1 = (String) JOptionPane.showInputDialog(null,
            "Ingrese el valor",
            "CALCULIN SUMAS Y RESTAS",
            JOptionPane.QUESTION_MESSAGE, logo,
            null,
            "");
    String v2 = (String) JOptionPane.showInputDialog(null,
            "Ingrese el valor",
            "CALCULIN SUMAS Y RESTAS",
            JOptionPane.QUESTION_MESSAGE, logo,
            null,
            "");
    
    valor1 = Integer.parseInt(v1);
    valor2 = Integer.parseInt(v2);
       
}
//Metodo para mostrar datos
public void MostrarResultado(){
    JOptionPane.showMessageDialog(null,
            "El resultado de la operacion fue :" +resultado,
            "Resultado de la Operacion",
            JOptionPane.INFORMATION_MESSAGE, logo);

}   
  
}
