/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.n.pkg10.pkgswitch.como.va.a.pagar;

import java.util.Scanner;

public class EjercicioN10SWITCHComoVaAPagar {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int importe;
        int opcion =0;
        int tarjeta =0;
        int numero =0;
        int cuotas;

            System.out.println("Ingrese el importe");
            System.out.print("Valor: $ ");
            importe = entrada.nextInt();
            System.out.println("Opciones de pago");
            System.out.println("Efectivo ingrese: 1");
            System.out.println("Tarjeta de Credito ingrese: 2");
            System.out.println("Tardeja de Debito ingrese: 3");

            opcion = entrada.nextInt();
        
        switch (opcion)
        {
            case 1:
                System.out.println(" Efectivo descuento 40% ");
                break;
            case 2:
                System.out.print("NUMERO DE TARJETA : " );
                numero= entrada.nextInt();
                System.out.print("Seleccionar cuotas 1, 2 o 3 : " );
                cuotas= entrada.nextInt();
                System.out.println(" Tarjeta Credito 20% recargo ");
                break;
            case 3:
                System.out.print("NUMERO DE TARJETA : " );
                numero= entrada.nextInt();
                System.out.println(" Tarjeta Debito 10% recargo ");
                break;
                default:
                    System.out.println(" Seleccione correctamente ");
                    break;
        }
                
            
        
        
        
        
        }
    }
