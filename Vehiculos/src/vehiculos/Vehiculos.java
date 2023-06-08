/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Vehiculos {

    public static void main(String[] args) {
       
        String [] vehi ={"Autos","Motos"};
        ImageIcon Icon = new ImageIcon("src/Imagenes/icon1.png");
        
        //JOptionPane.showInputDialog(null,"Seleccione el vehiculo :","Rodados :",JOptionPane.QUESTION_MESSAGE,Icon,vehi,vehi[0]);
        
        Autos A = new Autos();
        Motos M = new Motos();
        
        int rodados = JOptionPane.showOptionDialog(null,
            "Seleccione el vehiculo : ",
            "Consesionario",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon,
            new Object[]{"Autos","Motos"},"");
        
        switch(rodados){
            case 0: A.marcasA(); A.tiposA(); A.impresionA();
            break;
            
            case 1: M.marcasM(); M.tiposM(); M.impresionM();
            break;
  
        }
        
    }
    
}

