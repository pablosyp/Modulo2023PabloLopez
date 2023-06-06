/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PRUEBA3 {

    public static void main(String[] args) {
        
        ImageIcon Icon2 = new ImageIcon("src/Imagenes/Logo.png");
        int contador=0;
        int coberAD=0;

         //Cobertura Adicional
        //String [] cobAD = {"Granizo","Llantas Deportivas","Asistencia Mecanica","Localizador GPS"};
        String [] cobAD1 = {"Granizo"};
        String [] cobAD2 = {"Llantas Deportivas"};
        String [] cobAD3 = {"Asistencia Mecanica"};
        String [] cobAD4 = {"Localizador GPS"};
        
        String option1 = (String) JOptionPane.showInputDialog(null,"Seleccione Cobertura Adicional ","Poliza",JOptionPane.QUESTION_MESSAGE,Icon2,cobAD1,cobAD1[0]);
        
        JOptionPane.showMessageDialog(null,"Selecciono :" +option1);
        if (option1 == "Granizo"){
            contador+=1;
        }else contador+=0;
            
        String option2 = (String) JOptionPane.showInputDialog(null,"Seleccione Cobertura Adicional ","Poliza",JOptionPane.QUESTION_MESSAGE,Icon2,cobAD2,cobAD2[0]);
        
        JOptionPane.showMessageDialog(null,"Selecciono :" +option2);
        if (option2 == "Llantas Deportivas"){
            contador+=1;
        }else contador+=0;
        
        String option3 = (String) JOptionPane.showInputDialog(null,"Seleccione Cobertura Adicional ","Poliza",JOptionPane.QUESTION_MESSAGE,Icon2,cobAD3,cobAD3[0]);
        
        JOptionPane.showMessageDialog(null,"Selecciono :" +option3);
        if (option3 == "Asistencia Mecanica"){
            contador+=1;
        }else contador+=0;
        
        String option4 = (String) JOptionPane.showInputDialog(null,"Seleccione Cobertura Adicional ","Poliza",JOptionPane.QUESTION_MESSAGE,Icon2,cobAD4,cobAD4[0]);
        
        JOptionPane.showMessageDialog(null,"Selecciono :" +option4);
        if (option4 == "Localizador GPS"){
            contador+=1;
        }else contador+=0;
        
        if(contador <1){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 000);
               coberAD = 000;
               }else if(contador ==1 ){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 300);
               coberAD = 300;
               }else if(contador ==2 ){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 300);
               coberAD = 300;
               }else if(contador >=3){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 600);
               coberAD = 600;
               }
        
        System.out.println("TIPO DE COBERTURA :" );
        

    }
    }









