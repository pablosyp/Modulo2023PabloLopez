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
        String resp2="";
        String resp22="";
        String resp11="";
        int numerorandom;
        int numerorandom1;
        String jugador1="R2D";
        String jugador2="";
        Random RD = new Random();
        
        //numero Random
        numerorandom = RD.nextInt(3)+1;
        numerorandom1 = RD.nextInt(3)+1;
        //Inicio del Juego
        System.out.println("---------------------------------");
        System.out.print("bienvenidos a Piedra-Papel-Tijera");
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
        System.out.print("\nINTRODUCIR 1er OPCION P/L/T\n"+ jugador2+ ": ");
        resp1=leer.next();
        System.out.print("\nINTRODUCIR 2da OPCION P/L/T\n"+ jugador2+ ": ");
        resp11=leer.next();
        //Convertir numeros en letras
        switch(numerorandom){
            case 1:resp2=" P";
                break;
            case 2:resp2=" T";
                break;
            case 3:resp2=" L";
                break;
        } 
                switch(numerorandom1){
            case 1:resp22=" P";
                break;
            case 2:resp22=" T";
                break;
            case 3:resp22=" L";
                break;
        } 
        System.out.println("\nLA 1er OPCION DE R2D FUE :" +resp2);
        System.out.println("\nLA 2da OPCION DE R2D FUE :" +resp22);
        // Logica del juego
        if(resp1.equals("P") && resp2.equals(" P")){
            System.out.println("\nEMPATE!!!\n");
        }
        if(resp1.equals("P") && resp2.equals(" L")){
            System.out.println("\nGANADOR\n" + jugador1);
        }
        if(resp1.equals("P") && resp2.equals(" T")){
            System.out.println("\nGANADOR\n" + jugador2);
        }
        if(resp1.equals("L") && resp2.equals(" L")){
            System.out.println("\nEMPATE!!!\n");
        }
        if(resp1.equals("L") && resp2.equals(" P")){
            System.out.println("\nGANADOR\n" + jugador1);
        }
        if(resp1.equals("L") && resp2.equals(" T")){
            System.out.println("\nGANADOR\n" + jugador2);
        }
        if(resp1.equals("T") && resp2.equals(" T")){
            System.out.println("\nEMPATE!!!\n");
        }
        if(resp1.equals("T") && resp2.equals(" L")){
            System.out.println("\nGANADOR\n" + jugador1);
        }
        if(resp1.equals("T") && resp2.equals(" P")){
            System.out.println("\nGANADOR\n" + jugador2);
        }
        if(resp1.equals("P") && resp22.equals(" P")){
            System.out.println("\nEMPATE!!!\n");
        }
        if(resp1.equals("P") && resp22.equals(" L")){
            System.out.println("\nGANADOR\n" + jugador1);
        }
        if(resp1.equals("P") && resp22.equals(" T")){
            System.out.println("\nGANADOR\n" + jugador2);
        }
        if(resp1.equals("L") && resp22.equals(" L")){
            System.out.println("\nEMPATE!!!\n");
        }
        if(resp1.equals("L") && resp22.equals(" P")){
            System.out.println("\nGANADOR\n" + jugador1);
        }
        if(resp1.equals("L") && resp22.equals(" T")){
            System.out.println("\nGANADOR\n" + jugador2);
        }
        if(resp1.equals("T") && resp22.equals(" T")){
            System.out.println("\nEMPATE!!!\n");
        }
        if(resp1.equals("T") && resp22.equals(" L")){
            System.out.println("\nGANADOR\n" + jugador1);
        }
        if(resp1.equals("T") && resp22.equals(" P")){
            System.out.println("\nGANADOR\n" + jugador2);
        }
        

        
    }
}

