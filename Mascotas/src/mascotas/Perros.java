/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotas;

import java.util.Scanner;

public class Perros {
        //Definir atributos
    String nombre,raza,color;
    int edad;
    //crear objeto
    Scanner leer = new Scanner(System.in);
    
    public void pedir(){
        System.out.print("Ingrese el Nombre del Perro: ");
        nombre= leer.nextLine();
        System.out.print("Ingrese la Raza del Perro: ");
        raza= leer.nextLine();
        System.out.print("Ingrese el Color del Perro: ");
        color= leer.nextLine();
    }
    public void ladrar(){
        System.out.print("Gua Gua Gua ");
        color= leer.nextLine(); 
    }
    public void correr(){
        System.out.print("Velocidad 40 KM");
        color= leer.nextLine();
    }
    public void ficha(){
        System.out.println("=============================");
        System.out.println("=======Veterinaria CFP=======");
        System.out.println("=============================");
        System.out.println("==Nombre de la mascota: " +nombre+ "==");
        System.out.println("==Raza de la mascota: " +raza+ "==");
        System.out.println("==Color de la mascota: " +color+ "==");
        System.out.println("=============================");
        }
    
}

