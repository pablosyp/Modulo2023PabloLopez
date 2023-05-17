
package joption1704;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Joption1704 {

    public static void main(String[] args) {
        String nombre ;
        String apellido ;
        
        //Mensaje JOPTION
        JOptionPane.showMessageDialog(null,"Este es un mensaje de Informacion","Mensaje de Informacion",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Este es un mensaje de Alerta","Mensaje de Alerta",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Este es un mensaje de Error","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"Este es un mensaje de Pregunta","Mensaje de Pregunta",JOptionPane.QUESTION_MESSAGE);
        
        //Input de JOption Nombre
        nombre = JOptionPane.showInputDialog(null,"Ingrese su Nombre","IMPUT",JOptionPane.QUESTION_MESSAGE);
        //Mostrar nombre del tipito
        JOptionPane.showMessageDialog(null,"El Nombre del Tipito es: " + nombre ,"DATOS DEL TIPITO",JOptionPane.WARNING_MESSAGE);
        //Input de JOption Apellido
        apellido = JOptionPane.showInputDialog(null,"Ingrese su Apellido","IMPUT",JOptionPane.QUESTION_MESSAGE);
        //Mostrar apellido del tipito
        JOptionPane.showMessageDialog(null,"El Apellido del Tipito es: " + apellido ,"DATOS DEL TIPITO",JOptionPane.WARNING_MESSAGE);
        //pedir numeros enteros
        int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad",""));
        //mostrar numeros
        JOptionPane.showMessageDialog(null,"La edad es : " + numero, "La edad del Tipito",JOptionPane.INFORMATION_MESSAGE);
    
        //mensaje con icono
        ImageIcon BIEN = new ImageIcon("src/Imagenes/foto.png");
        JOptionPane.showMessageDialog(null,"MUY BIEN" + " - " + nombre + " - " + apellido + " - Edad : " + numero,"Positivo",JOptionPane.INFORMATION_MESSAGE,BIEN);
        
    }
    
}
