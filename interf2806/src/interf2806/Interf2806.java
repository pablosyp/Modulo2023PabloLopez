
package interf2806;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interf2806 extends JFrame {
    private JLabel etiq;
    
    //constructor
    public Interf2806 (){
        //indicar con coordenadas la ubicacion del form
        setLayout(null);
        
    //crear la etiqueta
        //mensaje de etiquetas
        etiq = new JLabel("HOLA Etiqueta");
        //ubicacion x , y , ancho , alto
        etiq.setBounds(0,0,500,300);
        etiq.setHorizontalAlignment(JLabel.CENTER);
        add (etiq);
           
    }
    public static void main(String[] args) {
        
        Interf2806 ford =new Interf2806();
        
        //tamaño
        ford.setBounds(0, 0,500,300);
        //hacer visible formulario
        ford.setVisible(true);
        //centrar formulario
        ford.setLocationRelativeTo(null);
        //permitir la edicion del tamaño
        ford.setResizable(false);
        //titulo del formulario
        ford.setTitle("Saludos");
        
        
        
        
    }
    
}
