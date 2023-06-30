
package m2.ejercicio.n.pkg18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class M2EJercicioN18 extends JFrame implements ActionListener{

     private JButton saludar,salida;
     private JLabel etiqueta,respuesta;
     private JTextField textbox;
     
     public M2EJercicioN18(){
         
         setLayout(null);
         
         //Crear etiquetas
         etiqueta =new JLabel("Ingrese su nombre");
         etiqueta.setBounds(10,10,300,30);
         add(etiqueta);
         
         respuesta =new JLabel("");
         respuesta.setBounds(10,150,300,30);
         add(respuesta);
         
         //input box
         textbox =new JTextField();
         textbox.setBounds(120,17,150,20);
         add(textbox);
         
         //crear botones
         saludar =new JButton("Saludar");
         saludar.setBounds(10,100,90,30);
         add(saludar);
         saludar.addActionListener(this);   //vincula el boton con la accion
         
         salida=new JButton("Salida");
         salida.setBounds(210,200,90,30);
         add(salida);
         salida.addActionListener(this);    //vincula el boton con la accion
 
     }
     
     public void actionPerformed (ActionEvent e){
         
         if (e.getSource()== saludar ){
             respuesta.setText("Hola " + textbox.getText());
         }else if (e.getSource()== salida){
             System.exit(0);
         }
         
     }

    public static void main(String[] args) {
        //Mostramos lo que creamos caja de donde estaran los botones
       M2EJercicioN18 form1 = new M2EJercicioN18();
       form1.setBounds(0,0,350,300);
       form1.setVisible(true);
       form1.setResizable(false);
       form1.setTitle("Saludar");
        

    }
    
}
