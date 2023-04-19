/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchclase1904;

import java.util.Scanner;

public class SwitchClase1904 {

    public static void main(String[] args) {
        //Variables
        int dias;
        String mes;
        
        //Objeto Scanner
        Scanner leerdia = new Scanner(System.in);
        Scanner leermes = new Scanner(System.in);
        
        System.out.println("-------Dias de la semana-------");
        System.out.println("-------------------------------");
        System.out.println("-------1 Lunes-----------------");
        System.out.println("-------2 Martes----------------");
        System.out.println("-------3 Miercoles-------------");
        System.out.println("-------4 Jueves----------------");
        System.out.println("-------5 Viernes---------------");
        System.out.println("-------6 Sabado----------------");
        System.out.println("-------7 Domingo---------------");
        System.out.println("-------------------------------");
        System.out.println(" ¿Que dia es hoy de la semana? ");
        dias = leerdia.nextInt();
        
        //Logica del Switch
        switch (dias)
        {
            case 1:
                System.out.println(" Otra ves Lunes ");
            break;
            case 2:
                System.out.println(" Fuerza!!! ");
            break;
            case 3:
                System.out.println(" Mitad de semana ");
            break;
            case 4:
                System.out.println(" Falta menos ");
            break;
            case 5:
                System.out.println(" Llegamos al viernes!!! ");
            break;
            case 6:
                System.out.println(" Descanzar ");
            break;
            case 7:
                System.out.println(" Dia con la familia ");
            break;
            case 8:
                System.out.println(" EEEEE te pasaste ");
            break;
            
        }
        //Meses
        System.out.println("-------Meses-------------------");
        System.out.println("-------------------------------");
        System.out.println("-------1 Enero-----------------");
        System.out.println("-------2 Febrero---------------");
        System.out.println("-------3 Marzo-----------------");
        System.out.println("-------4 Abril-----------------");
        System.out.println("-------5 Mayo------------------");
        System.out.println("-------6 Junio-----------------");
        System.out.println("-------7 Julio-----------------");
        System.out.println("-------8 Agosto----------------");
        System.out.println("-------9 Septiembre------------");
        System.out.println("-------10 Octubre--------------");
        System.out.println("-------11 Noviembre------------");
        System.out.println("-------12 Diciembre------------");
        System.out.println("-------------------------------");
        System.out.println("  ¿Que mes te interesa saber?  ");
        mes = leermes.nextLine();
        
        switch (mes)
        {
            //Grupo de 28 Dias
            case "Febrero":
                System.out.println(" Este mes tiene 28 dias ");
                
            //Grupo de 30 Dias
            case "Abril":
            case "Junio":
            case "Septiembre":
            case "Noviembre":
                
                System.out.println(" Este mes tiene 30 dias ");
            //Grupo de 31 dias
            case "Enero":
            case "Marzo":
            case "Mayo":
            case "Julio":
            case "Agosto":
            case "Octubre":           
            case "Diciembre":   
                
                System.out.println(" Este mes tiene 31 dias ");
            
            default:
                break;
        }
    }
    
}
