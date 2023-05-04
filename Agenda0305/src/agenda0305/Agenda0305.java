/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda0305;

import java.util.Scanner;

public class Agenda0305 {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre[] = new String [5];
        String apellido[] = new String [5];
        String telefono[] = new String [5];
        String buscar="";

        for(int n=0;n<5;n++){
            System.out.print("Ingresar Nombre " + (n+1) + ":");
            Scanner nom = new Scanner(System.in);
            nombre[n] = nom.nextLine();
            
            System.out.print("Ingresar Apellido " + (n+1) + ":");
            Scanner ape = new Scanner(System.in);
            apellido[n] = ape.nextLine();
            
            System.out.print("Ingresar Telefono " + (n+1) + ":");
            Scanner tel = new Scanner(System.in);
            telefono[n] = tel.nextLine();
            
            
        }
            System.out.println("Ingrese Nombre a Buscar :");
            
            Scanner consulta = new Scanner (System.in);
            buscar = consulta.next();
            
            for(int b=0;b<nombre.length;b++){
                if(buscar.equals(nombre[b])){
                    System.out.println("Sus datos son :" + nombre[b] + "/" + apellido[b] + "/" + telefono[b]);
                    break;
                }
            }
            
            }
           
            }
        



