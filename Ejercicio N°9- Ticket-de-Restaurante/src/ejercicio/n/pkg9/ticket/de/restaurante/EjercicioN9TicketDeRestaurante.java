/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.n.pkg9.ticket.de.restaurante;

import java.util.Scanner;

public class EjercicioN9TicketDeRestaurante {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String MOZO ="";
        String fecha= "30/04/2020 11:46:47 AM";

        int consumo= 0; 
        int tarjeta =0;
        int pago1= 0;
        int pago2= 0;
        int pago3= 0;
        int cuotas= 0;
        int descuento= 0;
        int numero= 0;
        
        System.out.println("==============================");
        System.out.println("RESTAURANTE CFT No 36");
        System.out.println("Zavaleta 204, C1437EYF CABA");
        System.out.println("==============================");
        System.out.println("Caja # 1 - Ticket # 1 :");
        System.out.print("LO ATENDIO: ");
        MOZO= entrada.nextLine();
        System.out.println("FECHA : " + fecha );
        System.out.println("==============================");
        System.out.println("1 Gaseosa ");
        System.out.println("1 Milanesa Napolitana con fritas");
        System.out.println("1 flan con crema");
        System.out.println("1 Cafe");
        System.out.println("==============================");
        System.out.print("SUBTOTAL: ");
        consumo= entrada.nextInt();
        System.out.print("FORMA DE PAGO: 1-EF / 2-TD / 3-TC ");
        tarjeta= entrada.nextInt();
        //Procesos
        pago1= (-consumo * 30)/100 + consumo;
        pago2= (-consumo * 10)/100 + consumo;
        pago3= (consumo * 10)/100 + consumo;
        
        if (tarjeta ==1){
            System.out.println("EFECTIVO");
            System.out.println("DESCUENTO: 30%");
            System.out.println(" ");
            System.out.println("TOTAL: " + pago1);
        }
            if (tarjeta ==2){ 
                System.out.println("TARJETA DE DEBITO");
                System.out.print("NUMERO DE TARJETA : " );
                numero= entrada.nextInt();
                System.out.println("DESCUENTO: 10%");
                System.out.println(" ");
                System.out.println("TOTAL: " + pago2);
            }
                if (tarjeta ==3){ 
                    System.out.println("TARJETA DE CREDITO");
                    System.out.print("NUMERO TARJETA : ");
                    numero= entrada.nextInt();
                    System.out.print("CUOTAS: ");
                    cuotas= entrada.nextInt();
                    System.out.println("RECARGO: 10%");
                    System.out.println(" ");
                    System.out.println("TOTAL: " + pago3);
        }
                        System.out.println("==============================");
                        System.out.println("Gracias por su visita");
                        System.out.println("==============================");
    }
}
        
        
        
        
