/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package liquidacion.vacaciones;

import java.util.Scanner;

public class LiquidacionVacaciones {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String NOMBRE ="";
        int area=0, antiguedad=0;
            
        System.out.println("**************************");
        System.out.println("***LIQUIDACION DE VACACIONES***");
        System.out.println("********TATOOINE S.A.**********");
        System.out.println("*******************************");
        System.out.println("*******************************");
        System.out.println("INGRESE EL NOMBRE DEL TRABAJADOR :");
        NOMBRE= entrada.nextLine();
        System.out.println("CANTIDAD DE ANOS DE SERVICIO :");
        antiguedad= entrada.nextInt();
        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("***01 - Departamento de Atencion al cliente***");
        System.out.println("***02 - Departamento de Logistica***");
        System.out.println("***03 - Gerencia***");
        System.out.println("**************************");
        System.out.println("**************************");
        System.out.print("Ingrese un nimero de Area :");
        area= entrada.nextInt();
        
        //Dto atencion al cliente
        if (area ==1) {
            if (antiguedad ==1) {
                System.out.println("El trabajador :" + NOMBRE + " Antiguedad = " + antiguedad );
                System.out.println("Del area Atencion al cliente" );
                System.out.println("Tiene 6 dias de vacaciones" );
            }else if (antiguedad >=2 && antiguedad <= 6){
                System.out.println("El trabajador :" + NOMBRE + " Antiguedad = " + antiguedad );
                System.out.println("Del area Atencion al cliente" );
                System.out.println("Tiene 14 dias de vacaciones" );
            }else if (antiguedad >=7){
                System.out.println("El trabajador :" + NOMBRE + " Antiguedad = " + antiguedad );
                System.out.println("Del area Atencion al cliente" );
                System.out.println("Tiene 20 dias de vacaciones" );
            }
                }else if (area ==2){
                    if (antiguedad ==1) {
                        System.out.println("El trabajador :" + NOMBRE + " Antiguedad = " + antiguedad );
                        System.out.println("Del area Atencion al cliente" );
                        System.out.println("Tiene 7 dias de vacaciones" );
                    }else if (antiguedad >=2 && antiguedad <=6){
                        System.out.println("El trabajador :" + NOMBRE + " Antiguedad = " + antiguedad );
                        System.out.println("Del area Atencion al cliente" );
                        System.out.println("Tiene 15 dias de vacaciones" );
                    }else if (antiguedad >=7){
                        System.out.println("El trabajador :" + NOMBRE + " Antiguedad = " + antiguedad );
                        System.out.println("Del area Atencion al cliente" );
                        System.out.println("Tiene 22 dias de vacaciones" );
                    }
                        }else if (area ==3){
                            if (antiguedad ==1) {
                                System.out.println("El trabajador :" + NOMBRE + " Antiguedad = " + antiguedad );
                                System.out.println("Del area Atencion al cliente" );
                                System.out.println("Tiene 10 dias de vacaciones" );
                            }else if (antiguedad >=2 && antiguedad <=6){
                                System.out.println("El trabajador :" + NOMBRE + " Antiguedad = " + antiguedad );
                                System.out.println("Del area Atencion al cliente" );
                                System.out.println("Tiene 20 dias de vacaciones" );
                            }else if (antiguedad >=7){
                                System.out.println("El trabajador :" + NOMBRE + " Antiguedad = " + antiguedad );
                                System.out.println("Del area Atencion al cliente" );
                                System.out.println("Tiene 30 dias de vacaciones" );       
                                        }
                            }
        }  
    }
    
