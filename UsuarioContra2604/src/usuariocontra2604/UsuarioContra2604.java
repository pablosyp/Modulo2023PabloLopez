/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuariocontra2604;

import java.util.Scanner;

public class UsuarioContra2604 {

    public static void main(String[] args) {
        //Usuario 3 repeticiones
        String usuario="";
        int contador=0;
        
        Scanner leer = new Scanner(System.in);      

        while(contador <=2){
        System.out.print("Ingrese tu nombre de Usuario : ");
        usuario= leer.nextLine();
        if(usuario.equals("pepe")){
            System.out.println("Inicio de Sesion Correcto");
            break;
        }else{
            System.out.println("Inicio de Sesion Incorrecto");
                
        }
        contador++;
        }
    }
}
