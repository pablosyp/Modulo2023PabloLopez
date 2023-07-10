
package m2.ejercicio.n.pkg22;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class M2EjercicioN22 extends JFrame implements ActionListener{

    private JButton boton;
    private JLabel dato,sel1,sel2,sel3,sel4,sel5;
    private JTextField textbox;
    
    public M2EjercicioN22(){
        setLayout(null);
        sel1 =new JLabel("Colores : 1 - Azul");
        sel1.setBounds(120,20,300,30);
        
        sel2 =new JLabel("Colores : 2 - Verde");
        sel2.setBounds(120,50,300,30);
        
        sel3 =new JLabel("Colores : 3 - Magenta");
        sel3.setBounds(120,80,300,30);
        
        sel4 =new JLabel("Colores : 4 - Negro");
        sel4.setBounds(120,110,300,30);
        
        sel5 =new JLabel("Colores : 5 - Rojo");
        sel5.setBounds(120,140,300,30);
        
        dato =new JLabel("Numero :");
        dato.setBounds(10,180,300,30);
        //add(dato1);
        
        textbox =new JTextField();
        textbox.setBounds(120,187,150,20);
        //add(textbox1);

        boton =new JButton("Pulsador");
        boton.setBounds(150,280,90,30);
        //add(boton);
        boton.addActionListener(this);

        
        Container panel = getContentPane();
            panel.setLayout(null);
            panel.add(sel1);
            panel.add(sel2);
            panel.add(sel3);
            panel.add(sel4);
            panel.add(sel5);
            panel.add(dato);
            panel.add(textbox);
            panel.add(boton);
            panel.setBackground(Color.WHITE);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        int num = Integer.parseInt(textbox.getText());
        
        if(e.getSource() == boton){
            Container panel = getContentPane();
            panel.setLayout(null);
            //int num= 0;
            
            if (num == 1){
            panel.setBackground(Color.BLUE);
            } else if(num == 2){
            panel.setBackground(Color.GREEN);
            } else if(num == 3){
            panel.setBackground(Color.MAGENTA);
            } else if(num == 4){
            panel.setBackground(Color.BLACK);
            } else if(num == 5){
            panel.setBackground(Color.RED);
            }

    }
        }
    
    
    public static void main(String[] args) {
        M2EjercicioN22 form1 = new M2EjercicioN22();
        form1.setBounds(600,200,400,500);
        form1.setVisible(true);
        form1.setResizable(false);
        form1.setTitle("Datos");
        
    }
}
