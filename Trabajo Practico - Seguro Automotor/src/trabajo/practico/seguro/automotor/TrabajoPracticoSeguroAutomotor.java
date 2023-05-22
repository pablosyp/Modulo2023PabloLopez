/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.seguro.automotor;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class TrabajoPracticoSeguroAutomotor {

    public static void main(String[] args) {    
        int fecha=2023;
        
        int importeA = 500;
        int importeB = 1000;
        int importeC = 1500;
        int importeD = 2000;
        
        int RC = 100;
        int TC = 200;
        int TR = 300;
        
        int coberAD=0;
        
        int total;

        //Logo
        ImageIcon Icon = new ImageIcon("src/Imagenes/logo33.png");
        ImageIcon Icon2 = new ImageIcon("src/Imagenes/logo2.png");
        
        JOptionPane.showMessageDialog(null,Icon);
        //Solicitud de datos
        String nombre = JOptionPane.showInputDialog(null,"Nombre del Cliente ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null,"Apellido del Cliente ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String telefono = JOptionPane.showInputDialog(null,"Telefono ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String mail = JOptionPane.showInputDialog(null,"Mail ","Poliza",JOptionPane.QUESTION_MESSAGE);
        //Combobox
        Object [] modelo ={"Renault","Fiat","Ford"};
        JComboBox comboBoxmod = new JComboBox(modelo);    
        JOptionPane.showMessageDialog(null, comboBoxmod, "Seleccione el Modelo ",JOptionPane.QUESTION_MESSAGE);

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
        }
        
        //Tipo de cobertura
        int cobertura = JOptionPane.showOptionDialog(null,
            "Seleccione la cobertura : \n Responsabilidad Civil: RC"+"\n Terceros Completo: TC"+"\n Total Riezgo: TR",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"RC","TC","TR"},"RC");

        switch(cobertura){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Responsabilidad Civil");
            cobertura = RC;
            break;
            
            case 1: JOptionPane.showMessageDialog(null,"Selecciono : Terceros Completo");
            cobertura = TC;
            break;
            
            case 2: JOptionPane.showMessageDialog(null,"Selecciono : Total Riezgo");
            cobertura = TR;
            break;
            
            default:      
        }

        //Cobertura Adicional
        int resp1 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Coberturas Adicionales ?");
            if(JOptionPane.OK_OPTION == resp1){
                Object [] coberturaAD1 ={"A:Ganizo","B:Llantas Deportivas","C:Asistencia Mecanica","D:Localizador GPS"};
                JComboBox comboBoxcobAD1 = new JComboBox(coberturaAD1);    
                JOptionPane.showMessageDialog(null, comboBoxcobAD1, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                coberAD+=300;         
                    int resp2 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales ?");
                        if(JOptionPane.OK_OPTION == resp2){
                        Object [] coberturaAD2 ={"A:Ganizo","B:Llantas Deportivas","C:Asistencia Mecanica","D:Localizador GPS"};
                        JComboBox comboBoxcobAD2 = new JComboBox(coberturaAD2);    
                        JOptionPane.showMessageDialog(null, comboBoxcobAD2, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);                
                            int resp3 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales ?");
                                if(JOptionPane.OK_OPTION == resp3){
                                Object [] coberturaAD3 ={"A:Ganizo","B:Llantas Deportivas","C:Asistencia Mecanica","D:Localizador GPS"};
                                JComboBox comboBoxcobAD3 = new JComboBox(coberturaAD3);    
                                JOptionPane.showMessageDialog(null, comboBoxcobAD3, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                                coberAD+=300;
                                    int resp4 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales ?");
                                        if(JOptionPane.OK_OPTION == resp4){
                                        Object [] coberturaAD4 ={"A:Ganizo","B:Llantas Deportivas","C:Asistencia Mecanica","D:Localizador GPS"};
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
            System.out.println("MARCA :" + modelo[0]);
            System.out.println("DOMINIO :" + dominio);
            System.out.println("ANTIGUEDAD DEL VEHICULO :" + antig);
            System.out.println("--------------------------------------------");
            System.out.println("VALOR DE LA CUOTA :" + resultado);
            System.out.println("TIPO DE COBERTURA :" + cobertura);
            System.out.println("ADICIONALES :" + coberAD );
            total = resultado + cobertura + coberAD;
            System.out.println("--------------------------------------------");
            System.out.println("VALOR DE LA PRIMA TOTAL :" + total );
            System.out.println("--------------------------------------------");
            
            JOptionPane.showOptionDialog(null,
            "NOMBRE DEL CLIENTE :"+nombre+"\n APELLIDO DEL CLIENTE :"+apellido+"\n TELEFONO :"+telefono+"\n MAIL :"+mail+
                    "\n MARCA :"+modelo[0]+"\n DOMINIO :"+dominio+"\n ANTIGUEDAD DEL VEHICULO :"+antig+"\n VALOR DE LA CUOTA :"+resultado+
                    "\n TIPO DE COBERTURA :"+cobertura+"\n ADICIONALES :"+coberAD+ "\n VALOR DE LA PRIMA TOTAL :"+total,
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"IMPRIMIR POLIZA"},"");
    }
}