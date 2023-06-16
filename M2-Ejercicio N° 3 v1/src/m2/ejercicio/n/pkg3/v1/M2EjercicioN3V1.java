
package m2.ejercicio.n.pkg3.v1;

import javax.swing.JOptionPane;


public class M2EjercicioN3V1 {

    public static void main(String[] args) {
 
    String dni = "2515";
    String pass = "1234"; 
    String dnivalidacion;
    String passvalidacion;
    
    JOptionPane.showMessageDialog(null,"Introduzca su tarjeta");   

    dnivalidacion = (JOptionPane.showInputDialog("Ingrese su DNI :"));
    passvalidacion = (JOptionPane.showInputDialog("Ingrese su Pass :"));

     if (dnivalidacion.equals(dni) && passvalidacion.equals(pass) ){

         JOptionPane.showMessageDialog(null,"Bienvenido!!!");    
    } else {
         JOptionPane.showMessageDialog(null,"Credenciales incorrecta"); 
         System.exit(0);
     }
     
    banco A = new banco();
        
    A.transaccion();

    }
}

