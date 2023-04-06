/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.n.pkg3.variables.constantes.tipos;

/**
 *
 * @author PabloLopez
 */
public class EjercicioN3VariablesConstantesTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
            int numero1;
            int numero2;
            int suma;
            int edad;
    String nombre = "Pablo";
        // Constante
            final int NUMERO_3= 4;
        // Ingreso los valores a la variables numero1 y numero2
            numero1 = 30;
            numero2 = 40;
            edad = 46;
        // operación suma
            suma= numero1 + numero2;
        // Muestro en pantalla las dos variables y el resultado de la suma
            System.out.println("--sumo los datos--: " + suma);
        // Cambio los valores de numero1,numero2 y vuelvo a realizar la operación de suma
            numero1=100;
            numero2=200;
        //operación suma
            suma= numero1 + numero2;
        // Muestro en pantalla las dos variables y el resultado de la suma
            System.out.println("--sumo los datos--: " + suma);
        // Instancio y muestro en pantalla la variable nombre y su edad
            System.out.println("--Nombre--: " + nombre);
            System.out.println("--Edad--: " + edad);
        // Muestro en pantalla la constante
            System.out.println("--Constante--: " + NUMERO_3);

}

}


