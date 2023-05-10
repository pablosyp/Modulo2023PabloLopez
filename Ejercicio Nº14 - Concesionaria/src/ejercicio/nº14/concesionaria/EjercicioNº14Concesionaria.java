
package ejercicio.nº14.concesionaria;

public class EjercicioNº14Concesionaria {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombrevendedor="";
        String nombrecliente="";
        String dni="";
        String telefono="";
        
        String [] modelo = new String [1];
            modelo [0]= "Renault";
        String [] gama = new String [1];
            gama [0] = "Baja";
        String [] precio = new String [1];
            precio [0] = "5000000";
            
        
        for(int m=0; m<modelo.length; m++){
            for(int g=0; g<gama.length; g++){
                for(int p=0; p<precio.length; p++){
            System.out.println(+m+ "-" +modelo[m]);
                System.out.println(+g+ "-" +gama[g]);
                    System.out.println(+p+ "-" +precio[p]);
            break;
        }
        }
        
        
        
    }
    
}
}