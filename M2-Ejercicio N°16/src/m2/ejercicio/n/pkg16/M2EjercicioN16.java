
package m2.ejercicio.n.pkg16;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class M2EjercicioN16 extends JFrame{
    
    private JLabel etiq,etiq1,etiq2,etiq3,etiq4;
    
    public M2EjercicioN16(){
            //indicar con coordenadas la ubicacion del form
        setLayout(null);
        
    //crear la etiqueta
        //mensaje de etiquetas
        etiq = new JLabel("Datos EJ: 16"                          );
        etiq1 = new JLabel("Nombre: Pablo Lopez"                  );
        etiq2 = new JLabel("Fecha de nacimiento: xx-xx-xx"        );
        etiq3 = new JLabel("Correo electronico: pablo@outlook.com");
        etiq4 = new JLabel("Telefono: 777-7777"                   );
        //ubicacion x , y , ancho , alto
        etiq.setBounds(0,10,300,50);
        etiq.setHorizontalAlignment(JLabel.CENTER);
        add (etiq);
        etiq1.setBounds(0,20,300,100);
        etiq1.setHorizontalAlignment(JLabel.CENTER);
        add (etiq1);
        etiq2.setBounds(0,30,300,150);
        etiq2.setHorizontalAlignment(JLabel.CENTER);
        add (etiq2);
        etiq3.setBounds(0,40,300,200);
        etiq3.setHorizontalAlignment(JLabel.CENTER);
        add (etiq3);
        etiq4.setBounds(0,50,300,250);
        etiq4.setHorizontalAlignment(JLabel.CENTER);
        add (etiq4);
    }
    
    public static void main(String[] args) {
        M2EjercicioN16 ford =new M2EjercicioN16();
        
        //tamaño
        ford.setBounds(150, 150,300,300);
        //hacer visible formulario
        ford.setVisible(true);
        //centrar formulario
        ford.setLocationRelativeTo(null);
        //permitir la edicion del tamaño
        ford.setResizable(false);
        //titulo del formulario
        ford.setTitle("Datos");
    }
    
}
