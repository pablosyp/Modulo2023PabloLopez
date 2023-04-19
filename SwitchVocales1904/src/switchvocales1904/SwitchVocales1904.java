/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchvocales1904;

import java.util.Scanner;

public class SwitchVocales1904 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String letra;
        
        //Objeto Scanner
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-------Escriba una letra-------");
        //System.out.println("---------------A----------------");
        //System.out.println("---------------E----------------");
        //System.out.println("---------------I----------------");
        //System.out.println("---------------O----------------");
        //System.out.println("---------------U----------------");
        
        letra = leer.nextLine();
        
        //Logica del Switch
        switch (letra)
        {
            //Son vocales
            //Grupo Abiertas
            case "A":
            case "a":
            case "E":
            case "e":
            case "O":
            case "o":
                    System.out.println(" Es Vocal y Abierta ");
                    break;
            //Grupo Cerradas
            case "I":
            case "i":
            case "U":
            case "u":
                    System.out.println(" Es Vocal y Cerrada ");
                    
                break;
            default:
                System.out.println(" No es una vocal ");
                break;
        }
        
        }
        
    }
    
