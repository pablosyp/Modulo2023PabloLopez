/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.en.clase.pkg2023.pkg04.pkg14;

import java.util.Scanner;

public class EjercicioEnClase20230414 {

    public static void main(String[] args) {
        //Variables
        int suma;
        int resta;
        int multi;
        int division;

        int oper= 0;
        
        int num1= 0;
        int num2= 0;

        //Crear objetos scanner
        Scanner lector = new Scanner(System.in);
        //Seleccion de Operacion
        System.out.println("***SELECCIONE OPERACION***");
        System.out.println("***Operacion - 01 - Suma***");
        System.out.println("***Operacion - 02 - Resta***");
        System.out.println("***Operacion - 03 - Multiplicacion***");
        System.out.println("***Operacion - 04 - Division***");
        System.out.println("Numero :");
        oper= lector.nextInt();
        System.out.println("***SELECCIONE 1er NUMERO***");
        num1= lector.nextInt();
        System.out.println("***SELECCIONE 2do NUMERO***");
        num2= lector.nextInt();     
        //Procesos
        suma= num1 + num2;
        resta= num1 - num2;
        multi= num1 * num2;
        division= num1 / num2;
        
        if (oper ==1){
            System.out.println("--Resultado--: " + suma);
        }else if (oper ==2){
            System.out.println("--Resultado--: " + resta);
        }else if (oper ==3){
            System.out.println("--Resultado--: " + multi);
        }else if (oper ==4){
            System.out.println("--Resultado--: " + division);
        }
            
        
        
        
        
        
    }
    
    
}
