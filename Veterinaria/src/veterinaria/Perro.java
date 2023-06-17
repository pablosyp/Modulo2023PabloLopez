
package veterinaria;

public class Perro {
    private String nombre="TOMY";
    private String raza="Chiguagua";
    private int edad=10;
    
    public void ladrar(){
        System.out.println("Guau");
    }
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
