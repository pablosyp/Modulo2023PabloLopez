/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.n.pkg15.juegovaso;

import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EjercicioN15JuegoVaso {

    public static void main(String[] args) {
        //Variables
        int pelotita;
        String jugador1="";
        String jugador2="";
        int punto1=0;
        int punto2=0;
        
        Random RD = new Random();
        //pelotita Random
        pelotita = RD.nextInt(3)+1;
        
        jugador1 = JOptionPane.showInputDialog(null,"Ingrese Nombre Jugador 1","IMPUT",JOptionPane.QUESTION_MESSAGE);

        jugador2 = JOptionPane.showInputDialog(null,"Ingrese Nombre Jugador 2","IMPUT",JOptionPane.QUESTION_MESSAGE);

        //Imagenes 
        ImageIcon Bien = new ImageIcon("src/Imagenes/pelotita-bien.png");
        ImageIcon Mal = new ImageIcon("src/Imagenes/pelotita-mal.png");
        ImageIcon Icon = new ImageIcon("src/Imagenes/pelotita-icon.png");
        
                int seleccionA = JOptionPane.showOptionDialog(null,
                "Primera opcion "+"- " + jugador1 +" -",
                "Que Comience el Juego!!!",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,Icon,
                new Object [] {"Vaso 1","Vaso 2","Vaso 3"},"Vaso 1");
                
                int seleccionB = JOptionPane.showOptionDialog(null,
                "Primera opcion"+"- "+ jugador2 +" -",
                "",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,Icon,
                new Object [] {"Vaso 1","Vaso 2","Vaso 3"},"Vaso 1");
                
                
        if (pelotita==seleccionA){
            JOptionPane.showMessageDialog(null,"MUY BIEN","Juego Para Jugador1",JOptionPane.INFORMATION_MESSAGE, Bien);
            punto1+=1;
        } else if (pelotita==seleccionB){
            JOptionPane.showMessageDialog(null,"MUY BIEN","Juego Para Jugador2",JOptionPane.INFORMATION_MESSAGE,Bien);
            punto2+=1;
        } else {
            JOptionPane.showMessageDialog(null,"MUY MAL","Perdieron",JOptionPane.INFORMATION_MESSAGE,Mal);
            }  
                int seleccionC = JOptionPane.showOptionDialog(null,
                "Segunda opcion "+"- " + jugador1 +" -",
                "Ronda 2!!!",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,Icon,
                new Object [] {"Vaso 1","Vaso 2","Vaso 3"},"Vaso 1");
                
                int seleccionD = JOptionPane.showOptionDialog(null,
                "Segunda opcion"+"- "+ jugador2 +" -",
                "",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,Icon,
                new Object [] {"Vaso 1","Vaso 2","Vaso 3"},"Vaso 1");
                
                
        if (pelotita==seleccionC){
            JOptionPane.showMessageDialog(null,"MUY BIEN","Juego Para Jugador1",JOptionPane.INFORMATION_MESSAGE, Bien);
            punto1+=1;
        } else if (pelotita==seleccionD){
            JOptionPane.showMessageDialog(null,"MUY BIEN","Juego Para Jugador2",JOptionPane.INFORMATION_MESSAGE,Bien);
            punto2+=1;
        } else {
            JOptionPane.showMessageDialog(null,"MUY MAL","Perdieron",JOptionPane.INFORMATION_MESSAGE,Mal);
            } 
                int seleccionE = JOptionPane.showOptionDialog(null,
                "Tercera opcion "+"- " + jugador1 +" -",
                "Ronda 3!!!",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,Icon,
                new Object [] {"Vaso 1","Vaso 2","Vaso 3"},"Vaso 1");
                
                int seleccionF = JOptionPane.showOptionDialog(null,
                "Tercera opcion"+"- "+ jugador2 +" -",
                "",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,Icon,
                new Object [] {"Vaso 1","Vaso 2","Vaso 3"},"Vaso 1");
                
                
        if (pelotita==seleccionE){
            JOptionPane.showMessageDialog(null,"MUY BIEN","Juego Para Jugador1",JOptionPane.INFORMATION_MESSAGE, Bien);
            punto1+=1;
        } else if (pelotita==seleccionF){
            JOptionPane.showMessageDialog(null,"MUY BIEN","Juego Para Jugador2",JOptionPane.INFORMATION_MESSAGE,Bien);
            punto2+=1;
        } else {
            JOptionPane.showMessageDialog(null,"MUY MAL","Perdieron",JOptionPane.INFORMATION_MESSAGE,Mal);
            } 

        JOptionPane.showMessageDialog(null," Puntos "+"- " + jugador1 + " - "+ punto1 +" -");
        JOptionPane.showMessageDialog(null," Puntos "+"- " + jugador2 + " - "+ punto2 +" -");

        
        if(punto1<punto2){
               JOptionPane.showMessageDialog(null,"El ganador es : " + jugador1);

               }else if(punto1>punto2){
               JOptionPane.showMessageDialog(null,"El ganador es : " + jugador2);

               }else if(punto1==punto2){
               JOptionPane.showMessageDialog(null,"Hay empate !!! ");

               
    }
}
}           
    
    
