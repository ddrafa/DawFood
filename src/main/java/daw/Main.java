/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author ddrafa
 */
public class Main {

    public static void main(String[] args) {

        boolean proceder = true;

        Programa.inicializarTPVs();
        Programa.inicializarProductos();

        do {
            String acceso = Programa.encenderTPV();
            if(acceso=="Modo Usuario"){
              Ticket ticket= Programa.comoUsuario();
            } else if(acceso== "Modo Administrador"){
                Programa.comoAdministrador();
            }else {
                proceder=false;              
            }
        } while (proceder);
    }
}
