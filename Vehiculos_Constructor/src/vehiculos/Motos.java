
package vehiculos;

import javax.swing.JOptionPane;

public class Motos {
    private String marcas="";
    private String tipos="";
    
    public void Motos(String marcas, String tipos){
        this.marcas=marcas;
        this.tipos=tipos;
    }
    public void getMotos(){
        String marcas =(String) JOptionPane.showInputDialog(null, "Marca", "marcas", JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        String tipos =(String) JOptionPane.showInputDialog(null, "Tipos", "tipos", JOptionPane.QUESTION_MESSAGE, null, null, null);
    
        JOptionPane.showMessageDialog(null, 
                "Marca seleccionada :"+marcas+"\n Tipo de Auto :"+tipos,
                "Consesionario",
                JOptionPane.INFORMATION_MESSAGE,
                null);
    }
}


