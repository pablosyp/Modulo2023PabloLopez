
package m2.ejercicion14vehiculos;

import javax.swing.JOptionPane;

public abstract class Vehiculo {
    protected String vehi,Coche,Moto,Bus;
    
    public void intro(){
        
        //Metodo para pedir valores
        JOptionPane.showMessageDialog(null,
                "Vamos a estacionar",
                "",
                JOptionPane.INFORMATION_MESSAGE,null);
                
    }
    public void pedir_datos1(){
        
        String [] vehiculos ={"Coche","Moto","Bus"};

        vehi = (String) JOptionPane.showInputDialog(null,"Seleccione un vehiculo :","Vehiculos :",JOptionPane.QUESTION_MESSAGE,null,vehiculos,vehiculos[0]);

    }
    
    public abstract void Operaciones();
    

}


