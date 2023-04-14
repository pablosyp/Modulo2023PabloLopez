/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.nº5.variables;

/**
 *
 * @author PabloLopez
 */
public class EjercicioNº5Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int X;
        int Y;
        int Z;
        double N;
        double M;
        int suma1;
        int diferencia1;
        int producto1;
        int cociente1;
        int resto1;
        int potencia1;
        double suma2;
        double diferencia2;
        double producto2;
        double cociente2;
        double resto2;
        double potencia2;
        int doble1;
        int doble2;
        double doble3;
        double doble4;
        double sumatotal;
        double productototales;
                
        //Valores
        X= 10;
        Y= 50;
        N= 5.5;
        M= 10.5;
        Z= 2;
        //Valores en pantalla
        System.out.println("Variable X = " + X);
        System.out.println("Variable Y = " + Y);
        System.out.println("Variable N = " + N);
        System.out.println("Variable M = " + M);
        //Procesos Matematicos
        suma1= X + Y;
        diferencia1= X - Y;
        producto1= X * Y;
        cociente1= X / Y;
        resto1= X % Y;
        suma2= N + M;
        diferencia2= N -M;
        producto2= N * M;
        cociente2= N / M;
        resto2= N % M;
        suma2= X + N;
        cociente2= Y / M;
        resto2= Y % M;
        //Procesos Matematicos conbinados
            //doble de cada variable 
        doble1= X * Z;
        doble2= Y * Z;
        doble3= N * Z;
        doble4= M * Z;
            //suma de todas las variables
        sumatotal= X + Y + N + M;
            //producto de todas las variables
        productototales= X * Y * N * M;
        //Valores Matematicos en pantalla
        System.out.println("suma de X + Y = " + suma1);
        System.out.println("diferencia de X - Y = " + diferencia1);
        System.out.println("producto de X * Y = " + producto1);
        System.out.println("cociente de X / Y = " + cociente1);
        System.out.println("resto de X % Y = " + resto1);
        System.out.println("suma de N + M = " + suma2);
        System.out.println("diferencia de N - M = " + diferencia2);
        System.out.println("producto de N * M = " + producto2);
        System.out.println("cociente de N / M = " + cociente2);
        System.out.println("resto de N % M = " + resto2);
        System.out.println("suma de X + N = " + suma2);
        System.out.println("cociente de Y / M = " + cociente2);
        System.out.println("resto de Y % M = " + resto2);
        //Valores Matematicos en pantalla conbinados
            //doble de cada variable
        System.out.println("Variable X = " + X + " el doble es " + doble1);
        System.out.println("Variable Y = " + Y + " el doble es " + doble2);
        System.out.println("Variable N = " + N + " el doble es " + doble3);
        System.out.println("Variable M = " + M + " el doble es " + doble4);
            //suma de todas las variables
        System.out.println("Suma total= X + Y + N + M = " + sumatotal);
            //producto de todas las variables
        System.out.println("Productos total= X * Y * N * M = " + productototales);
                       
    }
    
}
