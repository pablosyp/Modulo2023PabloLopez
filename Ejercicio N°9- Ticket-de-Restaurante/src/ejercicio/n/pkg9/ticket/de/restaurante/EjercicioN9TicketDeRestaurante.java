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
        int consumo=0, pago=0;
        
        System.out.println("==============================");
        System.out.println("RESTAURANTE CFT No 36");
        System.out.println("Zavaleta 204, C1437EYF CABA");
        System.out.println("==============================");
        System.out.println("Caja # 1 - Ticket # 1 :");
        System.out.print("LO ATENDIO: ");
        MOZO= entrada.nextLine();
        System.out.println("==============================");
        System.out.print("SUBTOTAL: ");
        consumo= entrada.nextInt();
        System.out.print("FORMA DE PAGO: ");
        consumo= entrada.nextInt();
        System.out.print("NUMERO DE TARJETA: ");
        pago= entrada.nextInt();
        System.out.print("CUOTAS: ");
        consumo= entrada.nextInt();
        System.out.print("DESCUENTO: ");
        consumo= entrada.nextInt();
        
        
        
        
    }
    
}