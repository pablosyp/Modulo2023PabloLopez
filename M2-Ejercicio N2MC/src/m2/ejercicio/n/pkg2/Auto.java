/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m2.ejercicio.n.pkg2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Auto {
    ImageIcon Icon = new ImageIcon("src/imagenes/fitito.png");
    
    String dato1 = "";
    String dato2 = "";
    String dato3 = "";
   
    int kilometraje = 0;

    public void DatosVehiculo(){
    dato1 = JOptionPane.showInputDialog(null, "Ingrese la Marca " +dato1, "", JOptionPane.QUESTION_MESSAGE);
    dato2 = JOptionPane.showInputDialog(null, "Ingrese el Modelo " +dato2, "", JOptionPane.QUESTION_MESSAGE);
    }

    public void estadoAuto(){
        int kilometraje = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Kilometraje ","",JOptionPane.QUESTION_MESSAGE));
        if (kilometraje == 0){
        dato3 = "0 km \n Esta nuevo"; 
        } else if (kilometraje <10000){
        dato3 = "<10000km \n Poco usado";
        } else if (kilometraje <100000){
        dato3 = "<100000km \n Usado";
        } else {
        dato3 = ">100000km \n Bastante usado";
        }  
        
    }    
    
}