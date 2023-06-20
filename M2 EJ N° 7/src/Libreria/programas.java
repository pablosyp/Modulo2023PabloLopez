
package Libreria;

public class programas {
    private int CargaCompleta=0,LavadoCompleto=0,SecadoCompleto=0,Lavado=0,Carga=0,Secado=0;
   
    //contrustor 
    public programas (int Carga, int Lavado, int Secado){
        this.Carga = Carga;
        this.Lavado = Lavado;
        this.Secado = Secado;
    }

    private void CA(){
                if(Carga == 0){
                    System.out.println("Iniciando la Media Carga ");
                    System.out.println("Cargando.....");
                    CargaCompleta = 1;
                } else if (Carga == 1 ) {
                    System.out.println("Iniciando la Carga Completa ");
                    System.out.println("Cargando.....");
                    CargaCompleta = 1;
                }
            }
    private void LA(){
        CA();
                    System.out.println("Programa de lavado iniciado" );
                    System.out.println("Lavando.....");
                    LavadoCompleto = 1;
                
            }
    private void SA(){
        LA();
                if(Secado == 0){
                    System.out.println("Programa de Centrifugado Iniciado");
                    System.out.println("Secando.....");
                    System.out.println("SECO");
                    SecadoCompleto = 1;      
                    } else if (Carga == 1 ) {
                    System.out.println("Programa de Centrifugado No Iniciado");
                    System.out.println("..........");
                    SecadoCompleto = 1; 
                }
    }
    public void ciclofinalizado(){
        SA();
                      System.out.println("Su ropa esta lista");
                      System.out.println("Puede abrir la puerta");
                }

    }
