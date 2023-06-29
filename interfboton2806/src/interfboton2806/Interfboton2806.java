
package interfboton2806;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfboton2806 extends JFrame implements ActionListener{

    private JButton bot1, bot2, bot3;
    private JLabel etiq;
    
    
    public Interfboton2806(){
        setLayout(null);
        
        //construir los botones
        bot1 = new JButton("1");
        bot1.setBounds(10,100,90,30);
        add(bot1);
        bot1.addActionListener(this);
        bot2 = new JButton("2");
        bot2.setBounds(110, 100, 90, 30);
        add(bot2);
        bot2.addActionListener(this);
        bot3 = new JButton("3");
        bot3.setBounds(210, 100, 90, 30);
        add(bot3);
        bot3.addActionListener(this);
        
        //contruir la etiqueta
        etiq = new JLabel("Presiona un boton");
        etiq.setBounds(10, 50, 300, 30);
        add(etiq);

    }
       @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bot1){
            etiq.setText("Has presionado el boton 1");  
        }
        if(e.getSource()==bot2){
            etiq.setText("Has presionado el boton 2");
        }
        if(e.getSource()==bot3){
            etiq.setText("Has presionado el boton 3");
        }
    }
    public static void main(String[] args) {
        //
        Interfboton2806 form = new Interfboton2806();
        form.setBounds(0, 0, 330, 200);
        form.setVisible(true);
        form.setResizable(true);
        form.setLocationRelativeTo(form);
        form.setTitle("Botones");
    }

    
 
    }
