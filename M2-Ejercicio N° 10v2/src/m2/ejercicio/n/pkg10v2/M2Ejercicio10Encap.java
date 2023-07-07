
package m2.ejercicio.n.pkg10v2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class M2Ejercicio10Encap {
    ImageIcon Icon = new ImageIcon("src/Imagenes/lavarropas1.png");
    String cargaA="";
    String lavadoA="";
    String secadoA="";
    String Carga="";
    
    public String Carga(){    
        int Carga = JOptionPane.showOptionDialog(null,
               "Por favor seleccione la carga:",
               "Llenado de agua",
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,Icon,
               new Object []{"1 - Media Carga", "2 - Carga Completo" },"CARGA");
        
        switch(Carga){
            case 0: cargaA="1 - Media Carga";
            break;
            case 1: cargaA="2 - Carga Completo";
        }
        return cargaA;
    }
    public String Lavado(){
        int Lavado = JOptionPane.showOptionDialog(null,
               "Por favor seleccione Lavado:",
               "Lavado",
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,Icon,
               new Object []{"1 - Normal", "2 - Lana", "3 - Ropa Sucia", "4 - Economico", "5 - Ropa de Bebe"},"LAVADO");
        
        switch(Lavado){
            case 0: lavadoA="1 - Normal";
            break;
            case 1: lavadoA="2 - Lana";
            break;
            case 2: lavadoA="3 - Ropa Sucia";
            break;
            case 3: lavadoA="4 - Economico";
            break;
            case 4: lavadoA="5 - Ropa de Bebe";
            
        }
        return lavadoA;
    }
    public String Secado(){
        int Secado = JOptionPane.showOptionDialog(null,
               "Por favor seleccione Centrifugado:",
               "Secado",
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,Icon,
               new Object []{"1 - 500 REVOLUCIONES", "2 - 1000 REVOLUCIONES", "3 - Desactivado"},"SECADO");
        
        switch(Secado){
            case 0: secadoA="1 - 500 REVOLUCIONES";
            break;
            case 1: secadoA="2 - 1000 REVOLUCIONES";
            break;
            case 2: secadoA="3 - Desactivado";
            break;
            
        }
        return secadoA;
    }
        public String fichaT(){
                    System.out.println("-----------------------");
                    System.out.println("-----Ficha Tecnica-----");
                    System.out.println("-----------------------");
                    System.out.println("Lavarropas Familiar Dream");
                    System.out.println("Corriente 220v ");
                    System.out.println("2 Tipos de carga ");
                    System.out.println("5 Progamas predefinidos");
                    System.out.println("2 Tipos de Centrifugado");
                    System.out.println("Sistema Silensioso ");
                    System.out.println("-----------------------");
        return"";

                }
        public String getCarga(){
            return Carga;
        }
        public void setCarga(String Carga){
            this.Carga= Carga;
            
        }
}
    

