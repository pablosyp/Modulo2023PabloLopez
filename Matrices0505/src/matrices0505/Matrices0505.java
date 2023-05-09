/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices0505;

import java.util.Scanner;

public class Matrices0505 {

    public static void main(String[] args) {
        // TODO code application logic here
        String estaciones[][]=new String[2][2];
                //llenado de la matriz
                estaciones [0][0]="otono";
                estaciones [0][1]="verano";
                estaciones [1][0]="invierno";
                estaciones [1][1]="primavera";
                
                //Imprimir en consola la matriz
                System.out.println("Estacion del ano en fila 0 columna 0 es " +estaciones [0][0]);
                System.out.println("Estacion del ano en fila 0 columna 1 es " +estaciones [0][1]);
                System.out.println("Estacion del ano en fila 1 columna 0 es " +estaciones [1][0]);
                System.out.println("Estacion del ano en fila 1 columna 1 es " +estaciones [1][1]);
                
         //matriz a demanda
         int fila=0,columna=0,contador=1;
         Scanner leer = new Scanner(System.in);
         
         //pedir filas
         System.out.print("Por favor ingrese la cantidad de filas: ");
         fila = leer.nextInt();
         
         //pedir columnas
         System.out.print("Por favor ingrese la cantidad de columnas: ");
         columna = leer.nextInt();
         
         //crear matriz
         int numeros [][] = new int [fila][columna]; 
         
         for(int j=0;j<fila;j++){
             for(int i=0;i<columna;i++){
                 numeros[j][i] =contador;
                 contador++;
                 System.out.println("" + numeros[j][i] );
                 //System.out.print("(" + numeros[j][i] + ")" );
                 {
                     //System.out.println("");
                 }
                 
             }
         }
         
        
    }
    
}
