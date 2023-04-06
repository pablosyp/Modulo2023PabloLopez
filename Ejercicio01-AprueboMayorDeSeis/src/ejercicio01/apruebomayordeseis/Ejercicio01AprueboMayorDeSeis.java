/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01.apruebomayordeseis;

/**
 *
 * @author PabloLopez
 */
public class Ejercicio01AprueboMayorDeSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        String nombre = "Pablo";
        int nota= 7;
        System.out.println("--Examenes--");
        System.out.println("--Nombre del Alumno: " + nombre);
        System.out.println("--Nota del Alumno: " + nota);
        if (nota >= 6){
            System.out.println("--Aprobado--");
        }else {
        System.out.println("--Nombre del Alumno: " + nombre);
        System.out.println("--Desaprobado--");
        
    }
    
}
}