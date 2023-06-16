/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m2.ejercicio.n.pkg3;

import javax.swing.JOptionPane;

public class cuentaBancaria {
        public double saldo;

    private static String contra_usuario;
    private static String contrasena = "1337";

    public static String menu = "¿Que deseas realizar?\n\n" +
                                "    1.- Realizar un deposito.\n" +
                                "    2.- Realizar un retiro.\n" +
                                "    3.- Revisar tu saldo.\n" +
                                "    4.- Salir.";


    public Cajero() {
        saldo = 5000.0;
    }


    public Cajero(double saldo) {
        this.saldo = saldo;
    }


    static boolean pedirNip() {
        contra_usuario = JOptionPane.showInputDialog(
            null,
            "De su nip de 4 digitos:"
        );
        if (contra_usuario.equals(contrasena)) {
            return(true);
        } else {
            return(false);
        }
    }


    static double saldoInicial() {
        double saldo = Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                "¿Con que cantidad desea abrir su cuenta?"
            )
        );
        return saldo;
    }


    public void realizarDeposito() {
        double abono = Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                "¿Cuanto deaseas abonar?"
            )
        );
        saldo += abono;
    }


    public void realizarRetiro() {
        double retiro = Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                "¿Cuanto deseas retirar?"
            )
        );
        if ((saldo - retiro) >= 0) {
            saldo -= retiro;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
        }
    }


    public void mostrarSaldo() {
        JOptionPane.showMessageDialog(null, "El saldo actual es: $" + saldo);
    }

}

        
