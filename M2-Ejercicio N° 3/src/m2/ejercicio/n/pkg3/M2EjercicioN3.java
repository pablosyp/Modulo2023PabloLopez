/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m2.ejercicio.n.pkg3;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static m2.ejercicio.n.pkg3.cuentaBancaria.pedirNip;


public class M2EjercicioN3 {
ImageIcon Icon = new ImageIcon("src/imagenes/cajero.png");

        do {
            String opcion_1 = JOptionPane.showInputDialog(
                null,
                "Bienvenido al cajero!\n\n" +
                "Ya tiene usted una cuenta?\n" +
                "si\n" +
                "no"
            );

            if (opcion_1.equals("si")) {
                if (pedirNip() == true) {
                    cuentaBancaria cajero = new cuentaBancaria();

                    int opcion_2 = Integer.parseInt(
                        JOptionPane.showInputDialog(
                            null,
                            menu
                        )
                    );

                    switch (opcion_2) {
                        case 1:
                            cajero.realizarDeposito();
                            cajero.mostrarSaldo();
                            break;

                        case 2:
                            cajero.realizarRetiro();
                            cajero.mostrarSaldo();
                            break;

                        case 3:
                            cajero.mostrarSaldo();
                            break;

                        case 4:
                            JOptionPane.showMessageDialog(
                                null,
                                "Gracias por hacer uso del cajero."
                            );
                            System.exit(0);
                            break;

                        default:
                            JOptionPane.showMessageDialog(
                                null,
                                "Opcion incorrecta, " +
                                "intentelo de nuevo."
                            );
                            break;
                    }

                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Su nip es incorrecto."
                    );
                }

            } else if (opcion_1.equals("no")) {
                double saldo = saldoInicial();
                cuentaBancaria cajero = new cuentaBancaria(saldo);

                int opcion_2 = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        null,
                        menu
                    )
                );


                switch (opcion_2) {
                    case 1:
                        cajero.realizarDeposito();
                        cajero.mostrarSaldo();
                        break;

                    case 2:
                        cajero.realizarRetiro();
                        cajero.mostrarSaldo();
                        break;

                    case 3:
                        cajero.mostrarSaldo();
                        break;

                    case 4:
                        JOptionPane.showMessageDialog(
                            null,
                            "Gracias por hacer uso del cajero."
                        );
                        System.exit(0);
                        break;

                    default:
                        JOptionPane.showMessageDialog(
                            null,
                            "Opcion incorrecta, " +
                            "intentelo de nuevo."
                        );
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Opcion invalida, intente de nuevo!"
                );
            }
        }
    }