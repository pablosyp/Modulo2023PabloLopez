
package vehiculos;

import javax.swing.JOptionPane;

public class Autos {
    private String marcas="";
    private String tipos="";
    
    public void Autos(String marcas, String tipos){
        this.marcas=marcas;
        this.tipos=tipos;
    }
    public void getAutos(){
        String marcas =(String) JOptionPane.showInputDialog(null, "Marca", "Autos", JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        String tipos =(String) JOptionPane.showInputDialog(null, "Tipos", "Autos", JOptionPane.QUESTION_MESSAGE, null, null, null);
    
    }
    public void getImpresion(){
    JOptionPane.showOptionDialog(null,
            "Marca seleccionada :"+Autos.this.marcas+"\n Tipo de Auto :"+Autos.this.tipos,
            "Consesionario",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,
            new Object[]{"Impresion de datos"},"");
    }

}




