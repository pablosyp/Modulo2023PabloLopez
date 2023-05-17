
package ejercicio.nº16.login.joptionpane;

import javax.swing.JOptionPane;

public class EjercicioNº16LOGINJOPTIONPANE {

    public static void main(String[] args) {
        // TODO code application logic here
        String usuario = "Pablo";
        String pass = "123456";
        
        usuario = JOptionPane.showInputDialog(null,"Ingrese su Usuario","IMPUT",JOptionPane.QUESTION_MESSAGE);
        pass = JOptionPane.showInputDialog(null,"Ingrese su Pass","IMPUT",JOptionPane.QUESTION_MESSAGE);
        if(usuario.equals("Pablo") && pass.equals("123456")){
            JOptionPane.showMessageDialog(null,"Usuario y Pass correcto","Usuario",JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(null,"Usuario Y/O Pass Incorrecto","Incorrecto",JOptionPane.ERROR_MESSAGE);
              
        }
        
                
        }
    }


