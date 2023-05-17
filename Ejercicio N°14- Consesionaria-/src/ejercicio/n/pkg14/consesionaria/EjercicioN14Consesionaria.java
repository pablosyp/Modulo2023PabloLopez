
package ejercicio.n.pkg14.consesionaria;

import java.util.*;

public class EjercicioN14Consesionaria {

    public static void main(String[] args) {
     //Variables 
     String nombrevendedor = "";
     String nombrecliente = "";
     int dni;
     int telefono;
     int importe;
     
     String usado = "";
     String dominio = "";
     
     String marca ="Renault";
     String modelo = "";
     String gama = "";
     String data = "";

     int opcion;
     int imptotalefect;
     int imptotal70;
     int imptotal80;
     int imptotal100;
     int importefinal70;
     int importefinal80;
     int importefinal100;
     int cuota120;
     int cuota85;
     int cuota240;
     

        //creamos metodo para ingreso de datos
        Scanner leerdato = new Scanner(System.in);
        //creamos la matriz de modelos {id_modelo,nombre de modelo}
        String [][] modelos = {{"1","Logan"},{"2","Twingo"},{"3","Kangoo"}};

        String [][] gamas = {{"1","Baja"},{"2","Media"},{"3","Alta"}};
        
        int valLogan []= {5000000,6000000,7000000};
        int valTwingo []= {3000000,3500000,4000000};
        int valKangoo []= {6500000,7000000,7500000};
        
        //String [][] valLogan = {{"1","Logan","Baja","5000000"},{"2","Logan","Media","6000000"},{"3","Logan","Alta","7000000"}};
        //String [][] valTwingo = {{"4","Twingo","Baja","3000000"},{"5","Twingo","Media","3500000"},{"6","Twingo","Alta","4000000"}};
        //String [][] valKangoo = {{"7","Kangoo","Baja","6500000"},{"8","Kangoo","Media","7000000"},{"9","Kangoo","Alta","7500000"}};

        System.out.println("=================================================");
        System.out.println("                   CONCESIONARIA                 ");
        System.out.println("                  RENAULT JOSECAR                ");
        System.out.println("         Venta de 0KM - Planes de Ahorro         ");        
        System.out.println("=================================================");
        System.out.println("                                                 ");
        System.out.println("                  MODELOS AUTOMOVILES            ");
        System.out.println(" Modelos  |   Logan   |    Twingo  |    Kangoo   ");    
        System.out.println("Gama Alta | 7.000.000 |  4.000.000 |  7.500.000 |");            
        System.out.println("Gama Media| 6.000.000 |  3.500.000 |  7.000.000 |");
        System.out.println("Gama Baja | 5.000.000 |  3.000.000 |  6.500.000 |");
        System.out.println("-------------------------------------------------");
        
        System.out.println("Ingrese el Nombre del Vendedor: ");
	nombrevendedor = leerdato.next();
        
        System.out.println("Ingrese el Nombre del Cliente: ");
	nombrecliente = leerdato.next();
        
        System.out.println("Ingrese el DNI: ");
	dni = leerdato.nextInt();
        
        System.out.println("Ingrese el Telefono: ");
	telefono = leerdato.nextInt();
        System.out.println("-------------------------------------------------");
        System.out.println("Marca de su proximo automovil: " + marca);
        System.out.println("-------------------------------------------------");
        System.out.println("------------- Lista de modelos ------------------");
        //listamos los modelos
        for (int x=0; x < modelos.length; x++) {
             
            for (int y=0; y < modelos[x].length; y++) {
            System.out.print (modelos[x][y]);
            System.out.print (" - ");
            }
            System.out.print ("\n");
        }
        
        System.out.println("-------------------------------------------------");
        
        System.out.print("Seleccione el modelo: ");
        data = leerdato.next();

        switch (data){
            case "1":
               modelo = "Logan";
            break;
            case "2":
               modelo = "Twingo";
            break;
            case "3":
               modelo = "Kangoo";
            break;
            default:
            System.out.println ("El dato ingresado no es valida!");   
            modelo = "0";
            break;    
        }
            System.out.println("El modelo seleccionado es: " +modelo);
        System.out.println("-------------------------------------------------");

        //listamos la gama
        System.out.println("------------- Lista de Gama ------------------");
        for (int x=0; x < gamas.length; x++) {
             
            for (int y=0; y < gamas[x].length; y++) {
            System.out.print (gamas[x][y]);
            System.out.print (" - ");
            }
            System.out.print ("\n");
        }
        System.out.println("-------------------------------------------------");
        
        System.out.print("Seleccione la Gama: ");
        data = leerdato.next();

        switch (data){
            case "1":
               gama = "Baja";
            break;
            case "2":
               gama = "Media";
            break;
            case "3":
               gama = "Alta";
            break;
            default:
            System.out.println ("El dato ingresado no es valida!");   
            gama = "0";
            break;    
        }
            System.out.println("La Gama seleccionada es: " +gama);
        System.out.println("-------------------------------------------------");
        
        System.out.println("------------- Lista de Precios ------------------");
        System.out.println("Logan--------------------------------------------");
        System.out.println("Baja------Media-----Alta-------------------------");
            for (int y=0; y < valLogan.length; y++) {
            System.out.print ("" + valLogan[y]);
            System.out.print (" - ");
            }
            System.out.print ("\n");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Twingo--------------------------------------------");
        System.out.println("Baja------Media-----Alta-------------------------");
            for (int y=0; y < valTwingo.length; y++) {
            System.out.print ("" + valTwingo[y]);
            System.out.print (" - ");
            }
            System.out.print ("\n");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Kangoo--------------------------------------------");
        System.out.println("Baja------Media-----Alta-------------------------");
            for (int y=0; y < valKangoo.length; y++) {
            System.out.print ("" + valKangoo[y]);
            System.out.print (" - ");
            }
            System.out.print ("\n");
        
        /*
        System.out.println("------------- Lista de Precios ------------------");
        for (int x=0; x < valLogan.length; x++) {
             
            for (int y=0; y < valLogan[x].length; y++) {
            System.out.print ("" + valLogan[x][y]);
            System.out.print (" - ");
            }
            System.out.print ("\n");
        }
        System.out.println("-------------------------------------------------");
         for (int x=0; x < valTwingo.length; x++) {
             
            for (int y=0; y < valTwingo[x].length; y++) {
            System.out.print ("" + valTwingo[x][y]);
            System.out.print (" - ");
            }
            System.out.print ("\n");
        }
        System.out.println("-------------------------------------------------");
          for (int x=0; x < valKangoo.length; x++) {
             
            for (int y=0; y < valKangoo[x].length; y++) {
            System.out.print ("" + valKangoo[x][y]);
            System.out.print (" - ");
            }
            System.out.print ("\n");
        }
        */
        System.out.println("-------------------------------------------------");
        System.out.println("------Ingrese el Precio de Lista------");
	importe = leerdato.nextInt();

        System.out.println("Entrega Vehiculo Usado: 1-SI // 2-NO" );
	data = leerdato.next();
        switch (data){
            case "1":
               usado = "SI";
               System.out.println("Ingrese el Dominio del Vehiculo Usado: " );
               dominio = leerdato.next();
            break;
            case "2":
               usado = "NO";
            break;   
        }

        System.out.println("-----------------------------------");
        System.out.println("---------Opciones de Pago:---------");
        System.out.println("-----------------------------------");
        System.out.println("-1- 100% en Efectivo---------------");
        System.out.println("-2- 70% Finaniado y 30% en efectivo");
        System.out.println("-3- 80% Finaniado y 20% en efectivo");
        System.out.println("-4- 100% Financiado");
        System.out.println("---------------------------------");
        System.out.println("Ingrese una opion de Pago");
	opcion = leerdato.nextInt();

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
        System.out.println("=================================");
        System.out.println("--------DATOS DEL CLIENTE------- ");   
        System.out.println("Nombre: " + nombrecliente);
        System.out.println("DNI: " + dni);
        System.out.println("Telefono: " + telefono);
        System.out.println("=================================");
        System.out.println("-------DATOS DEL AUTOMOTOR------ ");
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo );
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
