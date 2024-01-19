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
    public static String encenderTPV(){
        final String[] OPCIONESMENU = {"Modo Usuario", "Modo Administrador", "Apagar TPV"};
            return (String) JOptionPane.showInputDialog(null,
                    "¡Bienvenido a DawFood! ¿cómo quieres acceder?", "Acceder",
                    JOptionPane.QUESTION_MESSAGE, null,
                    OPCIONESMENU, "Modo Usuario");
    }
    
    public static Ticket comoUsuario(){
        Ticket ticket = new Ticket();
        
        return ticket;
    }
    public static void comoAdministrador(){
        
    }
    
    public static void inicializarTPVs(){
    
}
}
