/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;

/**
 *
 * @author ddrafa
 */
public record Tarjeta(int numeroTarjeta, int CVV, String titular, double saldo, LocalDate fechaVencimiento) {

}

//Las tarjetas estarán incluidas en la BBDD y usarán el método record porque sus valores no se van a cambiar
