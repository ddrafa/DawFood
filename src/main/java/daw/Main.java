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

        Programa.inicializarTPVs();
        Programa.mostrarTPVs();
        Programa.inicializarProductos();
        TPV maquina = Programa.elegirTPV();

        String acceso = Programa.encenderTPV(maquina);
        switch (acceso) {
            case "Modo Usuario" -> {
                Ticket ticket = Programa.comoUsuario(maquina);
            }
            case "Modo Administrador" -> {
                Programa.comoAdministrador(maquina);
            }
        }
        JOptionPane.showMessageDialog(null, "Nos vemos pronto :D");
    }
}
