/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.seguro.automotor;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TrabajoPracticoSeguroAutomotor {

    public static void main(String[] args) {    
        int fecha=2023;
        
        int importeA = 500;
        int importeB = 1000;
        int importeC = 1500;
        int importeD = 2000;
        
        int RC = 1000;
        int TC = 2000;
        int RT = 3000;
        
        int coberAD=0;
        int contador=0;
        String coberturaT="";
        
        int total;
        
        String marca;
        String modelos="";
        
        //Logo
        ImageIcon Icon = new ImageIcon("src/Imagenes/logo33.png");
        ImageIcon Icon2 = new ImageIcon("src/Imagenes/logo2.png");
        
        JOptionPane.showMessageDialog(null,Icon);
        //Solicitud de datos
        String nombre = JOptionPane.showInputDialog(null,"Nombre del Cliente ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null,"Apellido del Cliente ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String telefono = JOptionPane.showInputDialog(null,"Telefono ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String mail = JOptionPane.showInputDialog(null,"Mail ","Poliza",JOptionPane.QUESTION_MESSAGE);
        
        //Marcas
        String [] marcas ={"Renault","Fiat","Ford","Citroen","VW"};

        marca = (String) JOptionPane.showInputDialog(null,"Seleccione una Marca :","Vehiculos :",JOptionPane.QUESTION_MESSAGE,null,marcas,marcas[0]);
        
        //Modelos
        String [] Renault = {"Sandero","Logan","Captur","Kicks","Twingo"};
        String [] Fiat = {"Uno","Mobi","Pulse","Argo","Cronos"};
        String [] Ford = {"Fiesta","Focus","Mondeo","KA","Falcon"};
        String [] Citroen = {"Picasso","Cactus","Aircros","C3","C4"};
        String [] VW = {"Polo","Nivus","Virtus","Taos","Vento"};
        
        
        if(marca.equalsIgnoreCase("Renault")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,Renault,Renault);
            
        }else if(marca.equalsIgnoreCase("Fiat")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,Fiat,Fiat);
            
        }else if(marca.equalsIgnoreCase("Ford")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,Ford,Ford);
            
        }else if(marca.equalsIgnoreCase("Citroen")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,Citroen,Citroen);
            
        }else if(marca.equalsIgnoreCase("VW")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,VW,VW);
            
        }

        //Dominio
        String dominio = JOptionPane.showInputDialog(null,"Ingrese Dominio ","Poliza",JOptionPane.QUESTION_MESSAGE);

        //Año de Antiguedad
        int antig = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Año de Antiguedad ","Poliza",JOptionPane.QUESTION_MESSAGE));
        int resultado = (fecha - antig);
      
        JOptionPane.showMessageDialog(null,"Antiguedad :"+" " + resultado + " " + "Años");
        
        if (resultado <= 5){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $500");
                    resultado = importeA;
        }else if ((resultado >= 5) && (resultado < 10)){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $1000");
                    resultado = importeB;
        }else if ((resultado >= 10) && (resultado < 15)){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $1500");
                    resultado = importeC;
        }else if ((resultado >= 15) && (resultado < 20)){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $2000");
                    resultado = importeD;
        }else if (resultado >= 20){
            JOptionPane.showMessageDialog(null,"Disculpas, su Auto no puede ser asegurado");
            System.exit(0);
        }
        
        //Tipo de cobertura
        int cobertura = JOptionPane.showOptionDialog(null,
            "Seleccione la cobertura : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Responsabilidad Civil","Terceros Completo","Riezgo Total"},"");

        switch(cobertura){
            case 0: JOptionPane.showMessageDialog(null,"Ud. Selecciono : Responsabilidad Civil");
            cobertura = RC;
            coberturaT ="Responsabilidad Civil";
            break;
            
            case 1: JOptionPane.showMessageDialog(null,"Ud. Selecciono : Terceros Completo");
            cobertura = TC;
            coberturaT ="Terceros Completo";
            break;
            
            case 2: JOptionPane.showMessageDialog(null,"Ud. Selecciono : Riezgo Total");
            cobertura = RT;
            coberturaT ="Riezgo Total";
            break;
            
            default:      
        }
        //Cobertura Adicional

 int coberAD1 = JOptionPane.showOptionDialog(null,
            "Seleccione cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Granizo","NO"},"");

        switch(coberAD1){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Granizo");
            contador+=1;
            break;
            default:  
            }
        int coberAD2 = JOptionPane.showOptionDialog(null,
            "Seleccione la cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Llantas Deportivas","NO"},"");
            
            switch(coberAD2){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Llantas Deportivas");
            contador+=1;
            break;
            }
        int coberAD3 = JOptionPane.showOptionDialog(null,
            "Seleccione la cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Asistencia Mecanica","NO"},"");
            
            switch(coberAD3){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Llantas Deportivas");
            contador+=1;
            break;
            }
        int coberAD4 = JOptionPane.showOptionDialog(null,
            "Seleccione la cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Localizador GPS","NO"},"");
            
            switch(coberAD4){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Localizador GPS");
            contador+=1;
            break;
        }
            
            if(contador <2){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 300);
               coberAD = 300;
               }else if(contador == 2 ){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 300);
               coberAD = 300;
               }else if(contador >2){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 600);
               coberAD = 600;
    }
            
            System.out.println("--------------------------------------------");
            System.out.println("---------------Presupuesto------------------");
            System.out.println("------------Seguros Segurola----------------");
            System.out.println("--------------------------------------------");
            System.out.println("------------Datos del usuario---------------");
            System.out.println("NOMBRE :" + nombre);
            System.out.println("APELLIDO :" + apellido);
            System.out.println("TELEFONO :" + telefono);
            System.out.println("MAIL :" + mail);
            System.out.println("-----------Datos del Vehiculo---------------");
            System.out.println("MARCA :" + marca);
            System.out.println("MODELO :" + modelos);
            System.out.println("DOMINIO :" + dominio);
            System.out.println("ANTIGUEDAD DEL VEHICULO :" + antig);
            System.out.println("--------------------------------------------");
            System.out.println("VALOR DE LA CUOTA :" + resultado);
            System.out.println("TIPO DE COBERTURA :" + coberturaT);
            System.out.println("VALOR DE COBERTURA :" + cobertura);
            System.out.println("VALOR DE ADICIONALES :" + coberAD );
            total = resultado + cobertura + coberAD;
            System.out.println("--------------------------------------------");
            System.out.println("VALOR DE LA PRIMA TOTAL :" + total );
            System.out.println("--------------------------------------------");
            
            JOptionPane.showOptionDialog(null,
            "NOMBRE DEL CLIENTE :"+nombre+"\n APELLIDO DEL CLIENTE :"+apellido+"\n TELEFONO :"+telefono+"\n MAIL :"+mail+
                    "\n MARCA :"+marca+"\n MODELO :"+modelos+"\n DOMINIO :"+dominio+"\n ANTIGUEDAD DEL VEHICULO :"+antig+"\n VALOR DE LA CUOTA :"+resultado+
                    "\n TIPO DE COBERTURA :"+coberturaT+"\n VALOR DE COBERTURA :"+cobertura+"\n ADICIONALES :"+coberAD+ "\n VALOR DE LA PRIMA TOTAL :"+total,
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"IMPRIMIR POLIZA"},"");
    }
        
}