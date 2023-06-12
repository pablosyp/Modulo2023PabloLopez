/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m2.ejercicio.n.pkg2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class M2EjercicioN2 {

    public static void main(String[] args) {
        
        String marcaA = "";
        String modeloA = "";
        String estadoA = "";

        ImageIcon Icon = new ImageIcon("src/imagenes/fitito.png");
    
        Auto A = new Auto();

        A.DatosVehiculo();
        marcaA = A.dato1;
        modeloA = A.dato2;
        
        A.estadoAuto();
        estadoA = A.dato3;

        JOptionPane.showMessageDialog(null,"\n El Vehiculo :\n" +marcaA+ "\n El modelo :\n" +modeloA+ "\n Se encuentra :\n" +estadoA, "",JOptionPane.INFORMATION_MESSAGE,Icon);
    
    }
    
}
