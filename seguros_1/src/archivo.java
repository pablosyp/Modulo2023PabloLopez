import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class archivo {
    File archivo;
    gestor S = new gestor();

    public void crearArchivo() throws IOException{
        try{
            archivo = new File("Seguros Segurola");
            if (archivo.createNewFile()){
                JOptionPane.showMessageDialog(null,"El archivo fue creado con exito");
            }    
            }catch (IOException e){
                    System.out.println(e);
                    
        }
    }
    public void escribirArchivo() throws IOException{
        try{
            FileWriter escribir = new FileWriter(archivo,true);
            switch (persona.setTSEG()){
                
            }
        }
        
    
        
    }
}

