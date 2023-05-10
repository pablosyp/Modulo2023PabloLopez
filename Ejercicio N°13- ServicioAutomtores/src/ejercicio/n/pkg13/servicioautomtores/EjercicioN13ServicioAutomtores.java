
package ejercicio.n.pkg13.servicioautomtores;

import java.util.Scanner;

public class EjercicioN13ServicioAutomtores {

    public static void main(String[] args) {
        // TODO code application logic here
        String nom="";
        String tel="";
        String domVehiculo="";
        String marca="";
        int data="0";
        
        String [] servicio = new String [4];
        
        servicio [0]="alineacion";
        servicio [1]="balanceo";
        servicio [2]="aceite";
        servicio [3]="cubierta";
        
        Scanner leer = new Scanner(System.in);
         
        System.out.print("Ingrese su nombre : " );
        nom = leer.next();
        System.out.print("Ingrese su telefono : " );
        tel = leer.next();
        System.out.print("Ingrese Dominio del vehiculo : " );
        domVehiculo = leer.next();
        System.out.print("Marca : ");
        marca = leer.next();
        
        for(int i=0; i<servicio.length; i++){
            do {
                    System.out.println("Desea agregar " +servicio[i]+ " ?. "); 
                    System.out.print("Escriba 1 para si, 2 para no : "); 
            }}}}
            }
    }
}


