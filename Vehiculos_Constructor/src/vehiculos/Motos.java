
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
        String marcas =(String) JOptionPane.showInputDialog(null, "Marca", "Motos", JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        String tipos =(String) JOptionPane.showInputDialog(null, "Tipos", "motos", JOptionPane.QUESTION_MESSAGE, null, null, null);
    
    }
    public void getImpresion(){
    JOptionPane.showOptionDialog(null,
            "Marca seleccionada :"+Motos.this.marcas+"\n Tipo de Moto :"+Motos.this.tipos,
            "Consesionario",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,
            new Object[]{"Impresion de datos"},"");
    }
}

