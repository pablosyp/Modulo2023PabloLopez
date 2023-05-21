/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.seguro.automotor;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class TrabajoPracticoSeguroAutomotor {

    public static void main(String[] args) {    
        int fecha=2023;
        //Logo
        ImageIcon Icon = new ImageIcon("src/Imagenes/logo.png");
        JOptionPane.showMessageDialog(null,Icon);
        //Solicitud de datos
        String nombre = JOptionPane.showInputDialog(null,"Nombre del Cliente ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null,"Apellido del Cliente ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String telefono = JOptionPane.showInputDialog(null,"Telefono ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String mail = JOptionPane.showInputDialog(null,"Mail ","Poliza",JOptionPane.QUESTION_MESSAGE);
        //Combobox
        Object [] modelo ={"Renault","Fiat","Ford"};
        JComboBox comboBoxmod = new JComboBox(modelo);    
        JOptionPane.showMessageDialog(null, comboBoxmod, "Seleccione el Modelo",JOptionPane.QUESTION_MESSAGE);

        //Dominio
        String dominio = JOptionPane.showInputDialog(null,"Ingrese Dominio :","Poliza",JOptionPane.QUESTION_MESSAGE);

        //Año de Antiguedad
        int antig = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Año de Antiguedad ","Poliza",JOptionPane.QUESTION_MESSAGE));
        int resultado = (fecha - antig);
      
        JOptionPane.showMessageDialog(null,"Antiguedad"+ "\n" + resultado + "\n");
        
        if (resultado <= 5){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $500");
        }else if ((resultado >= 5) && (resultado < 10)){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $1000");
        }else if ((resultado >= 10) && (resultado < 15)){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $1500");
        }else if ((resultado >= 15) && (resultado < 20)){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $2000");
        }else if (resultado >= 20){
            JOptionPane.showMessageDialog(null,"No se Asegura el Auto");
        
        //Tipo de cobertura
        Object [][] cobertura ={{"RC","1000"},{"TC","2000"},{"TR","3000"}};
        JComboBox comboBoxcob = new JComboBox(cobertura);    
        JOptionPane.showMessageDialog(null, comboBoxcob, "Seleccione la Cobertura",JOptionPane.QUESTION_MESSAGE);
        
    }
    
    }
}
    