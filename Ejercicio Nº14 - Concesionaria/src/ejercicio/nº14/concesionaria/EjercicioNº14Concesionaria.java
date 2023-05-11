
package ejercicio.nº14.concesionaria;

import java.util.*;

public class EjercicioNº14Concesionaria {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombrevendedor="";
        String nombrecliente="";
        String dni="";
        String telefono="";
        String gam = "";

        //Planes
        int plan=0;
        int precioA= 0;
        int precioB= 0;
        int precioC= 0;
        int valor1= 5000000;
        int valor2= 7000000;
        int valor3= 8000000;
        
        String [] marca = new String [1];
            marca [0]= "Renault";
        String [] modelo = new String [1];
            modelo [0]= "Logan";
        String [] gama = new String [3];
            gama [0] = "Baja";
            gama [1] = "Media";
            gama [2] = "Alta";
        String [] precio = new String [1];
            precio [0] = "5000000";

        Scanner entrada = new Scanner(System.in);
        Date fecha = new Date();
        
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("====Concesionaria RENAULT-JOSECAR====");
        System.out.println("=====Zavaleta 204, C1437EYF CABA=====");
        System.out.println("=====================================");
        System.out.println("=====Vendedor :======================");
        nombrevendedor= entrada.next();
        System.out.println("=====================================");
        System.out.println("=====Fecha de propuesta :============");
        System.out.println (fecha);
        System.out.println("=====Nombre del Cliente :============");
        nombrecliente= entrada.next();
        System.out.println("=====DNI : ==========================");
        dni= entrada.next();
        System.out.println("=====Telefono :======================");
        telefono= entrada.next();
        System.out.println("=====Marca :"+ marca[0]);
        System.out.println("=====Modelo :" + modelo[0]);
        System.out.print("=====Gama :");
        gam= entrada.next();

        
        //Seleccionar PLAN , vector con los planes Efectivo , 70/30 , 80/20 y 100% financiado

        String [] efectivo = new String [1];
            efectivo [0]= "Efectivo";
        String [] planA = new String [1];
            planA [0] = "70/30 - cuota 120";
        String [] planB = new String [1];
            planB [0] = "80/20 - cuota 85";
        String [] planC = new String [1];
            planC [0] = "100% financiado - cuota 240";
        
        System.out.println("Tipos de planes ");
                System.out.println("-1- " + efectivo [0]);
                System.out.println("-2- " + planA [0]);
                System.out.println("-3- " + planB [0]);
                System.out.println("-4- " + planC [0]);
                
                precioA = (valor1 * 70)/100 + valor1;
                precioB = (valor1 * 80)/100 + valor1;
                precioC = (valor1 * 100)/100 + valor1;
                
                
               
                System.out.print("Selecione el plan:  ");
                plan = entrada.nextInt();
                if (plan ==1){
                    System.out.println("TOTAL: " + valor1);
                     }
                if (plan ==2){ 
                    System.out.println("TOTAL: " + precioA);
                    }
                if (plan ==3){ 
                    System.out.println("TOTAL: " + precioB);
                    }
                if (plan ==4){ 
                    System.out.println("TOTAL: " + precioC);
                
            }

        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        
        
        }
}
