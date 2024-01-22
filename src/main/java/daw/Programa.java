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
        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una TPV", "Selección",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, OPCIONESMENU, OPCIONESMENU[0]);

        //a partir de aquí se duplica
        switch (seleccion) {
            case 0 -> {
                return (TPV) BBDD.listaDeTPVs().get(0);
            }
            case 1 -> {
                return (TPV) BBDD.listaDeTPVs().get(1);
            }
            case 2 -> {
                return (TPV) BBDD.listaDeTPVs().get(2);
            }
            case 3 -> {
                return (TPV) BBDD.listaDeTPVs().get(3);
            }
        }
        return null;
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
        Carrito carrito = new Carrito();
        
        final String[] OPCIONESMENU = {"Catalogo de Productos", "Carrito", "Salir de la selección"};
        String opcion = (String) JOptionPane.showInputDialog(null,
                "¿Qué desea hacer?", "Acceder como Usuario",
                JOptionPane.QUESTION_MESSAGE, null,
                OPCIONESMENU, "Cambiar Producto");

        return ticket;
    }

    public static void comoAdministrador(TPV maquina) {
        String contraseñaIntroducida = JOptionPane.showInputDialog("Introduce la contraseña del TPV de " + maquina.getLocation() + ":");
        if (contraseñaIntroducida.equals(maquina.getPassword())) {

            final String[] OPCIONESMENU = {"Cambiar Producto", "Gestionar Productos", "Consultar Ventas", "Salir de la selección"};
            String opcion = (String) JOptionPane.showInputDialog(null,
                    "¿Qué tarea desea realizar?", "Acceder como Admin",
                    JOptionPane.QUESTION_MESSAGE, null,
                    OPCIONESMENU, "Cambiar Producto");

            switch (opcion) {

                case "Cambiar Producto" -> {

                }

                case "Gestionar Productos" -> {

                }

                case "Consultar Ventas" -> {

                }
                case "Salir de la selección" -> {
                    
                }
            }
        } else {
            System.out.println("Contraseña incorrecta, inténtelo de nuevo");
        }

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

    public static void mostrarTPVs() {
        for (int i = 0; i < BBDD.listaDeTPVs().size(); i++) {
            System.out.println(BBDD.listaDeTPVs().get(i).toString());
        }
    }
}
