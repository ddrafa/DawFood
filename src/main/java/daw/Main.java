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
        Programa.inicializarProductos();
        TPV maquina = Programa.elegirTPV();

        do {
            String acceso = Programa.encenderTPV(maquina);
            if(acceso.equals("Modo Usuario")){
              Ticket ticket= Programa.comoUsuario(maquina);
            } else if(acceso.equals("Modo Administrador")){
                Programa.comoAdministrador(maquina);
            }else {
                proceder=false;              
            }
        } while (proceder);
        JOptionPane.showMessageDialog(null, "Nos vemos pronto :D");
    }
}
