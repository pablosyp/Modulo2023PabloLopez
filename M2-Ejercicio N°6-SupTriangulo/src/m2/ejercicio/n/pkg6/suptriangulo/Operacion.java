
package m2.ejercicio.n.pkg6.suptriangulo;

import javax.swing.JOptionPane;

public class Operacion {
    
    private int base, altura, resultado;
    
    public Operacion(int base, int altura, int resultado){
        this.base=base;
        this.altura=altura;
        this.resultado=resultado;
    }
    
        public void getDatos(){
            String baseB = (String) JOptionPane.showInputDialog(null,"Ingresar Base :", null,JOptionPane.QUESTION_MESSAGE);
            String alturaA = (String) JOptionPane.showInputDialog(null, "Ingresar Altura :", null, JOptionPane.QUESTION_MESSAGE);
        
            
            base = Integer.parseInt(baseB);
            altura = Integer.parseInt(alturaA);
            
            resultado= base * altura;
        }

        public void Resultado(){
        JOptionPane.showMessageDialog(null,"\n La superficie es : " +resultado, "",JOptionPane.INFORMATION_MESSAGE,null);

    }
}




