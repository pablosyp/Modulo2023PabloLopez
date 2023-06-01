/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba4.tpsa.marina;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PRUEBA4TPSAMARINA {

    public static void main(String[] args) {
                int fecha=2023;
        
        int importeA = 500;
        int importeB = 1000;
        int importeC = 1500;
        int importeD = 2000;
        
        int RC = 1000;
        int TC = 2000;
        int RT = 3000;
        
        int coberAD=0;
        String coberturaT ="";
        String coberturaRT ="";
        
        int total;
        
        String marca;
        String modelos = "";
        

        //Logo
        ImageIcon Icon = new ImageIcon("src/imagenes/logo33.png");
        ImageIcon Icon1 = new ImageIcon("src/imagenes/ticket.png");
        ImageIcon Icon2 = new ImageIcon("src/imagenes/Logo2.png");
        
        ImageIcon Icon3 = new ImageIcon("src/imagenes/nombre.png");
        ImageIcon Icon4 = new ImageIcon("src/imagenes/celular.png");
        ImageIcon Icon5 = new ImageIcon("src/imagenes/mail.png");
        ImageIcon Icon6 = new ImageIcon("src/imagenes/logo.png");
        
        ImageIcon Icon7 = new ImageIcon("src/imagenes/logocitroen.png");
        ImageIcon Icon8 = new ImageIcon("src/imagenes/logoford.png");
        ImageIcon Icon9 = new ImageIcon("src/imagenes/logorenault.png");
        ImageIcon Icon10 = new ImageIcon("src/imagenes/logofiat.png");
        ImageIcon Icon11 = new ImageIcon("src/imagenes/logovw.png");
       
        
        
        JOptionPane.showMessageDialog(null,Icon,"Seguros Segurola",JOptionPane.PLAIN_MESSAGE);
        

        //Solicitud de datos
        
        
        
        
        String nombre = JOptionPane.showInputDialog(null,"Nombre del Cliente","Poliza",JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null,"Apellido del Cliente ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String telefono = JOptionPane.showInputDialog(null,"Telefono ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String mail = JOptionPane.showInputDialog(null,"Mail ","Poliza",JOptionPane.QUESTION_MESSAGE);
       
        //Marcas
        String [] marcas ={"Renault","Fiat","Ford","Citroen","VW"};

        marca = (String) JOptionPane.showInputDialog(null,"Seleccione una Marca :","Vehiculos :",JOptionPane.QUESTION_MESSAGE,Icon6,marcas,marcas[0]);
        
        //Moelos
        
        String [] Renault = {"Sandero","Logan","Captur","Kicks","Twingo"};
        String [] Fiat = {"Uno","Mobi","Pulse","Argo","Cronos"};
        String [] Ford = {"Fiesta","Focus","Mondeo","KA","Falcon"};
        String [] Citroen = {"Picasso","Cactus","Aircross","C3","C4"};
        String [] VW = {"Polo","Nivus","Virtus","Taos","Vento"};
        
        if(marca.equalsIgnoreCase("Renault")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos:",JOptionPane.QUESTION_MESSAGE,Icon9,Renault,Renault[0]);
            
        }else if(marca.equalsIgnoreCase("Fiat")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,Icon10,Fiat,Fiat[0]);
            
        }else if(marca.equalsIgnoreCase("Ford")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,Icon8,Ford,Ford[0]);
            
        }else if(marca.equalsIgnoreCase("Citroen")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,Icon7,Citroen,Citroen[0]);
            
        }else if(marca.equalsIgnoreCase("VW")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,Icon11,VW,VW[0]);
            
        }
        
        
        //Dominio
        String dominio = JOptionPane.showInputDialog(null,"Ingrese Dominio ","Poliza",JOptionPane.QUESTION_MESSAGE);

        //Año de Antiguedad
        int antig = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Año de Antiguedad ","Poliza",JOptionPane.QUESTION_MESSAGE));
        int resultado = (fecha - antig);
      
        JOptionPane.showMessageDialog(null,"Antiguedad :"+" " + resultado + " " + "Años");
        
        if (resultado <= 5){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $500");
                    resultado = importeA;
        }else if ((resultado >= 5) && (resultado < 10)){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $1000");
                    resultado = importeB;
        }else if ((resultado >= 10) && (resultado < 15)){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $1500");
                    resultado = importeC;
        }else if ((resultado >= 15) && (resultado < 20)){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $2000");
                    resultado = importeD;
        }else if (resultado >= 20){
            JOptionPane.showMessageDialog(null,"No se Asegura su Auto");
        System.exit(0);
        }
   
         //Tipo de cobertura
        
       int cobertura = JOptionPane.showOptionDialog(null,
            "Seleccione la cobertura : \n Responsabilidad Civil: RC"+"\n Terceros Completo: TC"+"\n Riezgo Total: RT",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"RC","TC","RT"},"RC");

        switch(cobertura){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Responsabilidad Civil");
            cobertura = RC;
            coberturaT ="Responsabilidad Civil";
            break;
            
            case 1: JOptionPane.showMessageDialog(null,"Selecciono : Terceros Completo");
            cobertura = TC;
            coberturaT ="Terceros Completo";
            break;
            
            case 2: JOptionPane.showMessageDialog(null,"Selecciono : Riezgo Total");
            cobertura = RT;
            coberturaRT ="Riezgo Total";
            break;

            default:      
        }
        
        //Cobertura Adicional
        int resp1 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Coberturas Adicionales ?");
            if(JOptionPane.OK_OPTION == resp1){
                String [] coberturaAD1 ={"Ganizo","Llantas Deportivas","Asistencia Mecanica","Localizador GPS"};
                JComboBox comboBoxcobAD1 = new JComboBox(coberturaAD1);    
                JOptionPane.showMessageDialog(null, comboBoxcobAD1, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                coberAD+=300;         
                    int resp2 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales ?");
                        if(JOptionPane.OK_OPTION == resp2){
                        Object [] coberturaAD2 ={"Ganizo","Llantas Deportivas","Asistencia Mecanica","Localizador GPS"};
                        JComboBox comboBoxcobAD2 = new JComboBox(coberturaAD2);    
                        JOptionPane.showMessageDialog(null, comboBoxcobAD2, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);                
                            int resp3 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales ?");
                                if(JOptionPane.OK_OPTION == resp3){
                                Object [] coberturaAD3 ={"Ganizo","Llantas Deportivas","Asistencia Mecanica","Localizador GPS"};
                                JComboBox comboBoxcobAD3 = new JComboBox(coberturaAD3);    
                                JOptionPane.showMessageDialog(null, comboBoxcobAD3, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                                coberAD+=300;
                                    int resp4 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales ?");
                                        if(JOptionPane.OK_OPTION == resp4){
                                        Object [] coberturaAD4 ={"Ganizo","Llantas Deportivas","Asistencia Mecanica","Localizador GPS"};
                                        JComboBox comboBoxcobAD4 = new JComboBox(coberturaAD4);    
                                        JOptionPane.showMessageDialog(null, comboBoxcobAD4, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                                        }
            
                } else {
                System.out.print("");
            }
        }
    }
            System.out.println("--------------------------------------------");
            System.out.println("---------------Presupuesto------------------");
            System.out.println("------------Seguros Segurola----------------");
            System.out.println("--------------------------------------------");
            System.out.println("NOMBRE :" + nombre);
            System.out.println("APELLIDO :" + apellido);
            System.out.println("TELEFONO :" + telefono);
            System.out.println("MAIL :" + mail);
            System.out.println("-----------Datos del Vehiculo---------------");
            System.out.println("MARCA :" + marca);
            System.out.println("MODELO :" + modelos);
            System.out.println("DOMINIO :" + dominio);
            System.out.println("ANTIGUEDAD DEL VEHICULO :" + antig);
            System.out.println("--------------------------------------------");
           System.out.println("VALOR DE LA CUOTA :" + resultado);
            System.out.println("TIPO DE COBERTURA :" + coberturaT);
            System.out.println("VALOR DE COBERTURA :" + cobertura);
            System.out.println("VALOR DE ADICIONALES :" + coberAD );
            total = resultado + cobertura + coberAD;
            System.out.println("--------------------------------------------");
            System.out.println("VALOR DE LA PRIMA TOTAL :" + total );
            System.out.println("--------------------------------------------");
            
            
            JOptionPane.showOptionDialog(null,
            "NOMBRE DEL CLIENTE :"+nombre+"\n APELLIDO DEL CLIENTE :"+apellido+"\n TELEFONO :"+telefono+"\n MAIL :"+mail+
                    "\n MARCA :"+modelos+"\n DOMINIO :"+dominio+"\n ANTIGUEDAD DEL VEHICULO :"+antig+"\n VALOR DE LA CUOTA :"+resultado+
                    "\n TIPO DE COBERTURA :"+cobertura+"\n ADICIONALES :"+coberAD+ "\n VALOR DE LA PRIMA TOTAL :"+total,
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE, Icon1,
            new Object[]{"IMPRIMIR POLIZA"},"");
    }
}

