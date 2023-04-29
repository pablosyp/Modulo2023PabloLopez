/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.nº11.ciclos.bucles;

public class EjercicioNº11CiclosBucles {

    public static void main(String[] args) {
        //A FOR
        System.out.println("Opcion A For");
        int num1=0;
        for (int A = 1; A <= 100; A++){
            System.out.println(+A);
        }
        //B WHILE
        System.out.println("Opcion B While");
        int num2=1;
        
        while( num2 <=100){
            System.out.println(num2);
            num2++;
        }   
        //DO WHILE
        System.out.println("Opcion C Do While");
        int num3=1;
         do{
             System.out.println(num3);
             num3++;
             }while(num3 <=100);
        
        
        
        
           
    }
}
