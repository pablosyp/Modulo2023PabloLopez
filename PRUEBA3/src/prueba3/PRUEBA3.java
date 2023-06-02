/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;

import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PRUEBA3 {

    public static void main(String[] args) {
        
        ImageIcon Icon2 = new ImageIcon("src/Imagenes/Logo.png");
        String cobertura="";
        String coberturaAD="";
        String coberADD []= {"Granizo","Llantas Deportivas","Asistencia Mecanica","Localizador GPS"};
        String coberturaAD1="Granizo";
        String coberturaAD2="Llantas Deportivas";
        String coberturaAD3="Asistencia Mecanica";
        String coberturaAD4="Localizador GPS";
        int contador=0;
        int coberAD=0;

            Scanner sc =new Scanner(System.in);
            int opciones;
            do{
                System.out.println("Eliga la opcion: ");
                JOptionPane.showOptionDialog(null,
                "Seleccione cobertura Adicional : ",
                "Poliza",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,Icon2,
                new Object[]{"Granizo","NO"},"");
            
            JOptionPane.showOptionDialog(null,
            "Seleccione la cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Llantas Deportivas","NO"},"");
            
            //System.out.println("1 = Granizo ");
            //System.out.println("2 = Llantas Deportivas");
            System.out.println("3 = Asistencia Mecanica");
            System.out.println("4 = Localizador GPS");
            System.out.println("5 = No selecciono cobertura adicionales");
            System.out.print("Ingrese la opcion :");
            opciones = sc.nextInt();
            
            }while (opciones <= 4);
            
            switch(opciones){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Granizo");
            coberADD = [0];
            contador+=1;
            break;
            default:  
            }
            switch(opciones){
            case 1: JOptionPane.showMessageDialog(null,"Selecciono : Llantas Deportivas");
            coberturaAD1 ="Llantas Deportivas";
            contador+=1;
            break;
            default:  
            }
            switch(opciones){
            case 2: JOptionPane.showMessageDialog(null,"Selecciono : Asistencia Mecanica");
            coberturaAD1 ="Asistencia Mecanica";
            contador+=1;
            break;
            default:  
            }
            switch(opciones){
            case 3: JOptionPane.showMessageDialog(null,"Selecciono : Localizador GPS");
            coberturaAD1 ="Localizador GPS";
            contador+=1;
            break;
            default:  
            }
                //JOptionPane.showMessageDialog(null," Suma de adicionales "+" - "+ contador +" -");
            
            if(contador <2){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 300);
               coberAD = 300;
               }else if(contador == 2 ){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 300);
               coberAD = 300;
               }else if(contador >3){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 600);
               coberAD = 600;
}
            
            JOptionPane.showOptionDialog(null,
            "\n Valor cobertura :"+coberAD+"\n VALOR DE LA PRIMA TOTAL :"+coberturaAD1+"\n VALOR DE LA PRIMA TOTAL :"+coberturaAD2+"\n VALOR DE LA PRIMA TOTAL :"+coberturaAD3+"\n VALOR DE LA PRIMA TOTAL :"+coberturaAD4,
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE, Icon2,
            new Object[]{"IMPRIMIR POLIZA"},"");

            
    
    }
}




