/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.n.pkg7.clasescanner;
    //Importar librerias con clase scanner

import java.util.Scanner;

public class EjercicioN7ClaseScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int num;
        int nac;
        int fecha;
        int resta;
        String nombre;
        String apellido;
        //Datos
        fecha = 2023;
        //Crear objetos scanner
        Scanner lector = new Scanner(System.in);
        //Pedir datos de usuario
        System.out.print("Ingresar su Nombre: ");
        nombre = lector.nextLine();
        System.out.print("Ingresar su Apellido: ");
        apellido = lector.nextLine();
        System.out.print("Ingrese el año de su nacimiento: ");
        nac = lector.nextInt();
        //Operacion
        resta= fecha - nac;
        //Muestro en pantalla la edad
        System.out.println("--Edad--: " + resta);
            
        
        
        
        
        
    }
    
}
