
package m2.ejercicio.n.pkg19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class M2EjercicioN19 extends JFrame implements ActionListener{
    
    private JButton comparar;
    private JLabel dato1,dato2,respuesta;
    private JTextField textbox1,textbox2;

    public M2EjercicioN19(){
        
        setLayout(null);
        
        //Crear etiquetas
        dato1 =new JLabel("Ingrese numero 1");
        dato1.setBounds(10,10,300,30);
        add(dato1);
         
        dato2 =new JLabel("Ingrese numero 2 :");
        dato2.setBounds(10,50,300,30);
        add(dato2);
        
        respuesta =new JLabel("");
        respuesta.setBounds(10,150,300,30);
        add(respuesta);
         
        //input box
        textbox1 =new JTextField();
        textbox1.setBounds(120,17,150,20);
        add(textbox1);
         
        textbox2 =new JTextField();
        textbox2.setBounds(120,57,150,20);
        add(textbox2);
        
        //crear botones
        comparar =new JButton("Comparar");
        comparar.setBounds(10,100,90,30);
        add(comparar);
        comparar.addActionListener(this);   //vincula el boton con la accion
         
    }

    public void actionPerformed (ActionEvent e){
        //String datoA=textbox1.getText();
        //String datoB=textbox2.getText();
        int num1 = Integer.parseInt(textbox1.getText());
        int num2 = Integer.parseInt(textbox2.getText());
        
        if (num1==num2){
            respuesta.setText("Los numeros son iguales");       
        } else if (num1>num2){  
            respuesta.setText("El numero mayor es :" +num1); 
        } else if (num2>num1){  
            respuesta.setText("El numero mayor es :" +num2);    
        } 
        
    }

    public static void main(String[] args) {
         //Mostramos lo que creamos caja de donde estaran los botones
       M2EjercicioN19 form1 = new M2EjercicioN19();
       form1.setBounds(150, 150,350,300);
       form1.setVisible(true);
       form1.setResizable(false);
       form1.setTitle("Comparar");
         
    }
    
}
