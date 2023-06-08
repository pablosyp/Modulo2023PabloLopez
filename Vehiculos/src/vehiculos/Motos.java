/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author F4121
 */
public class Motos {
    String marcas="";
    String tipos="";
    ImageIcon Icon = new ImageIcon("src/Imagenes/icon1.png");
    
    String [] marca ={"Honda","Suzuki","Yamaha"};
    String [] tipo ={"FULL","BASE"};
    
    public void marcasM(){
    marcas = (String) JOptionPane.showInputDialog(null,"Selecione el Modelo: ", "Marcas",JOptionPane.QUESTION_MESSAGE,Icon,marca,marca);
    }
    public void tiposM(){
    tipos = (String) JOptionPane.showInputDialog(null,"Selecione el Tipo: ","Tipos",JOptionPane.QUESTION_MESSAGE,Icon,tipo,tipo);
    }
    public void impresionM(){
    JOptionPane.showOptionDialog(null,
            "Marca seleccionada :"+marcas+"\n Tipo de Moto :"+tipos,
            "Consesionario",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon,
            new Object[]{"Impresion de datos"},"");
    }

}

