
package m2.ejercicio.n.pkg2;

import javax.swing.JOptionPane;

public class Auto {
    
    public String dato1,dato2,dato3;
    
    public void Motos(String dato1, String dato2, String dato3){
            this.dato1=dato1;
            this.dato2=dato2;
            this.dato3=dato3;
            
        }
    public void getDatosVehiculo(){
    dato1 = JOptionPane.showInputDialog(null, "Ingrese la Marca " +dato1, "", JOptionPane.QUESTION_MESSAGE);
    dato2 = JOptionPane.showInputDialog(null, "Ingrese el Modelo " +dato2, "", JOptionPane.QUESTION_MESSAGE);
    }

    public void estadoAuto(){
        int kilometraje = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Kilometraje ","",JOptionPane.QUESTION_MESSAGE));
        if (kilometraje == 0){
        dato3 = "0 km \n Esta nuevo"; 
        } else if (kilometraje <10000){
        dato3 = "<10000km \n Poco usado";
        } else if (kilometraje <100000){
        dato3 = "<100000km \n Usado";
        } else {
        dato3 = ">100000km \n Bastante usado";
        }  
        
    }    
    
}