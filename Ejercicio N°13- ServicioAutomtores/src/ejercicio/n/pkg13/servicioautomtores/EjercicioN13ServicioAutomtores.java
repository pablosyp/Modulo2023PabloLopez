
package ejercicio.n.pkg13.servicioautomtores;

import java.util.Random;
import java.util.Scanner;

public class EjercicioN13ServicioAutomtores {

    public static void main(String[] args) {
        // TODO code application logic here
        String nomCliente="";
        String domVehiculo="";
        String marca="";
        int n;
        int dni;
        int telefono;
        int cant=0;
        
        Scanner leernomCliente = new Scanner (System.in);
        Scanner leerdni = new Scanner (System.in);
        Scanner leertelefono = new Scanner (System.in);
        Scanner leermarca = new Scanner (System.in);
        Scanner leerdomVehiculo = new Scanner (System.in);
        
        int alineacion;
        int ruedasA=0;
        int ruedasB=0;
        int ruedasC=0;
        int balanceo;
        int aceite;
        int cubiertas;
        
        Scanner leeralineacion = new Scanner (System.in);
        Scanner leerbalanceo = new Scanner (System.in);
        Scanner leeraceite = new Scanner (System.in);
        Scanner leercubiertas = new Scanner (System.in);
        
        Scanner leer = new Scanner (System.in);
                
        System.out.println("Nombre del Cliente : ");
	nomCliente = leernomCliente.next();
        System.out.println("DNI : ");
	dni = leerdni.nextInt();
        System.out.println("Telefono : ");
	telefono = leertelefono.nextInt();
        System.out.println("Marca : ");
	marca = leermarca.next();
        System.out.println("Dominio del Vehiculo : ");
	domVehiculo = leerdomVehiculo.next();
        
        System.out.print("Servicio alineacion 1=si / 0=no: ");
        alineacion = leeralineacion.nextInt();
            if (alineacion ==1){
                    cant+=1;
                    System.out.println ("Cantidad ruedas a alinear: ");
                    ruedasA = leer.nextInt();
                    }
        System.out.print("Servicio balanceo 1=si / 0=no: ");
        balanceo = leerbalanceo.nextInt();
            if (balanceo ==1){
                    cant+=1;
                    System.out.println ("Cantidad ruedas a balancear: ");
                    ruedasB = leer.nextInt();
                    }  
        System.out.print("Servicio cambio de Aceite 1=si / 0=no: ");
        aceite = leeraceite.nextInt();
            if (aceite ==1){
                    cant+=1;
                    }
        System.out.print("Servicio cambio de cubiertas 1=si / 0=no: ");
        cubiertas = leercubiertas.nextInt();
            if (cubiertas ==1){
                    cant+=1;
                    System.out.println ("Cantidad cubiertas a cambiar: ");
                    ruedasC = leer.nextInt();
                    } 
       
            
        //Imprimir ticket
        System.out.println("\n==================================");
        System.out.println("======== Bienvenido ==============");
        System.out.println("Centro de Servicios Automotor CFP N°36\nZavaleta 204, C1437EYF, CABA");
                Random orden = new Random ();
                n=orden.nextInt(100)+1;
        
        System.out.println("=====Nº ORDEN: " + n + "===========================");
        System.out.println("Nombre del Cliente: " + nomCliente);
        System.out.println("DNI del cliente: " + dni);
        System.out.println("Telefono: " + telefono);
        System.out.println("Marca del Vehiculo: " + marca);
        System.out.println("Dominio del Vehiculo: " + domVehiculo);
        System.out.println("==================================");
        System.out.println("Cantidad de servicios: " + cant);
        
        String servicio[]=new String[4];
       
        servicio [0]="alineacion";
        servicio [1]="balanceo";
        servicio [2]="aceite";
        servicio [3]="cubierta";
        
        System.out.println("Los servicios son : " );
            if (alineacion ==1){
                System.out.println (""+ servicio [0] + " / " + "Cantidad de ruedas :" + ruedasA );
            }
            if (balanceo ==1){
            System.out.println (""+ servicio [1] + " / " + "Cantidad de ruedas :"  + ruedasB );
            }
            if (aceite ==1){
                System.out.println (""+ "Cambio de "+ servicio [2] );
            }
            if (cubiertas ==1){
                System.out.println (""+ "Cambio de "+ servicio [3] + " / " + "Cantidad de ruedas :"  + ruedasC);
            }
        System.out.println("==================================");
        
        
    }
}


