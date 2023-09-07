/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class persona {

    String dcuil;
    String dnombre;
    String dtelefono;
    String demail;
    String TSEG;
    String CI;
    String cobertura;
    String elementos;
    String datovehiculo;
    String coberturavehiulo;
    String coberturavida;
    String veneficiario;
    
    //Segurohogar
    public persona(String TSEG,String dcuil,String dnombre,String dtelefono,String demail){
        this.dcuil = dcuil;
        this.dnombre = dnombre;
        this.dtelefono = dtelefono;
        this.demail = demail;
        this.TSEG = TSEG;
       
        
    }

    //Segurovehivulo
    
    //Segurovida

    public String getDcuil() {
        return dcuil;
    }

    public String getDnombre() {
        return dnombre;
    }

    public String getDtelefono() {
        return dtelefono;
    }

    public String getDemail() {
        return demail;
    }

    public String getTSEG() {
        return TSEG;
    }

    public String getCI() {
        return CI;
    }

    public String getCobertura() {
        return cobertura;
    }

    public String getElementos() {
        return elementos;
    }

    public String getDatovehiculo() {
        return datovehiculo;
    }

    public String getCoberturavehiulo() {
        return coberturavehiulo;
    }

    public String getCoberturavida() {
        return coberturavida;
    }

    public String getVeneficiario() {
        return veneficiario;
    }

   
}

