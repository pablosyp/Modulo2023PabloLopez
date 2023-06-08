/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Autos {
    String marcas="";
    String tipos="";
    ImageIcon Icon = new ImageIcon("src/Imagenes/icon1.png");
    
    String [] marca ={"Ford","Fiat","Renault"};
    String [] tipo ={"FULL","BASE"};
    
    public void marcasA(){
    marcas = (String) JOptionPane.showInputDialog(null,"Selecione el Modelo: ", "Marcas",JOptionPane.QUESTION_MESSAGE,Icon,marca,marca);
    }
    public void tiposA(){
    tipos = (String) JOptionPane.showInputDialog(null,"Selecione el Tipo: ","Tipos",JOptionPane.QUESTION_MESSAGE,Icon,tipo,tipo);
    }
    public void impresionA(){
    JOptionPane.showOptionDialog(null,
            "Marca seleccionada :"+marcas+"\n Tipo de Auto :"+tipos,
            "Consesionario",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon,
            new Object[]{"Impresion de datos"},"");
    }

}

