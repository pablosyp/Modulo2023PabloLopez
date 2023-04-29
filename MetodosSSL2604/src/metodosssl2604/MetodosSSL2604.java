/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosssl2604;

import java.util.Scanner;

public class MetodosSSL2604 {

    public static void main(String[] args) {
        //Variables y objetos
        int cantidaddecaracteres,desde,hasta;
        String nombre="";
        String apellido,apellidocortado;
        String usuario="pablo";
        int contador=0;
        int serie1= 1;
        int serie2= 2;
      
        Scanner leer = new Scanner(System.in);
        Scanner leernumeros = new Scanner(System.in);
        Scanner leernom = new Scanner(System.in);
        
        //Pedir informacion
        System.out.print("Ingrese su nombre : ");
        nombre = leer.next();
        
        //Metodo length / los espacios no funciona, corta la cadena
        cantidaddecaracteres = nombre.length();

        //Mostrar caracteres nombre
        System.out.println("Usted ingreso la palabra " + nombre);
        System.out.println("La cantidad de caracteres que tiene es " +cantidaddecaracteres);
        
        //Pedir apellido
        System.out.print("Ingresar su apellido : ");
        apellido = leer.next();
        
        //Mostrar caracteres apellido
        System.out.println("Usted ingreso la palabra " + apellido);
        System.out.println("La cantidad de caracteres que tiene es " +cantidaddecaracteres);
        
        System.out.print("Ingrese el desde donde se debe cortar el string : ");
        desde = leernumeros.nextInt();
        System.out.print("Ingrese el hasta donde se debe cortar el string : ");
        hasta = leernumeros.nextInt();
        
        //Metodo Subtring
        {
        apellidocortado = nombre.substring(desde,hasta);
        System.out.println("La nueva cadema es: " + apellidocortado);
        
        //Funcion equals

        while(contador <=2){
        System.out.print("Ingrese tu nombre de Usuario : ");
        usuario= leernom.nextLine();
        if(usuario.equals("pablo")){
            System.out.println("Los nombres son iguales");
            break;
        }else{
            System.out.println("Los nombres son diferentes");
                break;
        }}
        //Ciclos/bucles  - WHILE
        
        do{
            System.out.println(serie1 + serie2 );
            serie1++;
        }while (serie1 <8);
        
            
        
       
        }
    }
}








