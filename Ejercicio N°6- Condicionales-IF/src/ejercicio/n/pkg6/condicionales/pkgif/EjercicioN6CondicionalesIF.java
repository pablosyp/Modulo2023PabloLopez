/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.n.pkg6.condicionales.pkgif;

public class EjercicioN6CondicionalesIF {

    public static void main(String[] args) {
        //1
        //Variables
        int temp1= 27;
        //Dato
        System.out.println("Ejercicio 1:");
        System.out.println("Temperatura es: " + temp1);
        if (temp1 > 25){
        //Salida
        System.out.println("--A la playa--");
        }
        //2
        //Variables
        boolean sol2;
        sol2 = true;
        //Dato
        System.out.println("Ejercicio 2:");
        System.out.println("Hace sol ?");
        if (sol2){
        //Salida
        System.out.println("--No te olvides la sombrilla--");
        }
        //3
        //Variables
        boolean haceso3= true;
        boolean nevado3= true;
        //Dato
        System.out.println("Ejercicio 3:");
        System.out.println("Nevado y hace sol");
        if (haceso3 || nevado3){
        //Salida
        System.out.println("--Que bien!--");
        }
        //4
        //Variables
        boolean nevando4= true;
        int temp4= 29;
        //Dato
        System.out.println("Ejercicio 4:");
        if (nevando4 && temp4 >= 20 && temp4 <=30){
        //Salida
        System.out.println("--No me lo creo--");
        }
        //5
        //Variables
        int temp5= 32;
        boolean hacesol5= true;
        //Dato
        System.out.println("Ejercicio 5:");
        System.out.println("Temperatura " + temp5);
        if (temp5 < 0 || temp5 > 30 && hacesol5);{
        //Salida
        System.out.println("--Mejor me quedo en casa--");
        }
        //6
        //Variables
        int temp6= 32;
        //Dato
        System.out.println("Ejercicio 6:");
        System.out.println("Temperatura " + temp6);
        if (temp5 > 25){
        //Salida
        System.out.println("--A la playa!!!--");
        }
        //7
        //Variables
        int temp7= 10;
        //Dato
        System.out.println("Ejercicio 7:");
        System.out.println("Temperatura " + temp7);
        if (temp7 <= 25);{
        //Salida
        System.out.println("--Esperando al buen tiempo...--");
        }
        //8
        //Variables
        int temp8= 10;
        //Dato
        System.out.println("Ejercicio 8:");
        System.out.println("Temperatura " + temp8);
        if (temp8 > 25){
            System.out.println("--A la playa!!!--");
        }else {
            System.out.println("--Esperando al buen tiempo--");
            }
        //82
        //Variables
        int temp82= 10;
        boolean nevado= true;
        //Dato
        System.out.println("Ejercicio 8.2:");
        System.out.println("Temperatura " + temp82);
        if (temp82 > 25){
            System.out.println("--A la playa!!!--");
        }else if (temp82 > 15){
            System.out.println("--A la montana!!!--");
        }else if (temp82 <5 && nevado){
            System.out.println("--A esquiar!!--");
        }else {
            System.out.println("--A dormir--");
            }
        //9
        //Variables
        int temp9= 10;
        System.out.println("Ejercicio 9:");
        System.out.println("Temperatura " + temp9 );
        if (temp9 < 15){
            if (temp9 < 5){
                System.out.println("--A esquiar!!!--");
                
            }else {
                System.out.println("--A dormir...zzzz!");
            }
        }else if (temp9 > 25){
            System.out.println("--A la playa!!!---");
        }else {
            System.out.println("--A la montana!!--");
        }
    
            }
        }
