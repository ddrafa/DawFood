/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author ddrafa
 */
public class Main {

    public static void main(String[] args) {

        boolean proceder = true;
        int pedido = 1;
        BBDD baseDatos = new BBDD();
        do {
            System.out.println("Refresh de datos");
            System.out.println(baseDatos.toString());
            TPV maquina = Programa.elegirTPV(baseDatos);
            if (maquina != null) {
                int acceso = Programa.encenderTPV(maquina);
                switch (acceso) {
                    case 0 -> {
                        do {
                            Ticket ticket = Programa.comoUsuario(maquina, baseDatos);
                            if (ticket != null) {
                                ticket.setNumPedido(pedido);
                                JOptionPane.showMessageDialog(null, ticket.toString());
                                proceder = true;
                                pedido++;
                            } else {
                                proceder = false;
                            }
                        } while (proceder);
                        proceder = true;
                    }
                    case 1 -> {
                        do {
                            proceder = Programa.comoAdministrador(maquina, baseDatos);
                        } while (proceder);
                        proceder = true;
                    }
                    case 2 -> {
                        proceder = false;
                    }
                }
            } else {
                proceder = false;
            }
        } while (proceder);

        JOptionPane.showMessageDialog(null, "Nos vemos pronto :D");
    }
}
