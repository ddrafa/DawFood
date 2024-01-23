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

    public static TPV elegirTPV(BBDD baseDatos) {
        final String[] OPCIONESMENU = {"TPV 1", "TPV 2", "TPV 3", "TPV 4"};
        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una TPV", "Selección",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, OPCIONESMENU, OPCIONESMENU[0]);

        //a partir de aquí se duplica
        switch (seleccion) {
            case 0 -> {
                return baseDatos.getListaTPVs().get(0);
            }
            case 1 -> {
                return baseDatos.getListaTPVs().get(1);
            }
            case 2 -> {
                return baseDatos.getListaTPVs().get(2);
            }
            case 3 -> {
                return baseDatos.getListaTPVs().get(3);
            }
        }
        return null;
    }

    public static int encenderTPV(TPV maquina) {
        final String[] OPCIONESMENU = {"Modo Usuario", "Modo Administrador", "Apagar TPV"};
        return JOptionPane.showOptionDialog(null,
                "¡Bienvenido a DawFood! ¿Cómo quieres acceder?", "Acceder",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                OPCIONESMENU, OPCIONESMENU[0]);
    }

    public static Ticket comoUsuario(TPV maquina) {
        Carrito carrito = new Carrito();
        
        final String[] OPCIONESMENU = {"Catalogo de Productos", "Carrito", "Salir de la selección"};
        int opcion = JOptionPane.showOptionDialog(null,
                "¿Qué desea hacer?", "Acceder como Usuario",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                OPCIONESMENU, OPCIONESMENU[0]);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //El ticket se debe crear despues de haber agregado o eliminido todos los productos del carrito
        Ticket ticket = new Ticket(carrito);
        return ticket;
    }

    public static void comoAdministrador(TPV maquina) {
        String password = JOptionPane.showInputDialog("Introduce la contraseña del TPV de " + maquina.getLocation() + ":");
        if (maquina.getPassword().equals(password)) {

            final String[] OPCIONESMENU = {"Cambiar Producto", "Gestionar Productos", "Consultar Ventas", "Salir de la selección"};
            int opcion = JOptionPane.showOptionDialog(null,
                    "¿Qué tarea desea realizar?", "Acceder como Admin",
                    JOptionPane.QUESTION_MESSAGE, JOptionPane.WARNING_MESSAGE, null,
                    OPCIONESMENU, OPCIONESMENU[0]);

            switch (opcion) {

                case 0 -> {
                    
                }

                case 1 -> {

                }

                case 2 -> {

                }
                case 3 -> {
                    
                }
            }
        } else {
            System.out.println("Contraseña incorrecta");
        }

    }
    
    public static void agregarProducto(){
        
    }
    
    public static void eliminarProducto(){
        
    }
    
    public static void guardarTarjeta(){
        
    }
    
    public static void modificarProducto(){
        
    }
}

    