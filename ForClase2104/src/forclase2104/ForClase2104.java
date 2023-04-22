/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forclase2104;

import java.util.Scanner;


public class ForClase2104 {

    public static void main(String[] args) {
            //1)Generar una escalera de numero de 1 a 100
            for(int ini = 1; ini <= 100; ini++){

            System.out.println("Mostrar numero : " + ini);

            }
            //2)Ingresar números  y clasificar si son pares o no
            int num2;
            Scanner leer2 = new Scanner (System.in);
            System.out.print("Ingresar un numero: ");
            num2 = leer2.nextInt();
            
            for (int A = 0; A < num2 ;A++){
                
                if (A%2 == 0){
                    System.out.println("El numero " + A +" es numero par");
                }else {
                    System.out.println("El numero " + A +" es numero impar");
                }
             }
            //3)Recorrer un lote de números y determinar culés son números múltiples de 3
            int num3= 0;
            Scanner leer3 = new Scanner (System.in);
            System.out.print("Ingresar un numero: ");
            num3 = leer3.nextInt();
            
            for (int B = 0; B < num3 ;B++){
                
                if (B%3 == 0){
                    System.out.println("El numero " + B +" es multiplo de 3");
                }else {
                    System.out.println("El numero " + B +" no es multiplo de 3");
                }
             }
            //4)Mostrar y calcular el factorial de un numero (5)
            int num4;
            int resultado= 1;
            
            Scanner leer4 = new Scanner (System.in);
            System.out.print("Ingresar un numero: ");
            num4 = leer4.nextInt();
            
            for (int C = num4; C >=1 ;C--){
                resultado *=C;
                
            }
            System.out.println(resultado);

            //5)Crear un programa que recorra del 1 a100 y informe al final del la cantidad de números prares e impares del lote.
            int contarnumpar= 0;
            int contarnumimp= 0;
        
            for(int ini = 1; ini <= 100; ini++){
         
            if( ini%2 == 0 ) {
                contarnumpar ++;
            }else {
                contarnumimp ++;
                
            }
        }
            System.out.println("Cantidad de numeros pares son : " + contarnumpar);
            System.out.println("Cantidad de numeros impares son : " + contarnumimp);
    }
}

