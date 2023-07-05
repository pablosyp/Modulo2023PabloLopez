
package m2.ejercicio.n.pkg20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class M2EjercicioN20 extends JFrame implements ActionListener{

    private JButton promedio;
    private JLabel exam1,exam2,exam3,respuesta;
    private JTextField textbox1,textbox2,textbox3;
    
    public M2EjercicioN20(){
    setLayout(null);
        
        //Crear etiquetas
        exam1 =new JLabel("Examen 1 :");
        exam1.setBounds(10,10,300,30);
        add(exam1);
         
        exam2 =new JLabel("Examen 2 :");
        exam2.setBounds(10,50,300,30);
        add(exam2);
        
        exam3 =new JLabel("Examen 3 :");
        exam3.setBounds(10,90,300,30);
        add(exam3);
        
        respuesta =new JLabel("");
        respuesta.setBounds(110,200,300,30);
        add(respuesta);
        
        //input box
        textbox1 =new JTextField();
        textbox1.setBounds(120,17,150,20);
        add(textbox1);
         
        textbox2 =new JTextField();
        textbox2.setBounds(120,57,150,20);
        add(textbox2);
        
        textbox3 =new JTextField();
        textbox3.setBounds(120,97,150,20);
        add(textbox3);
        
        //crear botones
        promedio =new JButton("Promedio");
        promedio.setBounds(110,140,90,30);
        add(promedio);
        promedio.addActionListener(this);   //vincula el boton con la accion
        
    }
        public void actionPerformed (ActionEvent e){
                
            int num1 = Integer.parseInt(textbox1.getText());
            int num2 = Integer.parseInt(textbox2.getText());
            int num3 = Integer.parseInt(textbox3.getText());
            int subtotal= 0;
            int total= 0;
            
            subtotal= (num1 + num2) + num3;
            total=subtotal /3;
            respuesta.setText("La nota total es : " +total);       
            
        }
                
    public static void main(String[] args) {
       M2EjercicioN20 form1 = new M2EjercicioN20();
       form1.setBounds(600, 200,350,300);
       form1.setVisible(true);
       form1.setResizable(false);
       form1.setTitle("Promedio");
        
    }
        
    }
    

