/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijeta.pkg2;

import java.util.*;

public class PiedraPapelTijeta2 {

    public static void main(String[] args) {
        //Objetos y Variables
        Scanner leer = new Scanner(System.in);
        String resp1="";
        String resp11="";
        String resp111="";
        String resp2="";
        String resp22="";
        String resp222="";
        int numerorandom;
        String jugador1="R2D";
        String jugador2="";
        Random RD = new Random();
        int punto1=0;
        int punto2=0;
        
        //numero Random
        numerorandom = RD.nextInt(3)+1;
        //Inicio del Juego
        System.out.println("---------------------------------");
        System.out.println("Bienvenidos a Piedra-Papel-Tijera");
        System.out.println("---------------------------------");
        //Pedir al tipito su nombre
        System.out.print("Ingrese su nombre : ");
        jugador2 =leer.next();
        //Dar inicio al juego
        System.out.println("---------INICIO DEL JUEGO---------");
        System.out.println("---La P es Piedra---");
        System.out.println("---La L es Papel---");
        System.out.println("---La T es Tijera---");
        //Pedir al jugador que ongrese la opcion (\n = significa un salto de linea)
        System.out.println("---------------------------------");
        System.out.print("\nINTRODUCIR 1er OPCION P/L/T\n"+ jugador2+ ": ");
        resp1=leer.next();
        System.out.print("\nINTRODUCIR 2da OPCION P/L/T\n"+ jugador2+ ": ");
        resp11=leer.next();
        System.out.print("\nINTRODUCIR 3da OPCION P/L/T\n"+ jugador2+ ": ");
        resp111=leer.next();
        //Convertir numeros en letras
        switch(numerorandom){
            case 1:resp2=" P";
                break;
            case 2:resp2=" T";
                break;
            case 3:resp2=" L";
                break;
        } 
                switch(numerorandom){
            case 1:resp22=" P";
                break;
            case 2:resp22=" T";
                break;
            case 3:resp22=" L";
                break;
        } 
                switch(numerorandom){
            case 1:resp222=" P";
                break;
            case 2:resp222=" T";
                break;
            case 3:resp222=" L";
                break;
        } 
        System.out.println("---------------------------------");
        System.out.println("---------Jugadas-- 1-- 2-- 3" ); 
        System.out.println("Jugador 1 :" +jugador1 +" : "+resp2+  " - "+resp22+  " - "+resp222);
        System.out.println("Jugador 2 :" +jugador2 +" : "+resp1+  " - "+resp11+  " - "+resp111);
        System.out.println("---------------------------------");
        //1er jugada
         if(resp1.equals("P") && resp2.equals(" P")){
            //System.out.println("\nEMPATE!!!\n");
        }
        if(resp1.equals("P") && resp2.equals(" L")){
            //System.out.println("\nGANADOR\n" + jugador1);
            //System.out.println(jugador1 + " suma 1 puntos");
            punto1+=1;
        }
        if(resp1.equals("P") && resp2.equals(" T")){
            //System.out.println("\nGANADOR\n" + jugador2);
            //System.out.println(jugador2 + " suma 1 puntos");
            punto2+=1;
        }
        if(resp1.equals("L") && resp2.equals(" L")){
            //System.out.println("\nEMPATE!!!\n");
            
        }
        if(resp1.equals("L") && resp2.equals(" P")){
            //System.out.println("\nGANADOR\n" + jugador2);
            //System.out.println(jugador2 + " suma 1 puntos");
            punto2+=1;
        }
        if(resp1.equals("L") && resp2.equals(" T")){
            //System.out.println("\nGANADOR\n" + jugador1);
            //System.out.println(jugador1 + " suma 1 puntos");
            punto1+=1;
        }
        if(resp1.equals("T") && resp2.equals(" T")){
            //System.out.println("\nEMPATE!!!\n");
        }
        if(resp1.equals("T") && resp2.equals(" L")){
            //System.out.println("\nGANADOR\n" + jugador2);
            //System.out.println(jugador2 + " suma 1 puntos");
            punto2+=1;
        }
        if(resp1.equals("T") && resp2.equals(" P")){
            //System.out.println("\nGANADOR\n" + jugador1);
            //System.out.println(jugador1 + " suma 1 puntos");
            punto1+=1;
        }
        //2da Jugada
         if(resp11.equals("P") && resp22.equals(" P")){
            //System.out.println("\nEMPATE!!!\n");
        }
        if(resp11.equals("P") && resp22.equals(" L")){
            //System.out.println("\nGANADOR\n" + jugador1);
            //System.out.println(jugador1 + " suma 1 puntos");
            punto1+=1;
        }
        if(resp11.equals("P") && resp22.equals(" T")){
            //System.out.println("\nGANADOR\n" + jugador2);
            //System.out.println(jugador2 + " suma 1 puntos");
            punto2+=1;
        }
        if(resp11.equals("L") && resp22.equals(" L")){
            //System.out.println("\nEMPATE!!!\n");
            
        }
        if(resp11.equals("L") && resp22.equals(" P")){
            //System.out.println("\nGANADOR\n" + jugador2);
            //System.out.println(jugador2 + " suma 1 puntos");
            punto2+=1;
        }
        if(resp11.equals("L") && resp22.equals(" T")){
            //System.out.println("\nGANADOR\n" + jugador1);
            //System.out.println(jugador1 + " suma 1 puntos");
            punto1+=1;
        }
        if(resp11.equals("T") && resp22.equals(" T")){
            //System.out.println("\nEMPATE!!!\n");
        }
        if(resp11.equals("T") && resp22.equals(" L")){
            //System.out.println("\nGANADOR\n" + jugador2);
            //System.out.println(jugador2 + " suma 1 puntos");
            punto2+=1;
        }
        if(resp11.equals("T") && resp22.equals(" P")){
            //System.out.println("\nGANADOR\n" + jugador1);
            //System.out.println(jugador1 + " suma 1 puntos");
            punto1+=1;
        }
        //3er Jugada
                if(resp111.equals("P") && resp222.equals(" P")){
            //System.out.println("\nEMPATE!!!\n");
        }
        if(resp111.equals("P") && resp222.equals(" L")){
            //System.out.println("\nGANADOR\n" + jugador1);
            //System.out.println(jugador1 + " suma 1 puntos");
            punto1+=1;
        }
        if(resp111.equals("P") && resp222.equals(" T")){
            //System.out.println("\nGANADOR\n" + jugador2);
            //System.out.println(jugador2 + " suma 1 puntos");
            punto2+=1;
        }
        if(resp111.equals("L") && resp222.equals(" L")){
            //System.out.println("\nEMPATE!!!\n");
            
        }
        if(resp111.equals("L") && resp222.equals(" P")){
            //System.out.println("\nGANADOR\n" + jugador2);
            //System.out.println(jugador2 + " suma 1 puntos");
            punto2+=1;
        }
        if(resp111.equals("L") && resp222.equals(" T")){
            //System.out.println("\nGANADOR\n" + jugador1);
            //System.out.println(jugador1 + " suma 1 puntos");
            punto1+=1;
        }
        if(resp111.equals("T") && resp222.equals(" T")){
            //System.out.println("\nEMPATE!!!\n");
        }
        if(resp111.equals("T") && resp222.equals(" L")){
            //System.out.println("\nGANADOR\n" + jugador2);
            //System.out.println(jugador2 + " suma 1 puntos");
            punto2+=1;
        }
        if(resp111.equals("T") && resp222.equals(" P")){
            //System.out.println("\nGANADOR\n" + jugador1);
            //System.out.println(jugador1 + " suma 1 puntos");
            punto1+=1;
        }
        
        System.out.println("---------------------------------");
        System.out.println("Totales: ");
        System.out.println(jugador1 + ": " + punto1 + " puntos");
        System.out.println(jugador2 + ": " + punto2 + " puntos");
        System.out.println("---------------------------------");

        if(punto1<punto2){
               System.out.println("---------------------------------");
               System.out.println("El ganador es : " + jugador2);
                       
               
               }else{
               System.out.println("---------------------------------");
               System.out.println ("El ganador es : " + jugador1);
               
               }
    }
}

