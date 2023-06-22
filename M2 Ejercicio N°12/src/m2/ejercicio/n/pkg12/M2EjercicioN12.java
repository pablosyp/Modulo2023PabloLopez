
package m2.ejercicio.n.pkg12;

import Operaciones.CJoystick;
import Operaciones.Ccelular;
import Operaciones.Csoptec;
import Operaciones.Ctablet;
import javax.swing.JOptionPane;

public class M2EjercicioN12 {

    public static void main(String[] args) {
        Csoptec DT = new Csoptec ();
        DT.PedirDatos();
        
        int dispositivo = JOptionPane.showOptionDialog(null,
            "Seleccione dispositivo ",
            "M2C",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,
            new Object[]{"Celular","Tablet","Joystick"},"");
    
    switch(dispositivo){
            case 0: JOptionPane.showMessageDialog(null,"Seleciono Celular");
            Ccelular msjs1 = new Ccelular();
                msjs1.PedirDatosC();
                msjs1.celulares();
                msjs1.MostrarResultadoCE();
            break;
            
            case 1: JOptionPane.showMessageDialog(null,"Seleciono Tablet");
            Ctablet msjs2 = new Ctablet();
                msjs2.PedirDatosC();
                msjs2.tablet();
                msjs2.MostrarResultadoTA();
            break;
            
            case 2: JOptionPane.showMessageDialog(null,"Seleciono Joystick");
            CJoystick msjs3 = new CJoystick();
                msjs3.PedirDatosC();
                msjs3.joystick();
                msjs3.MostrarResultadoJO();
            break;
            
            default:
}
       
        
    }
    
}
