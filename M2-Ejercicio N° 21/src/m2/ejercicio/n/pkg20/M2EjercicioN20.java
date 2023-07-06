
package m2.ejercicio.n.pkg20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class M2EjercicioN20 extends JFrame implements ActionListener{

    private JButton promedio;
    private JLabel exam1,exam2,exam3,respuesta,datoNA,datoG,datoD;
    private JTextField textbox1,textbox2,textbox3,textboxNA,textboxG,textboxD;
    
    public M2EjercicioN20(){
    setLayout(null);
         //Crear etiquetas
        datoNA =new JLabel("Nombre y Apellido :");
        datoNA.setBounds(10,20,300,30);
        add(datoNA);
         
        datoG =new JLabel("Grado :");
        datoG.setBounds(10,60,300,30);
        add(datoG);
        
        datoD =new JLabel("Division :");
        datoD.setBounds(10,100,300,30);
        add(datoD);
        
        exam1 =new JLabel("Examen 1 :");
        exam1.setBounds(10,140,300,30);
        add(exam1);
         
        exam2 =new JLabel("Examen 2 :");
        exam2.setBounds(10,180,300,30);
        add(exam2);
        
        exam3 =new JLabel("Examen 3 :");
        exam3.setBounds(10,220,300,30);
        add(exam3);
        
        respuesta =new JLabel("");
        respuesta.setBounds(150,330,300,30);
        add(respuesta);
        
        //input box
        textboxNA =new JTextField();
        textboxNA.setBounds(120,27,150,20);
        add(textboxNA);
         
        textboxG =new JTextField();
        textboxG.setBounds(120,67,150,20);
        add(textboxG);
        
        textboxD =new JTextField();
        textboxD.setBounds(120,107,150,20);
        add(textboxD);
        
        textbox1 =new JTextField();
        textbox1.setBounds(120,147,150,20);
        add(textbox1);
         
        textbox2 =new JTextField();
        textbox2.setBounds(120,187,150,20);
        add(textbox2);
        
        textbox3 =new JTextField();
        textbox3.setBounds(120,227,150,20);
        add(textbox3);
        
        //crear botones
        promedio =new JButton("Promedio");
        promedio.setBounds(150,280,90,30);
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
            
            if (total >= 6){
            respuesta.setText("Aprovado : " +total);       
            } else if (total < 5){  
            respuesta.setText("Deshaprobado : " +total); 
            }  
             
        JOptionPane.showMessageDialog(null,"\n Nombre y Apellido :" +textboxNA.getText()+ "\n Grado :" +textboxG.getText()+ "\n Division :" +textboxD.getText()+ "\n Promedio :" +total, "",JOptionPane.INFORMATION_MESSAGE,null);
        }
                
    public static void main(String[] args) {
        M2EjercicioN20 form1 = new M2EjercicioN20();
        form1.setBounds(600, 200,400,500);
        form1.setVisible(true);
        form1.setResizable(false);
        form1.setTitle("Promedio");
       
    }
        
    }
    

