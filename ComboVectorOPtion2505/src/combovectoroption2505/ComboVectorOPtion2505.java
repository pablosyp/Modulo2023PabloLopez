/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combovectoroption2505;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ComboVectorOPtion2505 {

    public static void main(String[] args) {
        // TODO code application logic here
        ImageIcon color = new ImageIcon("src/Imagenes/colores.png");
        
        String [] colores = {"","rojo","negro","amarillo","azul"};
        
        String option = (String) JOptionPane.showInputDialog(null,"Seleccione un color ","Hay que elegir",JOptionPane.QUESTION_MESSAGE,color,colores,colores[0]);
        
        System.out.println("El color es :" +option);
        
        
    }
    
}
