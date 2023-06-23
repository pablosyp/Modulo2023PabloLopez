
package polimofirmo2306;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public abstract class Operaciones_padre {
    protected int valor1,valor2,valor3,resultado;
    ImageIcon intro = new ImageIcon("srv/imagen/intro.png");
    
    public void intro(){
        
        //Metodo para pedir valores
        JOptionPane.showMessageDialog(null,
                "Podra realizar las operaciones de suma y resta",
                "Bienvenidos a Calculin",
                JOptionPane.INFORMATION_MESSAGE,intro);
                
    }
    public void pedir_datos(){
        String v1 = (String) JOptionPane.showInputDialog(null,
                "Ingreses el primer valor",
                "Calculin suma y resta",
                JOptionPane.QUESTION_MESSAGE,
                intro,
                null,
                "");
        
        String v2 = (String) JOptionPane.showInputDialog(null,
                "Ingreses el segundo valor",
                "Calculin suma y resta",
                JOptionPane.QUESTION_MESSAGE,
                intro,
                null,
                "");
        
        valor1 = Integer.parseInt(v1);
        valor2 = Integer.parseInt(v2);
        
        
    }
    public abstract void Operaciones();
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null,
                "El resultado de la operacion fue : " +resultado,
                "Resultados de la Operacion ",
                JOptionPane.INFORMATION_MESSAGE,intro);
         
    }
    
    
}
