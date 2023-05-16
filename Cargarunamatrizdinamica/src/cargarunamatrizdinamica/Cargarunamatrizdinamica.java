
package cargarunamatrizdinamica;

import java.util.Scanner;

public class Cargarunamatrizdinamica {

    public static void main(String[] args) {
        //String [][] matriz;
                //int matriz[][] = new int[3][3];
                String[][] matriz = new String[3][3];
                //String[][] matriz = {{"Marta","Luis","Nacho"},{"Juancho","Anabel","Julio"},{"Maria","David","Gema"}};
                
        Scanner consola = new Scanner(System.in);
            
     //cargar matriz dinamica con usuario  
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
            System.out.print("Introduzca un numero a la matriz[" + x + "," + y + "]  ");
            matriz[x][y] = consola.next();
        }
        }
    // mostrar matriz         
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
            System.out.println ("[" + x + "," + y + "] = " + matriz[x][y]);
            }
        }
        
              
    }
    
}

