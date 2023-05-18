
package ejercicio.n.pkg15.juego.del.vaso;

import java.util.*;
import javax.swing.JOptionPane;

public class EjercicioN15JuegoDelVaso {

    public static void main(String[] args) {
        // TODO code application logic here
        String jugadorA;
        String jugadorB;
        int numerorandom;
        String juga1="";
        String juga2="";
        String juga3="";
        Random vaso = new Random();
        
        jugadorA = JOptionPane.showInputDialog(null,"Ingrese su Nombre","IMPUT",JOptionPane.QUESTION_MESSAGE);
        jugadorB = JOptionPane.showInputDialog(null,"Ingrese su Nombre","IMPUT",JOptionPane.QUESTION_MESSAGE);

        numerorandom = vaso.nextInt(3)+1;
        
        JOptionPane.showMessageDialog(null,"Inicio del Juego","",JOptionPane.INFORMATION_MESSAGE);
        int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad",""));
        int juga1=Integer.parseInt(JOptionPane.showInputDialog(null,"J\" ugada 1","Seleccione el vaso 1 - 2 - 3 " +jugadorA,"IMPUT",JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showInputDialog(null,"Seleccione el vaso 1 - 2 - 3 " +jugadorA,"IMPUT",JOptionPane.QUESTION_MESSAGE);
        
    }
    
}
