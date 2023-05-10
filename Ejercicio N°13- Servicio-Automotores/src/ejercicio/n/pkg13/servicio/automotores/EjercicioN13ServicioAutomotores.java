/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.n.pkg13.servicio.automotores;

import java.util.*;

public class EjercicioN13ServicioAutomotores {

    public static void main(String[] args) {
        // TODO code application logic here
        String servicio[]=new String[4];
        
        String nom="";
        String tel="";
        String domVehiculo="";
        String marca="";
        int n;
        int cant=0;
        String servicios="";
        
        servicio [0]="alineacion";
        servicio [1]="balanceo";
        servicio [2]="aceite";
        servicio [3]="cubierta";
        
        Scanner leer = new Scanner(System.in);
         
        System.out.print("Ingrese su nombre : " );
        nom = leer.next();
        System.out.print("Ingrese su telefono : " );
        tel = leer.next();
        System.out.print("Ingrese Dominio del vehiculo : " );
        domVehiculo = leer.next();
        System.out.print("Marca : ");
        marca = leer.next();
        
        int fila=0,columna=0,contar=0;
                System.out.print("Servicio alineacion 1=si / 0=no: ");
                fila = leer.nextInt();
                if (fila ==1){
                    cant+=1;
                    System.out.println ("\nSu servicio adquirido es : "+ servicio [0]+ "\n");
                }
                System.out.print("Cantidad ruedas a alinear: " );
                columna = leer.nextInt();
                System.out.print("Servicio balanceo 1=si / 0=no: " );
                fila = leer.nextInt();
                if (fila ==1){
                    cant+=1;
                    System.out.println ("\nSu servicio adquirido es : "+ servicio [1]+ "\n");
                }
                System.out.print("Cantidad de balanceos: " );
                columna = leer.nextInt();
                System.out.print("Cambio de Aceite 1=si / 0=no: " );
                fila = leer.nextInt();
                if (fila ==1){
                    cant+=1;
                    System.out.println ("\nSu servicio adquirido es : "+ servicio [2]+ "\n");
                }
                System.out.print("Cambio de cubiertas 1=si / 0=no: " );
                fila = leer.nextInt();
                if (fila ==1){
                    cant+=1;
                    System.out.println ("\nSu servicio adquirido es : "+ servicio [3]+ "\n");
                }
                System.out.print("Cantidad de cubiertas a cambiar : " );
                columna = leer.nextInt();

        Random orden = new Random ();
        n=orden.nextInt(100)+1;
        
        //Imprimir ticket
        System.out.println("\n==================================");
        System.out.println("======== Bienvenido ==============");
        System.out.println("Centro de Servicios Automotor CFP N°36\nZavaleta 204, C1437EYF, CABA");
        System.out.println("=====Nº ORDEN: " + n + "===========================");
        System.out.println("Nombre del Cliente: " + nom);
        System.out.println("DNI del cliente: " + tel);
        System.out.println("Marca del Vehiculo: " + marca);
        System.out.println("Dominio del Vehiculo: " + domVehiculo);
        System.out.println("==================================");
        System.out.println("Cantidad de servicios: " + cant );
        
        System.out.println("Los servicios son: " + servicios);
        System.out.println("==================================");
        
    }
}


    



