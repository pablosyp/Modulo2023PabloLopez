
package m2.ejercicion14vehiculos;

public class Estacionar {

    public static void main(String[] args) {
        Vehiculo MSJ1 = new Coche();
        
        MSJ1.intro();
        MSJ1.pedir_datos1();
        MSJ1.Operaciones();
        
        Vehiculo MSJ2 = new Moto();
        
        MSJ2.intro();
        MSJ2.pedir_datos1();
        MSJ2.Operaciones();
        
        Vehiculo MSJ3 = new Bus();
        
        MSJ3.intro();
        MSJ3.pedir_datos1();
        MSJ3.Operaciones();
        
    }
}
    


