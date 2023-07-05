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
    Autos Form1 = new Autos("", "");
        Form1.setMarca("Ford");
        Form1.setTipo("Full");
        
        JOptionPane.showMessageDialog(null, 
                "\n Formulario de prueba para Autos  " + 
                "\n Auto Seleccionado :" + Form1.getMarca()+
                "\n Tipo de Auto :" + Form1.getTipo(),
                "Consesionario",
                JOptionPane.INFORMATION_MESSAGE,
                Icon);
        Motos Form2 = new Motos("", "");
        Form2.setMarca("Honda");
        Form2.setTipo("Base");
        
        JOptionPane.showMessageDialog(null, 
                "\n Formulario de prueba para Motos  " + 
                "\n Moto Seleccionada :" + Form2.getMarca()+
                "\n Tipo de Moto :" + Form2.getTipo(),
                "Consesionario",
                JOptionPane.INFORMATION_MESSAGE,
                Icon);
        
        int rodados = JOptionPane.showOptionDialog(null,
            "Seleccione el vehiculo : ",
            "Consesionario",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon,
            new Object[]{"Autos","Motos"},"");
        
        switch(rodados){
                case 0: Autos autoA= new Autos("", "");      
                        String marcaA =(String) JOptionPane.showInputDialog(null, "Marca", "Marca", JOptionPane.QUESTION_MESSAGE, Icon, null, null);
                        autoA.setMarca(marcaA);
                        String tipoA =(String) JOptionPane.showInputDialog(null, "Tipo", "Tipo", JOptionPane.QUESTION_MESSAGE, Icon, null, null);
                        autoA.setTipo(tipoA);
                        JOptionPane.showMessageDialog(null,
                        "\n Auto Seleccionado :" + autoA.getMarca() +
                        "\n Tipo de Auto :" + autoA.getTipo(),
                        "Consesionario",
                        JOptionPane.INFORMATION_MESSAGE,
                        Icon);
                        break;
                case 1: Motos motoM= new Motos("", "");
                        String marcaM =(String) JOptionPane.showInputDialog(null, "Marca", "Marca", JOptionPane.QUESTION_MESSAGE, Icon, null, null);
                        motoM.setMarca(marcaM);
                        String tipoM =(String) JOptionPane.showInputDialog(null, "Tipo", "Tipo", JOptionPane.QUESTION_MESSAGE, Icon, null, null);
                        motoM.setTipo(tipoM);
                        JOptionPane.showMessageDialog(null,
                        "\n Moto Seleccionado :" + motoM.getMarca() +
                        "\n Tipo de Moto :" + motoM.getTipo(),
                        "Consesionario",
                        JOptionPane.INFORMATION_MESSAGE,
                        Icon);
                        break;
                       
  
        }
        
    }
    
}

