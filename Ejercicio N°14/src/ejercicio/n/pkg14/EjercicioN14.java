
package ejercicio.n.pkg14;

import java.util.Date;
import java.util.Scanner;

public class EjercicioN14 {

    public static void main(String[] args) {
                // // Variables
     String nombrevendedor = "";
     String nombrecliente = "";
     String marca = "";
     String modelo = "";
     String gama = "";
     String usado = "";
     String dominio = "";
     String Logan = "";
     String Twingo = "";
     String Kangoo = "";
     
     int dni;
     int tel;
     int importe;
     
     int opcion;
     int numero;
     int imptotalefect;
     int imptotal70;
     int imptotal80;
     int imptotal100;
     int importefinal;
     int importefinal70;
     int importefinal80;
     int importefinal100;
     int cuota120;
     int cuota85;
     int cuota240;
     
    
        Scanner leernombrevendedor = new Scanner(System.in);
        Scanner leernombrecliente = new Scanner(System.in);
        Scanner leerdni = new Scanner(System.in);
        Scanner leertel = new Scanner(System.in);
        Scanner leermarca = new Scanner(System.in);
        Scanner leermodelo = new Scanner(System.in);
        Scanner leergama = new Scanner(System.in);
        Scanner leerimporte = new Scanner(System.in);
        Scanner leerusado = new Scanner(System.in);
        Scanner leerdominio = new Scanner(System.in);
        
        Scanner leeropcion = new Scanner(System.in);
        Scanner leerimptotalefect = new Scanner(System.in);
        Scanner leerimptotal70 = new Scanner(System.in);
        Scanner leerimptotal80 = new Scanner(System.in);
        Scanner leerimptotal100 = new Scanner(System.in);
        Scanner leerimportefinal = new Scanner(System.in);
        Scanner leerimportefinal70 = new Scanner(System.in);
        Scanner leerimportefinal80 = new Scanner(System.in);
        Scanner leerimportefinal100 = new Scanner(System.in);
        Scanner leercuota120 = new Scanner(System.in);
        Scanner leercuota85 = new Scanner(System.in);
        Scanner leercuota240 = new Scanner(System.in);
    
        Date fecha = new Date ();
        
        System.out.println("=================================================");
        System.out.println("                   CONCESIONARIA                 ");
        System.out.println("                  RENAULT JOSECAR                ");
        System.out.println("         Venta de 0KM - Planes de Ahorro         ");        
        System.out.println("=================================================");
        System.out.println("                                                 ");
        System.out.println("                  MODELOS AUTOMOVILES            ");
        System.out.println(" Modelos  |   Logan   |    Twingo  |    Kangoo   ");
        System.out.println("Gama Alta | 7.000.000 |  3.000.000 |  6.500.000 |");            
        System.out.println("Gama Media| 6.000.000 |  3.500.000 |  7.000.000 |");
        System.out.println("Gama Baja | 5.000.000 |  4.000.000 |  7.500.000 |");
        System.out.println("-------------------------------------------------");
                
        System.out.println("Ingrese el Nombre del Vendedor: ");
	nombrevendedor = leernombrevendedor.next();
        
        System.out.println("Ingrese el Nombre del Cliente: ");
	nombrecliente = leernombrecliente.next();
        
        System.out.println("Ingrese el DNI: ");
	dni = leerdni.nextInt();
        
        System.out.println("Ingrese el Telefono: ");
	tel = leertel.nextInt();
        
        System.out.println("Ingrese la Marca del Automotor: ");
	marca = leermarca.next();
        
        System.out.println("Ingrese el Modelo del Automotor: ");
	modelo = leermodelo.next();
        
        System.out.println("Ingrese la Gama del Automotor: ");
	gama = leergama.next();
        
        System.out.println("------Ingrese el Precio Total------");
	importe = leerimporte.nextInt();
        
        System.out.println("Entrega Vehiculo Usado SI/No: " );
	usado = leerusado.next();
        
        System.out.println("Dominio del Vehiculo Usado: " );
	dominio = leerdominio.next();
        
        System.out.println("-----------------------------------");
        System.out.println("---------Opciones de Pago:---------");
        System.out.println("-----------------------------------");
        System.out.println("-1- 100% en Efectivo---------------");
        System.out.println("-2- 70% Finaniado y 30% en efectivo");
        System.out.println("-3- 80% Finaniado y 20% en efectivo");
        System.out.println("-4- 100% Financiado");
        System.out.println("---------------------------------");
        System.out.println("Ingrese una opion de Pago");
	opcion = leeropcion.nextInt();
    
        
        
       //logica del switch- con tarjeta pedir numero
        switch (opcion){
            case 1:
        System.out.println("En Efectivo paga el 100% en una Cuota"); 
        imptotalefect = importe;
        System.out.println("El Total a pagar es:" + imptotalefect); 
        break;
            
            case 2:
        System.out.println("Con 70% Finaniado y 30% en efectivo");         
        imptotal70 = +importe *70 / 100;
        importefinal70 = importe + imptotal70;
        System.out.println("El Total a pagar en 120 cuotas es:" + importefinal70);
        cuota120 = importefinal70 / 120;
        System.out.println("El Valor a pagar por cuota es:" + cuota120);
        break;
        
            case 3:
        System.out.println("Con 80% Finaniado y 20% en efectivo");                
        imptotal80 = +importe *80 / 100;
        importefinal80 = importe + imptotal80;
        System.out.println("El Total a pagar en 85 cuotas es:" + importefinal80);
        cuota85 = importefinal80 / 85;
        System.out.println("El Valor a pagar por cuota es:" + cuota85);
        break;
            
            case 4:
        System.out.println("100% Financiado");                
        imptotal100 = +importe *100 / 100;
        importefinal100 = importe + imptotal100;
        System.out.println("El Total a pagar en 240 cuotas es:" + importefinal100);
        cuota240 = importefinal100 / 240;
        System.out.println("El Valor a pagar por cuota es:" + cuota240);
        break;
        
            default:
               System.out.println("Elija del 1 al 4 la opcion deseada");
           break;
        }
        System.out.println("=================================");
        System.out.println("          CONCESIONARIA          ");
        System.out.println("         RENAULT JOSECAR         ");
        System.out.println(" Venta de 0KM - Planes de Ahorro ");        
        System.out.println("=================================");
        System.out.println("*********PRESUPUESTO*************");
        System.out.println("=================================");
        System.out.println("Atendido por el Vendedor: " + nombrevendedor);
        System.out.println(fecha);
        System.out.println("Validez: 5 dias Habiles a partir de la fecha ");
        System.out.println("=================================");
        System.out.println("-------DATOS DEL COMPRADOR------ ");   
        System.out.println("Nombre: " + nombrecliente);
        System.out.println("DNI: " + dni);
        System.out.println("Telefono: " + tel);
        System.out.println("=================================");
        System.out.println("-------DATOS DEL AUTOMOTOR------ ");
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("GAMA: " + gama);
        System.out.println("PRECIO: " + importe);
        System.out.println("=================================");
        System.out.println("------PLAN de PAGO ELEGIDO------ ");
        switch (opcion){
            case 1:
        System.out.println("En Efectivo paga el 100% en una Cuota"); 
        imptotalefect = importe;
        System.out.println("El Total a pagar es:" + imptotalefect); 
        break;
            
            case 2:
        System.out.println("Con 70% Finaniado y 30% en efectivo");         
        imptotal70 = +importe *70 / 100;
        importefinal70 = importe + imptotal70;
        System.out.println("El Total a pagar en 120 cuotas es:" + importefinal70);
        cuota120 = importefinal70 / 120;
        System.out.println("El Valor a pagar por cuota es:" + cuota120);
        break;
        
            case 3:
        System.out.println("Con 80% Finaniado y 20% en efectivo");                
        imptotal80 = +importe *80 / 100;
        importefinal80 = importe + imptotal80;
        System.out.println("El Total a pagar en 85 cuotas es:" + importefinal80);
        cuota85 = importefinal80 / 85;
        System.out.println("El Valor a pagar por cuota es:" + cuota85);
        break;
            
            case 4:
        System.out.println("100% Financiado");                
        imptotal100 = +importe *100 / 100;
        importefinal100 = importe + imptotal100;
        System.out.println("El Total a pagar en 240 cuotas es:" + importefinal100);
        cuota240 = importefinal100 / 240;
        System.out.println("El Valor a pagar por cuota es:" + cuota240);
        break;
            default:
               System.out.println("Elija del 1 al 4 la opcion deseada");
           break;
        }
        System.out.println("=================================");
	System.out.println("Entrega Vehiculo Usado: " + usado);
	System.out.println("Dominio del Vehiculo Usado: " + dominio);
	System.out.println("=================================");
        System.out.println("-GRACIAS POR CONFIAR EN NOSOTROS-");        
        System.out.println("=================================");
        
        
        
        
    }
    
}

