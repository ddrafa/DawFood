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