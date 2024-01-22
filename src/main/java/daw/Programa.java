/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author nuria
 */
public class Programa {

    public static TPV elegirTPV() {
        final String[] OPCIONESMENU = {"TPV 1", "TPV 2", "TPV 3", "TPV 4"};
        String seleccion = (String) JOptionPane.showInputDialog(null,
                "Selecciona", "seleccion",
                JOptionPane.OK_CANCEL_OPTION, null,
                OPCIONESMENU, "TPV 1");
        switch (seleccion) {
            case "TPV 1" -> {
                return (TPV) BBDD.listaDeTPVs().get(0);
            }
            case "TPV 2" -> {
                return (TPV) BBDD.listaDeTPVs().get(1);
            }
            case "TPV 3" -> {
                return (TPV) BBDD.listaDeTPVs().get(2);
            }
            case "TPV 4" -> {
                return (TPV) BBDD.listaDeTPVs().get(3);
            }
        }
        return new TPV();
    }

    public static String encenderTPV(TPV maquina) {
        final String[] OPCIONESMENU = {"Modo Usuario", "Modo Administrador", "Apagar TPV"};
        return (String) JOptionPane.showInputDialog(null,
                "¡Bienvenido a DawFood! ¿Cómo quieres acceder?", "Acceder",
                JOptionPane.QUESTION_MESSAGE, null,
                OPCIONESMENU, "Modo Usuario");
    }

    public static Ticket comoUsuario(TPV maquina) {
        Ticket ticket = new Ticket();

        return ticket;
    }

    public static void comoAdministrador(TPV maquina) {

    }

    public static void inicializarTPVs() {
        BBDD.listaDeTPVs();
    }

    public static void inicializarProductos() {
        BBDD.listaDeProductos();
    }

    public static void inicializarTarjeta() {
        BBDD.listaDeTarjetas();
    }
}
