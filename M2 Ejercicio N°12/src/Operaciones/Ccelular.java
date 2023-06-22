
package Operaciones;

import java.util.Scanner;

public class Ccelular extends Csoptec {
    Scanner leer = new Scanner(System.in);
    
    public void celulares(){
        System.out.println("Dispositivo: Celular");
        System.out.print("Marca del Celular: ");
        marca= leer.nextLine();
        System.out.print("Modelo del Celular: ");
        modelo= leer.nextLine();
        System.out.println("Seleccione Bateria: ");
        System.out.println("1 - 3000ma  5hs");
        System.out.println("2 - 4000ma  9hs");
        System.out.println("3 - 7000ma  12hs");
        bateria= leer.nextLine();

        switch (bateria){
            case "1":
               bateria = "3000ma  5hs";
            break;
            case "2":
               bateria = "4000ma  9hs";
            break;
            case "3":
               bateria = "7000ma  12hs";
            break;
            default:
            System.out.println ("El dato ingresado no es valida!");   
            bateria = "0";
            break;    
        }
        System.out.print("Defecto del Celular: ");
        defecto= leer.nextLine();
    
   
}
}
