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
        
            BBDD baseDatos = new BBDD();
            System.out.println(baseDatos.toString());
        do {
            TPV maquina = Programa.elegirTPV(baseDatos);

            int acceso = Programa.encenderTPV(maquina);
            switch (acceso) {
                case 0 -> {
                    do{
                    Ticket ticket = Programa.comoUsuario(maquina, baseDatos);
                    if(ticket!=null){
                        proceder=true;
                    }else{
                        proceder=false;
                    }
                    }while(proceder);
                }
                case 1 -> {
                    proceder = Programa.comoAdministrador(maquina, baseDatos);
                }
                case 2-> {
                    proceder=false;
                }
            }
        } while (proceder);
        JOptionPane.showMessageDialog(null, "Nos vemos pronto :D");
    }
}
