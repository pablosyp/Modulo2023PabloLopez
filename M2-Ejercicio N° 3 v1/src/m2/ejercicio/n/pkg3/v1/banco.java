/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m2.ejercicio.n.pkg3.v1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author F4121
 */
public class banco {
    public void transaccion(){
    ImageIcon Icon = new ImageIcon("src/imagenes/cajero.png");
    String accion;
    
    int saldo=5000;
    String extraccion="";
    String deposito="";
    int pesos=0;
    String consultas="";
    int resultado=0;
    
    String [] acciones ={"Extraccion","Deposito","Consulta de Saldo"};
    
    accion = (String) JOptionPane.showInputDialog(null,"Seleccione una accion :","Banco CC",JOptionPane.QUESTION_MESSAGE,Icon,acciones,acciones[0]);

    if(accion.equalsIgnoreCase("Extraccion")){
            extraccion = (String) JOptionPane.showInputDialog(null,"Ingrese un valor :" +pesos , "Banco CC",JOptionPane.QUESTION_MESSAGE,Icon,null,"");
                int  pesos2 = Integer.parseInt(extraccion);
                if (pesos2 <=saldo){
                    JOptionPane.showMessageDialog(null,"Su transaccion fue exitosa");
                            resultado= saldo-(pesos2);
                            JOptionPane.showMessageDialog(null,"Su saldo es de :" +resultado );
                            JOptionPane.showMessageDialog(null,"Que tenga buen dia - Rerite su tarjeta");
                }else if(pesos2 > saldo){
                    JOptionPane.showMessageDialog(null,"Su saldo es insuficiente");
                    JOptionPane.showMessageDialog(null,"Que tenga buen dia - Rerite su tarjeta");
                        }
                }
    if(accion.equalsIgnoreCase("Deposito")){
            deposito = (String) JOptionPane.showInputDialog(null,"Ingrese un valor :" +pesos , "Banco CC",JOptionPane.QUESTION_MESSAGE,Icon,null,"");
                int  pesos2 = Integer.parseInt(deposito);
                JOptionPane.showMessageDialog(null,"Su transaccion fue exitosa");
                            resultado= saldo + pesos2;
                            JOptionPane.showMessageDialog(null,"Su saldo es de :" +resultado );
                            JOptionPane.showMessageDialog(null,"Gracias por su deposito - Rerite su tarjeta");
                }
        
    if(accion.equalsIgnoreCase("Consulta de Saldo")){
            JOptionPane.showMessageDialog(null,"Su saldo es de : $" +saldo);
            JOptionPane.showMessageDialog(null,"Que tenga excelente dia!!! - Rerite su tarjeta");
        }
    }
    
    
}
