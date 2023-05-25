/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PRUEBA3 {

    public static void main(String[] args) {
        String seleccion;
        String modelos="";
        
        String [] marcas ={"Renault","Fiat","Ford","Citroen","VW"};
        //JComboBox comboBoxmod = new JComboBox(marca);    
        //JOptionPane.showMessageDialog(null, comboBoxmod, "Seleccione la Marca ",JOptionPane.QUESTION_MESSAGE,null,marca,marca[0]);
        
        String [] Renault = {"Sandero","Logan","Captur","Kicks","Twingo"};
        String [] Fiat = {"Uno","Mobi","Pulse","Argo","Cronos"};
        String [] Ford = {"Fiesta","Focus","Mondeo","KA","Falcon"};
        String [] Citroen = {"Picasso","Cactus","Aircros","C3","C4"};
        String [] VW = {"Polo","Nivus","Virtus","Taos","Vento"};
        
        seleccion = (String) JOptionPane.showInputDialog(null,"Seleccione una Marca :","Vehiculos :",JOptionPane.QUESTION_MESSAGE,null,marcas,marcas);
        
        System.out.println("Ud. Selecciono : " +seleccion);
        
        if(seleccion.equalsIgnoreCase("Renault")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +seleccion , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,Renault,Renault);
            System.out.println("Selecciono Renault :" +modelos);
            //modelos = "Renault";
        }else if(seleccion.equalsIgnoreCase("Fiat")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +seleccion , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,Fiat,Fiat);
            System.out.println("Selecciono Fiat :" +modelos);
            //modelos = "Fiat";
        }
        
            System.out.println("MARCA :" + marcas[0]);
            System.out.println("MODELO :" + modelos);
        
        
        
        /*
        //Cobertura Adicional
        int coberAD=0;
        
        int resp1 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Coberturas Adicionales");
            if(JOptionPane.OK_OPTION == resp1){
                Object [] coberturaAD1 ={"A:Ganizo","B:Llantas Deportivas","C:Asistencia Mecanica","D:Localizador GPS"};
                JComboBox comboBoxcobAD1 = new JComboBox(coberturaAD1);    
                JOptionPane.showMessageDialog(null, comboBoxcobAD1, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                coberAD+=300;         
                    int resp2 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales");
                        if(JOptionPane.OK_OPTION == resp2){
                        Object [] coberturaAD2 ={"A:Ganizo","B:Llantas Deportivas","C:Asistencia Mecanica","D:Localizador GPS"};
                        JComboBox comboBoxcobAD2 = new JComboBox(coberturaAD2);    
                        JOptionPane.showMessageDialog(null, comboBoxcobAD2, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                        //coberAD1+=300;                
                            int resp3 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales");
                                if(JOptionPane.OK_OPTION == resp3){
                                Object [] coberturaAD3 ={"A:Ganizo","B:Llantas Deportivas","C:Asistencia Mecanica","D:Localizador GPS"};
                                JComboBox comboBoxcobAD3 = new JComboBox(coberturaAD3);    
                                JOptionPane.showMessageDialog(null, comboBoxcobAD3, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                                coberAD+=300;
                                    int resp4 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales");
                                        if(JOptionPane.OK_OPTION == resp4){
                                        Object [] coberturaAD4 ={"A:Ganizo","B:Llantas Deportivas","C:Asistencia Mecanica","D:Localizador GPS"};
                                        JComboBox comboBoxcobAD4 = new JComboBox(coberturaAD4);    
                                        JOptionPane.showMessageDialog(null, comboBoxcobAD4, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                                        //coberAD1+=300;
                                        }
            } else {
                System.out.print("");
            }


    }
                        System.out.println("Suma" + coberAD );
            }
*/
    }
}