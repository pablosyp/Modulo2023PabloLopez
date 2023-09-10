import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class archivo {
    File archivo;
    gestor S = new gestor();

    public void crearArchivo() throws IOException{
        try{
            archivo = new File("SegurosSegurola.txt");
            if (archivo.createNewFile()){
                JOptionPane.showMessageDialog(null,"El archivo fue creado con exito");
            }    
            }catch (IOException e){
                    System.out.println(e);
                    
        }
    }
    public void escribirEnarchivo(persona persona){
        gestor s = new gestor();
        
        try{
            FileWriter escribir = new FileWriter(archivo,true);
            switch (persona.getTSEG()){
                case "Seguro Hogar":
                    escribir.write(persona.getTSEG() + "," + persona.getDcuil()+ "," 
                            + persona.getDtelefono() + "," + persona.getDemail());
                    break;
                case "Seguro Vehiculo":
                    escribir.write(persona.getTSEG() + "," + persona.getDcuil()+ "," 
                            + persona.getDtelefono() + "," + persona.getDemail()+ ","
                            + persona.getCI());
                    break;
                case "Seguro Vida":
                    escribir.write(persona.getTSEG() + "," + persona.getDcuil()+ "," 
                            + persona.getDtelefono() + "," + persona.getDemail()+ ","
                            + persona.getCI());
                    break;
            }
            escribir.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
}

