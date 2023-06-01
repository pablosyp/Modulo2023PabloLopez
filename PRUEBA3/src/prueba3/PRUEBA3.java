/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;

import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PRUEBA3 {

    public static void main(String[] args) {
        /*
        ImageIcon Icon2 = new ImageIcon("src/Imagenes/Logo.png");
        String cobertura="";
        String coberturaAD="";
        String coberturaAD1="Granizo";
        String coberturaAD2="Llantas Deportivas";
        String coberturaAD3="Asistencia Mecanica";
        String coberturaAD4="Localizador GPS";
        int contador=0;
        int coberAD=0;

        int coberAD1 = JOptionPane.showOptionDialog(null,
            "Seleccione cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Granizo","NO"},"");

        switch(coberAD1){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Granizo");
            coberturaAD1 ="Granizo";
            contador+=1;
            break;
            default:  
            }
        int coberAD2 = JOptionPane.showOptionDialog(null,
            "Seleccione la cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Llantas Deportivas","NO"},"");
            
            switch(coberAD2){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Llantas Deportivas");
            coberturaAD2 ="Llantas Deportivas";
            contador+=1;
            break;
            }
        int coberAD3 = JOptionPane.showOptionDialog(null,
            "Seleccione la cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Asistencia Mecanica","NO"},"");
            
            switch(coberAD3){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Llantas Deportivas");
            coberturaAD3 ="Asistencia Mecanica";
            contador+=1;
            break;
            }
        int coberAD4 = JOptionPane.showOptionDialog(null,
            "Seleccione la cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Localizador GPS","NO"},"");
            
            switch(coberAD4){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Localizador GPS");
            coberturaAD4 ="Localizador GPS";
            contador+=1;
            break;


        }
            JOptionPane.showMessageDialog(null," Suma de adicionales "+" - "+ contador +" -");
            
            if(contador <2){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 300);
               coberAD = 300;
               }else if(contador == 2 ){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 300);
               coberAD = 300;
               }else if(contador >2){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 600);
               coberAD = 600;
    }
*/
            Scanner sc =new Scanner(System.in);
            String resp1;
            do{
            System.out.print("Eliga la opcion: ");
            String nota=sc.nextLine();
            System.out.print("Ingrese si o no ? ");
            resp1 = sc.nextLine();
            
            }while (resp1 == "si");
    
            
            /*
            JOptionPane.showOptionDialog(null,
            "\n Valor cobertura :"+coberAD+"\n VALOR DE LA PRIMA TOTAL :"+coberturaAD1+"\n VALOR DE LA PRIMA TOTAL :"+coberturaAD2+"\n VALOR DE LA PRIMA TOTAL :"+coberturaAD3+"\n VALOR DE LA PRIMA TOTAL :"+coberturaAD4,
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE, Icon2,
            new Object[]{"IMPRIMIR POLIZA"},"");
*/
    }
}



