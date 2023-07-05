
package vehiculos;

public class Autos {

    private String marca="";
    private String tipo="";
    
    public Autos(String marca, String tipo){
        this.marca=marca;
        this.tipo=tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

