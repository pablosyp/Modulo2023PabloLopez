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
        System.out.println("Temperatura es " + temp1);
        if (temp1 > 25){
        System.out.println("--A la playa--");
        }
        //2
        //Variables
        boolean sol2;
        sol2 = true;
        //Dato
        System.out.println("Hace sol ");
        if (sol2 = true){
        System.out.println("--No te olvides la sombrilla--");
        }
        //3
        //Variables
        boolean haceso3= true;
        boolean nevado3= true;
        //Dato
        System.out.println("Hace sol y Nevado");
        if (haceso3 || nevado3);
        //Salida
        System.out.println("--Que bien!--");
        
        //4
        //Variables
        boolean nevando4= true;
        int temp4= 29;
        //Dato
        if (nevando4 && temp4 >= 20 && temp4 <=30);
        //Salida
        System.out.println("--No me lo creo--");
        
        //5
        //Variables
        int temp5= 32;
        boolean hacesol5= true;
        //Dato
        System.out.println("Temperatura " + temp5);
        if (temp5 < 0 || temp5 > 30 && hacesol5);{
        System.out.println("--Mejor me quedo en casa--");
        }
        //8
        //Variables
        int temp8= 10;
        //Dato
        System.out.println("Temperatura " + temp8);
        if (temp8 > 25){
            System.out.println("--A la playa!!!--");
        }else {
            System.out.println("--Esperando al buen tiempo--");
            }
    
    
}
}