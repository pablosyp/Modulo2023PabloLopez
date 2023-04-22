/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for2104;

import java.util.Scanner;


public class For2104 {

    public static void main(String[] args) {
            // 1)Generar una escalera de numero de 1 a 100
            int contarnumpar= 0;
            int contarnumimp= 0;
            
        for(int ini = 1; ini <= 100; ini++){
            
            System.out.println("Mostrar numero : " + ini);
            
            if( ini%2 == 0 ) {
                contarnumpar ++;
            }else {
                contarnumimp ++;
                
            }

        }
            System.out.println("Cantidad de numeros pares son : " + contarnumpar);
            System.out.println("Cantidad de numeros impares son : " + contarnumimp);
            
            // Ejercicio 3
            
            int num1;
            Scanner leer1 = new Scanner (System.in);
            System.out.print("Ingresar un numero: ");
            num1 = leer1.nextInt();
            
            for (int i = 0; i < num1 ;i++){
                
                if (i%3 == 0){
                    System.out.println("El numero " + i +" es multiplo de 3");
                }else {
                    System.out.println("El numero " + i +" no es multiplo de 3");
                }
                
            }
            
            //Ejercicio Factorial
                    
            int num2;
            int resultado= 1;
            
            Scanner leer2 = new Scanner (System.in);
            System.out.print("Ingresar un numero: ");
            num2 = leer2.nextInt();
            
            for (int i = num2; i >=1 ;i--){
                resultado *=i;
                
            }
            System.out.println(resultado);
            
            
    }
    
}
