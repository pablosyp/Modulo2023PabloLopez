/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random2804;

import java.util.*;

public class Random2804 {

    public static void main(String[] args) {
        //   -Crear un Programa que genere tres números aleatorio comprendido entre 65 y 90 /Cuenta: 90 - 65 + 1= 26

        Random cualquiera = new Random ();
        int a,b,c,f,z;
        
        a=cualquiera.nextInt(26)+65;
        b=cualquiera.nextInt(26)+65;
        c=cualquiera.nextInt(26)+65;
        System.out.println("3 numeros Random del 65 al 90 :");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        //   -Imprimir un número aleatorio 0 a 10

        f=cualquiera.nextInt(11);
        System.out.println("Numero Random del 0 al 10 :" +f);
        
        //   -Imprimir un numero aleatorio de 1 a 47
        
        z=cualquiera.nextInt(47);
        System.out.println("Numero Random del 1 al 47 :" +z);
        
    }
    
}
