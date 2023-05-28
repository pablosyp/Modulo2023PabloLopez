/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PRUEBA3 {

    public static void main(String[] args) {
        /*
        String marca;
        String modelos="";
        
        int total;
        
        String [] marcas ={"Renault","Fiat","Ford","Citroen","VW"};
        ImageIcon Icon = new ImageIcon("src/Imagenes/Logo.png");
        //JComboBox comboBoxmod = new JComboBox(marca);    
        //JOptionPane.showMessageDialog(null, comboBoxmod, "Seleccione la Marca ",JOptionPane.QUESTION_MESSAGE,null,marca,marca[0]);
        
        String [] Renault = {"Sandero","Logan","Captur","Kicks","Twingo"};
        String [] Fiat = {"Uno","Mobi","Pulse","Argo","Cronos"};
        String [] Ford = {"Fiesta","Focus","Mondeo","KA","Falcon"};
        String [] Citroen = {"Picasso","Cactus","Aircros","C3","C4"};
        String [] VW = {"Polo","Nivus","Virtus","Taos","Vento"};
        
        marca = (String) JOptionPane.showInputDialog(null,"Seleccione una Marca :","Vehiculos :",JOptionPane.QUESTION_MESSAGE,null,marcas,marcas);
        
        System.out.println("Ud. Selecciono : " +marca);
        
        if(marca.equalsIgnoreCase("Renault")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,Renault,Renault);
            System.out.println("Selecciono Renault :" +modelos);
        }else if(marca.equalsIgnoreCase("Fiat")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,Fiat,Fiat);
            System.out.println("Selecciono Fiat :" +modelos);
        }
        
            System.out.println("MARCA :" + marca);
            System.out.println("MODELO :" + modelos);
        */
        //Cobertura Adicional
        ImageIcon Icon = new ImageIcon("src/Imagenes/Logo.png");
        String cobertura="";
        String coberADT1="";
        
        
        int resp1 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Coberturas Adicionales");
            if(JOptionPane.OK_OPTION == resp1){
                String [] coberturaAD1 ={"Ganizo"};  
                int resp11 =JOptionPane.showConfirmDialog(null,"Seleccione la Cobertura Adicional : Ganizo");
                if(JOptionPane.OK_OPTION == resp11){
                //coberAD+=300;
                coberADT1 = "Ganizo";
                System.out.println("Cobertura Tipo :" + coberADT1 );}}
                
                
                    int resp2 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales");
                        if(JOptionPane.OK_OPTION == resp2){
                        String [] coberturaAD2 ={"Llantas Deportivas"};
                        int resp22 =JOptionPane.showConfirmDialog(null,"Seleccione la Cobertura Adicional : Llantas Deportivas");
                        if(JOptionPane.OK_OPTION == resp22){
                        coberADT1 = "Llantas Deportivas";
                        System.out.println("Cobertura Tipo :" + coberADT1);}}
                        
                        
                            int resp3 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales");
                                if(JOptionPane.OK_OPTION == resp3){
                                String [] coberturaAD3 ={"Asistencia Mecanica"};
                                int resp33 =JOptionPane.showConfirmDialog(null,"Seleccione la Cobertura Adicional : Asistencia Mecanica");
                                if(JOptionPane.OK_OPTION == resp33){
                                //coberAD+=300;
                                coberADT1 = "Asistencia Mecanica";
                                System.out.println("Cobertura Tipo :" + coberADT1);}}
                                
                                
                                 
                                    int resp4 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales");
                                        if(JOptionPane.OK_OPTION == resp4){
                                        String [] coberturaAD4 ={"Localizador GPS"};
                                        int resp44 =JOptionPane.showConfirmDialog(null,"Seleccione la Cobertura Adicional : Localizador GPS");
                                        if(JOptionPane.OK_OPTION == resp44){
                                        coberADT1 = "Localizador GPS";
                                        System.out.println("Cobertura Tipo :" + coberADT1);}}
                                        
                                        //total = coberAD;
                                        //System.out.println("VALOR DE LA PRIMA TOTAL :" + total );
                                        
                                        JOptionPane.showOptionDialog(null,
                                        "\n MARCA :"+coberADT1+"\n TIPO DE ADICIONALES :"+coberADT1+ "\n VALOR DE LA PRIMA TOTAL :"+coberADT1,
                                        "Poliza",
                                        JOptionPane.YES_NO_CANCEL_OPTION,
                                        JOptionPane.QUESTION_MESSAGE,Icon,
                                        new Object[]{"IMPRIMIR POLIZA"},"");

    }
}

