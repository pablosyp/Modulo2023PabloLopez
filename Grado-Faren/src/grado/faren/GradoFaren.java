/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grado.faren;

import java.util.Scanner;

public class GradoFaren {

    public static void main(String[] args) {
        // TODO code application logic here
        int C;
        int F;
        Scanner lectorgrado = new Scanner(System.in);
        
        System.out.println("Ingresar Grado: ");
        C= lectorgrado.nextInt();
        F = 32 + 9 * C / 5;
        System.out.println("Resultado en Farenheith : " + F);
        
    }
    
}
